/*******************************************************************************
 * Copyright (c) 2004 Actuate Corporation.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *  Actuate Corporation  - initial API and implementation
 *******************************************************************************/

package org.eclipse.birt.report.designer.internal.ui.util;

/**
 * The interface is used for context-sensitive help IDs.
 */
public interface IHelpContextIds
{

	public static final String PREFIX = "org.eclipse.birt.cshelp."; //$NON-NLS-1$

	public static final String UNKNOWN = PREFIX + "dummy_outer_container"; //$NON-NLS-1$

	/*----------Control: Wizard----------*/
	public static final String NEW_REPORT_PROJECT_ID = PREFIX
			+ "NewReportProjectWizard_ID"; //$NON-NLS-1$

	public static final String NEW_REPORT_WIZARD_ID = PREFIX
			+ "NewReportWizard_ID"; //$NON-NLS-1$

	public static final String NEW_REPORT_COPY_WIZARD_ID = PREFIX
			+ "NewReportCopyWizard_ID"; //$NON-NLS-1$

	public static final String NEW_TEMPLATE_WIZARD_ID = PREFIX
			+ "NewTemplateWizard_ID"; //$NON-NLS-1$

	public static final String NEW_LIBRARY_WIZARD_ID = PREFIX
			+ "NewLibraryWizard_ID"; //$NON-NLS-1$

	public static final String SAVE_AS_WIZARD_ID = PREFIX
			+ "SaveReportAsWizard_ID"; //$NON-NLS-1$

	public static final String PUBLISH_TEMPLATE_WIZARD_ID = PREFIX
			+ "PublishTemplateWizard_ID"; //$NON-NLS-1$

	public static final String IMPORT_CSS_STYLE_WIZARD_ID = PREFIX
			+ "ImportCssStyle_ID"; //$NON-NLS-1$

	public static final String PUBLISH_LIBRARY_WIZARD_ID = PREFIX
			+ "PublishLibraryDialog_ID"; //$NON-NLS-1$

	public static final String EXPORT_TO_LIBRARY_WIZARD_ID = PREFIX
			+ "ExportToLibrary_ID"; //$NON-NLS-1$

	/*----------Control: Dialog----------*/
	public static final String FORMAT_BUILDER_ID = PREFIX + "FormatBuilder_ID"; //$NON-NLS-1$

	public static final String IMPORT_VALUE_DIALOG_ID = PREFIX
			+ "ImportValueDialog_ID"; //$NON-NLS-1$

	public static final String STYLE_BUILDER_GERNERAL_ID = PREFIX
			+ "StyleBuilderGeneral_ID"; //$NON-NLS-1$

	public static final String STYLE_BUILDER_FONT_ID = PREFIX
			+ "StyleBuilderFont_ID"; //$NON-NLS-1$

	public static final String STYLE_BUILDER_BACKGROUND_ID = PREFIX
			+ "StyleBuilderBackground_ID"; //$NON-NLS-1$

	public static final String STYLE_BUILDER_TEXTBLOCK_ID = PREFIX
			+ "StyleBuilderTextBlock_ID"; //$NON-NLS-1$

	public static final String STYLE_BUILDER_BOX_ID = PREFIX
			+ "StyleBuilderBox_ID"; //$NON-NLS-1$

	public static final String STYLE_BUILDER_BORDER_ID = PREFIX
			+ "StyleBuilderBorder_ID"; //$NON-NLS-1$

	public static final String STYLE_BUILDER_FORMATNUMBER_ID = PREFIX
			+ "StyleBuilderFormatNumber_ID"; //$NON-NLS-1$

	public static final String STYLE_BUILDER_FORMATDATATIME_ID = PREFIX
			+ "StyleBuilderFormatDateTime_ID"; //$NON-NLS-1$

	public static final String STYLE_BUILDER_FORMATSTRING_ID = PREFIX
			+ "StyleBuilderFormatString_ID"; //$NON-NLS-1$

	public static final String STYLE_BUILDER_PAGEBREAK_ID = PREFIX
			+ "StyleBuilderPageBreak_ID"; //$NON-NLS-1$

