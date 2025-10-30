.class public final LC3/e;
.super Landroid/os/Handler;
.source "SourceFile"


# instance fields
.field public final synthetic a:I

.field public final b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, LC3/e;->a:I

    iput-object p2, p0, LC3/e;->b:Ljava/lang/Object;

    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    return-void
.end method

.method public constructor <init>(LE7/i;)V
    .locals 1

    const/4 v0, 0x5

    iput v0, p0, LC3/e;->a:I

    const-string v0, "backgroundDispatcher"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 3
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-direct {p0, v0}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 4
    iput-object p1, p0, LC3/e;->b:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Landroid/os/Looper;I)V
    .locals 0

    .line 2
    iput p3, p0, LC3/e;->a:I

    iput-object p1, p0, LC3/e;->b:Ljava/lang/Object;

    invoke-direct {p0, p2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    return-void
.end method

.method public constructor <init>(Lt0/i;)V
    .locals 1

    const/16 v0, 0x8

    iput v0, p0, LC3/e;->a:I

    .line 5
    iput-object p1, p0, LC3/e;->b:Ljava/lang/Object;

    .line 6
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object p1

    invoke-direct {p0, p1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    return-void
.end method

.method private final a(Landroid/os/Message;)V
    .locals 4

    .line 1
    iget v0, p1, Landroid/os/Message;->what:I

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-ne v0, v1, :cond_1

    .line 5
    .line 6
    iget-object v0, p0, LC3/e;->b:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Landroid/support/v4/media/session/r;

    .line 9
    .line 10
    iget-object v0, v0, Landroid/support/v4/media/session/r;->a:Ljava/lang/Object;

    .line 11
    .line 12
    monitor-enter v0

    .line 13
    :try_start_0
    iget-object v1, p0, LC3/e;->b:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast v1, Landroid/support/v4/media/session/r;

    .line 16
    .line 17
    iget-object v1, v1, Landroid/support/v4/media/session/r;->d:Ljava/lang/ref/WeakReference;

    .line 18
    .line 19
    invoke-virtual {v1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    check-cast v1, Landroid/support/v4/media/session/t;

    .line 24
    .line 25
    iget-object v2, p0, LC3/e;->b:Ljava/lang/Object;

    .line 26
    .line 27
    check-cast v2, Landroid/support/v4/media/session/r;

    .line 28
    .line 29
    iget-object v3, v2, Landroid/support/v4/media/session/r;->e:LC3/e;

    .line 30
    .line 31
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 32
    if-eqz v1, :cond_1

    .line 33
    .line 34
    invoke-virtual {v1}, Landroid/support/v4/media/session/t;->b()Landroid/support/v4/media/session/r;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    if-ne v2, v0, :cond_1

    .line 39
    .line 40
    if-nez v3, :cond_0

    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_0
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 44
    .line 45
    check-cast p1, Lp0/a;

    .line 46
    .line 47
    invoke-virtual {v1, p1}, Landroid/support/v4/media/session/t;->f(Lp0/a;)V

    .line 48
    .line 49
    .line 50
    iget-object p1, p0, LC3/e;->b:Ljava/lang/Object;

    .line 51
    .line 52
    check-cast p1, Landroid/support/v4/media/session/r;

    .line 53
    .line 54
    invoke-virtual {p1, v1, v3}, Landroid/support/v4/media/session/r;->a(Landroid/support/v4/media/session/t;Landroid/os/Handler;)V

    .line 55
    .line 56
    .line 57
    const/4 p1, 0x0

    .line 58
    invoke-virtual {v1, p1}, Landroid/support/v4/media/session/t;->f(Lp0/a;)V

    .line 59
    .line 60
    .line 61
    return-void

    .line 62
    :catchall_0
    move-exception p1

    .line 63
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 64
    throw p1

    .line 65
    :cond_1
    :goto_0
    return-void
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

.method private final b(Landroid/os/Message;)V
    .locals 6

    .line 1
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Landroid/util/Pair;

    .line 4
    .line 5
    iget-object v1, v0, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 6
    .line 7
    iget-object v0, v0, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 8
    .line 9
    iget p1, p1, Landroid/os/Message;->what:I

    .line 10
    .line 11
    const/4 v2, 0x0

    .line 12
    const/4 v3, 0x0

    .line 13
    const/4 v4, 0x1

    .line 14
    if-eqz p1, :cond_4

    .line 15
    .line 16
    if-eq p1, v4, :cond_0

    .line 17
    .line 18
    goto/16 :goto_4

    .line 19
    .line 20
    :cond_0
    iget-object p1, p0, LC3/e;->b:Ljava/lang/Object;

    .line 21
    .line 22
    check-cast p1, Ln3/b;

    .line 23
    .line 24
    iget-object v5, p1, Ln3/b;->v:Ln3/t;

    .line 25
    .line 26
    if-ne v1, v5, :cond_8

    .line 27
    .line 28
    invoke-virtual {p1}, Ln3/b;->i()Z

    .line 29
    .line 30
    .line 31
    move-result v1

    .line 32
    if-nez v1, :cond_1

    .line 33
    .line 34
    goto/16 :goto_4

    .line 35
    .line 36
    :cond_1
    iput-object v3, p1, Ln3/b;->v:Ln3/t;

    .line 37
    .line 38
    instance-of v1, v0, Ljava/lang/Exception;

    .line 39
    .line 40
    if-eqz v1, :cond_2

    .line 41
    .line 42
    check-cast v0, Ljava/lang/Exception;

    .line 43
    .line 44
    invoke-virtual {p1, v0, v2}, Ln3/b;->k(Ljava/lang/Exception;Z)V

    .line 45
    .line 46
    .line 47
    goto/16 :goto_4

    .line 48
    .line 49
    :cond_2
    :try_start_0
    check-cast v0, [B

    .line 50
    .line 51
    iget-object v1, p1, Ln3/b;->b:Ln3/v;

    .line 52
    .line 53
    iget-object v2, p1, Ln3/b;->t:[B

    .line 54
    .line 55
    invoke-interface {v1, v2, v0}, Ln3/v;->h([B[B)[B

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    iget-object v1, p1, Ln3/b;->u:[B

    .line 60
    .line 61
    if-eqz v1, :cond_3

    .line 62
    .line 63
    if-eqz v0, :cond_3

    .line 64
    .line 65
    array-length v1, v0

    .line 66
    if-eqz v1, :cond_3

    .line 67
    .line 68
    iput-object v0, p1, Ln3/b;->u:[B

    .line 69
    .line 70
    goto :goto_0

    .line 71
    :catch_0
    move-exception v0

    .line 72
    goto :goto_2

    .line 73
    :cond_3
    :goto_0
    const/4 v0, 0x4

    .line 74
    iput v0, p1, Ln3/b;->n:I

    .line 75
    .line 76
    new-instance v0, Lk8/a;

    .line 77
    .line 78
    const/4 v1, 0x6

    .line 79
    invoke-direct {v0, v1}, Lk8/a;-><init>(I)V

    .line 80
    .line 81
    .line 82
    iget-object v0, p1, Ln3/b;->h:Ll4/c;

    .line 83
    .line 84
    iget-object v1, v0, Ll4/c;->a:Ljava/lang/Object;

    .line 85
    .line 86
    monitor-enter v1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 87
    :try_start_1
    iget-object v0, v0, Ll4/c;->c:Ljava/util/Set;

    .line 88
    .line 89
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 90
    :try_start_2
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 91
    .line 92
    .line 93
    move-result-object v0

    .line 94
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 95
    .line 96
    .line 97
    move-result v1

    .line 98
    if-eqz v1, :cond_8

    .line 99
    .line 100
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 101
    .line 102
    .line 103
    move-result-object v1

    .line 104
    check-cast v1, Ln3/l;

    .line 105
    .line 106
    invoke-virtual {v1}, Ln3/l;->a()V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    .line 107
    .line 108
    .line 109
    goto :goto_1

    .line 110
    :catchall_0
    move-exception v0

    .line 111
    :try_start_3
    monitor-exit v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 112
    :try_start_4
    throw v0
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_0

    .line 113
    :goto_2
    invoke-virtual {p1, v0, v4}, Ln3/b;->k(Ljava/lang/Exception;Z)V

    .line 114
    .line 115
    .line 116
    goto :goto_4

    .line 117
    :cond_4
    iget-object p1, p0, LC3/e;->b:Ljava/lang/Object;

    .line 118
    .line 119
    check-cast p1, Ln3/b;

    .line 120
    .line 121
    iget-object v5, p1, Ln3/b;->w:Ln3/u;

    .line 122
    .line 123
    if-ne v1, v5, :cond_8

    .line 124
    .line 125
    iget v1, p1, Ln3/b;->n:I

    .line 126
    .line 127
    const/4 v5, 0x2

    .line 128
    if-eq v1, v5, :cond_5

    .line 129
    .line 130
    invoke-virtual {p1}, Ln3/b;->i()Z

    .line 131
    .line 132
    .line 133
    move-result v1

    .line 134
    if-nez v1, :cond_5

    .line 135
    .line 136
    goto :goto_4

    .line 137
    :cond_5
    iput-object v3, p1, Ln3/b;->w:Ln3/u;

    .line 138
    .line 139
    instance-of v1, v0, Ljava/lang/Exception;

    .line 140
    .line 141
    iget-object v5, p1, Ln3/b;->c:Lk4/E;

    .line 142
    .line 143
    if-eqz v1, :cond_6

    .line 144
    .line 145
    check-cast v0, Ljava/lang/Exception;

    .line 146
    .line 147
    invoke-virtual {v5, v0, v2}, Lk4/E;->r(Ljava/lang/Exception;Z)V

    .line 148
    .line 149
    .line 150
    goto :goto_4

    .line 151
    :cond_6
    :try_start_5
    iget-object p1, p1, Ln3/b;->b:Ln3/v;

    .line 152
    .line 153
    check-cast v0, [B

    .line 154
    .line 155
    invoke-interface {p1, v0}, Ln3/v;->m([B)V
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_1

    .line 156
    .line 157
    .line 158
    iput-object v3, v5, Lk4/E;->c:Ljava/lang/Object;

    .line 159
    .line 160
    iget-object p1, v5, Lk4/E;->b:Ljava/lang/Object;

    .line 161
    .line 162
    check-cast p1, Ljava/util/HashSet;

    .line 163
    .line 164
    invoke-static {p1}, LP5/F;->o(Ljava/util/Collection;)LP5/F;

    .line 165
    .line 166
    .line 167
    move-result-object v0

    .line 168
    invoke-virtual {p1}, Ljava/util/HashSet;->clear()V

    .line 169
    .line 170
    .line 171
    invoke-virtual {v0, v2}, LP5/F;->q(I)LP5/D;

    .line 172
    .line 173
    .line 174
    move-result-object p1

    .line 175
    :cond_7
    :goto_3
    invoke-virtual {p1}, LP5/D;->hasNext()Z

    .line 176
    .line 177
    .line 178
    move-result v0

    .line 179
    if-eqz v0, :cond_8

    .line 180
    .line 181
    invoke-virtual {p1}, LP5/D;->next()Ljava/lang/Object;

    .line 182
    .line 183
    .line 184
    move-result-object v0

    .line 185
    check-cast v0, Ln3/b;

    .line 186
    .line 187
    invoke-virtual {v0}, Ln3/b;->l()Z

    .line 188
    .line 189
    .line 190
    move-result v1

    .line 191
    if-eqz v1, :cond_7

    .line 192
    .line 193
    invoke-virtual {v0, v4}, Ln3/b;->h(Z)V

    .line 194
    .line 195
    .line 196
    goto :goto_3

    .line 197
    :catch_1
    move-exception p1

    .line 198
    invoke-virtual {v5, p1, v4}, Lk4/E;->r(Ljava/lang/Exception;Z)V

    .line 199
    .line 200
    .line 201
    :cond_8
    :goto_4
    return-void
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


# virtual methods
.method public final handleMessage(Landroid/os/Message;)V
    .locals 11

    .line 1
    const/4 v0, 0x4

    .line 2
    const/4 v1, 0x0

    .line 3
    const/4 v2, 0x3

    .line 4
    const/4 v3, 0x0

    .line 5
    const/4 v4, 0x2

    .line 6
    const/4 v5, 0x1

    .line 7
    iget v6, p0, LC3/e;->a:I

    .line 8
    .line 9
    packed-switch v6, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    iget p1, p1, Landroid/os/Message;->what:I

    .line 13
    .line 14
    iget-object v0, p0, LC3/e;->b:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast v0, Lt0/u;

    .line 17
    .line 18
    if-eq p1, v5, :cond_1

    .line 19
    .line 20
    if-eq p1, v4, :cond_0

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    iput-boolean v1, v0, Lt0/u;->f:Z

    .line 24
    .line 25
    iget-object p1, v0, Lt0/u;->e:Lt0/o;

    .line 26
    .line 27
    invoke-virtual {v0, p1}, Lt0/u;->e(Lt0/o;)V

    .line 28
    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_1
    iput-boolean v1, v0, Lt0/u;->h:Z

    .line 32
    .line 33
    iget-object p1, v0, Lt0/u;->d:Li/G;

    .line 34
    .line 35
    if-eqz p1, :cond_2

    .line 36
    .line 37
    iget-object v1, v0, Lt0/u;->g:Lt0/v;

    .line 38
    .line 39
    iget-object p1, p1, Li/G;->b:Ljava/lang/Object;

    .line 40
    .line 41
    check-cast p1, Lt0/e;

    .line 42
    .line 43
    invoke-virtual {p1, v0}, Lt0/e;->d(Lt0/u;)Lt0/B;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    if-eqz v0, :cond_2

    .line 48
    .line 49
    invoke-virtual {p1, v0, v1}, Lt0/e;->n(Lt0/B;Lt0/v;)V

    .line 50
    .line 51
    .line 52
    :cond_2
    :goto_0
    return-void

    .line 53
    :pswitch_0
    iget v1, p1, Landroid/os/Message;->what:I

    .line 54
    .line 55
    iget v4, p1, Landroid/os/Message;->arg1:I

    .line 56
    .line 57
    iget-object v5, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 58
    .line 59
    invoke-virtual {p1}, Landroid/os/Message;->peekData()Landroid/os/Bundle;

    .line 60
    .line 61
    .line 62
    move-result-object p1

    .line 63
    iget-object v6, p0, LC3/e;->b:Ljava/lang/Object;

    .line 64
    .line 65
    check-cast v6, Lt0/i;

    .line 66
    .line 67
    iget-object v7, v6, Lt0/i;->j:Landroid/util/SparseArray;

    .line 68
    .line 69
    invoke-virtual {v7, v4}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object v7

    .line 73
    check-cast v7, Lt0/T;

    .line 74
    .line 75
    if-nez v7, :cond_3

    .line 76
    .line 77
    const-string p1, "MR2Provider"

    .line 78
    .line 79
    const-string v0, "Pending callback not found for control request."

    .line 80
    .line 81
    invoke-static {p1, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 82
    .line 83
    .line 84
    goto :goto_2

    .line 85
    :cond_3
    iget-object v6, v6, Lt0/i;->j:Landroid/util/SparseArray;

    .line 86
    .line 87
    invoke-virtual {v6, v4}, Landroid/util/SparseArray;->remove(I)V

    .line 88
    .line 89
    .line 90
    if-eq v1, v2, :cond_6

    .line 91
    .line 92
    if-eq v1, v0, :cond_4

    .line 93
    .line 94
    goto :goto_2

    .line 95
    :cond_4
    if-nez p1, :cond_5

    .line 96
    .line 97
    goto :goto_1

    .line 98
    :cond_5
    const-string v0, "error"

    .line 99
    .line 100
    invoke-virtual {p1, v0}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 101
    .line 102
    .line 103
    move-result-object v3

    .line 104
    :goto_1
    check-cast v5, Landroid/os/Bundle;

    .line 105
    .line 106
    invoke-static {v3, v5}, Lt0/T;->a(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 107
    .line 108
    .line 109
    goto :goto_2

    .line 110
    :cond_6
    check-cast v5, Landroid/os/Bundle;

    .line 111
    .line 112
    invoke-virtual {v7, v5}, Lt0/T;->b(Landroid/os/Bundle;)V

    .line 113
    .line 114
    .line 115
    :goto_2
    return-void

    .line 116
    :pswitch_1
    iget-object v2, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 117
    .line 118
    check-cast v2, [B

    .line 119
    .line 120
    if-nez v2, :cond_7

    .line 121
    .line 122
    goto :goto_3

    .line 123
    :cond_7
    iget-object v3, p0, LC3/e;->b:Ljava/lang/Object;

    .line 124
    .line 125
    check-cast v3, Ln3/e;

    .line 126
    .line 127
    iget-object v3, v3, Ln3/e;->j:Ljava/util/ArrayList;

    .line 128
    .line 129
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 130
    .line 131
    .line 132
    move-result v6

    .line 133
    move v7, v1

    .line 134
    :cond_8
    if-ge v7, v6, :cond_a

    .line 135
    .line 136
    invoke-virtual {v3, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 137
    .line 138
    .line 139
    move-result-object v8

    .line 140
    add-int/2addr v7, v5

    .line 141
    check-cast v8, Ln3/b;

    .line 142
    .line 143
    iget-object v9, v8, Ln3/b;->t:[B

    .line 144
    .line 145
    invoke-static {v9, v2}, Ljava/util/Arrays;->equals([B[B)Z

    .line 146
    .line 147
    .line 148
    move-result v9

    .line 149
    if-eqz v9, :cond_8

    .line 150
    .line 151
    iget p1, p1, Landroid/os/Message;->what:I

    .line 152
    .line 153
    if-eq p1, v4, :cond_9

    .line 154
    .line 155
    goto :goto_3

    .line 156
    :cond_9
    iget p1, v8, Ln3/b;->n:I

    .line 157
    .line 158
    if-ne p1, v0, :cond_a

    .line 159
    .line 160
    sget p1, Ll4/y;->a:I

    .line 161
    .line 162
    invoke-virtual {v8, v1}, Ln3/b;->h(Z)V

    .line 163
    .line 164
    .line 165
    :cond_a
    :goto_3
    return-void

    .line 166
    :pswitch_2
    invoke-direct {p0, p1}, LC3/e;->b(Landroid/os/Message;)V

    .line 167
    .line 168
    .line 169
    return-void

    .line 170
    :pswitch_3
    const-string v0, "msg"

    .line 171
    .line 172
    invoke-static {p1, v0}, Lkotlin/jvm/internal/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 173
    .line 174
    .line 175
    iget v0, p1, Landroid/os/Message;->what:I

    .line 176
    .line 177
    const-string v1, "SessionLifecycleClient"

    .line 178
    .line 179
    if-ne v0, v2, :cond_d

    .line 180
    .line 181
    invoke-virtual {p1}, Landroid/os/Message;->getData()Landroid/os/Bundle;

    .line 182
    .line 183
    .line 184
    move-result-object p1

    .line 185
    if-eqz p1, :cond_b

    .line 186
    .line 187
    const-string v0, "SessionUpdateExtra"

    .line 188
    .line 189
    invoke-virtual {p1, v0}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 190
    .line 191
    .line 192
    move-result-object p1

    .line 193
    if-nez p1, :cond_c

    .line 194
    .line 195
    :cond_b
    const-string p1, ""

    .line 196
    .line 197
    :cond_c
    const-string v0, "Session update received."

    .line 198
    .line 199
    invoke-static {v1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 200
    .line 201
    .line 202
    iget-object v0, p0, LC3/e;->b:Ljava/lang/Object;

    .line 203
    .line 204
    check-cast v0, LE7/i;

    .line 205
    .line 206
    invoke-static {v0}, LY7/B;->a(LE7/i;)Ld8/e;

    .line 207
    .line 208
    .line 209
    move-result-object v0

    .line 210
    new-instance v1, Li7/Y;

    .line 211
    .line 212
    invoke-direct {v1, p1, v3}, Li7/Y;-><init>(Ljava/lang/String;LE7/d;)V

    .line 213
    .line 214
    .line 215
    invoke-static {v0, v3, v1, v2}, LY7/B;->r(LY7/z;LE7/a;LO7/p;I)LY7/y0;

    .line 216
    .line 217
    .line 218
    goto :goto_4

    .line 219
    :cond_d
    new-instance v0, Ljava/lang/StringBuilder;

    .line 220
    .line 221
    const-string v2, "Received unexpected event from the SessionLifecycleService: "

    .line 222
    .line 223
    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 224
    .line 225
    .line 226
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 227
    .line 228
    .line 229
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 230
    .line 231
    .line 232
    move-result-object v0

    .line 233
    invoke-static {v1, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 234
    .line 235
    .line 236
    invoke-super {p0, p1}, Landroid/os/Handler;->handleMessage(Landroid/os/Message;)V

    .line 237
    .line 238
    .line 239
    :goto_4
    return-void

    .line 240
    :pswitch_4
    iget p1, p1, Landroid/os/Message;->what:I

    .line 241
    .line 242
    iget-object v0, p0, LC3/e;->b:Ljava/lang/Object;

    .line 243
    .line 244
    check-cast v0, Landroidx/mediarouter/app/N;

    .line 245
    .line 246
    if-eq p1, v5, :cond_f

    .line 247
    .line 248
    if-eq p1, v4, :cond_e

    .line 249
    .line 250
    goto :goto_5

    .line 251
    :cond_e
    iget-object p1, v0, Landroidx/mediarouter/app/N;->w:Lt0/C;

    .line 252
    .line 253
    if-eqz p1, :cond_10

    .line 254
    .line 255
    iput-object v3, v0, Landroidx/mediarouter/app/N;->w:Lt0/C;

    .line 256
    .line 257
    invoke-virtual {v0}, Landroidx/mediarouter/app/N;->n()V

    .line 258
    .line 259
    .line 260
    goto :goto_5

    .line 261
    :cond_f
    invoke-virtual {v0}, Landroidx/mediarouter/app/N;->m()V

    .line 262
    .line 263
    .line 264
    :cond_10
    :goto_5
    return-void

    .line 265
    :pswitch_5
    iget v0, p1, Landroid/os/Message;->what:I

    .line 266
    .line 267
    if-eq v0, v5, :cond_11

    .line 268
    .line 269
    goto :goto_6

    .line 270
    :cond_11
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 271
    .line 272
    check-cast p1, Ljava/util/List;

    .line 273
    .line 274
    iget-object v0, p0, LC3/e;->b:Ljava/lang/Object;

    .line 275
    .line 276
    check-cast v0, Landroidx/mediarouter/app/A;

    .line 277
    .line 278
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 279
    .line 280
    .line 281
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    .line 282
    .line 283
    .line 284
    move-result-wide v1

    .line 285
    iput-wide v1, v0, Landroidx/mediarouter/app/A;->p:J

    .line 286
    .line 287
    iget-object v1, v0, Landroidx/mediarouter/app/A;->j:Ljava/util/ArrayList;

    .line 288
    .line 289
    invoke-virtual {v1}, Ljava/util/ArrayList;->clear()V

    .line 290
    .line 291
    .line 292
    iget-object v1, v0, Landroidx/mediarouter/app/A;->j:Ljava/util/ArrayList;

    .line 293
    .line 294
    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 295
    .line 296
    .line 297
    iget-object p1, v0, Landroidx/mediarouter/app/A;->k:Landroidx/mediarouter/app/z;

    .line 298
    .line 299
    invoke-virtual {p1}, Landroidx/mediarouter/app/z;->n()V

    .line 300
    .line 301
    .line 302
    :goto_6
    return-void

    .line 303
    :pswitch_6
    iget v0, p1, Landroid/os/Message;->what:I

    .line 304
    .line 305
    iget-object v1, p0, LC3/e;->b:Ljava/lang/Object;

    .line 306
    .line 307
    check-cast v1, Landroidx/mediarouter/app/e;

    .line 308
    .line 309
    if-eq v0, v5, :cond_14

    .line 310
    .line 311
    if-eq v0, v4, :cond_13

    .line 312
    .line 313
    if-eq v0, v2, :cond_12

    .line 314
    .line 315
    goto :goto_7

    .line 316
    :cond_12
    iget-object p1, v1, Landroidx/mediarouter/app/e;->i:Ljava/util/ArrayList;

    .line 317
    .line 318
    invoke-virtual {p1}, Ljava/util/ArrayList;->isEmpty()Z

    .line 319
    .line 320
    .line 321
    move-result p1

    .line 322
    if-eqz p1, :cond_15

    .line 323
    .line 324
    invoke-virtual {v1, v2}, Landroidx/mediarouter/app/e;->i(I)V

    .line 325
    .line 326
    .line 327
    iget-object p1, v1, Landroidx/mediarouter/app/e;->w:LC3/e;

    .line 328
    .line 329
    invoke-virtual {p1, v4}, Landroid/os/Handler;->removeMessages(I)V

    .line 330
    .line 331
    .line 332
    invoke-virtual {p1, v2}, Landroid/os/Handler;->removeMessages(I)V

    .line 333
    .line 334
    .line 335
    invoke-virtual {p1, v5}, Landroid/os/Handler;->removeMessages(I)V

    .line 336
    .line 337
    .line 338
    iget-object p1, v1, Landroidx/mediarouter/app/e;->f:Lt0/D;

    .line 339
    .line 340
    iget-object v0, v1, Landroidx/mediarouter/app/e;->g:Landroidx/mediarouter/app/F;

    .line 341
    .line 342
    invoke-virtual {p1, v0}, Lt0/D;->h(Lt0/x;)V

    .line 343
    .line 344
    .line 345
    goto :goto_7

    .line 346
    :cond_13
    iget-object p1, v1, Landroidx/mediarouter/app/e;->i:Ljava/util/ArrayList;

    .line 347
    .line 348
    invoke-virtual {p1}, Ljava/util/ArrayList;->isEmpty()Z

    .line 349
    .line 350
    .line 351
    move-result p1

    .line 352
    if-eqz p1, :cond_15

    .line 353
    .line 354
    invoke-virtual {v1, v4}, Landroidx/mediarouter/app/e;->i(I)V

    .line 355
    .line 356
    .line 357
    iget-object p1, v1, Landroidx/mediarouter/app/e;->w:LC3/e;

    .line 358
    .line 359
    invoke-virtual {p1, v4}, Landroid/os/Handler;->removeMessages(I)V

    .line 360
    .line 361
    .line 362
    invoke-virtual {p1, v2}, Landroid/os/Handler;->removeMessages(I)V

    .line 363
    .line 364
    .line 365
    invoke-virtual {p1, v2}, Landroid/os/Handler;->obtainMessage(I)Landroid/os/Message;

    .line 366
    .line 367
    .line 368
    move-result-object v0

    .line 369
    const-wide/16 v1, 0x3a98

    .line 370
    .line 371
    invoke-virtual {p1, v0, v1, v2}, Landroid/os/Handler;->sendMessageDelayed(Landroid/os/Message;J)Z

    .line 372
    .line 373
    .line 374
    goto :goto_7

    .line 375
    :cond_14
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 376
    .line 377
    check-cast p1, Ljava/util/List;

    .line 378
    .line 379
    invoke-virtual {v1, p1}, Landroidx/mediarouter/app/e;->f(Ljava/util/List;)V

    .line 380
    .line 381
    .line 382
    :cond_15
    :goto_7
    return-void

    .line 383
    :pswitch_7
    invoke-direct {p0, p1}, LC3/e;->a(Landroid/os/Message;)V

    .line 384
    .line 385
    .line 386
    return-void

    .line 387
    :pswitch_8
    iget-object v0, p0, LC3/e;->b:Ljava/lang/Object;

    .line 388
    .line 389
    move-object v1, v0

    .line 390
    check-cast v1, LC3/g;

    .line 391
    .line 392
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 393
    .line 394
    .line 395
    iget v0, p1, Landroid/os/Message;->what:I

    .line 396
    .line 397
    if-eqz v0, :cond_1c

    .line 398
    .line 399
    if-eq v0, v5, :cond_19

    .line 400
    .line 401
    if-eq v0, v4, :cond_18

    .line 402
    .line 403
    iget-object v0, v1, LC3/g;->d:Ljava/util/concurrent/atomic/AtomicReference;

    .line 404
    .line 405
    new-instance v2, Ljava/lang/IllegalStateException;

    .line 406
    .line 407
    iget p1, p1, Landroid/os/Message;->what:I

    .line 408
    .line 409
    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 410
    .line 411
    .line 412
    move-result-object p1

    .line 413
    invoke-direct {v2, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 414
    .line 415
    .line 416
    :cond_16
    invoke-virtual {v0, v3, v2}, Ljava/util/concurrent/atomic/AtomicReference;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 417
    .line 418
    .line 419
    move-result p1

    .line 420
    if-eqz p1, :cond_17

    .line 421
    .line 422
    goto :goto_a

    .line 423
    :cond_17
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 424
    .line 425
    .line 426
    move-result-object p1

    .line 427
    if-eqz p1, :cond_16

    .line 428
    .line 429
    goto :goto_a

    .line 430
    :cond_18
    iget-object p1, v1, LC3/g;->e:LH1/k;

    .line 431
    .line 432
    invoke-virtual {p1}, LH1/k;->d()Z

    .line 433
    .line 434
    .line 435
    goto :goto_a

    .line 436
    :cond_19
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 437
    .line 438
    move-object v2, p1

    .line 439
    check-cast v2, LC3/f;

    .line 440
    .line 441
    iget v5, v2, LC3/f;->a:I

    .line 442
    .line 443
    iget-object v7, v2, LC3/f;->c:Landroid/media/MediaCodec$CryptoInfo;

    .line 444
    .line 445
    iget-wide v8, v2, LC3/f;->d:J

    .line 446
    .line 447
    iget v10, v2, LC3/f;->e:I

    .line 448
    .line 449
    :try_start_0
    sget-object p1, LC3/g;->h:Ljava/lang/Object;

    .line 450
    .line 451
    monitor-enter p1
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    .line 452
    :try_start_1
    iget-object v4, v1, LC3/g;->a:Landroid/media/MediaCodec;

    .line 453
    .line 454
    const/4 v6, 0x0

    .line 455
    invoke-virtual/range {v4 .. v10}, Landroid/media/MediaCodec;->queueSecureInputBuffer(IILandroid/media/MediaCodec$CryptoInfo;JI)V

    .line 456
    .line 457
    .line 458
    monitor-exit p1

    .line 459
    goto :goto_8

    .line 460
    :catchall_0
    move-exception v0

    .line 461
    monitor-exit p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 462
    :try_start_2
    throw v0
    :try_end_2
    .catch Ljava/lang/RuntimeException; {:try_start_2 .. :try_end_2} :catch_0

    .line 463
    :catch_0
    move-exception v0

    .line 464
    move-object p1, v0

    .line 465
    iget-object v4, v1, LC3/g;->d:Ljava/util/concurrent/atomic/AtomicReference;

    .line 466
    .line 467
    :cond_1a
    invoke-virtual {v4, v3, v0}, Ljava/util/concurrent/atomic/AtomicReference;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 468
    .line 469
    .line 470
    move-result p1

    .line 471
    if-eqz p1, :cond_1b

    .line 472
    .line 473
    goto :goto_8

    .line 474
    :cond_1b
    invoke-virtual {v4}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 475
    .line 476
    .line 477
    move-result-object p1

    .line 478
    if-eqz p1, :cond_1a

    .line 479
    .line 480
    :goto_8
    move-object v3, v2

    .line 481
    goto :goto_a

    .line 482
    :cond_1c
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 483
    .line 484
    check-cast p1, LC3/f;

    .line 485
    .line 486
    iget v5, p1, LC3/f;->a:I

    .line 487
    .line 488
    iget v7, p1, LC3/f;->b:I

    .line 489
    .line 490
    iget-wide v8, p1, LC3/f;->d:J

    .line 491
    .line 492
    iget v10, p1, LC3/f;->e:I

    .line 493
    .line 494
    :try_start_3
    iget-object v4, v1, LC3/g;->a:Landroid/media/MediaCodec;

    .line 495
    .line 496
    const/4 v6, 0x0

    .line 497
    invoke-virtual/range {v4 .. v10}, Landroid/media/MediaCodec;->queueInputBuffer(IIIJI)V
    :try_end_3
    .catch Ljava/lang/RuntimeException; {:try_start_3 .. :try_end_3} :catch_1

    .line 498
    .line 499
    .line 500
    goto :goto_9

    .line 501
    :catch_1
    move-exception v0

    .line 502
    iget-object v1, v1, LC3/g;->d:Ljava/util/concurrent/atomic/AtomicReference;

    .line 503
    .line 504
    :cond_1d
    invoke-virtual {v1, v3, v0}, Ljava/util/concurrent/atomic/AtomicReference;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 505
    .line 506
    .line 507
    move-result v2

    .line 508
    if-eqz v2, :cond_1e

    .line 509
    .line 510
    goto :goto_9

    .line 511
    :cond_1e
    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 512
    .line 513
    .line 514
    move-result-object v2

    .line 515
    if-eqz v2, :cond_1d

    .line 516
    .line 517
    :goto_9
    move-object v3, p1

    .line 518
    :goto_a
    if-eqz v3, :cond_1f

    .line 519
    .line 520
    invoke-static {v3}, LC3/g;->c(LC3/f;)V

    .line 521
    .line 522
    .line 523
    :cond_1f
    return-void

    .line 524
    nop

    .line 525
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
    .line 526
    .line 527
    .line 528
    .line 529
    .line 530
    .line 531
    .line 532
    .line 533
    .line 534
    .line 535
    .line 536
    .line 537
    .line 538
    .line 539
    .line 540
    .line 541
    .line 542
    .line 543
    .line 544
    .line 545
    .line 546
    .line 547
    .line 548
    .line 549
    .line 550
    .line 551
    .line 552
    .line 553
    .line 554
    .line 555
    .line 556
    .line 557
    .line 558
    .line 559
    .line 560
    .line 561
    .line 562
    .line 563
    .line 564
    .line 565
    .line 566
    .line 567
    .line 568
    .line 569
    .line 570
    .line 571
    .line 572
    .line 573
    .line 574
    .line 575
    .line 576
    .line 577
    .line 578
    .line 579
    .line 580
    .line 581
    .line 582
    .line 583
    .line 584
    .line 585
    .line 586
    .line 587
    .line 588
    .line 589
    .line 590
    .line 591
    .line 592
    .line 593
    .line 594
    .line 595
    .line 596
    .line 597
    .line 598
    .line 599
    .line 600
    .line 601
    .line 602
    .line 603
    .line 604
    .line 605
    .line 606
    .line 607
    .line 608
    .line 609
    .line 610
    .line 611
    .line 612
    .line 613
    .line 614
    .line 615
    .line 616
    .line 617
    .line 618
    .line 619
    .line 620
    .line 621
    .line 622
    .line 623
    .line 624
    .line 625
    .line 626
    .line 627
    .line 628
    .line 629
    .line 630
    .line 631
    .line 632
    .line 633
    .line 634
    .line 635
    .line 636
    .line 637
    .line 638
    .line 639
    .line 640
    .line 641
    .line 642
    .line 643
    .line 644
    .line 645
    .line 646
    .line 647
    .line 648
    .line 649
    .line 650
    .line 651
    .line 652
    .line 653
    .line 654
    .line 655
    .line 656
    .line 657
    .line 658
    .line 659
    .line 660
    .line 661
    .line 662
    .line 663
    .line 664
    .line 665
    .line 666
    .line 667
    .line 668
    .line 669
    .line 670
    .line 671
    .line 672
    .line 673
    .line 674
    .line 675
    .line 676
    .line 677
    .line 678
    .line 679
    .line 680
    .line 681
    .line 682
    .line 683
    .line 684
    .line 685
    .line 686
    .line 687
    .line 688
    .line 689
    .line 690
    .line 691
    .line 692
    .line 693
    .line 694
    .line 695
    .line 696
    .line 697
    .line 698
    .line 699
    .line 700
    .line 701
    .line 702
    .line 703
    .line 704
    .line 705
    .line 706
    .line 707
    .line 708
    .line 709
    .line 710
    .line 711
    .line 712
    .line 713
    .line 714
    .line 715
    .line 716
    .line 717
    .line 718
    .line 719
    .line 720
    .line 721
    .line 722
    .line 723
    .line 724
    .line 725
    .line 726
    .line 727
    .line 728
    .line 729
    .line 730
    .line 731
    .line 732
    .line 733
    .line 734
    .line 735
    .line 736
    .line 737
    .line 738
    .line 739
    .line 740
    .line 741
    .line 742
    .line 743
    .line 744
.end method
