
# Using Alfresco 5.1

h3. Step 5

Surfbug and you can see "Evaluated URI" of components
* Then search the uri on the share/page/index/all page
* You can see template and JS in order to merge or replace code
* To customize
** Add the <module> targetPackageRoot with the described in surfbug and sourcePackageRoot with <whateverpackageyouwant> (ie: blog.demo.customization)
** Create the folder webscript.<whateverpackageyouwant> (ie: webscript.blog.demo.customization)
** Create the js, ftl, or the thing you want to customize (ie: webview.get.js)

h3. 6. Customize Alfresco Share FreeMarker templates

IMPORTANT: templates should be located in alfresco.templates.<whateverpackageyouwant> because Alfresco will look on this folder for templates

h4. About Freemarker extensibilty

Actions supported
* remove: remove completely the content from the model
* replace
* before: put the content before the target directive contents
* after: put the content after the target directive

<@region>

To define regions into which components are bound

<@markup>

To demarcate sections of HTML in a template


Step 8. Add a new page to Alfresco Share

* Templates in: alfresco.templates.XXX
* Pages and templates instances in: alfresco.site-data
* Default configured page: alfresco.web-extension.site-data.configurations

Step 9. Override Alfresco Share login page
