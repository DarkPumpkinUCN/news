/*
 * Copyright 2020 Nicolae Soto Maldonado, nsm006@alumnos.ucn.cl
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation files (the "Software"), to deal in the Software without restriction, including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */

package cl.ucn.disc.dsm.nsoto.news.model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.threeten.bp.ZoneId;
import org.threeten.bp.ZonedDateTime;


 /**
  * Testing of News.
  *
  * @author Nicolae Soto Maldonado.
  */
 public final class TestNews {

     /**
 	* The Logger
 	*/
     private static final Logger log = LoggerFactory.getLogger(TestNews.class);
     /**
 	* Testing the constructor
 	*/
     @Test
     public void testContructor() {
        	log.debug("Testing ..");
        	// all data ok
        	News news = new News(
                	"The Title",
                	"The Source",
                	"The Author",
                	"The URL",
                	"The URL Image",
                	"The Description",
                	"The Content",
                	ZonedDateTime.now(ZoneId.of("-3")) 	);

        	log.debug("The id: {}.", news.getId());
        	Assertions.assertEquals(1182003507361219134L, news.getId(), "Wrong id !");
        	log.debug("Title null ..");

        	Assertions.assertThrows(IllegalArgumentException.class, () -> {
            	new News(
                    	null,
                    	"The Source",
                    	"The Author",
                    	"The URL",
                    	"The URL Image",
                    	"The Description",
                    	"The Content",
                    	ZonedDateTime.now(ZoneId.of("-3")) 	);

            	});

        	log.debug("Source null ..");
        	Assertions.assertThrows(IllegalArgumentException.class, () -> {
            	new News(
                        "The Title",
                        null,
                        "The Author",
                        "The URL",
                        "The URL Image",
                        "The Description",
                        "The Content",
                        ZonedDateTime.now(ZoneId.of("-3"))

                    	);

            	});


        	log.debug("Author null ..");
        	Assertions.assertThrows(IllegalArgumentException.class, () -> {
            	new News(
                    	"The Title",
                    	"The Source",
                    	null,
                    "The URL",
                    	"The URL Image",
                    	"The Description",
                    	"The Content",
                    	ZonedDateTime.now(ZoneId.of("-3")) 	);

            	});

        	log.debug("Description null ..");
        	Assertions.assertThrows(IllegalArgumentException.class, () -> {
            	new News(
                    	"The Title",
                    	"The Source",
                    	"The Author",
                    	"The URL",
                    	"The URL Image",
                    	null,
                    	"The Content",
                    	ZonedDateTime.now(ZoneId.of("-3")) 	);

            	});

        	log.debug("Content null ..");
        	Assertions.assertThrows(IllegalArgumentException.class, () -> {
            	new News(
                    	"The Title",
                    	"The Source",
                    	"The Author",
                    	"The URL",
                    	"The URL Image",
                    	"The Description",
                    	null,
                    	ZonedDateTime.now(ZoneId.of("-3")) 	);

            	});

        	log.debug("PublishedAt null ..");
        	Assertions.assertThrows(IllegalArgumentException.class, () -> {
            new News(
                    	"The Title",
                    	"The Source",
                    	"The Author",
                    	"The URL",
                    	"The URL Image",
                    	"The Description",
                    	"The Content",
                    	null
            	);

        	});


        	log.debug(".. Done!");
        }
}





/*public class TestNews {

    private static final Logger log = LoggerFactory.getLogger(News.class);

    @Test
    public void TestNews(){
        final Faker faker = Faker.instance();

        News tNews = new News(
                faker.book().title(),
                faker.name().username(),
                faker.name().fullName(),
                faker.internet().url(),
                faker.internet().avatar(),
                faker.harryPotter().quote(),
                faker.lorem().paragraph(3),
                ZonedDateTime.now(ZoneId.of("-3")));

        System.out.println(tNews.getId() + "\n" + tNews.getTitle() + "\n" + tNews.getAuthor() + "\n"
                + tNews.getContent() + "\n" + tNews.getDescription() + "\n" + tNews.getSource() +
                "\n" + tNews.getUrl() + "\n" + tNews.getUrlImage() + "\n" + tNews.getPublishedAt());

    }
}*/
