package com.example.mysubmission_dicoding

object KulinerData {



    private val kulinerNames = arrayOf(
            "Coto Makassar",
            "Pisang ijo",
            "Pisang Epe",
            "Cindolo Tape",
            "Pacco",
            "Lawa",
            "Barobbo",
            "Coto Kuda",
            "Nasu Likku",
            "Kapurung"
    )

    private val kulinerDetail= arrayOf(
            "Coto makassar atau coto mangkasara adalah makanan tradisional Makassar, Sulawesi Selatan. Makanan ini terbuat dari jeroan sapi yang direbus dalam waktu yang lama.",
            "Pisang ijo atau es pisang ijo adalah sejenis makanan khas di Sulawesi Selatan, terutama di kota Makassar, dengan bahan utama dari pisang.",
            "Kata “epe” sendiri berasal dari bahasa Makassar yang berarti “jepit”. Jadi, Pisang Epe secara lengkap bisa diartikan menjadi pisang bakar yang dijepit dan menjadi gepeng.",
            "CinTa adalah salahsatu makanan favorite orang bugis di Pinrang, perpaduan makanan cendol dan tape yang digabung jadi sebutannya orang bugis cindolo' na tape.",
            "Pacco adalah salah satu makanan tradisional penduduk Luwu Sulawesi Selatan di daerah pesisir pantai, karena bahan utama makanan ini adalah makanan dari laut yang masih segar.",
            "Lawa Bale adalah sejenis makanan khas bugis yang berbahan pokok ikan segar mentah. ",
            "Barobbo adalah kuliner tradisional khas Makassar, Sulawesi Selatan. Kuliner ini berupa bubur yang berbahan dasar jagung.",
            "Coto Kuda menu masakan khas dari Turatea. Kabupaten Jeneponto yang dijuluki Butta Turatea (Tanah Orang Atas) dikenal identik dengan kuda",
            "Nasu Likku adalah olahan lengkuas pada ayam kampung yang disajikan dengan pulut kuning. ... Untuk bahan dasarnya memakai daging ayam dan penggunaan lengkuas yang lebih banyak",
            "Kappurung adalah salah satu makanan khas tradisional di Sulawesi Selatan, khususnya masyarakat daerah Luwu juga di Tawau, di Sabah, Malaysia yang dihuni masyarakat mayoritas suku Bugis."
    )

    private val kulinerImages = intArrayOf(
        R.drawable.cotomakassar10,
        R.drawable.pisangijo9,
        R.drawable.pisangepe8,
        R.drawable.cindoltape7,
        R.drawable.pacco6,
        R.drawable.lawa5,
        R.drawable.barobbo4,
        R.drawable.cotokuda3,
        R.drawable.nasulikku2,
        R.drawable.kapurung1
    )

    private val kandungangizi= arrayOf(
        """
            Energi
            Lemak
            Protein
            Karbohidrat
        """.trimIndent(),
        """
            Carbohydrates
            Sodium
            Protein
        """.trimIndent(),
        """
            Carbohydrates
            Sodium
            Protein
        """.trimIndent(),
        """
            energy 
            karbohidrat
            protein 
            lipid
        """.trimIndent(),
        """
            Energi
            Protein 
            Lemak 
        """.trimIndent(),
        """
            protein 11,7 g 
            lemak 11,6 g 
            fosfor mg 
            besi 1,2 mg 
            kalsium 28 mg
        """.trimIndent(),
        """
            Vitamin C
            Vitamin A
        """.trimIndent(),
        """
            nutrisi 
            kalori
            Protein 
        """.trimIndent(),
        """
            protein  
            riboflavin
            niasin 
            fosfor
        """.trimIndent(),
        """
            riboflavin 
            tiamina 
            niasin  
            serat
            air  
            kalium.
        """.trimIndent()
    )

