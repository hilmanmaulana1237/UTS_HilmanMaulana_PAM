# 🍜 Mesen Makanan - Aplikasi Pemesanan Makanan Khas Bandung

Aplikasi Android untuk memesan makanan khas Bandung dengan desain modern dan colorful yang dibuat menggunakan Kotlin dan View Binding.

## 📱 Tentang Aplikasi

**Mesen Makanan** adalah aplikasi mobile yang memudahkan pengguna untuk memesan berbagai makanan khas Bandung dengan antarmuka yang menarik dan user-friendly. Aplikasi ini menampilkan 12 menu makanan dengan informasi lengkap termasuk nama, deskripsi, dan harga.

## ✨ Fitur Utama

- ✅ **Autentikasi User** - Login dan Register
- ✅ **12 Menu Makanan** - Pilihan makanan khas Bandung
- ✅ **Review Pesanan** - Melihat detail pesanan sebelum checkout
- ✅ **Input Alamat** - Form pengisian alamat pengiriman yang lengkap
- ✅ **Konfirmasi Pesanan** - Notifikasi sukses setelah order
- ✅ **Bottom Navigation** - Navigasi mudah antar halaman
- ✅ **Desain Modern** - UI/UX menarik dengan warna-warna cerah
- ✅ **Material Design** - Menggunakan Material Components

## 📸 Screenshot Aplikasi

### 1. Splash Screen
![Splash Screen](screenshot/01_splash.png)
- Background orange cerah dengan emoji makanan
- Judul "Mesen Makanan" dengan tagline
- Tombol "Mulai Sekarang" untuk memulai

### 2. Auth Choice
![Auth Choice](screenshot/02_auth_choice.png)
- Pilihan untuk Register atau Login
- Deskripsi singkat aplikasi
- Tombol dengan warna berbeda untuk setiap pilihan

### 3. Login
![Login](screenshot/03_login.png)
- Header hijau dengan emoji 🔐
- Form login dengan username dan password
- Material TextInputLayout dengan icon
- Password toggle untuk show/hide password

### 4. Register
![Register](screenshot/04_register.png)
- Header orange dengan emoji 📝
- Form registrasi lengkap (Nama, Username, Password)
- Material Design Components
- Validasi input

### 5. Home - Daftar Makanan
![Home](screenshot/05_home.png)
- Header orange dengan sapaan personal
- 12 menu makanan dalam card menarik:
  - Cimol Bandung Original - Rp 10.000
  - Basreng Pedas Nampol - Rp 12.000
  - Cireng Isi Abon - Rp 8.000
  - Seblak Ceker Mercon - Rp 15.000
  - Batagor Kuah Kacang - Rp 13.000
  - Cilok Bumbu Kacang - Rp 7.000
  - Cuanki Bandung - Rp 14.000
  - Mie Kocok Bandung - Rp 16.000
  - Siomay Bandung Komplit - Rp 15.000
  - Surabi Oncom Premium - Rp 9.000
  - Karedok Sayur Segar - Rp 11.000
  - Lotek Bandung Spesial - Rp 12.000
- Setiap card menampilkan nama, deskripsi, harga, dan color indicator
- RadioButton terintegrasi dalam card
- Bottom Navigation Bar (Home, Order, Profile)

### 6. Review Pesanan
![Order Review](screenshot/06_order_review.png)
- Header hijau dengan informasi user
- Card putih menampilkan pesanan yang dipilih
- Tombol "🚀 Lanjut ke Pengiriman"
- Bottom Navigation Bar

### 7. Alamat Pengiriman
![Address](screenshot/07_address.png)
- Header ungu dengan sapaan personal
- Form input alamat lengkap:
  - 👤 Nama Penerima
  - 🏠 Alamat Lengkap
  - 🗺️ Patokan Alamat
- Material TextInputLayout dengan icon
- Tombol "✅ Order dan Kirim"

> **Catatan**: Screenshot untuk halaman konfirmasi dapat ditambahkan setelah melakukan proses order lengkap. Halaman konfirmasi akan menampilkan emoji success ✅, card putih dengan pesan terima kasih, dan tombol "🏠 Kembali ke Home".

## 🛠️ Teknologi yang Digunakan

- **Bahasa**: Kotlin
- **SDK**: Android SDK (Min SDK 24, Target SDK 36)
- **Build Tool**: Gradle 8.13
- **Architecture Pattern**: MVVM (Model-View-ViewModel)
- **UI Components**:
  - View Binding
  - Material Design Components
  - ConstraintLayout
  - ScrollView
  - RecyclerView concept (manual implementation)
  - Material TextInputLayout
  - Material CardView
  - Bottom Navigation View

## 📁 Struktur Project

