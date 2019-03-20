package fi.iki.jka;

import org.junit.Test;

import javax.swing.*;

import java.awt.event.ActionEvent;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;





public class JPhotoFrameTest {

    private int exceptioncount = 0;

    @Test
    public void checkIfNoPhotosAvailable() throws Exception {
        //JPhoto photos = new JPhoto();
        JPhotoCollection photos = null;

        JPhotoFrame jPhotoFrame = new JPhotoFrame(null, photos);

        jPhotoFrame.action_start_slideshow();
    }

    @Test
    public void checkActionPerformed() throws Exception {

        ActionEvent actionEvent = new ActionEvent(this, 0, JPhotoMenu.A_SLIDESHOW);

        JPhotoCollection photos = null;
        JPhotoFrame jPhotoFrame = new JPhotoFrame(null, photos);

        jPhotoFrame.actionPerformed(actionEvent);

        assertThat(jPhotoFrame.Interval, equalTo(5000));
    }

    @Test
    public void checkActionPerformedNewVersion() throws Exception {

        ActionEvent actionEvent = new ActionEvent(this, 0, JPhotoMenu.A_SLIDESHOW_FAST);

        JPhotoCollection photos = null;
        JPhotoFrame jPhotoFrame = new JPhotoFrame(null, photos);

        jPhotoFrame.actionPerformed(actionEvent);

        @Override
                jPhotoFrame.action_start_slideshow()
        {
            counter = Integer;
        }



        assertThat(jPhotoFrame.Interval, equalTo(10000));

    }
}


