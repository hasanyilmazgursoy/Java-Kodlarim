#!/usr/bin/env bash
# Tüm Java dosyalarını derler (hata oluşursa dosya adını raporlar)
# Kullanım: bash compile_all.sh

set -euo pipefail

ERRORS=0

compile_dir() {
    local dir="$1"
    local label="$2"
    echo ""
    echo "==> $label derleniyor..."
    while IFS= read -r -d '' file; do
        if javac "$file" 2>/dev/null; then
            echo "  [OK]  $file"
        else
            echo "  [ERR] $file"
            ERRORS=$((ERRORS + 1))
        fi
    done < <(find "$dir" -name "*.java" -print0)
}

compile_dir "src/diziler"   "Dizi Alıştırmaları"
compile_dir "src/metodlar"  "Metot Alıştırmaları"
compile_dir "src/rekursiyon" "Özyineleme Örnekleri"

echo ""
if [ "$ERRORS" -eq 0 ]; then
    echo "Tüm dosyalar başarıyla derlendi."
else
    echo "$ERRORS dosya derlenemedi."
    exit 1
fi
