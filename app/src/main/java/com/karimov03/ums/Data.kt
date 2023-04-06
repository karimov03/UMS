package com.karimov03.ums

object Data {
    data class Tariflar(
        val name:String,
        val kod:String,
        val about:String,
        val fullabout:String

    )

    var list=ArrayList<Tariflar>()
    var daqiqalar=ArrayList<Tariflar>()
    fun addTAriflar(){
        list.add(Tariflar("Mobi 60","*111*134#","UNLIM\n" +
                "Mobiuz tarmog'i ichidagi qo‘ng‘iroqlarga","5000/167 Daqiqa\n" +
                "O‘zbekistonning boshqa mobil operatorlari va shahar raqamlariga chiquvchi qo‘ng‘iroqlarga oyiga/kuniga;\n" +
                "15000/500 MB\n" +
                "Mobil internet oyiga/kuniga;\n" +
                "5000/167 SMS\n" +
                "oyiga/kuniga"))
        list.add(Tariflar("Mobi 40","*111*134#","UNLIM\n" +
                "Mobiuz tarmog'i ichidagi qo‘ng‘iroqlarga","5000/167 Daqiqa\n" +
                "O‘zbekistonning boshqa mobil operatorlari va shahar raqamlariga chiquvchi qo‘ng‘iroqlarga oyiga/kuniga;\n" +
                "15000/500 MB\n" +
                "Mobil internet oyiga/kuniga;\n" +
                "5000/167 SMS\n" +
                "oyiga/kuniga"))
        list.add(Tariflar("Mobi 20","*111*134#","UNLIM\n" +
                "Mobiuz tarmog'i ichidagi qo‘ng‘iroqlarga","5000/167 Daqiqa\n" +
                "O‘zbekistonning boshqa mobil operatorlari va shahar raqamlariga chiquvchi qo‘ng‘iroqlarga oyiga/kuniga;\n" +
                "15000/500 MB\n" +
                "Mobil internet oyiga/kuniga;\n" +
                "5000/167 SMS\n" +
                "oyiga/kuniga"))
        list.add(Tariflar("   Mobi\nSTUDENT","*111*134#","UNLIM\n" +
                "Mobiuz tarmog'i ichidagi qo‘ng‘iroqlarga","5000/167 Daqiqa\n" +
                "O‘zbekistonning boshqa mobil operatorlari va shahar raqamlariga chiquvchi qo‘ng‘iroqlarga oyiga/kuniga;\n" +
                "15000/500 MB\n" +
                "Mobil internet oyiga/kuniga;\n" +
                "5000/167 SMS\n" +
                "oyiga/kuniga"))
        list.add(Tariflar("Mobi 100","*111*134#","UNLIM\n" +
                "Mobiuz tarmog'i ichidagi qo‘ng‘iroqlarga","5000/167 Daqiqa\n" +
                "O‘zbekistonning boshqa mobil operatorlari va shahar raqamlariga chiquvchi qo‘ng‘iroqlarga oyiga/kuniga;\n" +
                "15000/500 MB\n" +
                "Mobil internet oyiga/kuniga;\n" +
                "5000/167 SMS\n" +
                "oyiga/kuniga"))
        list.add(Tariflar("   Mobi\nCHEKSIZ","*111*134#","UNLIM\n" +
                "Mobiuz tarmog'i ichidagi qo‘ng‘iroqlarga","5000/167 Daqiqa\n" +
                "O‘zbekistonning boshqa mobil operatorlari va shahar raqamlariga chiquvchi qo‘ng‘iroqlarga oyiga/kuniga;\n" +
                "15000/500 MB\n" +
                "Mobil internet oyiga/kuniga;\n" +
                "5000/167 SMS\n" +
                "oyiga/kuniga"))
    }
    fun addDaqiqalar(){
        daqiqalar.add(
            Tariflar("60 daqiqa","*111*134#","UNLIM\n" +
                    "Mobiuz tarmog'i ichidagi qo‘ng‘iroqlarga","5000/167 Daqiqa\n" +
                    "O‘zbekistonning boshqa mobil operatorlari va shahar raqamlariga chiquvchi qo‘ng‘iroqlarga oyiga/kuniga;\n" +
                    "15000/500 MB\n" +
                    "Mobil internet oyiga/kuniga;\n" +
                    "5000/167 SMS\n" +
                    "oyiga/kuniga")
        )
        daqiqalar.add(
            Tariflar("20 daqiqa","*111*134#","UNLIM\n" +
                    "Mobiuz tarmog'i ichidagi qo‘ng‘iroqlarga","5000/167 Daqiqa\n" +
                    "O‘zbekistonning boshqa mobil operatorlari va shahar raqamlariga chiquvchi qo‘ng‘iroqlarga oyiga/kuniga;\n" +
                    "15000/500 MB\n" +
                    "Mobil internet oyiga/kuniga;\n" +
                    "5000/167 SMS\n" +
                    "oyiga/kuniga")
        )
        daqiqalar.add(
            Tariflar("400 daqiqa","*111*134#","UNLIM\n" +
                    "Mobiuz tarmog'i ichidagi qo‘ng‘iroqlarga","5000/167 Daqiqa\n" +
                    "O‘zbekistonning boshqa mobil operatorlari va shahar raqamlariga chiquvchi qo‘ng‘iroqlarga oyiga/kuniga;\n" +
                    "15000/500 MB\n" +
                    "Mobil internet oyiga/kuniga;\n" +
                    "5000/167 SMS\n" +
                    "oyiga/kuniga")
        )
        daqiqalar.add(
            Tariflar("100 daqiqa","*111*134#","UNLIM\n" +
                    "Mobiuz tarmog'i ichidagi qo‘ng‘iroqlarga","5000/167 Daqiqa\n" +
                    "O‘zbekistonning boshqa mobil operatorlari va shahar raqamlariga chiquvchi qo‘ng‘iroqlarga oyiga/kuniga;\n" +
                    "15000/500 MB\n" +
                    "Mobil internet oyiga/kuniga;\n" +
                    "5000/167 SMS\n" +
                    "oyiga/kuniga")
        )
        daqiqalar.add(
            Tariflar("300 daqiqa","*111*134#","UNLIM\n" +
                    "Mobiuz tarmog'i ichidagi qo‘ng‘iroqlarga","5000/167 Daqiqa\n" +
                    "O‘zbekistonning boshqa mobil operatorlari va shahar raqamlariga chiquvchi qo‘ng‘iroqlarga oyiga/kuniga;\n" +
                    "15000/500 MB\n" +
                    "Mobil internet oyiga/kuniga;\n" +
                    "5000/167 SMS\n" +
                    "oyiga/kuniga")
        )

        daqiqalar.add(
            Tariflar("  CHEKSIZ\n   daqiqa","*111*134#","UNLIM\n" +
                    "Mobiuz tarmog'i ichidagi qo‘ng‘iroqlarga","5000/167 Daqiqa\n" +
                    "O‘zbekistonning boshqa mobil operatorlari va shahar raqamlariga chiquvchi qo‘ng‘iroqlarga oyiga/kuniga;\n" +
                    "15000/500 MB\n" +
                    "Mobil internet oyiga/kuniga;\n" +
                    "5000/167 SMS\n" +
                    "oyiga/kuniga")
        )
    }
}