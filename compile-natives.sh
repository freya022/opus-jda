arch=$(uname -m)

if [ "$arch" == 'x86_64' ]; then
  jna_arch='x86-64'
elif [ "$arch" == 'aarch64' ]; then
  jna_arch='aarch64'
else
  echo "Unknown arch: $arch"
  exit
fi

# Try to do a sanity check of the working directory
if [ ! -e "./gradlew" ]; then
  echo "The script must be executed in the project root directory!"
  exit
fi

if [ ! -d "./opus" ]; then
  git clone https://github.com/xiph/opus
  cd opus || exit
  git checkout a8b13e40d751c7b40833b94fc9437c5c3439da89
  cd .. || exit
fi

cd opus || exit
mkdir build
cd build || exit
cmake .. -DOPUS_BUILD_SHARED_LIBRARY=ON -DCMAKE_BUILD_TYPE=Release
cmake --build . -j 8
mkdir -p ../../src/main/resources/dev/freya02/opus/jda/natives/linux-"$jna_arch"
cp ./libopus.so.0.11.0 ../../src/main/resources/dev/freya02/opus/jda/natives/linux-"$jna_arch"/libopus.so
