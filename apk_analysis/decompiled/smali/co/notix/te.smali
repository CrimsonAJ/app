.class public final Lco/notix/te;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lco/notix/y8;

.field public final b:LY7/z;

.field public c:Lco/notix/ne;

.field public d:Lco/notix/me;

.field public final e:Lb8/F;

.field public final f:Lb8/F;

.field public final g:LA7/e;


# direct methods
.method public constructor <init>(Lco/notix/d9;LY7/z;)V
    .locals 5

    .line 1
    const-string v0, "contextProvider"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "cs"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    .line 13
    .line 14
    iput-object p1, p0, Lco/notix/te;->a:Lco/notix/y8;

    .line 15
    .line 16
    iput-object p2, p0, Lco/notix/te;->b:LY7/z;

    .line 17
    .line 18
    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 19
    .line 20
    invoke-static {p1}, Lb8/M;->c(Ljava/lang/Object;)Lb8/Q;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    iput-object p1, p0, Lco/notix/te;->e:Lb8/F;

    .line 25
    .line 26
    iput-object p1, p0, Lco/notix/te;->f:Lb8/F;

    .line 27
    .line 28
    monitor-enter p1

    .line 29
    :try_start_0
    iget-object v0, p1, Lc8/b;->d:Lc8/F;

    .line 30
    .line 31
    if-nez v0, :cond_0

    .line 32
    .line 33
    new-instance v0, Lc8/F;

    .line 34
    .line 35
    iget v1, p1, Lc8/b;->b:I

    .line 36
    .line 37
    sget-object v2, La8/a;->b:La8/a;

    .line 38
    .line 39
    const/4 v3, 0x1

    .line 40
    const v4, 0x7fffffff

    .line 41
    .line 42
    .line 43
    invoke-direct {v0, v3, v4, v2}, Lb8/L;-><init>(IILa8/a;)V

    .line 44
    .line 45
    .line 46
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 47
    .line 48
    .line 49
    move-result-object v1

    .line 50
    invoke-virtual {v0, v1}, Lb8/L;->d(Ljava/lang/Object;)Z

    .line 51
    .line 52
    .line 53
    iput-object v0, p1, Lc8/b;->d:Lc8/F;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 54
    .line 55
    goto :goto_0

    .line 56
    :catchall_0
    move-exception p2

    .line 57
    goto :goto_1

    .line 58
    :cond_0
    :goto_0
    monitor-exit p1

    .line 59
    new-instance p1, Lco/notix/se;

    .line 60
    .line 61
    invoke-direct {p1, v0}, Lco/notix/se;-><init>(Lb8/O;)V

    .line 62
    .line 63
    .line 64
    invoke-static {p1}, Lb8/M;->j(Lb8/e;)Lb8/e;

    .line 65
    .line 66
    .line 67
    move-result-object p1

    .line 68
    new-instance v0, Lco/notix/le;

    .line 69
    .line 70
    const/4 v1, 0x0

    .line 71
    invoke-direct {v0, p0, v1}, Lco/notix/le;-><init>(Lco/notix/te;LE7/d;)V

    .line 72
    .line 73
    .line 74
    new-instance v2, Lb8/m;

    .line 75
    .line 76
    const/4 v3, 0x2

    .line 77
    invoke-direct {v2, p1, v3, v0}, Lb8/m;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 78
    .line 79
    .line 80
    new-instance p1, Lb8/h;

    .line 81
    .line 82
    invoke-direct {p1, v2, v1}, Lb8/h;-><init>(Lb8/m;LE7/d;)V

    .line 83
    .line 84
    .line 85
    const/4 v0, 0x3

    .line 86
    invoke-static {p2, v1, p1, v0}, LY7/B;->r(LY7/z;LE7/a;LO7/p;I)LY7/y0;

    .line 87
    .line 88
    .line 89
    new-instance p1, Lco/notix/oe;

    .line 90
    .line 91
    invoke-direct {p1, p0}, Lco/notix/oe;-><init>(Lco/notix/te;)V

    .line 92
    .line 93
    .line 94
    invoke-static {p1}, LZ0/a;->q(LO7/a;)LA7/l;

    .line 95
    .line 96
    .line 97
    move-result-object p1

    .line 98
    iput-object p1, p0, Lco/notix/te;->g:LA7/e;

    .line 99
    .line 100
    return-void

    .line 101
    :goto_1
    monitor-exit p1

    .line 102
    throw p2
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
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
.end method

