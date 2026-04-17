# Unclassified Code Snippets

These code blocks could not be automatically classified. Please review and manually organize them.

## Code Block 1
```java
@Override
protected void onCreate(Bundle savedInstanceState) {
```

## Code Block 2
```java
@Override
public void onClick(View view) {
```

## Code Block 3
```java
@Override
public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
```

## Code Block 4
```java
@Override
public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
```

## Code Block 5
```java
@Override
public void afterTextChanged(Editable editable) {
```

## Code Block 6
```java
@Override
public boolean onCreateOptionsMenu(Menu menu) {
```

## Code Block 7
```java
@Override
public boolean onOptionsItemSelected(@NonNull MenuItem item) {
```

## Code Block 8
```java
@Override
public void onClick(View view) {
```

## Code Block 9
```java
@Override
public void onClick(View view) {
```

## Code Block 10
```java
private Button mCaptureBtn, mShootPhotoModeBtn, mRecordVideoModeBtn, btnMore;
private ToggleButton mRecordBtn;
private TextView recordingTime, con_mode, distanc, compas, speed, height, battery, sat_nu;
private Handler handler;
private FlightController mFlightController;
private Battery mBattery;
private RemoteController mRemoteController;
private Compass compass;
private float compass_float = 0.0f, distance = 0, horizontal_distance = 0;
private double droneLocationLat = 181, droneLocationLng = 181;
private double home_droneLocationLat = 181, home_droneLocationLng = 181;
private float altitude = 100.0f, VelocityX = 0, VelocityY = 0, VelocityZ = 0, Velocity = 0;
private int sat_num = 0;
@Override
protected void onCreate(Bundle savedInstanceState) {
```

## Code Block 11
```java
@Override
public void onReceive(byte[] videoBuffer, int size) {
```

## Code Block 12
```java
@Override
public void onUpdate(SystemState cameraSystemState) {
```

## Code Block 13
```java
@Override
public void run() {
```

## Code Block 14
```java
protected void onProductChange() {
```

## Code Block 15
```java
private void loginAccount() {
```

## Code Block 16
```java
@Override
public void onSuccess(final UserAccountState userAccountState) {
```

## Code Block 17
```java
@Override
public void onFailure(DJIError error) {
```

## Code Block 18
```java
@Override
public void onResume() {
```

## Code Block 19
```java
@Override
public void onPause() {
```

## Code Block 20
```java
@Override
public void onStop() {
```

## Code Block 21
```java
public void onReturn(View view) {
```

## Code Block 22
```java
@Override
protected void onDestroy() {
```

## Code Block 23
```java
private void initUI() {
```

## Code Block 24
```java
private void initPreviewer() {
```

## Code Block 25
```java
@Override
public void onUpdate(BatteryState batteryState) {
```

## Code Block 26
```java
@Override
public void run() {
```

## Code Block 27
```java
@Override
public void onSuccess(AircraftMappingStyle aircraftMappingStyle) {
```

## Code Block 28
```java
@Override
public void run() {
```

## Code Block 29
```java
@Override
public void run() {
```

## Code Block 30
```java
@Override
public void run() {
```

## Code Block 31
```java
@Override
public void onFailure(DJIError djiError) {
```

## Code Block 32
```java
private void uninitPreviewer() {
```

## Code Block 33
```java
@Override
public void onSurfaceTextureAvailable(SurfaceTexture surface, int width, int height) {
```

## Code Block 34
```java
@Override
public void onSurfaceTextureSizeChanged(SurfaceTexture surface, int width, int height) {
```

## Code Block 35
```java
@Override
public boolean onSurfaceTextureDestroyed(SurfaceTexture surface) {
```

## Code Block 36
```java
@Override
public void onSurfaceTextureUpdated(SurfaceTexture surface) {
```

## Code Block 37
```java
public void showToast(final String msg) {
```

## Code Block 38
```java
private void switchCameraFlatMode(SettingsDefinitions.FlatCameraMode flatCameraMode) {
```

## Code Block 39
```java
private void switchCameraMode(SettingsDefinitions.CameraMode cameraMode) {
```

## Code Block 40
```java
private void captureAction() {
```

## Code Block 41
```java
private void takePhoto() {
```

## Code Block 42
```java
@Override
public void run() {
```

## Code Block 43
```java
private void startRecord() {
```

## Code Block 44
```java
private void stopRecord() {
```

## Code Block 45
```java
private boolean isMavicAir2() {
```

## Code Block 46
```java
private boolean isM300() {
```

## Code Block 47
```java
private List<String> missingPermission = new ArrayList<>();
private AtomicBoolean isRegistrationInProgress = new AtomicBoolean(false);
private static final int REQUEST_PERMISSION_CODE = 12345;
@Override
protected void onCreate(Bundle savedInstanceState) {
```

