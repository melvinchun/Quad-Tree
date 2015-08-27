/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sound;

/**
 *
 * @author guitartsword
 */
import java.applet.Applet;
import java.applet.AudioClip;
public class Sounds {
    public static final AudioClip boom = Applet.newAudioClip(Sounds.class.getResource("Boom.wav"));
    public static final AudioClip charge = Applet.newAudioClip(Sounds.class.getResource("charge.wav"));
    public static final AudioClip ding = Applet.newAudioClip(Sounds.class.getResource("ding.wav"));
    public static final AudioClip error = Applet.newAudioClip(Sounds.class.getResource("error.wav"));
    public static final AudioClip pop = Applet.newAudioClip(Sounds.class.getResource("pop.wav"));
    public static final AudioClip push = Applet.newAudioClip(Sounds.class.getResource("push.wav"));
}
