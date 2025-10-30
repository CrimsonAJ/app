.class public final Lco/notix/oj;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lco/notix/gr;


# instance fields
.field public final synthetic a:Lco/notix/gr;


# direct methods
.method public constructor <init>(Lco/notix/n;)V
    .locals 0

    iput-object p1, p0, Lco/notix/oj;->a:Lco/notix/gr;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 1
    check-cast p1, Lco/notix/pj;

    .line 2
    .line 3
    const-string v0, "from"

    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    new-instance v0, Lorg/json/JSONObject;

    .line 9
    .line 10
    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    .line 11
    .line 12
    .line 13
    iget-object v1, p0, Lco/notix/oj;->a:Lco/notix/gr;

    .line 14
    .line 15
    iget-object v2, p1, Lco/notix/pj;->a:Ljava/lang/String;

    .line 16
    .line 17
    const-string v3, "user"

    .line 18
    .line 19
    invoke-virtual {v0, v3, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 20
    .line 21
    .line 22
    iget-object v2, p1, Lco/notix/pj;->b:Ljava/lang/String;

    .line 23
    .line 24
    const-string v3, "app"

    .line 25
    .line 26
    invoke-virtual {v0, v3, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 27
    .line 28
    .line 29
    iget-object v2, p1, Lco/notix/pj;->c:Ljava/lang/String;

    .line 30
    .line 31
    const-string v3, "var_1"

    .line 32
    .line 33
    invoke-virtual {v0, v3, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 34
    .line 35
    .line 36
    iget-object v2, p1, Lco/notix/pj;->d:Ljava/lang/String;

    .line 37
    .line 38
    const-string v3, "var_2"

    .line 39
    .line 40
    invoke-virtual {v0, v3, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 41
    .line 42
    .line 43
    iget-object v2, p1, Lco/notix/pj;->e:Ljava/lang/String;

    .line 44
    .line 45
    const-string v3, "var_3"

    .line 46
    .line 47
    invoke-virtual {v0, v3, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 48
    .line 49
    .line 50
    iget-object v2, p1, Lco/notix/pj;->f:Ljava/lang/String;

    .line 51
    .line 52
    const-string v3, "var_4"

    .line 53
    .line 54
    invoke-virtual {v0, v3, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 55
    .line 56
    .line 57
    iget-object v2, p1, Lco/notix/pj;->g:Ljava/lang/String;

    .line 58
    .line 59
    const-string v3, "var_5"

    .line 60
    .line 61
    invoke-virtual {v0, v3, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 62
    .line 63
    .line 64
    iget-object p1, p1, Lco/notix/pj;->h:Lco/notix/o;

    .line 65
    .line 66
    invoke-interface {v1, p1}, Lco/notix/td;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object p1

    .line 70
    const-string v1, "cnt"

    .line 71
    .line 72
    invoke-virtual {v0, v1, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 73
    .line 74
    .line 75
    return-object v0
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
.end method
