package com.rachna;

import java.util.Random;

public class GeneralUtils {

        private GeneralUtils(){ }

        private final static Random random = new Random();
        public static Random getRandomFunction(){
            return random;
        }
    }
