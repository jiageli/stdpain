<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!-- <c:set var="inc">1</c:set> -->
<c:choose>
	<c:when test="${theme=='default'}">
		<script type="text/javascript" src="assets/js/plugins/forms/styling/uniform.min.js"></script>
		<script type="text/javascript" src="assets/js/core/app.js"></script>
	</c:when>
	
	<c:when test="${theme=='login'}">
		<script type="text/javascript" src="assets/js/plugins/forms/validation/validate.min.js"></script>
		<script type="text/javascript" src="assets/js/plugins/forms/styling/uniform.min.js"></script>
		<script type="text/javascript" src="assets/js/core/app.js"></script>
		<script type="text/javascript" src="assets/js/pages/login.js"></script>
	</c:when>

	<c:when test="{theme=='validate'}">
		<script type="text/javascript" src="assets/js/plugins/forms/validation/validate.min.js"></script>
		<script type="text/javascript" src="assets/js/plugins/forms/selects/bootstrap_multiselect.js"></script>
		<script type="text/javascript" src="assets/js/plugins/forms/inputs/touchspin.min.js"></script>
		<script type="text/javascript" src="assets/js/plugins/forms/selects/select2.min.js"></script>
		<script type="text/javascript" src="assets/js/plugins/forms/styling/switch.min.js"></script>
		<script type="text/javascript" src="assets/js/plugins/forms/styling/switchery.min.js"></script>
		<script type="text/javascript" src="assets/js/plugins/forms/styling/uniform.min.js"></script>

		<script type="text/javascript" src="assets/js/core/app.js"></script>
		<script type="text/javascript" src="assets/js/pages/form_validation.js"></script>
	</c:when>

	<c:otherwise>
		<script type="text/javascript" src="assets/js/pages/login.js"></script>
		<script type="text/javascript" src="assets/js/pages/support_chat_layouts.js"></script>

		<script type="text/javascript" src="assets/js/core/libraries/jquery_ui/interactions.min.js"></script>
		<script type="text/javascript" src="assets/js/plugins/forms/selects/select2.min.js"></script>
		<script type="text/javascript" src="assets/js/core/app.js"></script>
		<script type="text/javascript" src="assets/js/pages/form_select2.js"></script>
		</c:otherwise>
</c:choose>
