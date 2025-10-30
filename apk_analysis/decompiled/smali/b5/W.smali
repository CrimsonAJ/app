.class public final Lb5/W;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final synthetic a:I

.field public b:J

.field public c:Ljava/lang/Object;

.field public d:Ljava/lang/Object;

.field public final e:Ljava/lang/Object;


# direct methods
.method public constructor <init>(JLandroid/os/Bundle;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Lb5/W;->a:I

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p4, p0, Lb5/W;->c:Ljava/lang/Object;

    iput-object p5, p0, Lb5/W;->d:Ljava/lang/Object;

    iput-object p3, p0, Lb5/W;->e:Ljava/lang/Object;

    iput-wide p1, p0, Lb5/W;->b:J

    return-void
.end method

.method public synthetic constructor <init>(Lb5/c;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Lb5/W;->a:I

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lb5/W;->e:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lm8/c;)V
    .locals 3

    const/4 v0, 0x2

    iput v0, p0, Lb5/W;->a:I

    sget-object v0, Ljava/util/concurrent/TimeUnit;->MINUTES:Ljava/util/concurrent/TimeUnit;

    const-string v1, "taskRunner"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "timeUnit"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-wide/16 v1, 0x5

    .line 4
    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/TimeUnit;->toNanos(J)J

    move-result-wide v0

    iput-wide v0, p0, Lb5/W;->b:J

    .line 5
    invoke-virtual {p1}, Lm8/c;->e()Lm8/b;

    move-result-object p1

    iput-object p1, p0, Lb5/W;->c:Ljava/lang/Object;

    .line 6
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v0, Lk8/c;->g:Ljava/lang/String;

    const-string v1, " ConnectionPool"

    .line 7
    invoke-static {p1, v0, v1}, Lcom/google/android/gms/internal/measurement/k1;->q(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 8
    new-instance v0, Ll8/f;

    const/4 v1, 0x2

    invoke-direct {v0, p0, p1, v1}, Ll8/f;-><init>(Ljava/lang/Object;Ljava/lang/String;I)V

    iput-object v0, p0, Lb5/W;->d:Ljava/lang/Object;

    .line 9
    new-instance p1, Ljava/util/concurrent/ConcurrentLinkedQueue;

    invoke-direct {p1}, Ljava/util/concurrent/ConcurrentLinkedQueue;-><init>()V

    iput-object p1, p0, Lb5/W;->e:Ljava/lang/Object;

    return-void
.end method

.method public static e(Lb5/t;)Lb5/W;
    .locals 6

    .line 1
    new-instance v0, Lb5/W;

    .line 2
    .line 3
    iget-object v1, p0, Lb5/t;->b:Lb5/s;

    .line 4
    .line 5
    invoke-virtual {v1}, Lb5/s;->f()Landroid/os/Bundle;

    .line 6
    .line 7
    .line 8
    move-result-object v3

    .line 9
    iget-wide v1, p0, Lb5/t;->d:J

    .line 10
    .line 11
    iget-object v5, p0, Lb5/t;->c:Ljava/lang/String;

    .line 12
    .line 13
    iget-object v4, p0, Lb5/t;->a:Ljava/lang/String;

    .line 14
    .line 15
    invoke-direct/range {v0 .. v5}, Lb5/W;-><init>(JLandroid/os/Bundle;Ljava/lang/String;Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    return-object v0
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


# virtual methods
.method public a(Li8/a;Ln8/g;Ljava/util/List;Z)Z
    .locals 5

    .line 1
    const-string v0, "call"

    .line 2
    .line 3
    invoke-static {p2, v0}, Lkotlin/jvm/internal/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lb5/W;->e:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Ljava/util/concurrent/ConcurrentLinkedQueue;

    .line 9
    .line 10
    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentLinkedQueue;->iterator()Ljava/util/Iterator;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    const/4 v2, 0x0

    .line 19
    if-eqz v1, :cond_3

    .line 20
    .line 21
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    check-cast v1, Ln8/i;

    .line 26
    .line 27
    const-string v3, "connection"

    .line 28
    .line 29
    invoke-static {v1, v3}, Lkotlin/jvm/internal/h;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    monitor-enter v1

    .line 33
    const/4 v3, 0x1

    .line 34
    if-eqz p4, :cond_1

    .line 35
    .line 36
    :try_start_0
    iget-object v4, v1, Ln8/i;->g:Lq8/n;

    .line 37
    .line 38
    if-eqz v4, :cond_0

    .line 39
    .line 40
    move v2, v3

    .line 41
    :cond_0
    if-eqz v2, :cond_2

    .line 42
    .line 43
    :cond_1
    invoke-virtual {v1, p1, p3}, Ln8/i;->i(Li8/a;Ljava/util/List;)Z

    .line 44
    .line 45
    .line 46
    move-result v2

    .line 47
    if-eqz v2, :cond_2

    .line 48
    .line 49
    invoke-virtual {p2, v1}, Ln8/g;->c(Ln8/i;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 50
    .line 51
    .line 52
    monitor-exit v1

    .line 53
    return v3

    .line 54
    :catchall_0
    move-exception p1

    .line 55
    goto :goto_1

    .line 56
    :cond_2
    monitor-exit v1

    .line 57
    goto :goto_0

    .line 58
    :goto_1
    monitor-exit v1

    .line 59
    throw p1

    .line 60
    :cond_3
    return v2
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
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
.end method

.method public b(Ln8/i;J)I
    .locals 7

    .line 1
    const/4 v0, 0x1

    .line 2
    sget-object v1, Lk8/c;->a:[B

    .line 3
    .line 4
    iget-object v1, p1, Ln8/i;->p:Ljava/util/ArrayList;

    .line 5
    .line 6
    const/4 v2, 0x0

    .line 7
    move v3, v2

    .line 8
    :cond_0
    :goto_0
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 9
    .line 10
    .line 11
    move-result v4

    .line 12
    if-ge v3, v4, :cond_2

    .line 13
    .line 14
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v4

    .line 18
    check-cast v4, Ljava/lang/ref/Reference;

    .line 19
    .line 20
    invoke-virtual {v4}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v5

    .line 24
    if-eqz v5, :cond_1

    .line 25
    .line 26
    add-int/2addr v3, v0

    .line 27
    goto :goto_0

    .line 28
    :cond_1
    check-cast v4, Ln8/e;

    .line 29
    .line 30
    new-instance v5, Ljava/lang/StringBuilder;

    .line 31
    .line 32
    const-string v6, "A connection to "

    .line 33
    .line 34
    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    iget-object v6, p1, Ln8/i;->b:Li8/O;

    .line 38
    .line 39
    iget-object v6, v6, Li8/O;->a:Li8/a;

    .line 40
    .line 41
    iget-object v6, v6, Li8/a;->h:Li8/y;

    .line 42
    .line 43
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 44
    .line 45
    .line 46
    const-string v6, " was leaked. Did you forget to close a response body?"

    .line 47
    .line 48
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 49
    .line 50
    .line 51
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object v5

    .line 55
    sget-object v6, Ls8/p;->a:Ls8/p;

    .line 56
    .line 57
    sget-object v6, Ls8/p;->a:Ls8/p;

    .line 58
    .line 59
    iget-object v4, v4, Ln8/e;->a:Ljava/lang/Object;

    .line 60
    .line 61
    invoke-virtual {v6, v4, v5}, Ls8/p;->k(Ljava/lang/Object;Ljava/lang/String;)V

    .line 62
    .line 63
    .line 64
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    iput-boolean v0, p1, Ln8/i;->j:Z

    .line 68
    .line 69
    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    .line 70
    .line 71
    .line 72
    move-result v4

    .line 73
    if-eqz v4, :cond_0

    .line 74
    .line 75
    iget-wide v0, p0, Lb5/W;->b:J

    .line 76
    .line 77
    sub-long/2addr p2, v0

    .line 78
    iput-wide p2, p1, Ln8/i;->q:J

    .line 79
    .line 80
    return v2

    .line 81
    :cond_2
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 82
    .line 83
    .line 84
    move-result p1

    .line 85
    return p1
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

.method public c()Lb5/t;
    .locals 6

    .line 1
    new-instance v0, Lb5/t;

    .line 2
    .line 3
    new-instance v2, Lb5/s;

    .line 4
    .line 5
    new-instance v1, Landroid/os/Bundle;

    .line 6
    .line 7
    iget-object v3, p0, Lb5/W;->e:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v3, Landroid/os/Bundle;

    .line 10
    .line 11
    invoke-direct {v1, v3}, Landroid/os/Bundle;-><init>(Landroid/os/Bundle;)V

    .line 12
    .line 13
    .line 14
    invoke-direct {v2, v1}, Lb5/s;-><init>(Landroid/os/Bundle;)V

    .line 15
    .line 16
    .line 17
    iget-object v1, p0, Lb5/W;->c:Ljava/lang/Object;

    .line 18
    .line 19
    check-cast v1, Ljava/lang/String;

    .line 20
    .line 21
    iget-wide v4, p0, Lb5/W;->b:J

    .line 22
    .line 23
    iget-object v3, p0, Lb5/W;->d:Ljava/lang/Object;

    .line 24
    .line 25
    check-cast v3, Ljava/lang/String;

    .line 26
    .line 27
    invoke-direct/range {v0 .. v5}, Lb5/t;-><init>(Ljava/lang/String;Lb5/s;Ljava/lang/String;J)V

    .line 28
    .line 29
    .line 30
    return-object v0
    .line 31
    .line 32
.end method

.method public d(Lcom/google/android/gms/internal/measurement/V0;Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/V0;
    .locals 18

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v7, p1

    .line 4
    .line 5
    move-object/from16 v3, p2

    .line 6
    .line 7
    invoke-virtual {v7}, Lcom/google/android/gms/internal/measurement/V0;->t()Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-virtual {v7}, Lcom/google/android/gms/internal/measurement/V0;->u()Ljava/util/List;

    .line 12
    .line 13
    .line 14
    move-result-object v14

    .line 15
    iget-object v2, v1, Lb5/W;->e:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast v2, Lb5/c;

    .line 18
    .line 19
    iget-object v4, v2, Lb5/z1;->b:Lb5/J1;

    .line 20
    .line 21
    invoke-virtual {v4}, Lb5/J1;->a()Lb5/Z;

    .line 22
    .line 23
    .line 24
    const-string v5, "_eid"

    .line 25
    .line 26
    invoke-static {v7, v5}, Lb5/Z;->v0(Lcom/google/android/gms/internal/measurement/V0;Ljava/lang/String;)Ljava/io/Serializable;

    .line 27
    .line 28
    .line 29
    move-result-object v6

    .line 30
    move-object v10, v6

    .line 31
    check-cast v10, Ljava/lang/Long;

    .line 32
    .line 33
    if-eqz v10, :cond_f

    .line 34
    .line 35
    const-string v6, "_ep"

    .line 36
    .line 37
    invoke-virtual {v0, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 38
    .line 39
    .line 40
    move-result v6

    .line 41
    iget-object v8, v2, LD/n;->a:Ljava/lang/Object;

    .line 42
    .line 43
    move-object v15, v8

    .line 44
    check-cast v15, Lb5/n0;

    .line 45
    .line 46
    if-eqz v6, :cond_c

    .line 47
    .line 48
    invoke-virtual {v4}, Lb5/J1;->a()Lb5/Z;

    .line 49
    .line 50
    .line 51
    const-string v0, "_en"

    .line 52
    .line 53
    invoke-static {v7, v0}, Lb5/Z;->v0(Lcom/google/android/gms/internal/measurement/V0;Ljava/lang/String;)Ljava/io/Serializable;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    move-object v6, v0

    .line 58
    check-cast v6, Ljava/lang/String;

    .line 59
    .line 60
    invoke-static {v6}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 61
    .line 62
    .line 63
    move-result v0

    .line 64
    const/4 v11, 0x0

    .line 65
    if-eqz v0, :cond_0

    .line 66
    .line 67
    iget-object v0, v15, Lb5/n0;->i:Lb5/V;

    .line 68
    .line 69
    invoke-static {v0}, Lb5/n0;->f(Lb5/x0;)V

    .line 70
    .line 71
    .line 72
    const-string v2, "Extra parameter without an event name. eventId"

    .line 73
    .line 74
    iget-object v0, v0, Lb5/V;->g:Lb5/T;

    .line 75
    .line 76
    invoke-virtual {v0, v10, v2}, Lb5/T;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 77
    .line 78
    .line 79
    return-object v11

    .line 80
    :cond_0
    iget-object v0, v1, Lb5/W;->c:Ljava/lang/Object;

    .line 81
    .line 82
    check-cast v0, Lcom/google/android/gms/internal/measurement/V0;

    .line 83
    .line 84
    iget-object v2, v2, Lb5/z1;->b:Lb5/J1;

    .line 85
    .line 86
    if-eqz v0, :cond_2

    .line 87
    .line 88
    iget-object v0, v1, Lb5/W;->d:Ljava/lang/Object;

    .line 89
    .line 90
    check-cast v0, Ljava/lang/Long;

    .line 91
    .line 92
    if-eqz v0, :cond_2

    .line 93
    .line 94
    invoke-virtual {v10}, Ljava/lang/Long;->longValue()J

    .line 95
    .line 96
    .line 97
    move-result-wide v12

    .line 98
    iget-object v0, v1, Lb5/W;->d:Ljava/lang/Object;

    .line 99
    .line 100
    check-cast v0, Ljava/lang/Long;

    .line 101
    .line 102
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    .line 103
    .line 104
    .line 105
    move-result-wide v16

    .line 106
    cmp-long v0, v12, v16

    .line 107
    .line 108
    if-eqz v0, :cond_1

    .line 109
    .line 110
    goto :goto_0

    .line 111
    :cond_1
    const-wide/16 v16, 0x0

    .line 112
    .line 113
    goto/16 :goto_6

    .line 114
    .line 115
    :cond_2
    :goto_0
    iget-object v0, v4, Lb5/J1;->c:Lb5/n;

    .line 116
    .line 117
    invoke-static {v0}, Lb5/J1;->J(Lb5/D1;)V

    .line 118
    .line 119
    .line 120
    iget-object v4, v0, LD/n;->a:Ljava/lang/Object;

    .line 121
    .line 122
    check-cast v4, Lb5/n0;

    .line 123
    .line 124
    invoke-virtual {v0}, LD/n;->l0()V

    .line 125
    .line 126
    .line 127
    invoke-virtual {v0}, Lb5/D1;->m0()V

    .line 128
    .line 129
    .line 130
    :try_start_0
    invoke-virtual {v0}, Lb5/n;->h1()Landroid/database/sqlite/SQLiteDatabase;

    .line 131
    .line 132
    .line 133
    move-result-object v0

    .line 134
    const-string v12, "select main_event, children_to_process from main_event_params where app_id=? and event_id=?"

    .line 135
    .line 136
    invoke-virtual {v10}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 137
    .line 138
    .line 139
    move-result-object v13

    .line 140
    filled-new-array {v3, v13}, [Ljava/lang/String;

    .line 141
    .line 142
    .line 143
    move-result-object v13

    .line 144
    invoke-virtual {v0, v12, v13}, Landroid/database/sqlite/SQLiteDatabase;->rawQuery(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;

    .line 145
    .line 146
    .line 147
    move-result-object v12
    :try_end_0
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_0 .. :try_end_0} :catch_3
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 148
    :try_start_1
    invoke-interface {v12}, Landroid/database/Cursor;->moveToFirst()Z

    .line 149
    .line 150
    .line 151
    move-result v0

    .line 152
    if-nez v0, :cond_3

    .line 153
    .line 154
    iget-object v0, v4, Lb5/n0;->i:Lb5/V;

    .line 155
    .line 156
    invoke-static {v0}, Lb5/n0;->f(Lb5/x0;)V

    .line 157
    .line 158
    .line 159
    iget-object v0, v0, Lb5/V;->n:Lb5/T;

    .line 160
    .line 161
    const-string v13, "Main event not found"

    .line 162
    .line 163
    invoke-virtual {v0, v13}, Lb5/T;->b(Ljava/lang/String;)V
    :try_end_1
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 164
    .line 165
    .line 166
    invoke-interface {v12}, Landroid/database/Cursor;->close()V

    .line 167
    .line 168
    .line 169
    move-object v0, v11

    .line 170
    const-wide/16 v16, 0x0

    .line 171
    .line 172
    goto :goto_5

    .line 173
    :catchall_0
    move-exception v0

    .line 174
    goto :goto_3

    .line 175
    :catch_0
    move-exception v0

    .line 176
    const-wide/16 v16, 0x0

    .line 177
    .line 178
    goto :goto_4

    .line 179
    :cond_3
    const/4 v0, 0x0

    .line 180
    :try_start_2
    invoke-interface {v12, v0}, Landroid/database/Cursor;->getBlob(I)[B

    .line 181
    .line 182
    .line 183
    move-result-object v0

    .line 184
    const/4 v13, 0x1

    .line 185
    invoke-interface {v12, v13}, Landroid/database/Cursor;->getLong(I)J

    .line 186
    .line 187
    .line 188
    move-result-wide v16

    .line 189
    invoke-static/range {v16 .. v17}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 190
    .line 191
    .line 192
    move-result-object v13
    :try_end_2
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 193
    const-wide/16 v16, 0x0

    .line 194
    .line 195
    :try_start_3
    invoke-static {}, Lcom/google/android/gms/internal/measurement/V0;->r()Lcom/google/android/gms/internal/measurement/U0;

    .line 196
    .line 197
    .line 198
    move-result-object v8

    .line 199
    invoke-static {v8, v0}, Lb5/Z;->R0(Lcom/google/android/gms/internal/measurement/a2;[B)Lcom/google/android/gms/internal/measurement/a2;

    .line 200
    .line 201
    .line 202
    move-result-object v0

    .line 203
    check-cast v0, Lcom/google/android/gms/internal/measurement/U0;

    .line 204
    .line 205
    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/a2;->h()Lcom/google/android/gms/internal/measurement/b2;

    .line 206
    .line 207
    .line 208
    move-result-object v0

    .line 209
    check-cast v0, Lcom/google/android/gms/internal/measurement/V0;
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_1
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_3 .. :try_end_3} :catch_2
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 210
    .line 211
    :try_start_4
    invoke-static {v0, v13}, Landroid/util/Pair;->create(Ljava/lang/Object;Ljava/lang/Object;)Landroid/util/Pair;

    .line 212
    .line 213
    .line 214
    move-result-object v0
    :try_end_4
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_4 .. :try_end_4} :catch_2
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 215
    invoke-interface {v12}, Landroid/database/Cursor;->close()V

    .line 216
    .line 217
    .line 218
    goto :goto_5

    .line 219
    :catch_1
    move-exception v0

    .line 220
    goto :goto_1

    .line 221
    :catch_2
    move-exception v0

    .line 222
    goto :goto_4

    .line 223
    :goto_1
    :try_start_5
    iget-object v8, v4, Lb5/n0;->i:Lb5/V;

    .line 224
    .line 225
    invoke-static {v8}, Lb5/n0;->f(Lb5/x0;)V

    .line 226
    .line 227
    .line 228
    iget-object v8, v8, Lb5/V;->f:Lb5/T;

    .line 229
    .line 230
    const-string v9, "Failed to merge main event. appId, eventId"

    .line 231
    .line 232
    invoke-static {v3}, Lb5/V;->t0(Ljava/lang/String;)Lb5/U;

    .line 233
    .line 234
    .line 235
    move-result-object v13

    .line 236
    invoke-virtual {v8, v9, v13, v10, v0}, Lb5/T;->e(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_5
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_5 .. :try_end_5} :catch_2
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 237
    .line 238
    .line 239
    :goto_2
    invoke-interface {v12}, Landroid/database/Cursor;->close()V

    .line 240
    .line 241
    .line 242
    :cond_4
    move-object v0, v11

    .line 243
    goto :goto_5

    .line 244
    :goto_3
    move-object v11, v12

    .line 245
    goto/16 :goto_b

    .line 246
    .line 247
    :catchall_1
    move-exception v0

    .line 248
    goto/16 :goto_b

    .line 249
    .line 250
    :catch_3
    move-exception v0

    .line 251
    const-wide/16 v16, 0x0

    .line 252
    .line 253
    move-object v12, v11

    .line 254
    :goto_4
    :try_start_6
    iget-object v4, v4, Lb5/n0;->i:Lb5/V;

    .line 255
    .line 256
    invoke-static {v4}, Lb5/n0;->f(Lb5/x0;)V

    .line 257
    .line 258
    .line 259
    iget-object v4, v4, Lb5/V;->f:Lb5/T;

    .line 260
    .line 261
    const-string v8, "Error selecting main event"

    .line 262
    .line 263
    invoke-virtual {v4, v0, v8}, Lb5/T;->c(Ljava/lang/Object;Ljava/lang/String;)V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    .line 264
    .line 265
    .line 266
    if-eqz v12, :cond_4

    .line 267
    .line 268
    goto :goto_2

    .line 269
    :goto_5
    if-eqz v0, :cond_a

    .line 270
    .line 271
    iget-object v4, v0, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 272
    .line 273
    if-nez v4, :cond_5

    .line 274
    .line 275
    goto/16 :goto_a

    .line 276
    .line 277
    :cond_5
    check-cast v4, Lcom/google/android/gms/internal/measurement/V0;

    .line 278
    .line 279
    iput-object v4, v1, Lb5/W;->c:Ljava/lang/Object;

    .line 280
    .line 281
    iget-object v0, v0, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 282
    .line 283
    check-cast v0, Ljava/lang/Long;

    .line 284
    .line 285
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    .line 286
    .line 287
    .line 288
    move-result-wide v8

    .line 289
    iput-wide v8, v1, Lb5/W;->b:J

    .line 290
    .line 291
    invoke-virtual {v2}, Lb5/J1;->a()Lb5/Z;

    .line 292
    .line 293
    .line 294
    iget-object v0, v1, Lb5/W;->c:Ljava/lang/Object;

    .line 295
    .line 296
    check-cast v0, Lcom/google/android/gms/internal/measurement/V0;

    .line 297
    .line 298
    invoke-static {v0, v5}, Lb5/Z;->v0(Lcom/google/android/gms/internal/measurement/V0;Ljava/lang/String;)Ljava/io/Serializable;

    .line 299
    .line 300
    .line 301
    move-result-object v0

    .line 302
    check-cast v0, Ljava/lang/Long;

    .line 303
    .line 304
    iput-object v0, v1, Lb5/W;->d:Ljava/lang/Object;

    .line 305
    .line 306
    :goto_6
    iget-wide v4, v1, Lb5/W;->b:J

    .line 307
    .line 308
    const-wide/16 v8, -0x1

    .line 309
    .line 310
    add-long/2addr v4, v8

    .line 311
    iput-wide v4, v1, Lb5/W;->b:J

    .line 312
    .line 313
    cmp-long v0, v4, v16

    .line 314
    .line 315
    if-gtz v0, :cond_6

    .line 316
    .line 317
    iget-object v0, v2, Lb5/J1;->c:Lb5/n;

    .line 318
    .line 319
    invoke-static {v0}, Lb5/J1;->J(Lb5/D1;)V

    .line 320
    .line 321
    .line 322
    invoke-virtual {v0}, LD/n;->l0()V

    .line 323
    .line 324
    .line 325
    iget-object v4, v0, LD/n;->a:Ljava/lang/Object;

    .line 326
    .line 327
    check-cast v4, Lb5/n0;

    .line 328
    .line 329
    iget-object v5, v4, Lb5/n0;->i:Lb5/V;

    .line 330
    .line 331
    invoke-static {v5}, Lb5/n0;->f(Lb5/x0;)V

    .line 332
    .line 333
    .line 334
    const-string v8, "Clearing complex main event info. appId"

    .line 335
    .line 336
    iget-object v5, v5, Lb5/V;->n:Lb5/T;

    .line 337
    .line 338
    invoke-virtual {v5, v3, v8}, Lb5/T;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 339
    .line 340
    .line 341
    :try_start_7
    invoke-virtual {v0}, Lb5/n;->h1()Landroid/database/sqlite/SQLiteDatabase;

    .line 342
    .line 343
    .line 344
    move-result-object v0

    .line 345
    const-string v5, "delete from main_event_params where app_id=?"

    .line 346
    .line 347
    filled-new-array {v3}, [Ljava/lang/String;

    .line 348
    .line 349
    .line 350
    move-result-object v3

    .line 351
    invoke-virtual {v0, v5, v3}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_7
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_7 .. :try_end_7} :catch_4

    .line 352
    .line 353
    .line 354
    goto :goto_7

    .line 355
    :catch_4
    move-exception v0

    .line 356
    iget-object v3, v4, Lb5/n0;->i:Lb5/V;

    .line 357
    .line 358
    invoke-static {v3}, Lb5/n0;->f(Lb5/x0;)V

    .line 359
    .line 360
    .line 361
    const-string v4, "Error clearing complex main event"

    .line 362
    .line 363
    iget-object v3, v3, Lb5/V;->f:Lb5/T;

    .line 364
    .line 365
    invoke-virtual {v3, v0, v4}, Lb5/T;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 366
    .line 367
    .line 368
    goto :goto_7

    .line 369
    :cond_6
    iget-object v8, v2, Lb5/J1;->c:Lb5/n;

    .line 370
    .line 371
    invoke-static {v8}, Lb5/J1;->J(Lb5/D1;)V

    .line 372
    .line 373
    .line 374
    iget-wide v11, v1, Lb5/W;->b:J

    .line 375
    .line 376
    iget-object v0, v1, Lb5/W;->c:Ljava/lang/Object;

    .line 377
    .line 378
    move-object v13, v0

    .line 379
    check-cast v13, Lcom/google/android/gms/internal/measurement/V0;

    .line 380
    .line 381
    move-object v9, v3

    .line 382
    invoke-virtual/range {v8 .. v13}, Lb5/n;->X0(Ljava/lang/String;Ljava/lang/Long;JLcom/google/android/gms/internal/measurement/V0;)V

    .line 383
    .line 384
    .line 385
    :goto_7
    new-instance v0, Ljava/util/ArrayList;

    .line 386
    .line 387
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 388
    .line 389
    .line 390
    iget-object v3, v1, Lb5/W;->c:Ljava/lang/Object;

    .line 391
    .line 392
    check-cast v3, Lcom/google/android/gms/internal/measurement/V0;

    .line 393
    .line 394
    invoke-virtual {v3}, Lcom/google/android/gms/internal/measurement/V0;->u()Ljava/util/List;

    .line 395
    .line 396
    .line 397
    move-result-object v3

    .line 398
    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 399
    .line 400
    .line 401
    move-result-object v3

    .line 402
    :cond_7
    :goto_8
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 403
    .line 404
    .line 405
    move-result v4

    .line 406
    if-eqz v4, :cond_8

    .line 407
    .line 408
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 409
    .line 410
    .line 411
    move-result-object v4

    .line 412
    check-cast v4, Lcom/google/android/gms/internal/measurement/Y0;

    .line 413
    .line 414
    invoke-virtual {v2}, Lb5/J1;->a()Lb5/Z;

    .line 415
    .line 416
    .line 417
    invoke-virtual {v4}, Lcom/google/android/gms/internal/measurement/Y0;->s()Ljava/lang/String;

    .line 418
    .line 419
    .line 420
    move-result-object v5

    .line 421
    invoke-static {v7, v5}, Lb5/Z;->u0(Lcom/google/android/gms/internal/measurement/V0;Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/Y0;

    .line 422
    .line 423
    .line 424
    move-result-object v5

    .line 425
    if-nez v5, :cond_7

    .line 426
    .line 427
    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 428
    .line 429
    .line 430
    goto :goto_8

    .line 431
    :cond_8
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 432
    .line 433
    .line 434
    move-result v2

    .line 435
    if-nez v2, :cond_9

    .line 436
    .line 437
    invoke-virtual {v0, v14}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 438
    .line 439
    .line 440
    move-object v14, v0

    .line 441
    goto :goto_9

    .line 442
    :cond_9
    iget-object v0, v15, Lb5/n0;->i:Lb5/V;

    .line 443
    .line 444
    invoke-static {v0}, Lb5/n0;->f(Lb5/x0;)V

    .line 445
    .line 446
    .line 447
    const-string v2, "No unique parameters in main event. eventName"

    .line 448
    .line 449
    iget-object v0, v0, Lb5/V;->g:Lb5/T;

    .line 450
    .line 451
    invoke-virtual {v0, v6, v2}, Lb5/T;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 452
    .line 453
    .line 454
    :goto_9
    move-object v0, v6

    .line 455
    goto :goto_d

    .line 456
    :cond_a
    :goto_a
    iget-object v0, v15, Lb5/n0;->i:Lb5/V;

    .line 457
    .line 458
    invoke-static {v0}, Lb5/n0;->f(Lb5/x0;)V

    .line 459
    .line 460
    .line 461
    const-string v2, "Extra parameter without existing main event. eventName, eventId"

    .line 462
    .line 463
    iget-object v0, v0, Lb5/V;->g:Lb5/T;

    .line 464
    .line 465
    invoke-virtual {v0, v6, v10, v2}, Lb5/T;->d(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 466
    .line 467
    .line 468
    return-object v11

    .line 469
    :goto_b
    if-eqz v11, :cond_b

    .line 470
    .line 471
    invoke-interface {v11}, Landroid/database/Cursor;->close()V

    .line 472
    .line 473
    .line 474
    :cond_b
    throw v0

    .line 475
    :cond_c
    const-wide/16 v16, 0x0

    .line 476
    .line 477
    iput-object v10, v1, Lb5/W;->d:Ljava/lang/Object;

    .line 478
    .line 479
    iput-object v7, v1, Lb5/W;->c:Ljava/lang/Object;

    .line 480
    .line 481
    invoke-virtual {v4}, Lb5/J1;->a()Lb5/Z;

    .line 482
    .line 483
    .line 484
    invoke-static/range {v16 .. v17}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 485
    .line 486
    .line 487
    move-result-object v2

    .line 488
    const-string v3, "_epc"

    .line 489
    .line 490
    invoke-static {v7, v3}, Lb5/Z;->v0(Lcom/google/android/gms/internal/measurement/V0;Ljava/lang/String;)Ljava/io/Serializable;

    .line 491
    .line 492
    .line 493
    move-result-object v3

    .line 494
    if-nez v3, :cond_d

    .line 495
    .line 496
    goto :goto_c

    .line 497
    :cond_d
    move-object v2, v3

    .line 498
    :goto_c
    check-cast v2, Ljava/lang/Long;

    .line 499
    .line 500
    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    .line 501
    .line 502
    .line 503
    move-result-wide v2

    .line 504
    iput-wide v2, v1, Lb5/W;->b:J

    .line 505
    .line 506
    cmp-long v2, v2, v16

    .line 507
    .line 508
    if-gtz v2, :cond_e

    .line 509
    .line 510
    iget-object v2, v15, Lb5/n0;->i:Lb5/V;

    .line 511
    .line 512
    invoke-static {v2}, Lb5/n0;->f(Lb5/x0;)V

    .line 513
    .line 514
    .line 515
    const-string v3, "Complex event with zero extra param count. eventName"

    .line 516
    .line 517
    iget-object v2, v2, Lb5/V;->g:Lb5/T;

    .line 518
    .line 519
    invoke-virtual {v2, v0, v3}, Lb5/T;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 520
    .line 521
    .line 522
    goto :goto_d

    .line 523
    :cond_e
    iget-object v2, v4, Lb5/J1;->c:Lb5/n;

    .line 524
    .line 525
    invoke-static {v2}, Lb5/J1;->J(Lb5/D1;)V

    .line 526
    .line 527
    .line 528
    iget-wide v5, v1, Lb5/W;->b:J

    .line 529
    .line 530
    move-object/from16 v3, p2

    .line 531
    .line 532
    move-object v4, v10

    .line 533
    invoke-virtual/range {v2 .. v7}, Lb5/n;->X0(Ljava/lang/String;Ljava/lang/Long;JLcom/google/android/gms/internal/measurement/V0;)V

    .line 534
    .line 535
    .line 536
    :cond_f
    :goto_d
    invoke-virtual/range {p1 .. p1}, Lcom/google/android/gms/internal/measurement/b2;->f()Lcom/google/android/gms/internal/measurement/a2;

    .line 537
    .line 538
    .line 539
    move-result-object v2

    .line 540
    check-cast v2, Lcom/google/android/gms/internal/measurement/U0;

    .line 541
    .line 542
    invoke-virtual {v2}, Lcom/google/android/gms/internal/measurement/a2;->j()V

    .line 543
    .line 544
    .line 545
    iget-object v3, v2, Lcom/google/android/gms/internal/measurement/a2;->b:Lcom/google/android/gms/internal/measurement/b2;

    .line 546
    .line 547
    check-cast v3, Lcom/google/android/gms/internal/measurement/V0;

    .line 548
    .line 549
    invoke-static {v3, v0}, Lcom/google/android/gms/internal/measurement/V0;->z(Lcom/google/android/gms/internal/measurement/V0;Ljava/lang/String;)V

    .line 550
    .line 551
    .line 552
    invoke-virtual {v2}, Lcom/google/android/gms/internal/measurement/a2;->j()V

    .line 553
    .line 554
    .line 555
    iget-object v0, v2, Lcom/google/android/gms/internal/measurement/a2;->b:Lcom/google/android/gms/internal/measurement/b2;

    .line 556
    .line 557
    check-cast v0, Lcom/google/android/gms/internal/measurement/V0;

    .line 558
    .line 559
    invoke-static {v0}, Lcom/google/android/gms/internal/measurement/V0;->x(Lcom/google/android/gms/internal/measurement/V0;)V

    .line 560
    .line 561
    .line 562
    invoke-virtual {v2}, Lcom/google/android/gms/internal/measurement/a2;->j()V

    .line 563
    .line 564
    .line 565
    iget-object v0, v2, Lcom/google/android/gms/internal/measurement/a2;->b:Lcom/google/android/gms/internal/measurement/b2;

    .line 566
    .line 567
    check-cast v0, Lcom/google/android/gms/internal/measurement/V0;

    .line 568
    .line 569
    invoke-static {v0, v14}, Lcom/google/android/gms/internal/measurement/V0;->v(Lcom/google/android/gms/internal/measurement/V0;Ljava/lang/Iterable;)V

    .line 570
    .line 571
    .line 572
    invoke-virtual {v2}, Lcom/google/android/gms/internal/measurement/a2;->h()Lcom/google/android/gms/internal/measurement/b2;

    .line 573
    .line 574
    .line 575
    move-result-object v0

    .line 576
    check-cast v0, Lcom/google/android/gms/internal/measurement/V0;

    .line 577
    .line 578
    return-object v0
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
    .line 745
    .line 746
    .line 747
    .line 748
    .line 749
    .line 750
    .line 751
    .line 752
    .line 753
    .line 754
    .line 755
    .line 756
    .line 757
    .line 758
    .line 759
    .line 760
    .line 761
    .line 762
    .line 763
    .line 764
    .line 765
    .line 766
    .line 767
    .line 768
    .line 769
    .line 770
    .line 771
    .line 772
    .line 773
    .line 774
    .line 775
    .line 776
    .line 777
    .line 778
    .line 779
    .line 780
    .line 781
    .line 782
    .line 783
    .line 784
    .line 785
    .line 786
    .line 787
    .line 788
    .line 789
    .line 790
    .line 791
    .line 792
    .line 793
    .line 794
    .line 795
    .line 796
    .line 797
    .line 798
    .line 799
    .line 800
    .line 801
    .line 802
    .line 803
    .line 804
    .line 805
    .line 806
    .line 807
    .line 808
    .line 809
    .line 810
    .line 811
    .line 812
    .line 813
    .line 814
    .line 815
    .line 816
    .line 817
    .line 818
    .line 819
    .line 820
    .line 821
    .line 822
    .line 823
    .line 824
    .line 825
    .line 826
    .line 827
    .line 828
    .line 829
    .line 830
    .line 831
    .line 832
    .line 833
    .line 834
    .line 835
    .line 836
    .line 837
    .line 838
    .line 839
    .line 840
    .line 841
    .line 842
    .line 843
    .line 844
    .line 845
    .line 846
    .line 847
    .line 848
    .line 849
    .line 850
    .line 851
    .line 852
    .line 853
    .line 854
    .line 855
    .line 856
    .line 857
    .line 858
    .line 859
    .line 860
    .line 861
    .line 862
    .line 863
    .line 864
    .line 865
    .line 866
    .line 867
    .line 868
    .line 869
    .line 870
    .line 871
    .line 872
    .line 873
    .line 874
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    .line 1
    iget v0, p0, Lb5/W;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-super {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    return-object v0

    .line 11
    :pswitch_0
    iget-object v0, p0, Lb5/W;->e:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast v0, Landroid/os/Bundle;

    .line 14
    .line 15
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    new-instance v1, Ljava/lang/StringBuilder;

    .line 20
    .line 21
    const-string v2, "origin="

    .line 22
    .line 23
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    iget-object v2, p0, Lb5/W;->d:Ljava/lang/Object;

    .line 27
    .line 28
    check-cast v2, Ljava/lang/String;

    .line 29
    .line 30
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    const-string v2, ",name="

    .line 34
    .line 35
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    iget-object v2, p0, Lb5/W;->c:Ljava/lang/Object;

    .line 39
    .line 40
    check-cast v2, Ljava/lang/String;

    .line 41
    .line 42
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 43
    .line 44
    .line 45
    const-string v2, ",params="

    .line 46
    .line 47
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 48
    .line 49
    .line 50
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 51
    .line 52
    .line 53
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    return-object v0

    .line 58
    nop

    .line 59
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
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