## Code Block 48
```java
private void checkAndRequestPermissions() {
```

## Code Block 49
```java
@Override
public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
```

## Code Block 50
```java
private void startSDKRegistration() {
```

## Code Block 51
```java
@Override
public void run() {
```

## Code Block 52
```java
@Override
public void onRegister(DJIError djiError) {
```

## Code Block 53
```java
@Override
public void onProductDisconnect() {
```

## Code Block 54
```java
@Override
public void onProductConnect(BaseProduct baseProduct) {
```

## Code Block 55
```java
@Override
public void onProductChanged(BaseProduct baseProduct) {
```

## Code Block 56
```java
@Override
public void onComponentChange(BaseProduct.ComponentKey componentKey, BaseComponent oldComponent,
```

## Code Block 57
```java
@Override
public void onConnectivityChange(boolean isConnected) {
```

## Code Block 58
```java
@Override
public void onInitProcess(DJISDKInitEvent djisdkInitEvent, int i) {
```

## Code Block 59
```java
@Override
public void onDatabaseDownloadProgress(long l, long l1) {
```

## Code Block 60
```java
@Override
public void onResume() {
```

## Code Block 61
```java
@Override
public void onPause() {
```

## Code Block 62
```java
@Override
public void onStop() {
```

## Code Block 63
```java
@Override
protected void onDestroy() {
```

## Code Block 64
```java
private void initUI() {
```

## Code Block 65
```java
@Override
public void onReceive(Context context, Intent intent) {
```

## Code Block 66
```java
private void refreshSDKRelativeUI() {
```

## Code Block 67
```java
private void showToast(final String toastMsg) {
```

## Code Block 68
```java
@Override
protected void onNewIntent(@NonNull Intent intent) {
```

## Code Block 69
```java
private ListView listView;
private String host = "tcp://YOUR_MQTT_HOST:1883";
private String userName = "YOUR_MQTT_USERNAME";
private String passWord = "YOUR_MQTT_PASSWORD";
private String mqtt_id = "YOUR_MQTT_CLIENT_ID";
private String mqtt_sub_topic = "YOUR_MQTT_SUB_TOPIC";
private String mqtt_pub_topic = "YOUR_MQTT_PUB_TOPIC";
private int gg1_flag =0;
private int gg2_flag =0;
private int auto_flag =0;
private ScheduledExecutorService scheduler;
private Button btn_1;  //类似于单片机开发里面的   参数初始化
private Button btn_2;
private Button btn_auto;
private TextView text_test;
private TextView text_test2;
private TextView text_auto;
private TextView text_ph;
private MqttClient client;
private MqttConnectOptions options;
private Handler handler;
```

## Code Block 70
```java
@Override
protected void onCreate(Bundle savedInstanceState) {
```

## Code Block 71
```java
@Override
public void onClick(View v) {
```

## Code Block 72
```java
@Override
public void onClick(View v) {
```

## Code Block 73
```java
@Override
public void onClick(View v) {
```

## Code Block 74
```java
public void handleMessage(Message msg) {
```

## Code Block 75
```java
@Override
public boolean onNavigationItemSelected(@NonNull MenuItem item) {
```

## Code Block 76
```java
@Override
public void onClick(View view) {
```

## Code Block 77
```java
private void Mqtt_init()
```

## Code Block 78
```java
@Override
public void connectionLost(Throwable cause) {
```

## Code Block 79
```java
@Override
public void deliveryComplete(IMqttDeliveryToken token) {
```

## Code Block 80
```java
@Override
public void messageArrived(String topicName, MqttMessage message)
```

## Code Block 81
```java
private void Mqtt_connect() {
```

## Code Block 82
```java
@Override
public void run() {
```

## Code Block 83
```java
private void startReconnect() {
```

## Code Block 84
```java
@Override
public void run() {
```

## Code Block 85
```java
private void publishmessageplus(String topic,String message2)
```

## Code Block 86
```java
private int currentProgress = -1;
private ImageView mDisplayImageView;
private int lastClickViewIndex = -1;
private View lastClickView;
private TextView mPushTv;
@Override
protected void onCreate(Bundle savedInstanceState) {
```

## Code Block 87
```java
@Override
protected void onResume() {
```

## Code Block 88
```java
@Override
protected void onPause() {
```

## Code Block 89
```java
@Override
protected void onStop() {
```

## Code Block 90
```java
@Override
protected void onDestroy() {
```

## Code Block 91
```java
void initUI() {
```

## Code Block 92
```java
@Override
public void onCancel(DialogInterface dialog) {
```

## Code Block 93
```java
private void showProgressDialog() {
```

## Code Block 94
```java
public void run() {
```

## Code Block 95
```java
private void hideProgressDialog() {
```

## Code Block 96
```java
public void run() {
```

## Code Block 97
```java
private void ShowDownloadProgressDialog() {
```

