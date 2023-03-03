package properties

import java.util.*
import java.lang.Exception


object PropertiesUtil {
    fun loadProperty(propertiesURL: String?): Properties? {
        return try {
            val properties = Properties()
            val inputStream = PropertiesUtil::class.java
                .classLoader.getResourceAsStream(propertiesURL)
            properties.load(inputStream)
            properties
        } catch (e: Exception) {
            //e.printStackTrace()
            null
        }
    }
}