.class public final Lv4/o;
.super Lv4/s;
.source "SourceFile"


# instance fields
.field public final synthetic A:D

.field public final synthetic B:Lv4/h;


# direct methods
.method public constructor <init>(Lv4/h;D)V
    .locals 0

    .line 1
    iput-wide p2, p0, Lv4/o;->A:D

    .line 2
    .line 3
    iput-object p1, p0, Lv4/o;->B:Lv4/h;

    .line 4
    .line 5
    const/4 p2, 0x0

    .line 6
    invoke-direct {p0, p1, p2}, Lv4/s;-><init>(Lv4/h;Z)V

    .line 7
    .line 8
    .line 9
    return-void
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
.end method


# virtual methods
.method public final N()V
    .locals 9

    .line 1
    iget-object v0, p0, Lv4/o;->B:Lv4/h;

    .line 2
    .line 3
    iget-object v0, v0, Lv4/h;->c:Ly4/n;

    .line 4
    .line 5
    invoke-virtual {p0}, Lv4/s;->O()Ly4/o;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    iget-wide v2, p0, Lv4/o;->A:D

    .line 10
    .line 11
    iget-object v4, v0, Ly4/n;->f:Lt4/p;

    .line 12
    .line 13
    if-eqz v4, :cond_0

    .line 14
    .line 15
    new-instance v4, Lorg/json/JSONObject;

    .line 16
    .line 17
    invoke-direct {v4}, Lorg/json/JSONObject;-><init>()V

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0}, LX3/d;->n()J

    .line 21
    .line 22
    .line 23
    move-result-wide v5

    .line 24
    :try_start_0
    const-string v7, "requestId"

    .line 25
    .line 26
    invoke-virtual {v4, v7, v5, v6}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    .line 27
    .line 28
    .line 29
    const-string v7, "type"

    .line 30
    .line 31
    const-string v8, "SET_PLAYBACK_RATE"

    .line 32
    .line 33
    invoke-virtual {v4, v7, v8}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 34
    .line 35
    .line 36
    const-string v7, "playbackRate"

    .line 37
    .line 38
    invoke-virtual {v4, v7, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;D)Lorg/json/JSONObject;

    .line 39
    .line 40
    .line 41
    iget-object v2, v0, Ly4/n;->f:Lt4/p;

    .line 42
    .line 43
    const-string v3, "mediaStatus should not be null"

    .line 44
    .line 45
    invoke-static {v2, v3}, LF4/y;->i(Ljava/lang/Object;Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    const-string v2, "mediaSessionId"

    .line 49
    .line 50
    iget-object v3, v0, Ly4/n;->f:Lt4/p;

    .line 51
    .line 52
    iget-wide v7, v3, Lt4/p;->b:J

    .line 53
    .line 54
    invoke-virtual {v4, v2, v7, v8}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 55
    .line 56
    .line 57
    :catch_0
    invoke-virtual {v4}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object v2

    .line 61
    invoke-virtual {v0, v5, v6, v2}, LX3/d;->o(JLjava/lang/String;)V

    .line 62
    .line 63
    .line 64
    iget-object v0, v0, Ly4/n;->x:Ly4/p;

    .line 65
    .line 66
    invoke-virtual {v0, v5, v6, v1}, Ly4/p;->a(JLy4/o;)V

    .line 67
    .line 68
    .line 69
    return-void

    .line 70
    :cond_0
    new-instance v0, Ly4/m;

    .line 71
    .line 72
    invoke-direct {v0}, Ljava/lang/Exception;-><init>()V

    .line 73
    .line 74
    .line 75
    throw v0
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
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
.end method
