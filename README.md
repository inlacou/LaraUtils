# LaraUtils

Add this to AndroidManifest.xml, into the application tag:
```xml
<activity android:name="com.inlacou.larautils.DummyAct"/>
```

Add this where you want to launch the dummy activity:
```kt
DummyAct.navigate(this, R.layout.your_activity_xml_here)
```
Where `this` is any activity class.
