package com.localapps.a20calbackinterfaces;

import android.os.Bundle;
//              this is a call back interface
// we use it inside the activity so the activity it self now is an interface so we can call it from the fragment just with getACtivity because in this situation
// the activity it self is an interface
// after amplement it we have to put some logic inside this Activity giting the data comming from the fragment without any problem
// in this example i used bundle so you can put any cand of thata without any problem and you can get them easyly inside the Activity
public interface SendNameInterface {
void sendNameresult(Bundle bundle);
}
