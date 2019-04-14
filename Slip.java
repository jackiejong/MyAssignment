package hfad.com.myassignment;

import android.support.v4.app.NotificationCompat;

import com.google.gson.annotations.SerializedName;

public class Slip {

    @SerializedName("advice")
    private String advice;

    @SerializedName("slip_id")
    private String slip_id;

    public String getAdvice() {
        return advice;
    }

    public void setAdvice(String advice) {
        this.advice = advice;
    }

    public String getSlip_id() {
        return slip_id;
    }

    public void setSlip_id(String slip_id) {
        this.slip_id = slip_id;
    }
}