    private val jumlah= arrayOf(
            """
                1207  kj
                15,25 g
                25,4  g
                12,92 g 
            """.trimIndent(),
            """
                13,3  g
                31,3  mg
                8,1   g
            """.trimIndent(),
            """
                13,3  g
                31,3  mg
                8,1   g
            """.trimIndent(),
            """
                95,80 Kkal
                8,25  g
                1,21  g 
                6,44  g
            """.trimIndent(),
            """
                233  kkal
                27   g 
                11   g
            """.trimIndent(),
            """
                11,7  g  
                11,6  g 
                148   mg  
                1,2   mg 
                28    mg
            """.trimIndent(),
            """
                10    mg
                273   mg
            """.trimIndent(),
            """
                133    g
                133    g
                6.80   g
            """.trimIndent(),
            """
                14,5   g
                0,24   mg
                1,5    mg
                157    mg
            """.trimIndent(),
            """
                0,25  mg 
                0,12  mg
                2,7   mg 
                2,0   g
                79,6  g
                566,0 mg
            """.trimIndent()
    )

 private val caraMembuat= arrayOf(
         """
            Persiapan bumbu:
            Haluskan bawang bombay,bawang merah, bawang putih, minyak.
            Haluskan kacang tanah yang sudah digoreng dengan blender, tingkat kehalusan kacang disesuaikan dengan selera.
            Masukkan lengkuas. ...
            Masukkan daging, Tambahkan air, rebus hingga mendidih.
            Setelah mendidih, masukkan paru. 
            Masukkan kacang dan tauco kedalam rebusan, rebus sampai daging mulai matang.
            Bumbui dengan garam, merica dan gula.
            Rebus hingga kuah berkurang dan mulai mengental.
            Sajikan, lalu tambahkan daun bawang yang sudah diiris, bawang goreng dan jeruk nipis pada saat penyajian. Sajikan bersama ketupat dan sambal tauco.
            Sambal tauco:
            Blender bumbu tauco bersama dengan cabai rawit dan sedikit air.
         """.trimIndent(),
         """
             Cuci dan kukus pisang raja selama kurang lebih 10 menit sampai matang. Setelah matang kupas pisang dan sisihkan.
             Sembari menunggu pisang yang dikukus, blender 2 ikat daun pandan lebar atau segenggam daun pandam kecil dengan air 250 ml, peras dan saring.
             Campurkan santan kental dan air perasan daun pandan dengan tepung beras dan tepung terigu. Masukkan sedikit demi sedikit sambil diaduk-aduk agar tidak menggumpal.
             Tambahkan gula dan pasta pandan, aduk lagi sampai rata.
             Kukus adonan dalam wadah tahan panas selama 20 menit. Jangan khawatir jika adonan tampak cair karena nanti akan lebih liat setelah dikukus. Jika telah mencapai 20 menit angkat dan uleni adonan sampai kalis
             Ambil beberapa sendok adonan dan letakkan di atas kertas minyak, pipihkan. Isi dengan pisang lalu tutup dengan adonan. Rapikan bentuknya dengan bantuan plastik. Lanjutkan sampai habis.
             Tata daun pisang diatas wadah datar tahan panas lalu letakkan adonan pisang hijau di atasnya. Beri jarak agar tidak menempel. Kukus selama 15 menit. Jika telah matang, angkat dan dinginkan.
             Sembari menunggu adonan pisang hijau matang. Kita akan membuat vla :) Masukkan semua bahan dalam panci dan masak dengan api kecil. Aduk terus sampai mendidih dan vla mengental.
             Untuk menghidangkan:
             Letakkan beberapa sendok vla sesuai selera, potong-potong pisang hijau dan tata di atas vla. Beri potongan es (lebih enak yang dihancurkan) lalu siram dengan sirup coco pandan dan susu kental manis.
         """.trimIndent(),
         """
             Rebus bahan saus smp mendidih & gula larut,jika sdh hangat saring.
             Panaskan teflon oles mentega hingga leleh.
             Kupas pisang lalu pipihkan pelan,panggang bolak-balik smp semua sisi kecoklatan.
             Penyelesaian:tata pisang siram dgn saus gula merahnya taburi dgn kacang sangrainya
         """.trimIndent(),
         """
            Cendol: campur semua bahan. Aduk rata sampai tidak bergerindil. Masak dengan api kecil sambil di aduk hingga kental dan halus. Diamkan sebentar.
            Cetak menggunakan cetakan cendol di wadah yang sudah di isi air dingin. Jika tidak punya bisa gunakan plastik segitiga yang di gunting ujungnya. Tekan sedikit demi sedikit.
            Campur semua bahan santan. Rebus dengan api kecil sambil di aduk agar santan tidak pecah. Setelah matang angkat dan dinginkan.
            Campur semua bahan kuah gula merah. Masak dengan api kecil hingga gula larut dan mendidih. Dinginkan
            Siapkan gelas. Masukkan gula merah, tape cendol dan siram kuah santan. Jangan lupa di aduk dulu sebelum di konsumsi agar rasanya enak.
         """.trimIndent(),
         """
            ikan dibersihkan dulu, kemudian dibasuh dengan air masak. Setelah itu, ditambahkan perasan jeruk nipis dan dibiarkan 10 menit.
            Ikan kemudian dicampur bersama bumbu-bumbu yang berupa cabai rawit, jeruk sambel, garam, dan kacang tanah goreng atau bisa dikatakan dengan bumbu kacang. 
            Kuliner ini terasa segar, agak asam, dan gurih.
         """.trimIndent(),
         """
             Bahan dasarnya dari ikan ukuran kecil, bisa ikan teri atau ikan banjar. Proses pengolahannya cukup mudah. Setelah ikan dibersihkan, beri perasan jeruk nipis, garam, serta kelapa parut.
         """.trimIndent(),
         """
             
         """.trimIndent(),
         """
             Cuci bersi beras selanjutnya masak beras sampai pecah. sementara beras di masak. 
             Kalau jagung & beras sudah masak. masukan wortel,kacang pngjng,ayam, udang,bakso.
             Bumbu halus: bled bawang merah.bawang putih.serai samapi halus br tumis sampai harum.
             Terahir sayur bayam masukan bersama bumbu tumis aduk2 sampai matang.
         """.trimIndent(),
         """
             Rebus daging kuda, usus, dan hati. Saat merebus masukkan lengkuas, jahe, dan salam.
             Setelah matang, angkat dan tiriskan bahan tersebut setelah ditiriskan potong jeroan kuda menjadi dadu-dadu kecil.
             Siapkan wajan, kemudian panaskan minyak. Tumis bumbu-bumbu yang sudah dihaluskan hingga matang dan berbau harum.
             Masukkan bumbu tersebut ke dalam panci yang berisikan daging serta jeroan daging kuda.
             Panasakan
             sampai mendidih kemudian masukan santan. Diamkan beberapa saat
             setelah benar-benar matang matikan kompor, coto daging kuda pun siap
             dihidangkan, agar lebih nikmat sajikan coto dengan ketupat
         """.trimIndent(),
         """
             Rebus ayam sampai empuk, angkat. Sisihkan
             Sangrai kelapa lalu tumbuk sebentar saja
             Ulek halus kemiri, ketumbar, lada, bawang merah, jahe, bawang putih, kunyit, cabe rawit jika sudah halus tambahkan parutan lengkuas uleg lagi hingga lemgkuas tercampur rata dengan bumbu halus
             Tumis bumbu sampai harum lalu masukkan sereh yang sudah digeprek, daun salam aduk2 lalu turunkan santan beri garam dan masako koreksi rasa
             Turunkan ayam dan kelapa sangrai aduk2 sampai airnya menyusut
             Sajikan dengan burasa atau nasi putih
         """.trimIndent(),
         """
            1. Dalam wadah besar, tuang adonan sagu yang sudah dibulat-bulatkan beserta airnya.
            2. Tuang sayur beserta airnya, bumbu halus, kuah ikan masak kuning, udang, air perasan jeruk nipis, garam, dan penyedap rasa. Aduk rata lalu koreksi rasanya.
            3. Siap disajikan.  
         """.trimIndent()

 )

    val listData: ArrayList<kuliner>
    get() {
        val list = arrayListOf<kuliner>()
        for (position in kulinerNames.indices){
            val kuliner = kuliner()
            kuliner.name= kulinerNames[position]
            kuliner.detail= kulinerDetail[position]
            kuliner.img= kulinerImages[position]
            kuliner.kandunganGizi= kandungangizi[position]
            kuliner.jumlahGizi= jumlah[position]
            kuliner.caraMembuat= caraMembuat[position]
            list.add(kuliner)
        }
        return list
    }
}