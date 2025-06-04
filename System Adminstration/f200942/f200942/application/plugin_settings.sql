prompt --application/plugin_settings
begin
wwv_flow_imp.component_begin (
 p_version_yyyy_mm_dd=>'2024.11.30'
,p_release=>'24.2.5'
,p_default_workspace_id=>52587698573000585812
,p_default_application_id=>200942
,p_default_id_offset=>0
,p_default_owner=>'WKSP_SHYED2001'
);
wwv_flow_imp_shared.create_plugin_setting(
 p_id=>wwv_flow_imp.id(52608357228647296078)
,p_plugin_type=>'DYNAMIC ACTION'
,p_plugin=>'NATIVE_OPEN_AI_ASSISTANT'
,p_version_scn=>15629546018450
);
wwv_flow_imp_shared.create_plugin_setting(
 p_id=>wwv_flow_imp.id(52608357562462296080)
,p_plugin_type=>'ITEM TYPE'
,p_plugin=>'NATIVE_COLOR_PICKER'
,p_attributes=>wwv_flow_t_plugin_attributes(wwv_flow_t_varchar2(
  'display_as', 'POPUP',
  'mode', 'FULL')).to_clob
,p_version_scn=>15629546018481
);
wwv_flow_imp_shared.create_plugin_setting(
 p_id=>wwv_flow_imp.id(52608357850651296080)
,p_plugin_type=>'ITEM TYPE'
,p_plugin=>'NATIVE_DATE_PICKER_APEX'
,p_attributes=>wwv_flow_t_plugin_attributes(wwv_flow_t_varchar2(
  'appearance_behavior', 'MONTH-PICKER:YEAR-PICKER:TODAY-BUTTON',
  'days_outside_month', 'VISIBLE',
  'show_on', 'FOCUS',
  'time_increment', '15')).to_clob
,p_version_scn=>15629546018492
);
wwv_flow_imp_shared.create_plugin_setting(
 p_id=>wwv_flow_imp.id(52608358120123296080)
,p_plugin_type=>'ITEM TYPE'
,p_plugin=>'NATIVE_GEOCODED_ADDRESS'
,p_attributes=>wwv_flow_t_plugin_attributes(wwv_flow_t_varchar2(
  'background', 'default',
  'display_as', 'LIST',
  'map_preview', 'POPUP:ITEM',
  'match_mode', 'RELAX_HOUSE_NUMBER',
  'show_coordinates', 'N')).to_clob
,p_version_scn=>15629546018497
);
wwv_flow_imp_shared.create_plugin_setting(
 p_id=>wwv_flow_imp.id(52608358454527296081)
,p_plugin_type=>'ITEM TYPE'
,p_plugin=>'NATIVE_SELECT_MANY'
,p_attributes=>wwv_flow_t_plugin_attributes(wwv_flow_t_varchar2(
  'display_values_as', 'separated')).to_clob
,p_version_scn=>15629546018497
);
wwv_flow_imp_shared.create_plugin_setting(
 p_id=>wwv_flow_imp.id(52608358775045296081)
,p_plugin_type=>'ITEM TYPE'
,p_plugin=>'NATIVE_SINGLE_CHECKBOX'
,p_attributes=>wwv_flow_t_plugin_attributes(wwv_flow_t_varchar2(
  'checked_value', 'Y',
  'unchecked_value', 'N')).to_clob
,p_version_scn=>15629546018500
);
wwv_flow_imp_shared.create_plugin_setting(
 p_id=>wwv_flow_imp.id(52608359073897296081)
,p_plugin_type=>'ITEM TYPE'
,p_plugin=>'NATIVE_STAR_RATING'
,p_attributes=>wwv_flow_t_plugin_attributes(wwv_flow_t_varchar2(
  'default_icon', 'fa-star',
  'tooltip', '#VALUE#')).to_clob
,p_version_scn=>15629546018504
);
wwv_flow_imp_shared.create_plugin_setting(
 p_id=>wwv_flow_imp.id(52608359304146296081)
,p_plugin_type=>'ITEM TYPE'
,p_plugin=>'NATIVE_YES_NO'
,p_attributes=>wwv_flow_t_plugin_attributes(wwv_flow_t_varchar2(
  'display_style', 'SWITCH_CB',
  'off_value', 'N',
  'on_value', 'Y')).to_clob
,p_version_scn=>15629546018507
);
wwv_flow_imp_shared.create_plugin_setting(
 p_id=>wwv_flow_imp.id(52608359643279296081)
,p_plugin_type=>'PROCESS TYPE'
,p_plugin=>'NATIVE_GEOCODING'
,p_attribute_01=>'RELAX_HOUSE_NUMBER'
,p_version_scn=>15629546018508
);
wwv_flow_imp_shared.create_plugin_setting(
 p_id=>wwv_flow_imp.id(52608359951808296081)
,p_plugin_type=>'REGION TYPE'
,p_plugin=>'NATIVE_DISPLAY_SELECTOR'
,p_attributes=>wwv_flow_t_plugin_attributes(wwv_flow_t_varchar2(
  'include_slider', 'Y')).to_clob
,p_version_scn=>15629546018519
);
wwv_flow_imp_shared.create_plugin_setting(
 p_id=>wwv_flow_imp.id(52608360286625296082)
,p_plugin_type=>'REGION TYPE'
,p_plugin=>'NATIVE_IR'
,p_attributes=>wwv_flow_t_plugin_attributes(wwv_flow_t_varchar2(
  'actions_menu_structure', 'IG')).to_clob
,p_version_scn=>15629546018524
);
wwv_flow_imp_shared.create_plugin_setting(
 p_id=>wwv_flow_imp.id(52608360582049296082)
,p_plugin_type=>'REGION TYPE'
,p_plugin=>'NATIVE_MAP_REGION'
,p_attributes=>wwv_flow_t_plugin_attributes(wwv_flow_t_varchar2(
  'use_vector_tile_layers', 'Y')).to_clob
,p_version_scn=>15629546018524
);
wwv_flow_imp_shared.create_plugin_setting(
 p_id=>wwv_flow_imp.id(52608360898792296082)
,p_plugin_type=>'WEB SOURCE TYPE'
,p_plugin=>'NATIVE_ADFBC'
,p_version_scn=>15629546018532
);
wwv_flow_imp_shared.create_plugin_setting(
 p_id=>wwv_flow_imp.id(52608361109828296082)
,p_plugin_type=>'WEB SOURCE TYPE'
,p_plugin=>'NATIVE_BOSS'
,p_version_scn=>15629546018539
);
wwv_flow_imp.component_end;
end;
/