## Code Block 98
```java
public void run() {
```

## Code Block 99
```java
private void HideDownloadProgressDialog() {
```

## Code Block 100
```java
public void run() {
```

## Code Block 101
```java
private void setResultToToast(final String result) {
```

## Code Block 102
```java
public void run() {
```

## Code Block 103
```java
private void setResultToText(final String string) {
```

## Code Block 104
```java
@Override
public void run() {
```

## Code Block 105
```java
private void initMediaManager() {
```

## Code Block 106
```java
@Override
public void onResult(DJIError error) {
```

## Code Block 107
```java
private void getFileList() {
```

## Code Block 108
```java
@Override
public void onResult(DJIError djiError) {
```

## Code Block 109
```java
@Override
public int compare(MediaFile lhs, MediaFile rhs) {
```

## Code Block 110
```java
@Override
public void onResult(DJIError error) {
```

## Code Block 111
```java
private void getThumbnails() {
```

## Code Block 112
```java
private FetchMediaTask.Callback taskCallback = new FetchMediaTask.Callback() {
@Override
public void onUpdate(MediaFile file, FetchMediaTaskContent option, DJIError error) {
```

## Code Block 113
```java
public void run() {
```

## Code Block 114
```java
public void run() {
```

## Code Block 115
```java
private void getThumbnailByIndex(final int index) {
```

## Code Block 116
```java
public ItemHolder(View itemView) {
```

## Code Block 117
```java
@Override
public int getItemCount() {
```

## Code Block 118
```java
@Override
public ItemHolder onCreateViewHolder(ViewGroup parent, int viewType) {
```

## Code Block 119
```java
@Override
public void onBindViewHolder(ItemHolder mItemHolder, final int index) {
```

## Code Block 120
```java
private View.OnClickListener itemViewOnClickListener = new View.OnClickListener() {
@Override
public void onClick(View v) {
```

## Code Block 121
```java
private View.OnClickListener ImgOnClickListener = new View.OnClickListener() {
@Override
public void onClick(View v) {
```

## Code Block 122
```java
private void addMediaTask(final MediaFile mediaFile) {
```

## Code Block 123
```java
private MediaManager.FileListStateListener updateFileListStateListener = state -> currentFileListState = state;
```

## Code Block 124
```java
private void updateStatusTextView(MediaManager.VideoPlaybackState videoPlaybackState) {
```

## Code Block 125
```java
private void addLineToSB(StringBuffer sb, String name, Object value) {
```

## Code Block 126
```java
private void downloadFileByIndex(final int index) {
```

## Code Block 127
```java
@Override
public void onFailure(DJIError error) {
```

## Code Block 128
```java
@Override
public void onProgress(long total, long current) {
```

## Code Block 129
```java
@Override
public void onRateUpdate(long total, long current, long persize) {
```

## Code Block 130
```java
@Override
public void onRealtimeDataUpdate(byte[] bytes, long l, boolean b) {
```

## Code Block 131
```java
@Override
public void onStart() {
```

## Code Block 132
```java
@Override
public void onSuccess(String filePath) {
```

## Code Block 133
```java
private void deleteFileByIndex(final int index) {
```

## Code Block 134
```java
@Override
public void onSuccess(List<MediaFile> x, DJICameraError y) {
```

## Code Block 135
```java
@Override
public void onFailure(DJIError error) {
```

## Code Block 136
```java
private void playVideo() {
```

## Code Block 137
```java
private void moveToPosition() {
```

## Code Block 138
```java
@Override
public void onClick(View v) {
```

## Code Block 139
```java
@Override
public void onClick(View view) {
```

## Code Block 140
```java
@Override
public void onClick(View view) {
```

## Code Block 141
```java
private void clearText(EditText text){
```

## Code Block 142
```java
package com.example.memosystem.activity;
```

## Code Block 143
```java
@Override
public void onClick(View view) {
```

## Code Block 144
```java
@Override
public void onClick(View view) {
```

## Code Block 145
```java
private MapView mapView;
private AMap aMap;
private Button locate, add, clear;
private Button config, upload, start, stop, pause;
private boolean isAdd = false, pause_resume = true;
private double droneLocationLat = 181, droneLocationLng = 181;
private final Map<Integer, Marker> mMarkers = new ConcurrentHashMap<Integer, Marker>();
private Marker droneMarker = null;
private float altitude = 100.0f;
private float mSpeed = 10.0f;
private List<Waypoint> waypointList = new ArrayList<>();
public static WaypointMission.Builder waypointMissionBuilder;
private FlightController mFlightController;
private WaypointMissionOperator instance;
private WaypointMissionFinishedAction mFinishedAction = WaypointMissionFinishedAction.NO_ACTION;
private WaypointMissionHeadingMode mHeadingMode = WaypointMissionHeadingMode.AUTO;
@Override
protected void onResume() {
```

