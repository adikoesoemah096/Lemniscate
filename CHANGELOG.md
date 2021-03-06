Change Log
==========

Version 2.0.2 *(2019-07-27)*
----------------------------

* Fix `lineMinLength` setter

Version 2.0.1 *(2019-07-21)*
----------------------------

* Remove `android:allowBackup` and `android:supportsRtl` from manifest
* Update dependencies
* Change package from `com.vlad1m1r.lemniscate.sample.lemniscate` to `com.vlad1m1r.lemniscate`

Version 2.0.0 *(2019-03-23)*
----------------------------

* Migration to AndroidX

Version 1.4.5 *(2019-03-23)*
----------------------------

* Update dependencies

Version 1.4.4 *(2018-04-05)*
----------------------------

* Replace `View.BaseSavedState` with `android.support.v4.view.AbsSavedState` in `BaseCurveProgressView`

Version 1.4.3 *(2018-04-04)*
----------------------------

* Fixed problem with restoring view's state
* Small code optimization

Version 1.4.2 *(2018-01-16)*
----------------------------

* Fixed bug where View would not show inside ScrollView.  [#5](https://github.com/VladimirWrites/Lemniscate/issues/5)

Version 1.4.1 *(2018-01-06)*
----------------------------

* Fixed bug where SizeMultiplier property was not working when set from `xml`.  [#4](https://github.com/VladimirWrites/Lemniscate/issues/4)

Version 1.4.0 *(2017-11-09)*
----------------------------

* Project rewritten in Kotlin.  
* Organization of base classes improved
* Fixed bugs in Sample app

Version 1.3.0 *(2017-11-03)*
----------------------------

* `lineLength` and `lineLengthChangeable` do not exist anymore. If `maxLineLength` and `minLineLength` are the same then `lineLengthChangeable==false`, otherwise line length will be changeable
`getGraphX` and `getGraphY` now return `float` and not `double`
* `mLemniscateParamX` and `mLemniscateParamY` are not used anymore and are replaced by `viewSize.getSize()`, where `mLemniscateParamX == mLemniscateParamY == viewSize.getSize()/2`
* `minSdkVersion` moved from 11 to 14

Version 1.2.0 *(2017-02-16)*
----------------------------

 * New curves added: `BernoullisBowProgressView`, `BernoullisSharpProgressView`, `XProgressView`, `RoundScribbleProgressView`, `ScribbleProgressView`
 * `colorAccent` is now being used as default line color

Version 1.1.1 *(2017-01-26)*
----------------------------

 * Optimization of function that is doing sampling of curve

Version 1.1.0 *(2017-01-26)*
----------------------------

 * Abstract functions `getGraphX()` and `getGraphY()` now receive value of `getT()`

Version 1.0.2 *(2017-01-24)*
----------------------------

 * Fix: Added `onSaveState` for Roulette curves
 * Fix: Precision is being saved `onSaveState` for all curves


Version 1.0.1 *(2017-01-23)*
----------------------------

 * Fix: Crash on `setColor(int color)` in `BaseCurveProgressBar`, when called from constructor.


Version 1.0.0 *(2017-01-23)*
----------------------------

Initial release.


