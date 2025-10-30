.class public final LN3/m;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LN3/z;


# instance fields
.field public final a:Lb6/o;

.field public final b:Lk4/l;

.field public c:Le1/q;

.field public final d:J

.field public final e:J

.field public final f:J

.field public final g:F

.field public final h:F


# direct methods
.method public constructor <init>(Lk4/l;Lq3/h;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LN3/m;->b:Lk4/l;

    .line 5
    .line 6
    new-instance v0, Lb6/o;

    .line 7
    .line 8
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 9
    .line 10
    .line 11
    iput-object p2, v0, Lb6/o;->a:Ljava/lang/Object;

    .line 12
    .line 13
    new-instance p2, Ljava/util/HashMap;

    .line 14
    .line 15
    invoke-direct {p2}, Ljava/util/HashMap;-><init>()V

    .line 16
    .line 17
    .line 18
    iput-object p2, v0, Lb6/o;->b:Ljava/lang/Object;

    .line 19
    .line 20
    new-instance p2, Ljava/util/HashSet;

    .line 21
    .line 22
    invoke-direct {p2}, Ljava/util/HashSet;-><init>()V

    .line 23
    .line 24
    .line 25
    iput-object p2, v0, Lb6/o;->c:Ljava/lang/Object;

    .line 26
    .line 27
    new-instance p2, Ljava/util/HashMap;

    .line 28
    .line 29
    invoke-direct {p2}, Ljava/util/HashMap;-><init>()V

    .line 30
    .line 31
    .line 32
    iput-object p2, v0, Lb6/o;->d:Ljava/lang/Object;

    .line 33
    .line 34
    iput-object v0, p0, LN3/m;->a:Lb6/o;

    .line 35
    .line 36
    iget-object p2, v0, Lb6/o;->e:Ljava/lang/Object;

    .line 37
    .line 38
    check-cast p2, Lk4/l;

    .line 39
    .line 40
    if-eq p1, p2, :cond_0

    .line 41
    .line 42
    iput-object p1, v0, Lb6/o;->e:Ljava/lang/Object;

    .line 43
    .line 44
    iget-object p1, v0, Lb6/o;->b:Ljava/lang/Object;

    .line 45
    .line 46
    check-cast p1, Ljava/util/HashMap;

    .line 47
    .line 48
    invoke-virtual {p1}, Ljava/util/HashMap;->clear()V

    .line 49
    .line 50
    .line 51
    iget-object p1, v0, Lb6/o;->d:Ljava/lang/Object;

    .line 52
    .line 53
    check-cast p1, Ljava/util/HashMap;

    .line 54
    .line 55
    invoke-virtual {p1}, Ljava/util/HashMap;->clear()V

    .line 56
    .line 57
    .line 58
    :cond_0
    const-wide p1, -0x7fffffffffffffffL    # -4.9E-324

    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    iput-wide p1, p0, LN3/m;->d:J

    .line 64
    .line 65
    iput-wide p1, p0, LN3/m;->e:J

    .line 66
    .line 67
    iput-wide p1, p0, LN3/m;->f:J

    .line 68
    .line 69
    const p1, -0x800001

    .line 70
    .line 71
    .line 72
    iput p1, p0, LN3/m;->g:F

    .line 73
    .line 74
    iput p1, p0, LN3/m;->h:F

    .line 75
    .line 76
    return-void
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
.end method

.method public static c(Ljava/lang/Class;Lk4/l;)LN3/z;
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x1

    .line 3
    :try_start_0
    new-array v2, v1, [Ljava/lang/Class;

    .line 4
    .line 5
    const-class v3, Lk4/l;

    .line 6
    .line 7
    aput-object v3, v2, v0

    .line 8
    .line 9
    invoke-virtual {p0, v2}, Ljava/lang/Class;->getConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    new-array v1, v1, [Ljava/lang/Object;

    .line 14
    .line 15
    aput-object p1, v1, v0

    .line 16
    .line 17
    invoke-virtual {p0, v1}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    check-cast p0, LN3/z;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 22
    .line 23
    return-object p0

    .line 24
    :catch_0
    move-exception p0

    .line 25
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 26
    .line 27
    invoke-direct {p1, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/Throwable;)V

    .line 28
    .line 29
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
.method public final bridge synthetic a(Le1/q;)LN3/z;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, LN3/m;->d(Le1/q;)V

    .line 2
    .line 3
    .line 4
    return-object p0
    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
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
.end method

.method public final b(Lj3/Y;)LN3/a;
    .locals 23

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    const/4 v2, 0x6

    .line 6
    const/4 v3, 0x4

    .line 7
    const/4 v4, -0x1

    .line 8
    const/4 v5, 0x0

    .line 9
    const/4 v6, 0x3

    .line 10
    const/4 v7, 0x2

    .line 11
    const/4 v8, 0x0

    .line 12
    const/4 v9, 0x1

    .line 13
    iget-object v10, v1, Lj3/Y;->b:Lj3/U;

    .line 14
    .line 15
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 16
    .line 17
    .line 18
    iget-object v10, v1, Lj3/Y;->b:Lj3/U;

    .line 19
    .line 20
    iget-object v11, v10, Lj3/U;->a:Landroid/net/Uri;

    .line 21
    .line 22
    invoke-virtual {v11}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v11

    .line 26
    if-eqz v11, :cond_1

    .line 27
    .line 28
    const-string v12, "ssai"

    .line 29
    .line 30
    invoke-virtual {v11, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 31
    .line 32
    .line 33
    move-result v11

    .line 34
    if-nez v11, :cond_0

    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_0
    throw v5

    .line 38
    :cond_1
    :goto_0
    iget-object v11, v10, Lj3/U;->b:Ljava/lang/String;

    .line 39
    .line 40
    if-nez v11, :cond_2

    .line 41
    .line 42
    iget-object v11, v10, Lj3/U;->a:Landroid/net/Uri;

    .line 43
    .line 44
    invoke-static {v11}, Ll4/y;->D(Landroid/net/Uri;)I

    .line 45
    .line 46
    .line 47
    move-result v11

    .line 48
    goto :goto_3

    .line 49
    :cond_2
    sget v12, Ll4/y;->a:I

    .line 50
    .line 51
    invoke-virtual {v11}, Ljava/lang/String;->hashCode()I

    .line 52
    .line 53
    .line 54
    move-result v12

    .line 55
    sparse-switch v12, :sswitch_data_0

    .line 56
    .line 57
    .line 58
    :goto_1
    move v11, v4

    .line 59
    goto :goto_2

    .line 60
    :sswitch_0
    const-string v12, "application/x-rtsp"

    .line 61
    .line 62
    invoke-virtual {v11, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 63
    .line 64
    .line 65
    move-result v11

    .line 66
    if-nez v11, :cond_3

    .line 67
    .line 68
    goto :goto_1

    .line 69
    :cond_3
    move v11, v6

    .line 70
    goto :goto_2

    .line 71
    :sswitch_1
    const-string v12, "application/dash+xml"

    .line 72
    .line 73
    invoke-virtual {v11, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 74
    .line 75
    .line 76
    move-result v11

    .line 77
    if-nez v11, :cond_4

    .line 78
    .line 79
    goto :goto_1

    .line 80
    :cond_4
    move v11, v7

    .line 81
    goto :goto_2

    .line 82
    :sswitch_2
    const-string v12, "application/vnd.ms-sstr+xml"

    .line 83
    .line 84
    invoke-virtual {v11, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 85
    .line 86
    .line 87
    move-result v11

    .line 88
    if-nez v11, :cond_5

    .line 89
    .line 90
    goto :goto_1

    .line 91
    :cond_5
    move v11, v9

    .line 92
    goto :goto_2

    .line 93
    :sswitch_3
    const-string v12, "application/x-mpegURL"

    .line 94
    .line 95
    invoke-virtual {v11, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 96
    .line 97
    .line 98
    move-result v11

    .line 99
    if-nez v11, :cond_6

    .line 100
    .line 101
    goto :goto_1

    .line 102
    :cond_6
    move v11, v8

    .line 103
    :goto_2
    packed-switch v11, :pswitch_data_0

    .line 104
    .line 105
    .line 106
    move v11, v3

    .line 107
    goto :goto_3

    .line 108
    :pswitch_0
    move v11, v6

    .line 109
    goto :goto_3

    .line 110
    :pswitch_1
    move v11, v8

    .line 111
    goto :goto_3

    .line 112
    :pswitch_2
    move v11, v9

    .line 113
    goto :goto_3

    .line 114
    :pswitch_3
    move v11, v7

    .line 115
    :goto_3
    iget-object v12, v0, LN3/m;->a:Lb6/o;

    .line 116
    .line 117
    iget-object v13, v12, Lb6/o;->d:Ljava/lang/Object;

    .line 118
    .line 119
    check-cast v13, Ljava/util/HashMap;

    .line 120
    .line 121
    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 122
    .line 123
    .line 124
    move-result-object v14

    .line 125
    invoke-virtual {v13, v14}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 126
    .line 127
    .line 128
    move-result-object v14

    .line 129
    check-cast v14, LN3/z;

    .line 130
    .line 131
    if-eqz v14, :cond_7

    .line 132
    .line 133
    goto/16 :goto_8

    .line 134
    .line 135
    :cond_7
    iget-object v14, v12, Lb6/o;->b:Ljava/lang/Object;

    .line 136
    .line 137
    check-cast v14, Ljava/util/HashMap;

    .line 138
    .line 139
    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 140
    .line 141
    .line 142
    move-result-object v15

    .line 143
    invoke-virtual {v14, v15}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    .line 144
    .line 145
    .line 146
    move-result v15

    .line 147
    if-eqz v15, :cond_8

    .line 148
    .line 149
    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 150
    .line 151
    .line 152
    move-result-object v3

    .line 153
    invoke-virtual {v14, v3}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 154
    .line 155
    .line 156
    move-result-object v3

    .line 157
    check-cast v3, LO5/n;

    .line 158
    .line 159
    goto :goto_7

    .line 160
    :cond_8
    iget-object v15, v12, Lb6/o;->e:Ljava/lang/Object;

    .line 161
    .line 162
    check-cast v15, Lk4/l;

    .line 163
    .line 164
    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 165
    .line 166
    .line 167
    const-class v5, LN3/z;

    .line 168
    .line 169
    if-eqz v11, :cond_d

    .line 170
    .line 171
    if-eq v11, v9, :cond_c

    .line 172
    .line 173
    if-eq v11, v7, :cond_b

    .line 174
    .line 175
    if-eq v11, v6, :cond_a

    .line 176
    .line 177
    if-eq v11, v3, :cond_9

    .line 178
    .line 179
    goto :goto_5

    .line 180
    :cond_9
    :try_start_0
    new-instance v3, LN3/k;

    .line 181
    .line 182
    invoke-direct {v3, v12, v15, v6}, LN3/k;-><init>(Ljava/lang/Object;Lk4/l;I)V

    .line 183
    .line 184
    .line 185
    goto :goto_6

    .line 186
    :cond_a
    const-class v3, Lcom/google/android/exoplayer2/source/rtsp/RtspMediaSource$Factory;

    .line 187
    .line 188
    invoke-virtual {v3, v5}, Ljava/lang/Class;->asSubclass(Ljava/lang/Class;)Ljava/lang/Class;

    .line 189
    .line 190
    .line 191
    move-result-object v3

    .line 192
    new-instance v5, LN3/l;

    .line 193
    .line 194
    invoke-direct {v5, v8, v3}, LN3/l;-><init>(ILjava/lang/Object;)V

    .line 195
    .line 196
    .line 197
    :goto_4
    move-object v3, v5

    .line 198
    goto :goto_6

    .line 199
    :cond_b
    const-class v3, Lcom/google/android/exoplayer2/source/hls/HlsMediaSource$Factory;

    .line 200
    .line 201
    invoke-virtual {v3, v5}, Ljava/lang/Class;->asSubclass(Ljava/lang/Class;)Ljava/lang/Class;

    .line 202
    .line 203
    .line 204
    move-result-object v3

    .line 205
    new-instance v5, LN3/k;

    .line 206
    .line 207
    invoke-direct {v5, v3, v15, v7}, LN3/k;-><init>(Ljava/lang/Object;Lk4/l;I)V

    .line 208
    .line 209
    .line 210
    goto :goto_4

    .line 211
    :cond_c
    const-class v3, Lcom/google/android/exoplayer2/source/smoothstreaming/SsMediaSource$Factory;

    .line 212
    .line 213
    invoke-virtual {v3, v5}, Ljava/lang/Class;->asSubclass(Ljava/lang/Class;)Ljava/lang/Class;

    .line 214
    .line 215
    .line 216
    move-result-object v3

    .line 217
    new-instance v5, LN3/k;

    .line 218
    .line 219
    invoke-direct {v5, v3, v15, v9}, LN3/k;-><init>(Ljava/lang/Object;Lk4/l;I)V

    .line 220
    .line 221
    .line 222
    goto :goto_4

    .line 223
    :cond_d
    const-class v3, Lcom/google/android/exoplayer2/source/dash/DashMediaSource$Factory;

    .line 224
    .line 225
    invoke-virtual {v3, v5}, Ljava/lang/Class;->asSubclass(Ljava/lang/Class;)Ljava/lang/Class;

    .line 226
    .line 227
    .line 228
    move-result-object v3

    .line 229
    new-instance v5, LN3/k;

    .line 230
    .line 231
    invoke-direct {v5, v3, v15, v8}, LN3/k;-><init>(Ljava/lang/Object;Lk4/l;I)V
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 232
    .line 233
    .line 234
    goto :goto_4

    .line 235
    :catch_0
    :goto_5
    const/4 v3, 0x0

    .line 236
    :goto_6
    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 237
    .line 238
    .line 239
    move-result-object v5

    .line 240
    invoke-virtual {v14, v5, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 241
    .line 242
    .line 243
    if-eqz v3, :cond_e

    .line 244
    .line 245
    iget-object v5, v12, Lb6/o;->c:Ljava/lang/Object;

    .line 246
    .line 247
    check-cast v5, Ljava/util/HashSet;

    .line 248
    .line 249
    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 250
    .line 251
    .line 252
    move-result-object v6

    .line 253
    invoke-virtual {v5, v6}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 254
    .line 255
    .line 256
    :cond_e
    :goto_7
    if-nez v3, :cond_f

    .line 257
    .line 258
    const/4 v14, 0x0

    .line 259
    goto :goto_8

    .line 260
    :cond_f
    invoke-interface {v3}, LO5/n;->get()Ljava/lang/Object;

    .line 261
    .line 262
    .line 263
    move-result-object v3

    .line 264
    move-object v14, v3

    .line 265
    check-cast v14, LN3/z;

    .line 266
    .line 267
    iget-object v3, v12, Lb6/o;->f:Ljava/lang/Object;

    .line 268
    .line 269
    check-cast v3, Le1/q;

    .line 270
    .line 271
    if-eqz v3, :cond_10

    .line 272
    .line 273
    invoke-interface {v14, v3}, LN3/z;->a(Le1/q;)LN3/z;

    .line 274
    .line 275
    .line 276
    :cond_10
    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 277
    .line 278
    .line 279
    move-result-object v3

    .line 280
    invoke-virtual {v13, v3, v14}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 281
    .line 282
    .line 283
    :goto_8
    new-instance v3, Ljava/lang/StringBuilder;

    .line 284
    .line 285
    const-string v5, "No suitable media source factory found for content type: "

    .line 286
    .line 287
    invoke-direct {v3, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 288
    .line 289
    .line 290
    invoke-virtual {v3, v11}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 291
    .line 292
    .line 293
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 294
    .line 295
    .line 296
    move-result-object v3

    .line 297
    invoke-static {v14, v3}, Ll4/a;->o(Ljava/lang/Object;Ljava/lang/String;)V

    .line 298
    .line 299
    .line 300
    iget-object v3, v1, Lj3/Y;->c:Lj3/T;

    .line 301
    .line 302
    invoke-virtual {v3}, Lj3/T;->a()LR3/t;

    .line 303
    .line 304
    .line 305
    move-result-object v5

    .line 306
    iget-wide v6, v3, Lj3/T;->a:J

    .line 307
    .line 308
    const-wide v11, -0x7fffffffffffffffL    # -4.9E-324

    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    cmp-long v6, v6, v11

    .line 314
    .line 315
    if-nez v6, :cond_11

    .line 316
    .line 317
    iget-wide v6, v0, LN3/m;->d:J

    .line 318
    .line 319
    iput-wide v6, v5, LR3/t;->a:J

    .line 320
    .line 321
    :cond_11
    iget v6, v3, Lj3/T;->d:F

    .line 322
    .line 323
    const v7, -0x800001

    .line 324
    .line 325
    .line 326
    cmpl-float v6, v6, v7

    .line 327
    .line 328
    if-nez v6, :cond_12

    .line 329
    .line 330
    iget v6, v0, LN3/m;->g:F

    .line 331
    .line 332
    iput v6, v5, LR3/t;->d:F

    .line 333
    .line 334
    :cond_12
    iget v6, v3, Lj3/T;->e:F

    .line 335
    .line 336
    cmpl-float v6, v6, v7

    .line 337
    .line 338
    if-nez v6, :cond_13

    .line 339
    .line 340
    iget v6, v0, LN3/m;->h:F

    .line 341
    .line 342
    iput v6, v5, LR3/t;->e:F

    .line 343
    .line 344
    :cond_13
    iget-wide v6, v3, Lj3/T;->b:J

    .line 345
    .line 346
    cmp-long v6, v6, v11

    .line 347
    .line 348
    if-nez v6, :cond_14

    .line 349
    .line 350
    iget-wide v6, v0, LN3/m;->e:J

    .line 351
    .line 352
    iput-wide v6, v5, LR3/t;->b:J

    .line 353
    .line 354
    :cond_14
    iget-wide v6, v3, Lj3/T;->c:J

    .line 355
    .line 356
    cmp-long v6, v6, v11

    .line 357
    .line 358
    if-nez v6, :cond_15

    .line 359
    .line 360
    iget-wide v6, v0, LN3/m;->f:J

    .line 361
    .line 362
    iput-wide v6, v5, LR3/t;->c:J

    .line 363
    .line 364
    :cond_15
    invoke-virtual {v5}, LR3/t;->a()Lj3/T;

    .line 365
    .line 366
    .line 367
    move-result-object v5

    .line 368
    invoke-virtual {v5, v3}, Lj3/T;->equals(Ljava/lang/Object;)Z

    .line 369
    .line 370
    .line 371
    move-result v6

    .line 372
    if-nez v6, :cond_1e

    .line 373
    .line 374
    new-instance v6, LY2/r;

    .line 375
    .line 376
    invoke-direct {v6, v2}, LY2/r;-><init>(I)V

    .line 377
    .line 378
    .line 379
    sget-object v7, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 380
    .line 381
    sget-object v11, LP5/S;->e:LP5/S;

    .line 382
    .line 383
    sget-object v12, Lj3/V;->c:Lj3/V;

    .line 384
    .line 385
    new-instance v12, Lj3/O;

    .line 386
    .line 387
    invoke-direct {v12}, Ljava/lang/Object;-><init>()V

    .line 388
    .line 389
    .line 390
    iget-object v13, v1, Lj3/Y;->e:Lj3/Q;

    .line 391
    .line 392
    move v15, v8

    .line 393
    move/from16 v16, v9

    .line 394
    .line 395
    iget-wide v8, v13, Lj3/P;->a:J

    .line 396
    .line 397
    iput-wide v8, v12, Lj3/O;->a:J

    .line 398
    .line 399
    iget-wide v8, v13, Lj3/P;->b:J

    .line 400
    .line 401
    iput-wide v8, v12, Lj3/O;->b:J

    .line 402
    .line 403
    iget-boolean v8, v13, Lj3/P;->c:Z

    .line 404
    .line 405
    iput-boolean v8, v12, Lj3/O;->c:Z

    .line 406
    .line 407
    iget-boolean v8, v13, Lj3/P;->d:Z

    .line 408
    .line 409
    iput-boolean v8, v12, Lj3/O;->d:Z

    .line 410
    .line 411
    iget-boolean v8, v13, Lj3/P;->e:Z

    .line 412
    .line 413
    iput-boolean v8, v12, Lj3/O;->e:Z

    .line 414
    .line 415
    invoke-virtual {v3}, Lj3/T;->a()LR3/t;

    .line 416
    .line 417
    .line 418
    if-eqz v10, :cond_17

    .line 419
    .line 420
    iget-object v3, v10, Lj3/U;->c:Lj3/S;

    .line 421
    .line 422
    if-eqz v3, :cond_16

    .line 423
    .line 424
    new-instance v2, LY2/r;

    .line 425
    .line 426
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 427
    .line 428
    .line 429
    iget-object v6, v3, Lj3/S;->a:Ljava/util/UUID;

    .line 430
    .line 431
    iput-object v6, v2, LY2/r;->a:Ljava/lang/Object;

    .line 432
    .line 433
    iget-object v6, v3, Lj3/S;->b:Landroid/net/Uri;

    .line 434
    .line 435
    iput-object v6, v2, LY2/r;->b:Ljava/lang/Object;

    .line 436
    .line 437
    iget-object v6, v3, Lj3/S;->c:LP5/X;

    .line 438
    .line 439
    iput-object v6, v2, LY2/r;->c:Ljava/lang/Object;

    .line 440
    .line 441
    iget-object v6, v3, Lj3/S;->d:LP5/S;

    .line 442
    .line 443
    iput-object v6, v2, LY2/r;->d:Ljava/lang/Object;

    .line 444
    .line 445
    iget-object v3, v3, Lj3/S;->e:[B

    .line 446
    .line 447
    iput-object v3, v2, LY2/r;->e:Ljava/lang/Object;

    .line 448
    .line 449
    move-object v6, v2

    .line 450
    goto :goto_9

    .line 451
    :cond_16
    new-instance v3, LY2/r;

    .line 452
    .line 453
    invoke-direct {v3, v2}, LY2/r;-><init>(I)V

    .line 454
    .line 455
    .line 456
    move-object v6, v3

    .line 457
    :goto_9
    iget-object v2, v10, Lj3/U;->b:Ljava/lang/String;

    .line 458
    .line 459
    iget-object v3, v10, Lj3/U;->a:Landroid/net/Uri;

    .line 460
    .line 461
    iget-object v7, v10, Lj3/U;->d:Ljava/util/List;

    .line 462
    .line 463
    iget-object v11, v10, Lj3/U;->e:LP5/F;

    .line 464
    .line 465
    move-object/from16 v19, v2

    .line 466
    .line 467
    move-object/from16 v18, v3

    .line 468
    .line 469
    :goto_a
    move-object/from16 v21, v7

    .line 470
    .line 471
    move-object/from16 v22, v11

    .line 472
    .line 473
    goto :goto_b

    .line 474
    :cond_17
    const/16 v18, 0x0

    .line 475
    .line 476
    const/16 v19, 0x0

    .line 477
    .line 478
    goto :goto_a

    .line 479
    :goto_b
    invoke-virtual {v5}, Lj3/T;->a()LR3/t;

    .line 480
    .line 481
    .line 482
    move-result-object v2

    .line 483
    iget-object v3, v6, LY2/r;->b:Ljava/lang/Object;

    .line 484
    .line 485
    check-cast v3, Landroid/net/Uri;

    .line 486
    .line 487
    if-eqz v3, :cond_19

    .line 488
    .line 489
    iget-object v3, v6, LY2/r;->a:Ljava/lang/Object;

    .line 490
    .line 491
    check-cast v3, Ljava/util/UUID;

    .line 492
    .line 493
    if-eqz v3, :cond_18

    .line 494
    .line 495
    goto :goto_c

    .line 496
    :cond_18
    move v3, v15

    .line 497
    goto :goto_d

    .line 498
    :cond_19
    :goto_c
    move/from16 v3, v16

    .line 499
    .line 500
    :goto_d
    invoke-static {v3}, Ll4/a;->m(Z)V

    .line 501
    .line 502
    .line 503
    if-eqz v18, :cond_1b

    .line 504
    .line 505
    new-instance v17, Lj3/U;

    .line 506
    .line 507
    iget-object v3, v6, LY2/r;->a:Ljava/lang/Object;

    .line 508
    .line 509
    check-cast v3, Ljava/util/UUID;

    .line 510
    .line 511
    if-eqz v3, :cond_1a

    .line 512
    .line 513
    new-instance v5, Lj3/S;

    .line 514
    .line 515
    invoke-direct {v5, v6}, Lj3/S;-><init>(LY2/r;)V

    .line 516
    .line 517
    .line 518
    move-object/from16 v20, v5

    .line 519
    .line 520
    goto :goto_e

    .line 521
    :cond_1a
    const/16 v20, 0x0

    .line 522
    .line 523
    :goto_e
    invoke-direct/range {v17 .. v22}, Lj3/U;-><init>(Landroid/net/Uri;Ljava/lang/String;Lj3/S;Ljava/util/List;LP5/F;)V

    .line 524
    .line 525
    .line 526
    move-object/from16 v8, v17

    .line 527
    .line 528
    goto :goto_f

    .line 529
    :cond_1b
    const/4 v8, 0x0

    .line 530
    :goto_f
    new-instance v5, Lj3/Y;

    .line 531
    .line 532
    iget-object v3, v1, Lj3/Y;->a:Ljava/lang/String;

    .line 533
    .line 534
    if-eqz v3, :cond_1c

    .line 535
    .line 536
    :goto_10
    move-object v6, v3

    .line 537
    goto :goto_11

    .line 538
    :cond_1c
    const-string v3, ""

    .line 539
    .line 540
    goto :goto_10

    .line 541
    :goto_11
    new-instance v7, Lj3/Q;

    .line 542
    .line 543
    invoke-direct {v7, v12}, Lj3/P;-><init>(Lj3/O;)V

    .line 544
    .line 545
    .line 546
    invoke-virtual {v2}, LR3/t;->a()Lj3/T;

    .line 547
    .line 548
    .line 549
    move-result-object v9

    .line 550
    iget-object v2, v1, Lj3/Y;->d:Lj3/b0;

    .line 551
    .line 552
    if-eqz v2, :cond_1d

    .line 553
    .line 554
    :goto_12
    move-object v10, v2

    .line 555
    goto :goto_13

    .line 556
    :cond_1d
    sget-object v2, Lj3/b0;->Z:Lj3/b0;

    .line 557
    .line 558
    goto :goto_12

    .line 559
    :goto_13
    iget-object v11, v1, Lj3/Y;->f:Lj3/V;

    .line 560
    .line 561
    invoke-direct/range {v5 .. v11}, Lj3/Y;-><init>(Ljava/lang/String;Lj3/Q;Lj3/U;Lj3/T;Lj3/b0;Lj3/V;)V

    .line 562
    .line 563
    .line 564
    move-object v1, v5

    .line 565
    goto :goto_14

    .line 566
    :cond_1e
    move v15, v8

    .line 567
    move/from16 v16, v9

    .line 568
    .line 569
    :goto_14
    invoke-interface {v14, v1}, LN3/z;->b(Lj3/Y;)LN3/a;

    .line 570
    .line 571
    .line 572
    move-result-object v2

    .line 573
    iget-object v3, v1, Lj3/Y;->b:Lj3/U;

    .line 574
    .line 575
    iget-object v3, v3, Lj3/U;->e:LP5/F;

    .line 576
    .line 577
    invoke-interface {v3}, Ljava/util/List;->isEmpty()Z

    .line 578
    .line 579
    .line 580
    move-result v5

    .line 581
    if-nez v5, :cond_21

    .line 582
    .line 583
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 584
    .line 585
    .line 586
    move-result v5

    .line 587
    add-int/lit8 v5, v5, 0x1

    .line 588
    .line 589
    new-array v5, v5, [LN3/a;

    .line 590
    .line 591
    aput-object v2, v5, v15

    .line 592
    .line 593
    move v8, v15

    .line 594
    :goto_15
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 595
    .line 596
    .line 597
    move-result v2

    .line 598
    if-ge v8, v2, :cond_20

    .line 599
    .line 600
    iget-object v2, v0, LN3/m;->b:Lk4/l;

    .line 601
    .line 602
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 603
    .line 604
    .line 605
    new-instance v6, Le1/q;

    .line 606
    .line 607
    invoke-direct {v6, v4}, Le1/q;-><init>(I)V

    .line 608
    .line 609
    .line 610
    iget-object v7, v0, LN3/m;->c:Le1/q;

    .line 611
    .line 612
    if-eqz v7, :cond_1f

    .line 613
    .line 614
    move-object v6, v7

    .line 615
    :cond_1f
    add-int/lit8 v7, v8, 0x1

    .line 616
    .line 617
    invoke-interface {v3, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 618
    .line 619
    .line 620
    move-result-object v8

    .line 621
    check-cast v8, Lj3/X;

    .line 622
    .line 623
    new-instance v9, LN3/l0;

    .line 624
    .line 625
    invoke-direct {v9, v8, v2, v6}, LN3/l0;-><init>(Lj3/X;Lk4/l;Le1/q;)V

    .line 626
    .line 627
    .line 628
    aput-object v9, v5, v7

    .line 629
    .line 630
    move v8, v7

    .line 631
    goto :goto_15

    .line 632
    :cond_20
    new-instance v2, LN3/N;

    .line 633
    .line 634
    invoke-direct {v2, v5}, LN3/N;-><init>([LN3/a;)V

    .line 635
    .line 636
    .line 637
    :cond_21
    move-object v7, v2

    .line 638
    iget-object v1, v1, Lj3/Y;->e:Lj3/Q;

    .line 639
    .line 640
    iget-wide v2, v1, Lj3/P;->a:J

    .line 641
    .line 642
    const-wide/16 v4, 0x0

    .line 643
    .line 644
    cmp-long v4, v2, v4

    .line 645
    .line 646
    iget-wide v5, v1, Lj3/P;->b:J

    .line 647
    .line 648
    if-nez v4, :cond_22

    .line 649
    .line 650
    const-wide/high16 v8, -0x8000000000000000L

    .line 651
    .line 652
    cmp-long v4, v5, v8

    .line 653
    .line 654
    if-nez v4, :cond_22

    .line 655
    .line 656
    iget-boolean v4, v1, Lj3/P;->d:Z

    .line 657
    .line 658
    if-nez v4, :cond_22

    .line 659
    .line 660
    return-object v7

    .line 661
    :cond_22
    move-wide v4, v5

    .line 662
    new-instance v6, LN3/g;

    .line 663
    .line 664
    invoke-static {v2, v3}, Ll4/y;->H(J)J

    .line 665
    .line 666
    .line 667
    move-result-wide v8

    .line 668
    invoke-static {v4, v5}, Ll4/y;->H(J)J

    .line 669
    .line 670
    .line 671
    move-result-wide v10

    .line 672
    iget-boolean v2, v1, Lj3/P;->e:Z

    .line 673
    .line 674
    xor-int/lit8 v12, v2, 0x1

    .line 675
    .line 676
    iget-boolean v13, v1, Lj3/P;->c:Z

    .line 677
    .line 678
    iget-boolean v14, v1, Lj3/P;->d:Z

    .line 679
    .line 680
    invoke-direct/range {v6 .. v14}, LN3/g;-><init>(LN3/a;JJZZZ)V

    .line 681
    .line 682
    .line 683
    return-object v6

    .line 684
    nop

    .line 685
    :sswitch_data_0
    .sparse-switch
        -0x3a5c4caa -> :sswitch_3
        -0x957ced0 -> :sswitch_2
        0x3d3887d -> :sswitch_1
        0x44d481f3 -> :sswitch_0
    .end sparse-switch

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
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
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

.method public final d(Le1/q;)V
    .locals 2

    .line 1
    const-string v0, "MediaSource.Factory#setLoadErrorHandlingPolicy no longer handles null by instantiating a new DefaultLoadErrorHandlingPolicy. Explicitly construct and pass an instance in order to retain the old behavior."

    .line 2
    .line 3
    invoke-static {p1, v0}, Ll4/a;->l(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, LN3/m;->c:Le1/q;

    .line 7
    .line 8
    iget-object v0, p0, LN3/m;->a:Lb6/o;

    .line 9
    .line 10
    iput-object p1, v0, Lb6/o;->f:Ljava/lang/Object;

    .line 11
    .line 12
    iget-object v0, v0, Lb6/o;->d:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v0, Ljava/util/HashMap;

    .line 15
    .line 16
    invoke-virtual {v0}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 25
    .line 26
    .line 27
    move-result v1

    .line 28
    if-eqz v1, :cond_0

    .line 29
    .line 30
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    check-cast v1, LN3/z;

    .line 35
    .line 36
    invoke-interface {v1, p1}, LN3/z;->a(Le1/q;)LN3/z;

    .line 37
    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_0
    return-void
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
