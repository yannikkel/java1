int customerAccount = 100;
        int bonusScale = 100;
        int uploadVolume = 1200;
        int bonus;
        int bonus = 0;

        if (uploadVolume >= 1000){
            bonus = uploadVolume / bonusScale;
        } else {
            bonus = 0;
        }

        int totalAccount = customerAccount + uploadVolume + bonus;