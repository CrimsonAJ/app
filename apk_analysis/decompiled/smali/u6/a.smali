.class public final synthetic Lu6/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lx6/a;
.implements Lw6/a;
.implements LS6/a;


# instance fields
.field public final synthetic a:Ld0/f;


# direct methods
.method public synthetic constructor <init>(Ld0/f;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lu6/a;->a:Ld0/f;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public h(LS6/b;)V
    .locals 7

    .line 1
    iget-object v0, p0, Lu6/a;->a:Ld0/f;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    sget-object v1, Lv6/c;->a:Lv6/c;

    .line 7
    .line 8
    const-string v2, "AnalyticsConnector now available."

    .line 9
    .line 10
    invoke-virtual {v1, v2}, Lv6/c;->c(Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    invoke-interface {p1}, LS6/b;->get()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    check-cast p1, Lp6/b;

    .line 18
    .line 19
    new-instance v2, Lcom/google/firebase/messaging/u;

    .line 20
    .line 21
    invoke-direct {v2, p1}, Lcom/google/firebase/messaging/u;-><init>(Ljava/lang/Object;)V

    .line 22
    .line 23
    .line 24
    new-instance v3, Lk4/E;

    .line 25
    .line 26
    const/16 v4, 0x11

    .line 27
    .line 28
    const/4 v5, 0x0

    .line 29
    invoke-direct {v3, v4, v5}, Lk4/E;-><init>(IZ)V

    .line 30
    .line 31
    .line 32
    check-cast p1, Lp6/c;

    .line 33
    .line 34
    const-string v4, "clx"

    .line 35
    .line 36
    invoke-virtual {p1, v4, v3}, Lp6/c;->b(Ljava/lang/String;Lk4/E;)Le0/c;

    .line 37
    .line 38
    .line 39
    move-result-object v4

    .line 40
    const/4 v5, 0x0

    .line 41
    if-nez v4, :cond_2

    .line 42
    .line 43
    const-string v4, "FirebaseCrashlytics"

    .line 44
    .line 45
    const/4 v6, 0x3

    .line 46
    invoke-static {v4, v6}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 47
    .line 48
    .line 49
    move-result v6

    .line 50
    if-eqz v6, :cond_0

    .line 51
    .line 52
    const-string v6, "Could not register AnalyticsConnectorListener with Crashlytics origin."

    .line 53
    .line 54
    invoke-static {v4, v6, v5}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 55
    .line 56
    .line 57
    :cond_0
    const-string v6, "crash"

    .line 58
    .line 59
    invoke-virtual {p1, v6, v3}, Lp6/c;->b(Ljava/lang/String;Lk4/E;)Le0/c;

    .line 60
    .line 61
    .line 62
    move-result-object p1

    .line 63
    if-eqz p1, :cond_1

    .line 64
    .line 65
    const-string v6, "A new version of the Google Analytics for Firebase SDK is now available. For improved performance and compatibility with Crashlytics, please update to the latest version."

    .line 66
    .line 67
    invoke-static {v4, v6, v5}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 68
    .line 69
    .line 70
    :cond_1
    move-object v4, p1

    .line 71
    :cond_2
    if-eqz v4, :cond_4

    .line 72
    .line 73
    const-string p1, "Registered Firebase Analytics listener."

    .line 74
    .line 75
    invoke-virtual {v1, p1}, Lv6/c;->c(Ljava/lang/String;)V

    .line 76
    .line 77
    .line 78
    new-instance p1, Lf5/o;

    .line 79
    .line 80
    const/16 v1, 0x17

    .line 81
    .line 82
    invoke-direct {p1, v1}, Lf5/o;-><init>(I)V

    .line 83
    .line 84
    .line 85
    new-instance v1, Lv4/q;

    .line 86
    .line 87
    sget-object v4, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    .line 88
    .line 89
    invoke-direct {v1, v2}, Lv4/q;-><init>(Lcom/google/firebase/messaging/u;)V

    .line 90
    .line 91
    .line 92
    monitor-enter v0

    .line 93
    :try_start_0
    iget-object v2, v0, Ld0/f;->c:Ljava/lang/Object;

    .line 94
    .line 95
    check-cast v2, Ljava/util/ArrayList;

    .line 96
    .line 97
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 98
    .line 99
    .line 100
    move-result v4

    .line 101
    const/4 v5, 0x0

    .line 102
    :goto_0
    if-ge v5, v4, :cond_3

    .line 103
    .line 104
    invoke-virtual {v2, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 105
    .line 106
    .line 107
    move-result-object v6

    .line 108
    add-int/lit8 v5, v5, 0x1

    .line 109
    .line 110
    check-cast v6, Ly6/n;

    .line 111
    .line 112
    invoke-virtual {p1, v6}, Lf5/o;->i(Ly6/n;)V

    .line 113
    .line 114
    .line 115
    goto :goto_0

    .line 116
    :catchall_0
    move-exception p1

    .line 117
    goto :goto_1

    .line 118
    :cond_3
    iput-object p1, v3, Lk4/E;->c:Ljava/lang/Object;

    .line 119
    .line 120
    iput-object v1, v3, Lk4/E;->b:Ljava/lang/Object;

    .line 121
    .line 122
    iput-object p1, v0, Ld0/f;->b:Ljava/lang/Object;

    .line 123
    .line 124
    iput-object v1, v0, Ld0/f;->a:Ljava/lang/Object;

    .line 125
    .line 126
    monitor-exit v0

    .line 127
    return-void

    .line 128
    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 129
    throw p1

    .line 130
    :cond_4
    const-string p1, "Could not register Firebase Analytics listener; a listener is already registered."

    .line 131
    .line 132
    invoke-virtual {v1, p1, v5}, Lv6/c;->g(Ljava/lang/String;Ljava/lang/Exception;)V

    .line 133
    .line 134
    .line 135
    return-void
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
.end method

.method public i(Ly6/n;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lu6/a;->a:Ld0/f;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, v0, Ld0/f;->b:Ljava/lang/Object;

    .line 5
    .line 6
    check-cast v1, Lx6/a;

    .line 7
    .line 8
    instance-of v1, v1, Lx6/b;

    .line 9
    .line 10
    if-eqz v1, :cond_0

    .line 11
    .line 12
    iget-object v1, v0, Ld0/f;->c:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v1, Ljava/util/ArrayList;

    .line 15
    .line 16
    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 17
    .line 18
    .line 19
    :cond_0
    iget-object v1, v0, Ld0/f;->b:Ljava/lang/Object;

    .line 20
    .line 21
    check-cast v1, Lx6/a;

    .line 22
    .line 23
    invoke-interface {v1, p1}, Lx6/a;->i(Ly6/n;)V

    .line 24
    .line 25
    .line 26
    monitor-exit v0

    .line 27
    return-void

    .line 28
    :catchall_0
    move-exception p1

    .line 29
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 30
    throw p1
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
.end method

.method public j(Landroid/os/Bundle;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lu6/a;->a:Ld0/f;

    .line 2
    .line 3
    iget-object v0, v0, Ld0/f;->a:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v0, Lw6/a;

    .line 6
    .line 7
    invoke-interface {v0, p1}, Lw6/a;->j(Landroid/os/Bundle;)V

    .line 8
    .line 9
    .line 10
    return-void
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
.end method
