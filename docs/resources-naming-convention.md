## Resources naming convention

The SDK is used by external developers, so there is a chance that [resource names could collide](https://github.com/mapbox/mapbox-navigation-android/issues/1793). The Mapbox team has added the `mapbox`/`Mapbox` prefix to all SDK resource files to avoid resource collision. 
The naming convention below refers to [ribot's Android Guidelines](https://github.com/ribot/android-guidelines/blob/master/project_and_code_guidelines.md).

Here are some examples:
### Drawable files

mapbox_<bg/ic/drawable>_<function/feature name>[_state].xml

* mapbox_bg_feedback_issue_list.xml -- _for background drawables_
* mapbox_drawable_progress_bar.xml -- _for general drawables_
* mapbox_ic_arrow_head.xml -- _for icons_
* mapbox_ic_feedback_confusing_audio_normal.xml -- _for selector normal state_
* mapbox_ic_feedback_confusing_audio_pressed.xml -- _for selector pressed state_

### Layout files

mapbox[_view-type]_<function/feature name>.xml

* mapbox_button_feedback.xml            -- _for view component layout_
* mapbox_instruction_view.xml           -- _for view component layout_
* mapbox_item_instruction.xml           -- _for list view item layout_
* mapbox_partial_instruction_view.xml   -- _for partial view layout_

### Animation files

mapbox_animation_<function/feature name>.xml

* mapbox_animation_instruction_view_fade_in.xml
* mapbox_animation_slide_down_top.xml

### Values naming

* Styles always start with **MapboxStyle**
* Colors/Dimens/Strings always start with **mapbox_** 

#### Styles

* MapboxStyleNavigationMapRoute
* MapboxStyleSummaryBottomSheet

#### Colors

* mapbox_navigation_route_layer_blue
* mapbox_navigation_view_color_primary
* mapbox_navigation_view_color_primary_text
* mapbox_navigation_view_color_banner_maneuver_secondary

#### Dimens

* mapbox_dimen_2dp
* mapbox_fab_margin_bottom
* mapbox_wayname_view_height
* mapbox_wayname_padding

#### Strings

* mapbox_report_feedback
* mapbox_feedback_description_turn_icon_incorrect
* mapbox_feedback_description_street_name_incorrect
* mapbox_unit_kilometers
* mapbox_unit_meters
* mapbox_unit_hr
* mapbox_unit_min

 
