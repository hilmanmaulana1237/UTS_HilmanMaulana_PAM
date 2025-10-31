package com.example.praktikumwireframe

data class FoodItem(
    val id: Int,
    val name: String,
    val description: String,
    val price: String,
    val colorRes: Int
)

object FoodData {
    val foodList = listOf(
        FoodItem(
            1,
            "Cimol Bandung Original",
            "Cemilan khas Bandung dari tepung tapioka dengan bumbu rahasia yang gurih",
            "Rp 10.000",
            R.color.primaryOrange
        ),
        FoodItem(
            2,
            "Basreng Pedas Nampol",
            "Bakso goreng dari ikan tenggiri dengan tingkat kepedasan maksimal",
            "Rp 12.000",
            R.color.accentYellow
        ),
        FoodItem(
            3,
            "Cireng Isi Abon",
            "Aci digoreng isi abon sapi pilihan dengan saus sambal khas",
            "Rp 8.000",
            R.color.accentGreen
        ),
        FoodItem(
            4,
            "Seblak Ceker Mercon",
            "Seblak dengan ceker ayam dan tingkat kepedasan yang menantang",
            "Rp 15.000",
            R.color.accentPurple
        ),
        FoodItem(
            5,
            "Batagor Kuah Kacang",
            "Baso tahu goreng dengan kuah kacang kental dan lezat",
            "Rp 13.000",
            R.color.primaryOrange
        ),
        FoodItem(
            6,
            "Cilok Bumbu Kacang",
            "Aci dicolok dengan bumbu kacang dan kecap manis",
            "Rp 7.000",
            R.color.accentYellow
        ),
        FoodItem(
            7,
            "Cuanki Bandung",
            "Pangsit rebus dengan bakso dan siomay dalam kuah kaldu segar",
            "Rp 14.000",
            R.color.accentGreen
        ),
        FoodItem(
            8,
            "Mie Kocok Bandung",
            "Mie kuah dengan kikil sapi dan tauge segar khas Bandung",
            "Rp 16.000",
            R.color.accentPurple
        ),
        FoodItem(
            9,
            "Siomay Bandung Komplit",
            "Siomay lengkap dengan telur, kentang, kol, dan saus kacang",
            "Rp 15.000",
            R.color.primaryOrange
        ),
        FoodItem(
            10,
            "Surabi Oncom Premium",
            "Kue surabi dengan topping oncom dan kelapa parut manis",
            "Rp 9.000",
            R.color.accentYellow
        ),
        FoodItem(
            11,
            "Karedok Sayur Segar",
            "Salad sayuran segar dengan bumbu kacang pedas khas Sunda",
            "Rp 11.000",
            R.color.accentGreen
        ),
        FoodItem(
            12,
            "Lotek Bandung Spesial",
            "Sayuran rebus dengan bumbu kacang dan lontong",
            "Rp 12.000",
            R.color.accentPurple
        )
    )
}
