# !/bin/bash

path=($HOME).cache

echo "---"

if [ `ls $path/google-chrome/Default | wc -l` -gt 0 ]; then
   rm -r $path/google-chrome/Default/*
   echo "Arquivos temporarios do Google Chrome removidos com sucesso."
else
   echo "Pasta de arquivos temporários do Google Chrome já está vazia."
fi

if [ `ls $path/mozilla/firefox | wc -l` -gt 0 ]; then
   rm -r $path/mozilla/firefox/*
   echo "Arquivos temporarios do Firefox removidos com sucesso."
else
   echo "Pasta de arquivos temporários do Firefox já está vazia."
fi

echo "---"
echo "Espaço em disco sendo utilizado:"
du -sh ~/ | awk {'print $1'}