	public static final String STYLE_BUILDER_MAP_ID = PREFIX
			+ "StyleBuilderMap_ID"; //$NON-NLS-1$

	public static final String STYLE_BUILDER_HIGHTLIGHTS_ID = PREFIX
			+ "StyleBuilderHighlights_ID"; //$NON-NLS-1$

	public static final String PARAMETER_GROUP_DIALOG_ID = PREFIX
			+ "ParameterGroupDialog_ID"; //$NON-NLS-1$

	public static final String HYPERLINK_BUILDER_ID = PREFIX
			+ "HyperlinkBuilder_ID"; //$NON-NLS-1$

	public static final String EXPRESSION_BUILDER_ID = PREFIX
			+ "ExpressionBuilder_ID"; //$NON-NLS-1$

	public static final String PARAMETER_DIALOG_ID = PREFIX
			+ "ParameterDialog_ID"; //$NON-NLS-1$

	public static final String CASCADING_PARAMETER_DIALOG_ID = PREFIX
			+ "CascadingParametersDialog_ID"; //$NON-NLS-1$

	public static final String ADD_EDIT_CASCADING_PARAMETER_DIALOG_ID = PREFIX
			+ "AddEditCascadingParametersDialog_ID"; //$NON-NLS-1$

	public static final String IMAGE_BUIDLER_ID = PREFIX + "ImageBuilder_ID"; //$NON-NLS-1$

	public static final String THUMBNAIL_BUIDLER_ID = PREFIX
			+ "ThumbnailBuilder_ID"; //$NON-NLS-1$

	public static final String TABLE_OPTION_DIALOG_ID = PREFIX
			+ "TableOptionDialog_ID"; //$NON-NLS-1$

	public static final String Grid_OPTION_DIALOG_ID = PREFIX
			+ "GridOptionDialog_ID"; //$NON-NLS-1$

	public static final String TEXT_EDITOR_ID = PREFIX + "TextEditor_ID"; //$NON-NLS-1$

	public static final String GROUP_DIALOG_ID = PREFIX + "GroupDialog_ID"; //$NON-NLS-1$

	public static final String DATA_BINDING_DIALOG_ID = PREFIX
			+ "DataBindingDialog_ID"; //$NON-NLS-1$

	public static final String HIGHLIGHT_RULE_BUILDER_ID = PREFIX
			+ "HighlightRuleBuilder_ID"; //$NON-NLS-1$

	public static final String RESOURCE_SELECT_DIALOG_ID = PREFIX
			+ "ResourceSelectDialog_ID"; //$NON-NLS-1$

	public static final String CREATE_TEMPLATE_REPORT_ITEM_DIALOG_ID = PREFIX
			+ "CreateTemplateReportItem_ID"; //$NON-NLS-1$

	public static final String INSERT_EDIT_MAP_RULE_DIALOG_ID = PREFIX
			+ "AddEditMapRule_ID"; //$NON-NLS-1$

	public static final String INSERT_EDIT_FILTER_CONDITION_DIALOG_ID = PREFIX
			+ "AddEditFilterCondition_ID"; //$NON-NLS-1$

	public static final String INSERT_EDIT_GRAND_TOTAL_DIALOG_ID = PREFIX
			+ "AddEditGrandTotal_ID"; //$NON-NLS-1$

	public static final String INSERT_EDIT_SUB_TOTAL_DIALOG_ID = PREFIX
			+ "AddEditSubTotal_ID"; //$NON-NLS-1$

	public static final String INSERT_EDIT_PAGE_BREAK_DIALOG_ID = PREFIX
			+ "AddEditPageBreakDialog_ID"; //$NON-NLS-1$

	public static final String INSERT_EDIT_SORTKEY_DIALOG_ID = PREFIX
			+ "AddEditSortkey_ID"; //$NON-NLS-1$

	public static final String ADD_EDIT_USER_PROPERTIES_DIALOG_ID = PREFIX
			+ "AddEditUserProperties_ID"; //$NON-NLS-1$

	public static final String ADD_JAR_FILES_DIALOG_ID = PREFIX
			+ "AddJarResourceFileFolderSelectionDialog_ID"; //$NON-NLS-1$
	
