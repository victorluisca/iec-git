#!/bin/bash

if [ -z "$1" ]; then
	exit 1
fi

nome_dir="$1"

mkdir "$nome_dir"

tar -cvf "$nome_dir.tar" "$nome_dir"

echo "diretorio criado e compactado."
