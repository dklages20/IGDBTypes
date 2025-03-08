import com.fasterxml.jackson.module.kotlin.jacksonObjectMapper
import com.fasterxml.jackson.module.kotlin.readValue
import io.github.dklages20.igdb.types.AgeRating

fun main() {
    val om = jacksonObjectMapper()
    val ageRating = om.readValue<List<AgeRating>>("[\n" +
            "\t{\n" +
            "\t\t\"id\": 41302,\n" +
            "\t\t\"category\": 1,\n" +
            "\t\t\"content_descriptions\": [\n" +
            "\t\t\t44647,\n" +
            "\t\t\t44648\n" +
            "\t\t],\n" +
            "\t\t\"rating\": 8,\n" +
            "\t\t\"checksum\": \"494c694a-5a6d-be36-98f8-050e0dfa47f8\",\n" +
            "\t\t\"organization\": 1,\n" +
            "\t\t\"rating_category\": 8,\n" +
            "\t\t\"rating_content_descriptions\": [\n" +
            "\t\t\t1,\n" +
            "\t\t\t47\n" +
            "\t\t]\n" +
            "\t}\n" +
            "]")

    println(ageRating.first())
}