	public static final String ADD_JS_FILES_DIALOG_ID = PREFIX
	+ "AddJsResourceFileFolderSelectionDialog_ID"; //$NON-NLS-1$

	public static final String ADD_IMAGE_FILES_DIALOG_ID = PREFIX
			+ "AddImageResourceFileFolderSelectionDialog_ID"; //$NON-NLS-1$

	public static final String NEW_ADD_RESOURCE_FILES_DIALOG_ID = PREFIX
			+ "NewResourceFileDialog_ID"; //$NON-NLS-1$

	public static final String PROJECT_FILES_DIALOG_ID = PREFIX
			+ "ProjectFileDialog_ID"; //$NON-NLS-1$

	public static final String ADD_EDIT_NAMED_EXPRESSION_DIALOG_ID = PREFIX
			+ "AddEditNamedExpression_ID"; //$NON-NLS-1$

	public static final String RESOURCE_EDIT_DIALOG_ID = PREFIX
			+ "ResourceEditDialog_ID"; //$NON-NLS-1$

	public static final String ADD_LIBRARY_DIALOG_ID = PREFIX
			+ "AddLibraryDialog_ID"; //$NON-NLS-1$

	public static final String COLUMNBINDING_DIALOG_ID = PREFIX
			+ "ColumnBindingDialog_ID"; //$NON-NLS-1$

	public static final String PARAMETERBINDING_DIALOG_ID = PREFIX
			+ "ParameterBindingDialog_ID"; //$NON-NLS-1$

	public static final String DELETE_WARNING_DIALOG_ID = PREFIX
			+ "DeleteWarningDialog_ID"; //$NON-NLS-1$

	public static final String NEW_SECTION_DIALOG = PREFIX
			+ "NewSectionDialog_ID"; //$NON-NLS-1$

	public static final String DIMENSION_BUILDER_DIALOG_DIALOG = PREFIX
			+ "DimensionBuilderDialog_ID"; //$NON-NLS-1$

	public static final String HANDLER_CLASS_SELECTION_DIALOG = PREFIX
			+ "HandlerClassSelectionDialog_ID"; //$NON-NLS-1$

	public static final String DATA_COLUMN_BINDING_DIALOG = PREFIX
			+ "DataColumnBindingDialog_ID"; //$NON-NLS-1$

	public static final String DATA_ITEM_BINDING_DIALOG = PREFIX
			+ "DataItemBindingDialog_ID"; //$NON-NLS-1$

	public static final String DATA_SET_PARAMETER_BINDING_DIALOG = PREFIX
			+ "DataSetParameterBindingInputDialog_ID"; //$NON-NLS-1$

	public static final String SELECTION_CHOICE_DIALOG = PREFIX
			+ "SelectionChoiceDialog_ID"; //$NON-NLS-1$

	public static final String CUBE_BUILDER_DATASET_SELECTION_PAGE = PREFIX
			+ "CubeBuilderDataSetSelectionPage_ID"; //$NON-NLS-1$

	public static final String CUBE_BUILDER_GROUPS_PAGE = PREFIX
			+ "CubeBuilderGroupsPage_ID"; //$NON-NLS-1$

	public static final String CUBE_BUILDER_LINK_GROUPS_PAGE = PREFIX
			+ "CubeBuilderLinkGroupsPage_ID"; //$NON-NLS-1$

	public static final String LEVEL_PROPERTY_DIALOG = PREFIX
			+ "LevelPropertyDialog_ID"; //$NON-NLS-1$

	public static final String MEASURE_DIALOG = PREFIX + "MeasureDialog_ID"; //$NON-NLS-1$

	public static final String XTAB_FILTER_CONDITION_BUILDER = PREFIX
			+ "CrossTabFilterConditionBuilder_ID"; //$NON-NLS-1$

	public static final String XTAB_SORTER_CONDITION_BUILDER = PREFIX
			+ "CrossTabSorterBuilder_ID"; //$NON-NLS-1$

