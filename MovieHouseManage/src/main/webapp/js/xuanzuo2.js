webpackJsonp(["cinemas-seat"], {
    1238: function (e, t, n) {
        "use strict";

        function o(e, t) {
            return '<span class="ticket" data-row-id="' + e + '" data-column-id="' + t + '" data-index="' + e + "-" + t + '">' + e + "排" + t + "座</span>"
        }

        function i(e) {
            return e.hasClass("lover-left") || e.hasClass("lover-right")
        }

        function a(e) {
            return e.hasClass("lover-left") ? e.next(".lover-right") : e.prev(".lover-left")
        }

        function s(e) {
            var t = e.data(), n = t.rowId, i = t.columnId, a = t.no, s = t.st;
            q.push({
                rowId: n,
                columnId: i,
                seatNo: a,
                type: s
            }), w.append(o(n, i)), e.removeClass("selectable").addClass("selected")
        }

        function r(e) {
            if (q.length >= L) return d("一次最多购买" + L + "张票");
            C.hide(), g.show(), s(e), i(e) && s(a(e)), x.removeClass("disable"), I.text(_[q.length].price.replace("元", ""))
        }

        function c(e) {
            var t = e.data(), n = t.rowId, o = t.columnId, i = n + "-" + o;
            q = q.filter(function (e) {
                return !(e.rowId === n && e.columnId === o)
            }), $('.ticket[data-index="' + i + '"]').remove(), I.text(_[q.length].price.replace("元", "")), e.removeClass("selected").addClass("selectable")
        }

        function l(e) {
            c(e), i(e) && c(a(e)), 0 === q.length && (C.show(), g.hide(), x.addClass("disable"))
        }

        function d(e, t) {
            b.find(".icon").removeClass("ox xox"), t && b.find(".icon").addClass(t), b.find(".tip").text(e), b.show()
        }

        function u(e) {
            return e.hasClass("selectable")
        }

        function f(e) {
            return e.hasClass("selected")
        }

        function m(e, t) {
            function n(t) {
                var n = e ? t.prev() : t.next();
                return 0 === n.length || n.hasClass("empty") ? $() : n
            }

            return t ? n(t) : n
        }

        function p(e, t, n) {
            var o = t(e);
            if (u(o)) {
                if (o = t(o), u(o)) return !1;
                if (f(o)) return d("座位中间不要留空", "xox"), !0;
                if (!u(o)) {
                    var i = L;
                    for (o = e; i--;) if (o = n(o), !f(o)) {
                        var a = u(o);
                        return a && d("座位旁边不要留空", "ox"), a
                    }
                }
            }
        }

        function h() {
            for (var e = $(".seats-wrapper").find(".selected"), t = e.length, n = m(!0), o = m(!1), i = 0; i < t; ++i) {
                var a = e.eq(i);
                if (p(a, n, o) || p(a, o, n)) return !1
            }
            return !0
        }

        function v() {
            var e = k.data(), t = e.sectionId, n = e.sectionName, o = e.seqNo, i = {count: q.length, list: q},
                a = {sectionId: t, sectionName: n, seqNo: o, seats: JSON.stringify(i)};
            $.post("/ajax/createOrder", a, function (e) {
                e.data && e.data.data ? location.href = "/order/confirm/" + e.data.data.id : d(e.error ? e.error.message : "抱歉，您的座位已被其他用户选中，请重新选择")
            })
        }

        n(1016);
        var C = $(".no-ticket"), g = $(".has-ticket"), w = $(".ticket-container"), k = $(".seats-block"),
            y = $(".screen"), I = $(".total-price .price"), b = $(".modal-container"), x = $(".confirm-btn"),
            L = +w.data("limit"), N = y.width(), P = $(".seats-wrapper").width(), _ = system.seatsPrice, q = [],
            T = void 0, j = void 0;
        if (function () {
            system.error && b.show(), system.remind && system.remind.length > 0 && b.show()
        }(), _ && (_[0] = {price: "0元"}), system.user || $(".login-form input").placeholder(), b.on("click", ".ok-btn", function () {
            b.hide(), system.error && (system.cinemaId ? location.href = "http://www.maoyan.com/cinema/" + system.cinemaId : system.poiId ? location.href = "http://www.maoyan.com/cshop/" + system.poiId : location.href = "http://www.maoyan.com")
        }), $(".ticket-container").on("click", ".ticket", function () {
            var e = $(this).data(), t = e.rowId, n = e.columnId;
            $(".seat").each(function () {
                var e = $(this);
                if (e.data("columnId") === n && e.data("rowId") === t) return l(e), !1
            })
        }), function () {
            var e = P / 2;
            $(".screen-container").css("left", e - N / 2)
        }(), $(".seats-block").on("click", ".seat", function () {
            var e = $(this);
            if (!e.hasClass("empty") && !e.hasClass("sold")) return u(e) ? r(e) : f(e) ? l(e) : void 0
        }), system.user) $(".confirm-btn").on("click", function (e) {
            $(this).hasClass("disable") || h() && v()
        }); else {
            var J = {
                risk_platform: 1,
                risk_partner: 1,
                risk_app: -1,
                isMobile: !1,
                uuid: system.uuid,
                componentId: "iLoginComp",
                uiConfig: {
                    loginBtnText: "确认选座",
                    codePlaceholder: "填写验证码",
                    phoneNumPlaceholder: "输入手机号",
                    sendCodeText: "获取验证码",
                    sendCodePos: 2
                }
            }, O = function (e) {
                return /^1[0-9]\d{9}$/.test(e)
            }, A = function (e) {
                return /^.{6}$/.test(e)
            };
            iLoginComp.session.on("compInited", function () {
                x = $(".iLoginComp-login-btn-wrapper"), x.attr("data-act", "confirm-click").attr("data-bid", "b_0a0ep6pp").addClass("disable")
            });
            var B = iLoginComp.onLoginClick;
            iLoginComp.onLoginClick = function () {
                if (h()) {
                    if (T = $("#phoneNumInput").val(), !O(T)) return d("请输入11位正确的手机号码");
                    if (j = $("#codeInput").val(), !A(j)) return d("请输入6位正确的手机验证码");
                    x.data("disabled") || (x.data("disabled", !0), setTimeout(function () {
                        x.data("disabled", !1)
                    }, 3e3), B.call.apply(B, [this].concat(Array.prototype.slice.call(arguments))))
                }
            }, iLoginComp.session.on("loginComplete", function (e) {
                if (!e || !e.user) return d("登录失败, 请稍后重试");
                $.post({
                    url: "/ajax/mobileLogin", data: {token: e.user.token}, success: function (e) {
                        e.success ? v() : d("登录失败, 请稍后重试")
                    }, fail: function () {
                        d("登录失败, 请稍后重试")
                    }
                })
            }), iLoginComp.init(J)
        }
        n(1239)
    }, 1239: function (e, t) {
    }
}, [1238]);