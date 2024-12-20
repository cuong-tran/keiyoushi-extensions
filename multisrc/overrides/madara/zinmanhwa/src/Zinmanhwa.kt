package eu.kanade.tachiyomi.extension.en.zinmanhwa

import eu.kanade.tachiyomi.multisrc.madara.Madara
import java.text.SimpleDateFormat
import java.util.Locale

class Zinmanhwa : Madara(
    "Zinmanhwa",
    "https://zinmanga.io",
    "en",
    dateFormat = SimpleDateFormat("dd/MM/yy", Locale.US),
)
