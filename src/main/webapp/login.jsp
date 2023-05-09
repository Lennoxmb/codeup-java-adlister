<form method="POST" action="/register" class="row g-3">
    <div class="col-auto">
        <label for="emailAddress" class="visually-hidden">Email</label>
        <input type="text" class="form-control" id="emailAddress" placeholder="Email">
    </div>
    <div class="col-auto">
        <label for="inputPassword2" class="visually-hidden">Password</label>
        <input type="password" class="form-control" id="inputPassword2" placeholder="Password">
    </div>
    <div class="col-auto">
        <button type="submit" class="btn btn-primary mb-3">Confirm identity</button>
    </div>
<%--    String email = request.getParameter("emailAddress");--%>
<%--    // Now we can do something with the email like save it in our database, or--%>
<%--    // use it to send a message to the user--%>

</form>