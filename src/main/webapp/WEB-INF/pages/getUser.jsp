<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 17/3/4
  Time: 22:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title></title>
    <script src="../../static/js/react.js"></script>
    <script src="../../static/js/react-dom.js"></script>
    <script src="../../static/js/browser.min.js"></script>
</head>
<body>
<table>

    <div id="example"></div>

    <c:forEach items="${users}" var="u">
        <tr>
            <td>${u.id}</td>
            <td>${u.nickname}</td>
            <td>${u.firstName}</td>
            <td>${u.lastName}</td>
        </tr>
    </c:forEach>

    <script type="text/babel">
        var names = ['Alice', 'Emily', 'Kate'];
        var arr = [
            <h1>Hello world!</h1>,
            <h2>React is awesome</h2>,
        ];
        var HelloMessage = React.createClass({
            render: function() {
                return <h1>Hello {this.props.name}</h1>;
            }
        });
        var NotesList = React.createClass({
            render: function() {
                return (
                        <ol>
                            {
                                React.Children.map(this.props.children, function (child) {
                                    return <li>{child}</li>;
                                })
                            }
                        </ol>
                );
            }
        });
        var MyTitle = React.createClass({
            propTypes : {
                title : React.PropTypes.string.isRequired,
            },

            getDefaultProps: function() {
                return {
                    title : '这是默认值哈！'
                };
            },

            render : function () {
                return <h1>{this.props.title}</h1>
            }
        });
        var data = '该组件的属性必须为字符串，但是数字也能显示，虽然会报错';
        var MyComponent = React.createClass({
            handleClick: function() {
                this.refs.myTextInput.focus();
            },
            showValueClick: function () {
                alert(this.refs.myTextInput.value);
            },
            render: function() {
                return (
                        <div>
                            <input type="text" ref="myTextInput" />
                            <input type="button" value="Focus the text input" onClick={this.handleClick} />
                            <input type="button" value="Show value" onClick={this.showValueClick} />
                        </div>
                );
            }
        });
        var LikeButton = React.createClass({
            getInitialState: function() {
                return {liked: false};
            },
            handleClick: function(event) {
                this.setState({liked: !this.state.liked});
            },
            render: function() {
                var text = this.state.liked ? 'like' : 'haven\'t liked';
                return (
                        <p onClick={this.handleClick}>
                            You {text} this. Click to toggle.
                        </p>
                );
            }
        });
        var Input = React.createClass({
            getInitialState: function() {
                return {value: 'Hello!'};
            },
            handleChange: function(event) {
                this.setState({value: event.target.value});
            },
            render: function () {
                var value = this.state.value;
                return (
                        <div>
                            <input type="text" value={value} onChange={this.handleChange} />
                            <p>{value}</p>
                        </div>
                );
            }
        });

        ReactDOM.render(
                <div>
                    {
                        names.map(function (name) {
                            return <div>Hello, {name}!</div>
                        })
                    }
                    <HelloMessage name="John" />
                    <NotesList>
                        <span>hello</span>
                        <span>world</span>
                    </NotesList>
                    <div>{arr}</div>
                    <MyTitle title={data}/>
                    <MyTitle/>
                    <MyComponent />
                    <LikeButton/>
                    <Input/>
                </div>,
                
            document.getElementById('example')
        );
    </script>
</table>
</body>
</html>