	public static final String XTAB_FILTER_CONDITION_SELECT_VALUE_DIALOG = PREFIX
			+ "CrossTabFilterSelectValueDialog_ID"; //$NON-NLS-1$

	public static final String XTAB_SHOW_SUMMARY_FIELD_DIALOG = PREFIX
			+ "CrossTabShowSummaryFieldDialog_ID"; //$NON-NLS-1$

	public static final String XTAB_LEVEL_VIEW_DIALOG = PREFIX
			+ "CrossTabLevelViewDialog_ID"; //$NON-NLS-1$

	public static final String XTAB_AGGREGATION_DIALOG = PREFIX
			+ "CrossTabAggregationDialog_ID"; //$NON-NLS-1$

	public static final String CUBE_BUILDER_GROUP_DIALOG = PREFIX
			+ "CubeBuilderGroupDialog_ID"; //$NON-NLS-1$

	public static final String CUBE_DATE_LEVEL_DIALOG = PREFIX
			+ "CubeBuilderDateLevelDialog_ID"; //$NON-NLS-1$

	public static final String CUBE_FILTER_LIST_DIALOG = PREFIX
			+ "CubeBuilderFilterListDialog_ID"; //$NON-NLS-1$

	/*----------Control: Preference----------*/
	public static final String PREFERENCE_BIRT_DATA_SET_EDITOR_ID = PREFIX
			+ "Preference_BIRT_DataSetEditor_ID"; //$NON-NLS-1$

	public static final String PREFERENCE_BIRT_ELEMENT_NAMES_ID = PREFIX
			+ "Preference_BIRT_ElementNames_ID"; //$NON-NLS-1$

	public static final String PREFERENCE_BIRT_LIBRARY_ID = PREFIX
			+ "Preference_BIRT_Library_ID"; //$NON-NLS-1$

	public static final String PREFERENCE_BIRT_PREVIEW_ID = PREFIX
			+ "Preference_BIRT_Preview_ID"; //$NON-NLS-1$

	public static final String PREFERENCE_BIRT_PREVIEW_DATA_ID = PREFIX
			+ "Preference_BIRT_Preview_DATA_ID"; //$NON-NLS-1$

	public static final String PREFERENCE_BIRT_PREVIEW_SERVER_ID = PREFIX
			+ "Preference_BIRT_PreviewServer_ID"; //$NON-NLS-1$

	public static final String PREFERENCE_BIRT_TEMPLATE_ID = PREFIX
			+ "Preference_BIRT_Template_ID"; //$NON-NLS-1$

	public static final String PREFERENCE_BIRT_COMMENTTEMPLATE_ID = PREFIX
			+ "Preference_BIRT_CommentTemplate_ID"; //$NON-NLS-1$
	
	public static final String PREFERENCE_BIRT_BIDI_ID = PREFIX
	+ "Preference_BIRT_BIDI_ID"; //$NON-NLS-1$

	public static final String PREFERENCE_BIRT_RESOURCE_ID = PREFIX
			+ "Preference_BIRT_Resource_ID"; //$NON-NLS-1$

	public static final String ADD_CSS_DIALOG_ID = PREFIX + "AddCSSDialog_ID"; //$NON-NLS-1$

	// public static final String PUBLISH_CSS_WIZARD_ID = PREFIX
	// + "PublishCSSDialog_ID";

	public static final String USE_CSS_IN_REPORT_DIALOG_ID = PREFIX
			+ "UseCssInReportDialog_ID"; //$NON-NLS-1$

	public static final String RESOURCE_FILTER_DIALOG_ID = PREFIX
	+ "ResourceFilterDialog_ID"; //$NON-NLS-1$

	public static final String STYLE_BUILDER_COMMENTS_ID = PREFIX
			+ "StyleBuilderComments_ID"; //$NON-NLS-1$

	public static final String PREFERENCE_BIRT_XTAB_ID = PREFIX
			+ "Preference_BIRT_CrossTab_ID"; //$NON-NLS-1$
	
	public static final String PREFERENCE_BIRT_GENERAL_ID = PREFIX
			+ "Preference_BIRT_GENERAL_ID"; //$NON-NLS-1$

}