## Code Block 146
```java
@Override
protected void onPause() {
```

## Code Block 147
```java
@Override
protected void onDestroy() {
```

## Code Block 148
```java
public void onReturn(View view) {
```

## Code Block 149
```java
private void setResultToToast(final String string) {
```

## Code Block 150
```java
@Override
public void run() {
```

## Code Block 151
```java
private void initUI() {
```

## Code Block 152
```java
private void initMapView() {
```

## Code Block 153
```java
@Override
protected void onCreate(Bundle savedInstanceState) {
```

## Code Block 154
```java
@Override
public void onReceive(Context context, Intent intent) {
```

## Code Block 155
```java
private void onProductConnectionChange() {
```

## Code Block 156
```java
private void loginAccount() {
```

## Code Block 157
```java
@Override
public void onSuccess(final UserAccountState userAccountState) {
```

## Code Block 158
```java
@Override
public void onFailure(DJIError error) {
```

## Code Block 159
```java
private void initFlightController() {
```

## Code Block 160
```java
@Override
public void onUpdate(FlightControllerState
```

## Code Block 161
```java
private void addListener() {
```

## Code Block 162
```java
private void removeListener() {
```

## Code Block 163
```java
private WaypointMissionOperatorListener eventNotificationListener = new WaypointMissionOperatorListener() {
@Override
public void onDownloadUpdate(WaypointMissionDownloadEvent downloadEvent) {
```

## Code Block 164
```java
@Override
public void onUploadUpdate(WaypointMissionUploadEvent uploadEvent) {
```

## Code Block 165
```java
@Override
public void onExecutionUpdate(WaypointMissionExecutionEvent executionEvent) {
```

## Code Block 166
```java
@Override
public void onExecutionStart() {
```

## Code Block 167
```java
@Override
public void onExecutionFinish(@Nullable final DJIError error) {
```

## Code Block 168
```java
public WaypointMissionOperator getWaypointMissionOperator() {
```

## Code Block 169
```java
@Override
public void onMapClick(LatLng point) {
```

## Code Block 170
```java
public static boolean checkGpsCoordination(double latitude, double longitude) {
```

## Code Block 171
```java
private void updateDroneLocation() {
```

## Code Block 172
```java
@Override
public void run() {
```

## Code Block 173
```java
private void markWaypoint(LatLng point) {
```

## Code Block 174
```java
@Override
public void onClick(View v) {
```

## Code Block 175
```java
private void cameraUpdate() {
```

## Code Block 176
```java
private void enableDisableAdd() {
```

## Code Block 177
```java
private void showSettingDialog() {
```

## Code Block 178
```java
@Override
public void onCheckedChanged(RadioGroup group, int checkedId) {
```

## Code Block 179
```java
@Override
public void onCheckedChanged(RadioGroup group, int checkedId) {
```

## Code Block 180
```java
@Override
public void onCheckedChanged(RadioGroup group, int checkedId) {
```

## Code Block 181
```java
public void onClick(DialogInterface dialog, int id) {
```

## Code Block 182
```java
public void onClick(DialogInterface dialog, int id) {
```

## Code Block 183
```java
private void configWayPointMission() {
```

## Code Block 184
```java
private void uploadWayPointMission() {
```

## Code Block 185
```java
@Override
public void onResult(DJIError error) {
```

## Code Block 186
```java
private void startWaypointMission() {
```

## Code Block 187
```java
@Override
public void onResult(DJIError error) {
```

## Code Block 188
```java
private void stopWaypointMission() {
```

## Code Block 189
```java
@Override
public void onResult(DJIError error) {
```

## Code Block 190
```java
private void pauseWaypointMission() {
```

## Code Block 191
```java
@Override
public void onResult(DJIError error) {
```

## Code Block 192
```java
@Override
public void run() {
```

## Code Block 193
```java
private void resumeWaypointMission() {
```

## Code Block 194
```java
@Override
public void onResult(DJIError error) {
```

## Code Block 195
```java
@Override
public void run() {
```

## Code Block 196
```java
public void loadWeb() {
```

## Code Block 197
```java
@Override
public boolean onKeyDown(int keyCode, KeyEvent event) {
```

## Code Block 198
```java
public void loadWeb() {
```

## Code Block 199
```java
@Override
public boolean onKeyDown(int keyCode, KeyEvent event) {
```

## Code Block 200
```java
private ListView listView;
```

## Code Block 201
```java
private Toolbar toolbar;
@Override
protected void onCreate(Bundle savedInstanceState) {
```

## Code Block 202
```java
@Override
public boolean onNavigationItemSelected(@NonNull MenuItem item) {
```

## Code Block 203
```java
@Override
public void onClick(View view) {
```

## Code Block 204
```java
@Override
public void onClick(View view) {
```