.method public static final a(Lco/notix/te;)V
    .locals 4

    .line 1
    iget-object v0, p0, Lco/notix/te;->c:Lco/notix/ne;

    if-nez v0, :cond_2

    .line 2
    iget-object v0, p0, Lco/notix/te;->d:Lco/notix/me;

    if-eqz v0, :cond_0

    goto :goto_1

    :cond_0
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x18

    if-lt v0, v1, :cond_1

    new-instance v0, Lco/notix/ne;

    invoke-direct {v0, p0}, Lco/notix/ne;-><init>(Lco/notix/te;)V

    .line 3
    iget-object v1, p0, Lco/notix/te;->g:LA7/e;

    invoke-interface {v1}, LA7/e;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/net/ConnectivityManager;

    .line 4
    invoke-static {v1, v0}, LC3/d;->v(Landroid/net/ConnectivityManager;Lco/notix/ne;)V

    iput-object v0, p0, Lco/notix/te;->c:Lco/notix/ne;

    goto :goto_0

    :cond_1
    new-instance v0, Lco/notix/me;

    invoke-direct {v0, p0}, Lco/notix/me;-><init>(Lco/notix/te;)V

    .line 5
    iget-object v1, p0, Lco/notix/te;->a:Lco/notix/y8;

    check-cast v1, Lco/notix/d9;

    invoke-virtual {v1}, Lco/notix/d9;->a()Landroid/content/Context;

    move-result-object v1

    .line 6
    new-instance v2, Landroid/content/IntentFilter;

    const-string v3, "android.net.conn.CONNECTIVITY_CHANGE"

    invoke-direct {v2, v3}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v0, v2}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    iput-object v0, p0, Lco/notix/te;->d:Lco/notix/me;

    :goto_0
    invoke-virtual {p0}, Lco/notix/te;->a()Z

    move-result v0

    invoke-virtual {p0, v0}, Lco/notix/te;->a(Z)V

    :cond_2
    :goto_1
    return-void
.end method

.method public static final b(Lco/notix/te;)V
    .locals 4

    .line 1
    iget-object v0, p0, Lco/notix/te;->c:Lco/notix/ne;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-object v1, p0, Lco/notix/te;->d:Lco/notix/me;

    .line 6
    .line 7
    if-nez v1, :cond_0

    .line 8
    .line 9
    return-void

    .line 10
    :cond_0
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 11
    .line 12
    const/16 v2, 0x18

    .line 13
    .line 14
    const/4 v3, 0x0

    .line 15
    if-lt v1, v2, :cond_2

    .line 16
    .line 17
    if-eqz v0, :cond_1

    .line 18
    .line 19
    iget-object v1, p0, Lco/notix/te;->g:LA7/e;

    .line 20
    .line 21
    invoke-interface {v1}, LA7/e;->getValue()Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    check-cast v1, Landroid/net/ConnectivityManager;

    .line 26
    .line 27
    invoke-virtual {v1, v0}, Landroid/net/ConnectivityManager;->unregisterNetworkCallback(Landroid/net/ConnectivityManager$NetworkCallback;)V

    .line 28
    .line 29
    .line 30
    :cond_1
    iput-object v3, p0, Lco/notix/te;->c:Lco/notix/ne;

    .line 31
    .line 32
    return-void

    .line 33
    :cond_2
    iget-object v0, p0, Lco/notix/te;->d:Lco/notix/me;

    .line 34
    .line 35
    if-eqz v0, :cond_3

    .line 36
    .line 37
    iget-object v1, p0, Lco/notix/te;->a:Lco/notix/y8;

    .line 38
    .line 39
    check-cast v1, Lco/notix/d9;

    .line 40
    .line 41
    invoke-virtual {v1}, Lco/notix/d9;->a()Landroid/content/Context;

    .line 42
    .line 43
    .line 44
    move-result-object v1

    .line 45
    invoke-virtual {v1, v0}, Landroid/content/Context;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    .line 46
    .line 47
    .line 48
    :cond_3
    iput-object v3, p0, Lco/notix/te;->d:Lco/notix/me;

    .line 49
    .line 50
    return-void
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
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


# virtual methods
.method public final a(Z)V
    .locals 3

    .line 7
    iget-object v0, p0, Lco/notix/te;->b:LY7/z;

    new-instance v1, Lco/notix/pe;

    const/4 v2, 0x0

    invoke-direct {v1, p0, p1, v2}, Lco/notix/pe;-><init>(Lco/notix/te;ZLE7/d;)V

    const/4 p1, 0x3

    invoke-static {v0, v2, v1, p1}, LY7/B;->r(LY7/z;LE7/a;LO7/p;I)LY7/y0;

    return-void
.end method

.method public final a()Z
    .locals 4

    const/4 v0, 0x0

    const/4 v1, 0x1

    .line 8
    :try_start_0
    iget-object v2, p0, Lco/notix/te;->g:LA7/e;

    invoke-interface {v2}, LA7/e;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/net/ConnectivityManager;

    .line 9
    iget-object v3, p0, Lco/notix/te;->g:LA7/e;

    invoke-interface {v3}, LA7/e;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroid/net/ConnectivityManager;

    .line 10
    invoke-virtual {v3}, Landroid/net/ConnectivityManager;->getActiveNetwork()Landroid/net/Network;

    move-result-object v3

    invoke-virtual {v2, v3}, Landroid/net/ConnectivityManager;->getNetworkCapabilities(Landroid/net/Network;)Landroid/net/NetworkCapabilities;

    move-result-object v2

    if-eqz v2, :cond_0

    const/16 v3, 0xc

    invoke-virtual {v2, v3}, Landroid/net/NetworkCapabilities;->hasCapability(I)Z

    move-result v2
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v2, :cond_0

    move v0, v1

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_0
    :goto_0
    xor-int/2addr v0, v1

    .line 11
    :catch_0
    :try_start_1
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_2

    :goto_1
    invoke-static {v0}, La/a;->h(Ljava/lang/Throwable;)LA7/i;

    move-result-object v0

    .line 12
    :goto_2
    instance-of v2, v0, LA7/i;

    if-eqz v2, :cond_1

    const/4 v0, 0x0

    .line 13
    :cond_1
    check-cast v0, Ljava/lang/Boolean;

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    :cond_2
    return v1
.end method
