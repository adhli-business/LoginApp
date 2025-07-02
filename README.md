## 🔹 **1. Aplikasi: LoginApp – Simulasi Login dan Home**

### 🎯 **Tujuan Pembelajaran**

- Memahami perpindahan antar Activity (`LoginActivity` → `HomeActivity`)
- Memahami behavior lifecycle saat `finish()` dan back button
- Membedakan `onCreate()`, `onResume()`, `onPause()` saat pindah halaman

### 📱 **Fitur Utama**

- `LoginActivity`: Form login (username, password) + tombol Login
- Jika login berhasil → pindah ke `HomeActivity`
- `HomeActivity`: Menampilkan “Selamat Datang” + tombol Logout (kembali ke `LoginActivity`)

### ✅ **Requirement Teknis**

- Gunakan 2 Activity: `LoginActivity`, `HomeActivity`
- Tambahkan log di semua method lifecycle
- Gunakan `Intent` untuk berpindah Activity
- Gunakan `finish()` saat logout

### 🔍 **Eksplorasi Lifecycle**

- Apa yang terjadi ketika berpindah dari Login → Home?
- Apa perbedaan back vs tombol logout (`finish()` vs backstack)?
- Apakah `LoginActivity` tetap hidup saat di-back dari `HomeActivity`?

---