```
PraktikumWireframe/
├── app/
│   ├── src/
│   │   ├── main/
│   │   │   ├── java/com/example/praktikumwireframe/
│   │   │   │   ├── SplashActivity.kt          # Splash screen
│   │   │   │   ├── AuthChoiceActivity.kt      # Pilihan auth
│   │   │   │   ├── LoginActivity.kt           # Login
│   │   │   │   ├── RegisterActivity.kt        # Register
│   │   │   │   ├── HomeActivity.kt            # Daftar makanan
│   │   │   │   ├── OrderReviewActivity.kt     # Review pesanan
│   │   │   │   ├── AddressActivity.kt         # Input alamat
│   │   │   │   ├── ConfirmActivity.kt         # Konfirmasi
│   │   │   │   ├── FoodItem.kt                # Data class makanan
│   │   │   │   └── OrderData.kt               # Singleton data order
│   │   │   ├── res/
│   │   │   │   ├── layout/
│   │   │   │   │   ├── activity_splash.xml
│   │   │   │   │   ├── activity_auth_choice.xml
│   │   │   │   │   ├── activity_login.xml
│   │   │   │   │   ├── activity_register.xml
│   │   │   │   │   ├── activity_home.xml
│   │   │   │   │   ├── activity_order_review.xml
│   │   │   │   │   ├── activity_address.xml
│   │   │   │   │   ├── activity_confirm.xml
│   │   │   │   │   ├── item_food.xml          # Layout item makanan
│   │   │   │   │   └── partial_bottom_bar.xml
│   │   │   │   ├── values/
│   │   │   │   │   ├── colors.xml             # Definisi warna
│   │   │   │   │   ├── styles.xml             # Custom styles
│   │   │   │   │   ├── dimens.xml             # Dimensi
│   │   │   │   │   └── strings.xml
│   │   │   │   ├── menu/
│   │   │   │   │   └── menu_bottom.xml
│   │   │   │   └── drawable/
│   │   │   └── AndroidManifest.xml
│   │   └── build.gradle.kts
│   └── ...
├── screenshot/                                 # Folder screenshot
└── README.md
```

## 🎨 Skema Warna

Aplikasi menggunakan skema warna yang vibrant dan menarik:

- **Primary Orange**: `#FF6B35` - Splash, Register, Home header
- **Accent Yellow**: `#FFC93C` - Confirmation accent
- **Accent Green**: `#07BEB8` - Login, Order review
- **Accent Purple**: `#8B5CF6` - Address form
- **Dark Gray**: `#1F2937` - Text primary
- **Light Gray Background**: `#F9FAFB` - Background
- **Medium Gray**: `#9CA3AF` - Text secondary

## 🚀 Cara Menjalankan Aplikasi

### Prasyarat
- Android Studio Arctic Fox atau lebih baru
- JDK 11 atau lebih tinggi
- Android SDK dengan API Level 24 atau lebih tinggi
- Emulator Android atau perangkat fisik

### Langkah-langkah

1. **Clone Repository**
   ```bash
   git clone <repository-url>
   cd PraktikumWireframe
   ```

2. **Buka di Android Studio**
   - Buka Android Studio
   - File → Open → Pilih folder project
   - Tunggu Gradle sync selesai

3. **Build Project**
   ```bash
   ./gradlew build
   ```
   atau melalui Android Studio: Build → Make Project

4. **Run Aplikasi**
   - Pilih device/emulator
   - Klik tombol Run (▶️) atau Shift+F10
   - Aplikasi akan terinstall dan berjalan

## 📦 Komponen Utama

### Data Classes

**FoodItem.kt**
```kotlin
data class FoodItem(
    val id: Int,
    val name: String,
    val description: String,
    val price: String,
    val colorRes: Int
)
```

**OrderData.kt** - Singleton untuk menyimpan data pesanan
```kotlin
object OrderData {
    var namaUser: String = ""
    val makananDipilih = mutableListOf<String>()
    var namaPenerima: String = ""
    var alamat: String = ""
    var patokan: String = ""
}
```

### Activities

1. **SplashActivity** - Landing page dengan branding
2. **AuthChoiceActivity** - Pemilihan Login/Register
3. **LoginActivity** - Autentikasi user
4. **RegisterActivity** - Pendaftaran user baru
5. **HomeActivity** - Menampilkan 12 menu makanan
6. **OrderReviewActivity** - Review pesanan sebelum checkout
7. **AddressActivity** - Input alamat pengiriman
8. **ConfirmActivity** - Konfirmasi pesanan berhasil

## 🎯 Flow Aplikasi

```
Splash Screen
    ↓
Auth Choice (Register/Login)
    ↓
Login/Register Form
    ↓
Home (Pilih Makanan)
    ↓
Order Review
    ↓
Address Input
    ↓
Confirmation
    ↓
Back to Home/Exit
```

## 💡 Fitur Khusus

### 1. Dynamic Food List
- Menu makanan di-generate secara dinamis dari FoodData
- Setiap item memiliki color indicator yang berbeda
- Click anywhere on card untuk memilih

### 2. Material Design Components
- TextInputLayout dengan icon dan hint animasi
- Password toggle untuk show/hide
- CardView dengan elevation dan rounded corners
- Bottom Navigation dengan custom styling

### 3. Data Persistence
- Menggunakan Singleton pattern untuk OrderData
- Data user dan pesanan tersimpan selama session

### 4. User Experience
- Sapaan personal di setiap halaman
- Toast notification untuk validasi
- Smooth navigation flow
- Responsive design

## 📝 Dependencies

```kotlin
dependencies {
    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.material)
    implementation(libs.androidx.activity)
    implementation(libs.androidx.constraintlayout)
}
```

## 👨‍💻 Pengembang

- **Nama**: [Nama Anda]
- **NIM**: [NIM Anda]
- **Kelas**: [Kelas Anda]
- **Mata Kuliah**: Pemrograman Mobile / Android

## 📄 Lisensi

Project ini dibuat untuk keperluan pembelajaran dalam mata kuliah Pemrograman Mobile.

## 🙏 Terima Kasih

Terima kasih kepada:
- Dosen pengampu mata kuliah
- Teman-teman yang telah membantu
- Referensi Material Design dari Google

---

**© 2025 Mesen Makanan - Aplikasi Pemesanan Makanan Khas Bandung**

*Dibuat dengan ❤️ menggunakan Kotlin & Material Design*
