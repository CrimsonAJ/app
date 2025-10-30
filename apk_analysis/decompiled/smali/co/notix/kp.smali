.class public final Lco/notix/kp;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lco/notix/gb;


# instance fields
.field public final synthetic a:Lco/notix/gb;


# direct methods
.method public constructor <init>(Lco/notix/j9;)V
    .locals 0

    iput-object p1, p0, Lco/notix/kp;->a:Lco/notix/gb;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    .line 1
    check-cast p1, Lorg/json/JSONObject;

    .line 2
    .line 3
    const-string v0, "from"

    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    const-string v0, "domains"

    .line 9
    .line 10
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    const/4 v1, 0x0

    .line 15
    if-eqz v0, :cond_1

    .line 16
    .line 17
    iget-object v2, p0, Lco/notix/kp;->a:Lco/notix/gb;

    .line 18
    .line 19
    const-string v3, "<this>"

    .line 20
    .line 21
    invoke-static {v2, v3}, Lkotlin/jvm/internal/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    :try_start_0
    invoke-interface {v2, v0}, Lco/notix/td;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 28
    goto :goto_0

    .line 29
    :catchall_0
    move-exception v0

    .line 30
    invoke-static {v0}, La/a;->h(Ljava/lang/Throwable;)LA7/i;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    :goto_0
    instance-of v2, v0, LA7/i;

    .line 35
    .line 36
    if-eqz v2, :cond_0

    .line 37
    .line 38
    move-object v0, v1

    .line 39
    :cond_0
    check-cast v0, Lco/notix/l9;

    .line 40
    .line 41
    goto :goto_1

    .line 42
    :cond_1
    move-object v0, v1

    .line 43
    :goto_1
    const-string v2, "remote_logs"

    .line 44
    .line 45
    invoke-virtual {p1, v2}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    .line 46
    .line 47
    .line 48
    move-result-object v2

    .line 49
    if-eqz v2, :cond_5

    .line 50
    .line 51
    const-string v3, "level"

    .line 52
    .line 53
    invoke-static {v2, v3}, Lco/notix/jc;->d(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object v3

    .line 57
    if-eqz v3, :cond_3

    .line 58
    .line 59
    invoke-static {}, Lco/notix/ql;->values()[Lco/notix/ql;

    .line 60
    .line 61
    .line 62
    move-result-object v4

    .line 63
    array-length v5, v4

    .line 64
    const/4 v6, 0x0

    .line 65
    :goto_2
    if-ge v6, v5, :cond_3

    .line 66
    .line 67
    aget-object v7, v4, v6

    .line 68
    .line 69
    iget-object v8, v7, Lco/notix/ql;->a:Ljava/lang/String;

    .line 70
    .line 71
    invoke-static {v8, v3}, Lkotlin/jvm/internal/h;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 72
    .line 73
    .line 74
    move-result v8

    .line 75
    if-eqz v8, :cond_2

    .line 76
    .line 77
    goto :goto_3

    .line 78
    :cond_2
    add-int/lit8 v6, v6, 0x1

    .line 79
    .line 80
    goto :goto_2

    .line 81
    :cond_3
    move-object v7, v1

    .line 82
    :goto_3
    const-string v3, "storage_max_size"

    .line 83
    .line 84
    invoke-static {v2, v3}, Lco/notix/jc;->c(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/Long;

    .line 85
    .line 86
    .line 87
    move-result-object v3

    .line 88
    const-string v4, "rate_limits"

    .line 89
    .line 90
    invoke-virtual {v2, v4}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    .line 91
    .line 92
    .line 93
    move-result-object v2

    .line 94
    if-eqz v2, :cond_4

    .line 95
    .line 96
    new-instance v4, Lco/notix/qp;

    .line 97
    .line 98
    const-string v5, "vh"

    .line 99
    .line 100
    invoke-static {v2, v5}, Lco/notix/jc;->c(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/Long;

    .line 101
    .line 102
    .line 103
    move-result-object v5

    .line 104
    const-string v6, "ih"

    .line 105
    .line 106
    invoke-static {v2, v6}, Lco/notix/jc;->c(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/Long;

    .line 107
    .line 108
    .line 109
    move-result-object v6

    .line 110
    const-string v8, "eh"

    .line 111
    .line 112
    invoke-static {v2, v8}, Lco/notix/jc;->c(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/Long;

    .line 113
    .line 114
    .line 115
    move-result-object v8

    .line 116
    const-string v9, "delay"

    .line 117
    .line 118
    invoke-static {v2, v9}, Lco/notix/jc;->c(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/Long;

    .line 119
    .line 120
    .line 121
    move-result-object v2

    .line 122
    invoke-direct {v4, v5, v6, v8, v2}, Lco/notix/qp;-><init>(Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;)V

    .line 123
    .line 124
    .line 125
    goto :goto_4

    .line 126
    :cond_4
    move-object v4, v1

    .line 127
    :goto_4
    new-instance v2, Lco/notix/rp;

    .line 128
    .line 129
    invoke-direct {v2, v7, v3, v4}, Lco/notix/rp;-><init>(Lco/notix/ql;Ljava/lang/Long;Lco/notix/qp;)V

    .line 130
    .line 131
    .line 132
    goto :goto_5

    .line 133
    :cond_5
    move-object v2, v1

    .line 134
    :goto_5
    const-string v3, "notifications"

    .line 135
    .line 136
    invoke-virtual {p1, v3}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    .line 137
    .line 138
    .line 139
    move-result-object v3

    .line 140
    if-eqz v3, :cond_8

    .line 141
    .line 142
    const-string v4, "pull"

    .line 143
    .line 144
    invoke-virtual {v3, v4}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    .line 145
    .line 146
    .line 147
    move-result-object v4

    .line 148
    if-eqz v4, :cond_6

    .line 149
    .line 150
    new-instance v5, Lco/notix/np;

    .line 151
    .line 152
    const-string v6, "force_ad"

    .line 153
    .line 154
    invoke-static {v4, v6}, Lco/notix/jc;->a(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/Boolean;

    .line 155
    .line 156
    .line 157
    move-result-object v6

    .line 158
    const-string v7, "ad_freq"

    .line 159
    .line 160
    invoke-static {v4, v7}, Lco/notix/jc;->b(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/Integer;

    .line 161
    .line 162
    .line 163
    move-result-object v7

    .line 164
    const-string v8, "ad_initial_delay"

    .line 165
    .line 166
    invoke-static {v4, v8}, Lco/notix/jc;->c(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/Long;

    .line 167
    .line 168
    .line 169
    move-result-object v8

    .line 170
    const-string v9, "ad_minimal_delay"

    .line 171
    .line 172
    invoke-static {v4, v9}, Lco/notix/jc;->c(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/Long;

    .line 173
    .line 174
    .line 175
    move-result-object v4

    .line 176
    invoke-direct {v5, v6, v7, v8, v4}, Lco/notix/np;-><init>(Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Long;Ljava/lang/Long;)V

    .line 177
    .line 178
    .line 179
    goto :goto_6

    .line 180
    :cond_6
    move-object v5, v1

    .line 181
    :goto_6
    const-string v4, "push"

    .line 182
    .line 183
    invoke-virtual {v3, v4}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    .line 184
    .line 185
    .line 186
    move-result-object v3

    .line 187
    if-eqz v3, :cond_7

    .line 188
    .line 189
    new-instance v4, Lco/notix/op;

    .line 190
    .line 191
    const-string v6, "sender_id"

    .line 192
    .line 193
    invoke-static {v3, v6}, Lco/notix/jc;->c(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/Long;

    .line 194
    .line 195
    .line 196
    move-result-object v3

    .line 197
    invoke-direct {v4, v3}, Lco/notix/op;-><init>(Ljava/lang/Long;)V

    .line 198
    .line 199
    .line 200
    goto :goto_7

    .line 201
    :cond_7
    move-object v4, v1

    .line 202
    :goto_7
    new-instance v3, Lco/notix/pp;

    .line 203
    .line 204
    invoke-direct {v3, v5, v4}, Lco/notix/pp;-><init>(Lco/notix/np;Lco/notix/op;)V

    .line 205
    .line 206
    .line 207
    goto :goto_8

    .line 208
    :cond_8
    move-object v3, v1

    .line 209
    :goto_8
    const-string v4, "lsi"

    .line 210
    .line 211
    invoke-virtual {p1, v4}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    .line 212
    .line 213
    .line 214
    move-result-object p1

    .line 215
    if-eqz p1, :cond_9

    .line 216
    .line 217
    new-instance v1, Lco/notix/mp;

    .line 218
    .line 219
    const-string v4, "interval_sec"

    .line 220
    .line 221
    invoke-static {p1, v4}, Lco/notix/jc;->c(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/Long;

    .line 222
    .line 223
    .line 224
    move-result-object v4

    .line 225
    const-string v5, "close_sec"

    .line 226
    .line 227
    invoke-static {p1, v5}, Lco/notix/jc;->c(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/Long;

    .line 228
    .line 229
    .line 230
    move-result-object p1

    .line 231
    invoke-direct {v1, v4, p1}, Lco/notix/mp;-><init>(Ljava/lang/Long;Ljava/lang/Long;)V

    .line 232
    .line 233
    .line 234
    :cond_9
    new-instance p1, Lco/notix/sp;

    .line 235
    .line 236
    invoke-direct {p1, v0, v2, v3, v1}, Lco/notix/sp;-><init>(Lco/notix/l9;Lco/notix/rp;Lco/notix/pp;Lco/notix/mp;)V

    .line 237
    .line 238
    .line 239
    return-object p1
    .line 240
.end method
