if (!function (e, n, t, r) {
    function i() {
        return r ? r : /\b(mobile|iphone|htc)\b/gi.test(f) ? "mobile" : "web"
    }

    var o = window, a = document, s = "_MeiTuanALogObject";
    if (o[s] = t, !o[t]) {
        var c = function () {
            return c.q.push(arguments), c
        };
        c.q = c.q || [], c.v = n, c.l = +new Date, c.C = r, o[t] = o[t] || c;
        var u = a.getElementsByTagName("head")[0], l = a.createElement("script"),
            f = navigator.userAgent.toLocaleLowerCase(), p = i(), h = "";
        h = e.length - 3 === e.indexOf(".js") ? e : ["//", e, "/source/", n, "/", p, ".", "js"].join(""), l.defer = l.async = !0, l.charset = "utf-8", l.src = h, l.onload = l.onerror = function () {
        }, u.appendChild(l)
    }
}("analytics.meituan.com", "stable", "Analytics", ""), "1" === window.$mtsiFlag) {
    var tmp = Analytics;
    Analytics = function () {
    }, Object.assign(Analytics, tmp)
}
Analytics("config", "appnm", "movie"), Analytics("config", "alwaysSendReferrer", !0), Analytics("use", "movie"), Analytics("set", "uid", window.system ? system.uid : ""), window.openPlatform && Analytics("get", "utm", function (e) {
    e = e || {}, e.utm_campaign = "openPlatform=" + encodeURIComponent(openPlatform), window.openPlatformSub && (e.utm_campaign += "-" + encodeURIComponent(window.openPlatformSub)), Analytics("set", "utm", e)
}), function (e) {
    var n = /(Googlebot|Baiduspider|360Spider|Sogou web spider|bingbot)/, t = navigator.userAgent;
    analytics = function (r) {
        "send" !== r && "event" !== r || n.test(t) || e.apply(this, [].slice.call(arguments, 0))
    }
}(Analytics), analytics("send", "pv", {cid: window.cid, val: window.val}), !function (e, n, t) {
    function r() {
        var e = n.createElement("script");
        e.async = !0, e.src = "https://s0.meituan.net/bs/js/?f=mta-js:mta.min.js";
        var t = n.getElementsByTagName("script")[0];
        t.parentNode.insertBefore(e, t)
    }

    if (e.MeituanAnalyticsObject = t, e[t] = e[t] || function () {
        (e[t].q = e[t].q || []).push(arguments)
    }, "complete" === n.readyState) r(); else {
        var i = "addEventListener", o = "attachEvent";
        if (e[i]) e[i]("load", r, !1); else if (e[o]) e[o]("onload", r); else {
            var a = e.onload;
            e.onload = function () {
                r(), a && a()
            }
        }
    }
}(window, document, "mta"), function (e, n, t) {
    if (n && !("_mta" in n)) {
        n._mta = !0;
        var r = e.location.protocol;
        if ("file:" !== r) {
            var i = e.location.host, o = n.prototype.open;
            n.prototype.open = function (n, t, a, s, c) {
                if (this._method = "string" == typeof n ? n.toUpperCase() : null, t) {
                    if (0 === t.indexOf("http://") || 0 === t.indexOf("https://") || 0 === t.indexOf("//")) this._url = t; else if (0 === t.indexOf("/")) this._url = r + "//" + i + t; else {
                        var u = r + "//" + i + e.location.pathname;
                        u = u.substring(0, u.lastIndexOf("/") + 1), this._url = u + t
                    }
                    var l = this._url.indexOf("?");
                    -1 !== l ? (this._searchLength = this._url.length - 1 - l, this._url = this._url.substring(0, l)) : this._searchLength = 0
                } else this._url = null, this._searchLength = 0;
                return this._startTime = (new Date).getTime(), o.apply(this, arguments)
            };
            var a = "onreadystatechange", s = "addEventListener", c = n.prototype.send;
            n.prototype.send = function (n) {
                function t(t, i) {
                    if (0 !== t._url.indexOf(r + "//frep.meituan.net/_.gif")) {
                        for (var o = "browser.ajax", a = [98, 114, 111, 119, 115, 101, 114, 46, 97, 106, 97, 120], s = 0, c = o.length; c > s; s++) if (o.charCodeAt(s) !== a[s]) return;
                        var u;
                        if (t.response) switch (t.responseType) {
                            case"json":
                                u = JSON && JSON.stringify(t.response).length;
                                break;
                            case"blob":
                            case"moz-blob":
                                u = t.response.size;
                                break;
                            case"arraybuffer":
                                u = t.response.byteLength;
                            case"document":
                                u = t.response.documentElement && t.response.documentElement.innerHTML && t.response.documentElement.innerHTML.length + 28;
                                break;
                            default:
                                u = t.response.length
                        }
                        e.mta("send", o, {
                            url: t._url,
                            method: t._method,
                            error: !(0 === t.status.toString().indexOf("2") || 304 === t.status),
                            responseTime: (new Date).getTime() - t._startTime,
                            requestSize: t._searchLength + (n ? n.length : 0),
                            responseSize: u || 0
                        })
                    }
                }

                if (s in this) {
                    var i = function (e) {
                        t(this, e)
                    };
                    this[s]("load", i), this[s]("error", i), this[s]("abort", i)
                } else {
                    var o = this[a];
                    this[a] = function (n) {
                        o && o.apply(this, arguments), 4 === this.readyState && e.mta && t(this, n)
                    }
                }
                return c.apply(this, arguments)
            }
        }
    }
}(window, window.XMLHttpRequest, "mta"), mta("create", "5732dc750ea11a1c3db93a1c"), mta("config", "beaconImage", "https://frep.meituan.com/_.gif"), mta("send", "page"), function (e, n) {
    "use strict";

    function t(e, n) {
        var t, r;
        n = n || {}, e = "raven" + e.substr(0, 1).toUpperCase() + e.substr(1), document.createEvent ? (t = document.createEvent("HTMLEvents"), t.initEvent(e, !0, !0)) : (t = document.createEventObject(), t.eventType = e);
        for (r in n) f(n, r) && (t[r] = n[r]);
        if (document.createEvent) document.dispatchEvent(t); else try {
            document.fireEvent("on" + t.eventType.toLowerCase(), t)
        } catch (i) {
        }
    }

    function r(e) {
        this.name = "RavenConfigError", this.message = e
    }

    function i(e) {
        var n = G.exec(e), t = {}, i = 7;
        try {
            for (; i--;) t[Z[i]] = n[i] || ""
        } catch (o) {
            throw new r("Invalid DSN: " + e)
        }
        if (t.pass) throw new r("Do not specify your private key in the DSN!");
        return t
    }

    function o(e) {
        return void 0 === e
    }

    function a(e) {
        return "function" == typeof e
    }

    function s(e) {
        return "[object String]" === W.toString.call(e)
    }

    function c(e) {
        return "object" == typeof e && null !== e
    }

    function u(e) {
        for (var n in e) return !1;
        return !0
    }

    function l(e) {
        return c(e) && "[object Error]" === W.toString.call(e) || e instanceof Error
    }

    function f(e, n) {
        return W.hasOwnProperty.call(e, n)
    }

    function p(e, n) {
        var t, r;
        if (o(e.length)) for (t in e) f(e, t) && n.call(null, t, e[t]); else if (r = e.length) for (t = 0; t < r; t++) n.call(null, t, e[t])
    }

    function h(e, n) {
        var r = [];
        e.stack && e.stack.length && p(e.stack, function (e, n) {
            var t = m(n);
            t && r.push(t)
        }), t("handle", {stackInfo: e, options: n}), d(e.name, e.message, e.url, e.lineno, r, n)
    }

    function m(e) {
        if (e.url) {
            var n, t = {filename: e.url, lineno: e.line, colno: e.column, "function": e.func || "?"}, r = g(e);
            if (r) {
                var i = ["pre_context", "context_line", "post_context"];
                for (n = 3; n--;) t[i[n]] = r[n]
            }
            return t.in_app = !(D.includePaths.test && !D.includePaths.test(t.filename) || /(Raven|TraceKit)\./.test(t["function"]) || /raven\.(min\.)?js$/.test(t.filename)), t
        }
    }

    function g(e) {
        if (e.context && D.fetchContext) {
            for (var n = e.context, t = ~~(n.length / 2), r = n.length, i = !1; r--;) if (n[r].length > 300) {
                i = !0;
                break
            }
            if (i) {
                if (o(e.column)) return;
                return [[], n[t].substr(e.column, 50), []]
            }
            return [n.slice(0, t), n[t], n.slice(t + 1)]
        }
    }

    function d(e, n, t, r, i, o) {
        var a, s;
        D.ignoreErrors.test && D.ignoreErrors.test(n) || (n += "", n = x(n, D.maxMessageLength), s = e + ": " + n, s = x(s, D.maxMessageLength), i && i.length ? (t = i[0].filename || t, i.reverse(), a = {frames: i}) : t && (a = {
            frames: [{
                filename: t,
                lineno: r,
                in_app: !0
            }]
        }), D.ignoreUrls.test && D.ignoreUrls.test(t) || D.whitelistUrls.test && !D.whitelistUrls.test(t) || b(v({
            exception: {
                type: e,
                value: n
            }, stacktrace: a, culprit: t, message: s
        }, o)))
    }

    function v(e, n) {
        return n ? (p(n, function (n, t) {
            e[n] = t
        }), e) : e
    }

    function x(e, n) {
        return e.length <= n ? e : e.substr(0, n) + "…"
    }

    function y() {
        return +new Date
    }

    function w() {
        if (document.location && document.location.href) {
            var e = {headers: {"User-Agent": navigator.userAgent}};
            return e.url = document.location.href, document.referrer && (e.headers.Referer = document.referrer), e
        }
    }

    function b(e) {
        var n = {project: I, logger: D.logger, platform: "javascript"}, r = w();
        r && (n.request = r), e = v(n, e), e.tags = v(v({}, D.tags), e.tags), e.extra = v(v({}, D.extra), e.extra), e.extra = v({"session:duration": y() - J}, e.extra), u(e.tags) && delete e.tags, M && (e.user = M), D.release && (e.release = D.release), a(D.dataCallback) && (e = D.dataCallback(e) || e), e && !u(e) && (a(D.shouldSendCallback) && !D.shouldSendCallback(e) || (L = e.event_id || (e.event_id = O()), C("debug", "Raven about to send:", e), _() && (D.transport || E)({
            url: N,
            auth: {sentry_version: "4", sentry_client: "raven-js/" + X.VERSION, sentry_key: F},
            data: e,
            options: D,
            onSuccess: function () {
                t("success", {data: e, src: N})
            },
            onError: function () {
                t("failure", {data: e, src: N})
            }
        })))
    }

    function E(e) {
        e.auth.sentry_data = JSON.stringify(e.data);
        var n = S(), t = e.url + "?" + R(e.auth);
        (e.options.crossOrigin || "" === e.options.crossOrigin) && (n.crossOrigin = e.options.crossOrigin), n.onload = e.onSuccess, n.onerror = n.onabort = e.onError, n.src = t
    }

    function S() {
        return document.createElement("img")
    }

    function _() {
        return !!q && (!!N || (K || C("error", "Error: Raven has not been configured."), K = !0, !1))
    }

    function k(e) {
        for (var n, t = [], r = 0, i = e.length; r < i; r++) n = e[r], s(n) ? t.push(n.replace(/([.*+?^=!:${}()|\[\]\/\\])/g, "\\$1")) : n && n.source && t.push(n.source);
        return new RegExp(t.join("|"), "i")
    }

    function O() {
        var n = e.crypto || e.msCrypto;
        if (!o(n) && n.getRandomValues) {
            var t = new Uint16Array(8);
            n.getRandomValues(t), t[3] = 4095 & t[3] | 16384, t[4] = 16383 & t[4] | 32768;
            var r = function (e) {
                for (var n = e.toString(16); n.length < 4;) n = "0" + n;
                return n
            };
            return r(t[0]) + r(t[1]) + r(t[2]) + r(t[3]) + r(t[4]) + r(t[5]) + r(t[6]) + r(t[7])
        }
        return "xxxxxxxxxxxx4xxxyxxxxxxxxxxxxxxx".replace(/[xy]/g, function (e) {
            var n = 16 * Math.random() | 0, t = "x" == e ? n : 3 & n | 8;
            return t.toString(16)
        })
    }

    function C(e) {
        H[e] && X.debug && H[e].apply(B, A.call(arguments, 1))
    }

    function T() {
        var n = e.RavenConfig;
        n && X.config(n.dsn, n.config).install()
    }

    function R(e) {
        var n = [];
        return p(e, function (e, t) {
            n.push(encodeURIComponent(e) + "=" + encodeURIComponent(t))
        }), n.join("&")
    }

    var j = {remoteFetching: !1, collectWindowErrors: !0, linesOfContext: 7, debug: !1}, A = [].slice, U = "?";
    j.wrap = function (e) {
        function n() {
            try {
                return e.apply(this, arguments)
            } catch (n) {
                throw j.report(n), n
            }
        }

        return n
    }, j.report = function () {
        function t(e) {
            s(), m.push(e)
        }

        function r(e) {
            for (var n = m.length - 1; n >= 0; --n) m[n] === e && m.splice(n, 1)
        }

        function i() {
            c(), m = []
        }

        function o(e, n) {
            var t = null;
            if (!n || j.collectWindowErrors) {
                for (var r in m) if (f(m, r)) try {
                    m[r].apply(null, [e].concat(A.call(arguments, 2)))
                } catch (i) {
                    t = i
                }
                if (t) throw t
            }
        }

        function a(e, n, t, r, i) {
            var a = null;
            if (v) j.computeStackTrace.augmentStackTraceWithInitialElement(v, n, t, e), u(); else if (i) a = j.computeStackTrace(i), o(a, !0); else {
                var s = {url: n, line: t, column: r};
                s.func = j.computeStackTrace.guessFunctionName(s.url, s.line), s.context = j.computeStackTrace.gatherContext(s.url, s.line), a = {
                    message: e,
                    url: document.location.href,
                    stack: [s]
                }, o(a, !0)
            }
            return !!p && p.apply(this, arguments)
        }

        function s() {
            h || (p = e.onerror, e.onerror = a, h = !0)
        }

        function c() {
            h && (e.onerror = p, h = !1, p = n)
        }

        function u() {
            var e = v, n = g;
            g = null, v = null, d = null, o.apply(null, [e, !1].concat(n))
        }

        function l(n, t) {
            var r = A.call(arguments, 1);
            if (v) {
                if (d === n) return;
                u()
            }
            var i = j.computeStackTrace(n);
            if (v = i, d = n, g = r, e.setTimeout(function () {
                d === n && u()
            }, i.incomplete ? 2e3 : 0), t !== !1) throw n
        }

        var p, h, m = [], g = null, d = null, v = null;
        return l.subscribe = t, l.unsubscribe = r, l.uninstall = i, l
    }(), j.computeStackTrace = function () {
        function n(n) {
            if (!j.remoteFetching) return "";
            try {
                var t = function () {
                    try {
                        return new e.XMLHttpRequest
                    } catch (n) {
                        return new e.ActiveXObject("Microsoft.XMLHTTP")
                    }
                }, r = t();
                return r.open("GET", n, !1), r.send(""), r.responseText
            } catch (i) {
                return ""
            }
        }

        function t(e) {
            if (!s(e)) return [];
            if (!f(y, e)) {
                var t = "", r = "";
                try {
                    r = document.domain
                } catch (i) {
                }
                e.indexOf(r) !== -1 && (t = n(e)), y[e] = t ? t.split("\n") : []
            }
            return y[e]
        }

        function r(e, n) {
            var r, i = /function ([^(]*)\(([^)]*)\)/,
                a = /['"]?([0-9A-Za-z$_]+)['"]?\s*[:=]\s*(function|eval|new Function)/, s = "", c = 10, u = t(e);
            if (!u.length) return U;
            for (var l = 0; l < c; ++l) if (s = u[n - l] + s, !o(s)) {
                if (r = a.exec(s)) return r[1];
                if (r = i.exec(s)) return r[1]
            }
            return U
        }

        function i(e, n) {
            var r = t(e);
            if (!r.length) return null;
            var i = [], a = Math.floor(j.linesOfContext / 2), s = a + j.linesOfContext % 2, c = Math.max(0, n - a - 1),
                u = Math.min(r.length, n + s - 1);
            n -= 1;
            for (var l = c; l < u; ++l) o(r[l]) || i.push(r[l]);
            return i.length > 0 ? i : null
        }

        function a(e) {
            return e.replace(/[\-\[\]{}()*+?.,\\\^$|#]/g, "\\$&")
        }

        function c(e) {
            return a(e).replace("<", "(?:<|&lt;)").replace(">", "(?:>|&gt;)").replace("&", "(?:&|&amp;)").replace('"', '(?:"|&quot;)').replace(/\s+/g, "\\s+")
        }

        function u(e, n) {
            for (var r, i, o = 0, a = n.length; o < a; ++o) if ((r = t(n[o])).length && (r = r.join("\n"), i = e.exec(r))) return {
                url: n[o],
                line: r.substring(0, i.index).split("\n").length,
                column: i.index - r.lastIndexOf("\n", i.index) - 1
            };
            return null
        }

        function l(e, n, r) {
            var i, o = t(n), s = new RegExp("\\b" + a(e) + "\\b");
            return r -= 1, o && o.length > r && (i = s.exec(o[r])) ? i.index : null
        }

        function p(n) {
            for (var t, r, i, o, s = [e.location.href], l = document.getElementsByTagName("script"), f = "" + n, p = /^function(?:\s+([\w$]+))?\s*\(([\w\s,]*)\)\s*\{\s*(\S[\s\S]*\S)\s*\}\s*$/, h = /^function on([\w$]+)\s*\(event\)\s*\{\s*(\S[\s\S]*\S)\s*\}\s*$/, m = 0; m < l.length; ++m) {
                var g = l[m];
                g.src && s.push(g.src)
            }
            if (i = p.exec(f)) {
                var d = i[1] ? "\\s+" + i[1] : "", v = i[2].split(",").join("\\s*,\\s*");
                t = a(i[3]).replace(/;$/, ";?"), r = new RegExp("function" + d + "\\s*\\(\\s*" + v + "\\s*\\)\\s*{\\s*" + t + "\\s*}")
            } else r = new RegExp(a(f).replace(/\s+/g, "\\s+"));
            if (o = u(r, s)) return o;
            if (i = h.exec(f)) {
                var x = i[1];
                if (t = c(i[2]), r = new RegExp("on" + x + "=[\\'\"]\\s*" + t + "\\s*[\\'\"]", "i"), o = u(r, s[0])) return o;
                if (r = new RegExp(t), o = u(r, s)) return o
            }
            return null
        }

        function h(e) {
            if (!o(e.stack) && e.stack) {
                for (var n, t, a = /^\s*at (.*?) ?\(?((?:(?:file|https?|chrome-extension):.*?)|<anonymous>):(\d+)(?::(\d+))?\)?\s*$/i, s = /^\s*(.*?)(?:\((.*?)\))?@((?:file|https?|chrome).*?):(\d+)(?::(\d+))?\s*$/i, c = /^\s*at (?:((?:\[object object\])?.+) )?\(?((?:ms-appx|http|https):.*?):(\d+)(?::(\d+))?\)?\s*$/i, u = e.stack.split("\n"), f = [], p = /^(.*) is undefined$/.exec(e.message), h = 0, m = u.length; h < m; ++h) {
                    if (n = s.exec(u[h])) t = {
                        url: n[3],
                        func: n[1] || U,
                        args: n[2] ? n[2].split(",") : "",
                        line: +n[4],
                        column: n[5] ? +n[5] : null
                    }; else if (n = a.exec(u[h])) t = {
                        url: n[2],
                        func: n[1] || U,
                        line: +n[3],
                        column: n[4] ? +n[4] : null
                    }; else {
                        if (!(n = c.exec(u[h]))) continue;
                        t = {url: n[2], func: n[1] || U, line: +n[3], column: n[4] ? +n[4] : null}
                    }
                    !t.func && t.line && (t.func = r(t.url, t.line)), t.line && (t.context = i(t.url, t.line)), f.push(t)
                }
                return f.length ? (f[0].line && !f[0].column && p ? f[0].column = l(p[1], f[0].url, f[0].line) : f[0].column || o(e.columnNumber) || (f[0].column = e.columnNumber + 1), {
                    name: e.name,
                    message: e.message,
                    url: document.location.href,
                    stack: f
                }) : null
            }
        }

        function m(e) {
            var n = e.stacktrace;
            if (!o(e.stacktrace) && e.stacktrace) {
                for (var t, a = / line (\d+), column (\d+) in (?:<anonymous function: ([^>]+)>|([^\)]+))\((.*)\) in (.*):\s*$/i, s = n.split("\n"), c = [], u = 0, l = s.length; u < l; u += 2) if (t = a.exec(s[u])) {
                    var f = {
                        line: +t[1],
                        column: +t[2],
                        func: t[3] || t[4],
                        args: t[5] ? t[5].split(",") : [],
                        url: t[6]
                    };
                    if (!f.func && f.line && (f.func = r(f.url, f.line)), f.line) try {
                        f.context = i(f.url, f.line)
                    } catch (p) {
                    }
                    f.context || (f.context = [s[u + 1]]), c.push(f)
                }
                return c.length ? {name: e.name, message: e.message, url: document.location.href, stack: c} : null
            }
        }

        function g(n) {
            var o = n.message.split("\n");
            if (o.length < 4) return null;
            var a, s, l, p, h = /^\s*Line (\d+) of linked script ((?:file|https?)\S+)(?:: in function (\S+))?\s*$/i,
                m = /^\s*Line (\d+) of inline#(\d+) script in ((?:file|https?)\S+)(?:: in function (\S+))?\s*$/i,
                g = /^\s*Line (\d+) of function script\s*$/i, d = [], v = document.getElementsByTagName("script"),
                x = [];
            for (s in v) f(v, s) && !v[s].src && x.push(v[s]);
            for (s = 2, l = o.length; s < l; s += 2) {
                var y = null;
                if (a = h.exec(o[s])) y = {url: a[2], func: a[3], line: +a[1]}; else if (a = m.exec(o[s])) {
                    y = {url: a[3], func: a[4]};
                    var w = +a[1], b = x[a[2] - 1];
                    if (b && (p = t(y.url))) {
                        p = p.join("\n");
                        var E = p.indexOf(b.innerText);
                        E >= 0 && (y.line = w + p.substring(0, E).split("\n").length)
                    }
                } else if (a = g.exec(o[s])) {
                    var S = e.location.href.replace(/#.*$/, ""), _ = a[1], k = new RegExp(c(o[s + 1]));
                    p = u(k, [S]), y = {url: S, line: p ? p.line : _, func: ""}
                }
                if (y) {
                    y.func || (y.func = r(y.url, y.line));
                    var O = i(y.url, y.line), C = O ? O[Math.floor(O.length / 2)] : null;
                    O && C.replace(/^\s*/, "") === o[s + 1].replace(/^\s*/, "") ? y.context = O : y.context = [o[s + 1]], d.push(y)
                }
            }
            return d.length ? {name: n.name, message: o[0], url: document.location.href, stack: d} : null
        }

        function d(e, n, t, o) {
            var a = {url: n, line: t};
            if (a.url && a.line) {
                e.incomplete = !1, a.func || (a.func = r(a.url, a.line)), a.context || (a.context = i(a.url, a.line));
                var s = / '([^']+)' /.exec(o);
                if (s && (a.column = l(s[1], a.url, a.line)), e.stack.length > 0 && e.stack[0].url === a.url) {
                    if (e.stack[0].line === a.line) return !1;
                    if (!e.stack[0].line && e.stack[0].func === a.func) return e.stack[0].line = a.line, e.stack[0].context = a.context, !1
                }
                return e.stack.unshift(a), e.partial = !0, !0
            }
            return e.incomplete = !0, !1
        }

        function v(e, n) {
            for (var t, i, o, a = /function\s+([_$a-zA-Z\xA0-\uFFFF][_$a-zA-Z0-9\xA0-\uFFFF]*)?\s*\(/i, s = [], c = {}, u = !1, f = v.caller; f && !u; f = f.caller) if (f !== x && f !== j.report) {
                if (i = {
                    url: null,
                    func: U,
                    line: null,
                    column: null
                }, f.name ? i.func = f.name : (t = a.exec(f.toString())) && (i.func = t[1]), "undefined" == typeof i.func) try {
                    i.func = t.input.substring(0, t.input.indexOf("{"))
                } catch (h) {
                }
                if (o = p(f)) {
                    i.url = o.url, i.line = o.line, i.func === U && (i.func = r(i.url, i.line));
                    var m = / '([^']+)' /.exec(e.message || e.description);
                    m && (i.column = l(m[1], o.url, o.line))
                }
                c["" + f] ? u = !0 : c["" + f] = !0, s.push(i)
            }
            n && s.splice(0, n);
            var g = {name: e.name, message: e.message, url: document.location.href, stack: s};
            return d(g, e.sourceURL || e.fileName, e.line || e.lineNumber, e.message || e.description), g
        }

        function x(e, n) {
            var t = null;
            n = null == n ? 0 : +n;
            try {
                if (t = m(e)) return t
            } catch (r) {
                if (j.debug) throw r
            }
            try {
                if (t = h(e)) return t
            } catch (r) {
                if (j.debug) throw r
            }
            try {
                if (t = g(e)) return t
            } catch (r) {
                if (j.debug) throw r
            }
            try {
                if (t = v(e, n + 1)) return t
            } catch (r) {
                if (j.debug) throw r
            }
            return {name: e.name, message: e.message, url: document.location.href}
        }

        var y = {};
        return x.augmentStackTraceWithInitialElement = d, x.computeStackTraceFromStackProp = h, x.guessFunctionName = r, x.gatherContext = i, x
    }();
    var $, L, N, M, F, I, P = e.Raven, q = !("object" != typeof JSON || !JSON.stringify), D = {
        logger: "javascript",
        ignoreErrors: [],
        ignoreUrls: [],
        whitelistUrls: [],
        includePaths: [],
        crossOrigin: "anonymous",
        collectWindowErrors: !0,
        tags: {},
        maxMessageLength: 100,
        extra: {}
    }, z = !1, W = Object.prototype, B = e.console || {}, H = {}, J = y();
    for (var V in B) H[V] = B[V];
    var X = {
        VERSION: "1.1.22", debug: !0, noConflict: function () {
            return e.Raven = P, X
        }, config: function (e, n) {
            if (N) return C("error", "Error: Raven has already been configured"), X;
            if (!e) return X;
            var t = i(e), r = t.path.lastIndexOf("/"), o = t.path.substr(1, r);
            return n && p(n, function (e, n) {
                D[e] = n
            }), D.ignoreErrors.push(/^Script error\.?$/), D.ignoreErrors.push(/^Javascript error: Script error\.? on line 0$/), D.ignoreErrors = k(D.ignoreErrors), D.ignoreUrls = !!D.ignoreUrls.length && k(D.ignoreUrls), D.whitelistUrls = !!D.whitelistUrls.length && k(D.whitelistUrls), D.includePaths = k(D.includePaths), F = t.user, I = t.path.substr(r + 1), N = "//" + t.host + (t.port ? ":" + t.port : "") + "/" + o + "api/" + I + "/store/", t.protocol && (N = t.protocol + ":" + N), D.fetchContext && (j.remoteFetching = !0), D.linesOfContext && (j.linesOfContext = D.linesOfContext), j.collectWindowErrors = !!D.collectWindowErrors, X
        }, install: function () {
            return _() && !z && (j.report.subscribe(h), z = !0), X
        }, context: function (e, t, r) {
            return a(e) && (r = t || [], t = e, e = n), X.wrap(e, t).apply(this, r)
        }, wrap: function (e, t) {
            function r() {
                for (var n = [], r = arguments.length, i = !e || e && e.deep !== !1; r--;) n[r] = i ? X.wrap(e, arguments[r]) : arguments[r];
                try {
                    return t.apply(this, n)
                } catch (o) {
                    throw X.captureException(o, e), o
                }
            }

            if (o(t) && !a(e)) return e;
            if (a(e) && (t = e, e = n), !a(t)) return t;
            if (t.__raven__) return t;
            for (var i in t) f(t, i) && (r[i] = t[i]);
            return r.__raven__ = !0, r.__inner__ = t, r
        }, uninstall: function () {
            return j.report.uninstall(), z = !1, X
        }, captureException: function (e, n) {
            if (!l(e)) return X.captureMessage(e, n);
            $ = e;
            try {
                var t = j.computeStackTrace(e);
                h(t, n)
            } catch (r) {
                if (e !== r) throw r
            }
            return X
        }, captureMessage: function (e, n) {
            if (!D.ignoreErrors.test || !D.ignoreErrors.test(e)) return b(v({message: e + ""}, n)), X
        }, setUserContext: function (e) {
            return M = e, X
        }, setExtraContext: function (e) {
            return D.extra = e || {}, X
        }, setTagsContext: function (e) {
            return D.tags = e || {}, X
        }, setReleaseContext: function (e) {
            return D.release = e, X
        }, setDataCallback: function (e) {
            return D.dataCallback = e, X
        }, setShouldSendCallback: function (e) {
            return D.shouldSendCallback = e, X
        }, lastException: function () {
            return $
        }, lastEventId: function () {
            return L
        }, isSetup: function () {
            return _()
        }
    };
    X.setUser = X.setUserContext;
    var Z = "source protocol user pass host port path".split(" "),
        G = /^(?:(\w+):)?\/\/(?:(\w+)(:\w+)?@)?([\w\.-]+)(?::(\d+))?(\/.*)/;
    r.prototype = new Error, r.prototype.constructor = r;
    var K;
    T(), e.Raven = X
}("undefined" != typeof window ? window : this), function (e, n) {
    "use strict";
    var t = function (t) {
        var r = e[t];
        e[t] = function () {
            var e = [].slice.call(arguments), t = e[0];
            return "function" == typeof t && (e[0] = n.wrap(t)), r.apply ? r.apply(this, e) : r(e[0], e[1])
        }
    };
    t("setTimeout"), t("setInterval")
}(window, window.Raven), Raven.config("http://5d54bac77cc04401ba8fca7a7b1d4c8c@sentry7.meituan.com/422", {whitelistUrls: ["maoyan.com", "anonymous"]}).install();