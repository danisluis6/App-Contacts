# LOGINFACEBOOKAPP
- Project: Bai07 [[sudo chown -R $USER: $HOME]]
- Description: List View
- Trick: ExRecycle to custom ListView following personal

    - Basic Login Application Facebook 
    <?xml version="1.0" encoding="utf-8"?>
	<RelativeLayout xmlns:android="http://schemas.android.com/apk/res/android"
	    android:layout_width="match_parent"
	    android:layout_height="match_parent"
	    android:background="@color/bgFB">
	    <TextView
		android:layout_width="match_parent"
		android:layout_height="wrap_content"
		android:gravity="center"
		android:layout_marginTop="30dp"
		android:text="facebook"
		android:textStyle="bold"
		android:textSize="60dp"
		android:textColor="@color/titleFB"/>

	    <EditText
		android:layout_width="match_parent"
		android:layout_height="wrap_content"
		android:layout_centerHorizontal="true"
		android:layout_marginTop="120dp"
		android:layout_marginRight="20dp"
		android:layout_marginLeft="20dp"
		android:padding="12dp"
		android:hint="Email"
		android:textSize="15dp"
		android:background="@color/emailFB"/>

	    <EditText
		android:layout_width="match_parent"
		android:layout_height="wrap_content"
		android:layout_centerHorizontal="true"
		android:layout_marginTop="180dp"
		android:layout_marginRight="20dp"
		android:layout_marginLeft="20dp"
		android:padding="12dp"
		android:hint="Password"
		android:textSize="15dp"
		android:background="@color/passFB"/>

	    <Button
		android:layout_width="match_parent"
		android:layout_height="wrap_content"
		android:padding="12dp"
		android:text="Login"
		android:textColor="@color/btnLogin"
		android:background="@color/bgLogin"
		android:layout_marginTop="240dp"
		android:layout_marginLeft="20dp"
		android:layout_marginRight="20dp"
		/>
	    <TextView
		android:layout_width="match_parent"
		android:layout_height="wrap_content"
		android:text="@string/SignUpForFacebook"
		android:gravity="center"
		android:textSize="18dp"
		android:textColor="@color/btnLogin"
		android:layout_marginTop="430dp"/>
	    <Button
		android:layout_width="40dp"
		android:layout_height="40dp"
		android:layout_centerHorizontal="true"
		android:text="\?"
		android:padding="0dp"
		android:textSize="30dp"
		android:textStyle="bold"
		android:background="@color/bgLogin"
		android:textColor="@color/btnLogin"
		android:layout_marginTop="460dp"/>
	</RelativeLayout>

![alt tag](https://github.com/danisluis6/GUI/blob/master/LoginFacebookApp/1.png)

    - Basic Login Application Facebook. Only input data into one line 
    <?xml version="1.0" encoding="utf-8"?>
	<RelativeLayout xmlns:android="http://schemas.android.com/apk/res/android"
	    android:layout_width="match_parent"
	    android:layout_height="match_parent"
	    android:background="@color/bgFB">
	    <TextView
		android:layout_width="match_parent"
		android:layout_height="wrap_content"
		android:gravity="center"
		android:layout_marginTop="30dp"
		android:text="facebook"
		android:textStyle="bold"
		android:textSize="60dp"
		android:textColor="@color/titleFB"/>

	    <EditText
		android:layout_width="match_parent"
		android:layout_height="wrap_content"
		android:layout_centerHorizontal="true"
		android:layout_marginTop="120dp"
		android:layout_marginRight="20dp"
		android:layout_marginLeft="20dp"
		android:padding="12dp"
		android:hint="Email"
		android:textSize="15dp"
		android:background="@color/emailFB"
		android:lines="1"/>

	    <EditText
		android:layout_width="match_parent"
		android:layout_height="wrap_content"
		android:layout_centerHorizontal="true"
		android:layout_marginTop="180dp"
		android:layout_marginRight="20dp"
		android:layout_marginLeft="20dp"
		android:padding="12dp"
		android:hint="Password"
		android:textSize="15dp"
		android:background="@color/passFB"
		android:lines="1"/>

	    <Button
		android:layout_width="match_parent"
		android:layout_height="wrap_content"
		android:padding="12dp"
		android:text="Login"
		android:textColor="@color/btnLogin"
		android:background="@color/bgLogin"
		android:layout_marginTop="240dp"
		android:layout_marginLeft="20dp"
		android:layout_marginRight="20dp"
		/>
	    <TextView
		android:layout_width="match_parent"
		android:layout_height="wrap_content"
		android:text="@string/SignUpForFacebook"
		android:gravity="center"
		android:textSize="18dp"
		android:textColor="@color/btnLogin"
		android:layout_marginTop="430dp"/>
	    <Button
		android:layout_width="40dp"
		android:layout_height="40dp"
		android:layout_centerHorizontal="true"
		android:text="\?"
		android:padding="0dp"
		android:textSize="30dp"
		android:textStyle="bold"
		android:background="@color/bgLogin"
		android:textColor="@color/btnLogin"
		android:layout_marginTop="460dp"/>
	</RelativeLayout>



