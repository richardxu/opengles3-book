package com.richard.hellotrianglendk;

//
//public class NativeActivity extends AppCompatActivity {
//
//    // Used to load the 'native-lib' library on application startup.
//    static {
//        //System.loadLibrary("native-lib");
//        System.loadLibrary("Hello_Triangle");
//    }
//
//    private final int CONTEXT_CLIENT_VERSION = 3;
//    private GLSurfaceView mGLSurfaceView;
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
////        setContentView(R.layout.activity_native);
//
//        // Example of a call to a native method
////        TextView tv = (TextView) findViewById(R.id.sample_text);
//       // tv.setText(stringFromJNI());
//
//        mGLSurfaceView = new GLSurfaceView(this);
//        if(detectOpenGLES30())
//        {
//            mGLSurfaceView.setEGLContextClientVersion(CONTEXT_CLIENT_VERSION);
//            //设置 Renderer 用于绘图
//           // mGLSurfaceView.setRenderer(new );
//        }
//    }
//
//    private boolean detectOpenGLES30()
//    {
//        ActivityManager am = (ActivityManager) getSystemService(Context.ACTIVITY_SERVICE);
//        ConfigurationInfo info = am.getDeviceConfigurationInfo();
//        return (info.reqGlEsVersion >= 0x30000);
//    }
//
//    /**
//     * A native method that is implemented by the 'native-lib' native library,
//     * which is packaged with this application.
//     */
//    //public native String stringFromJNI();
//}
