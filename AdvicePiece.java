package hfad.com.myassignment;

import com.google.gson.annotations.SerializedName;

public class AdvicePiece {

    @SerializedName("slip")
    private Slip slip;

    public Slip getSlip() {
        return slip;
    }

    public void setSlip(Slip slip) {
        this.slip = slip;
    }
}
