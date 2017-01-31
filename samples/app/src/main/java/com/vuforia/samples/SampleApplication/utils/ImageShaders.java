package com.vuforia.samples.SampleApplication.utils;

/**
 * Created by Runi on 24-01-2017.
 */

public class ImageShaders {

    public static final String IMAGE_MESH_VERTEX_SHADERS =
            //Test
            "attribute vec2 a_TexCoordinate;" +
                    "varying vec2 v_TexCoordinate;" +
                    //End Test
                    "uniform mat4 uMVPMatrix;" +
                    "attribute vec4 vPosition;" +
                    "void main() {" +
                    "  gl_Position = vPosition * uMVPMatrix;" +
                    //Test
                    "v_TexCoordinate = a_TexCoordinate;" +
                    //End Test
                    "}";

    public static final String IMAGE_MESH_FRAGMENT_SHADERS =
            "precision mediump float;" +
                    "uniform vec4 vColor;" +
                    //Test
                    "uniform sampler2D u_Texture;" +
                    "varying vec2 v_TexCoordinate;" +
                    //End Test
                    "void main() {" +
                    //"gl_FragColor = vColor;" +
                    "gl_FragColor = (v_Color * texture2D(u_Texture, v_TexCoordinate));" +
                    "}";
}
