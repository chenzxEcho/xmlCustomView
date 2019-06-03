# introduce in FlatXmlHelper


引入xmlcustomviewlib即可


 * 使用方法：
 * 方法1、在xml文件中通过 app:fx_... 的方式设置各种样式

例：
```
<com.chenzexuan.xmlcustomviewlib.XmlCustomTextView
      android:id="@+id/text"
      android:layout_width="match_parent"
      android:layout_height="40dp"
      android:layout_margin="20dp"
      android:text="HELLO WORLD"
      android:textSize="18dp"
      app:fx_background_color="#0070FF"
      app:fx_background_disable_alpha="51"
      app:fx_radius="14dp"
      app:fx_text_color="#FFFFFF"
      app:fx_text_pressed_color="#4cffffff"
      />
```
 * 方法2、使用XmlCustomView的updateXmlParams(XmlCustomViewParams viewParams)方法在java代码中组装viewParams后更新

例：
```
  XmlParams params = new XmlCustomViewParams();
  params.setRawTextColor(getResources().getColor(android.R.color.black));
  params.setSelectedTextColor(getResources().getColor(android.R.color.holo_red_dark));
  XmlCustomTextView textView = new XmlCustomTextView(context, params);
  textView.updateXmlParams(params);
```

 * 可设置控件背景色（正常状态、按下状态、disable状态、聚焦状态） 只可设置纯色
 * <p>
 * 可设置控件背景drawable（正常状态、按下状态、disable状态、聚焦状态）  drawable暂未支持同时设置圆角 todo
 * <p>
 * 可设置控件背景alpha值（正常状态、按下状态、disable状态、聚焦状态）
 * <p>
 * 可设置控件文字色 （正常状态、按下状态、disable状态、聚焦状态）
 * <p>
 * 可设置控件描边颜色及宽度
 * <p>
 * 可设置控件圆角
 * <p>
 * <p>可设置渐变背景色
 *
 * 以上设置可以叠加  例如：同时设置 背景色蓝色，描边白色，5dp圆角，按下后有阴影等效果
