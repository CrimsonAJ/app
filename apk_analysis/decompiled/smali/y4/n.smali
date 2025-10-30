.class public final Ly4/n;
.super LX3/d;
.source "SourceFile"


# static fields
.field public static final y:Ljava/lang/String;


# instance fields
.field public e:J

.field public f:Lt4/p;

.field public g:Ljava/lang/Long;

.field public h:Li/G;

.field public i:I

.field public final j:Ly4/p;

.field public final k:Ly4/p;

.field public final l:Ly4/p;

.field public final m:Ly4/p;

.field public final n:Ly4/p;

.field public final o:Ly4/p;

.field public final p:Ly4/p;

.field public final q:Ly4/p;

.field public final r:Ly4/p;

.field public final s:Ly4/p;

.field public final t:Ly4/p;

.field public final u:Ly4/p;

.field public final v:Ly4/p;

.field public final w:Ly4/p;

.field public final x:Ly4/p;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    sget-object v0, Ly4/a;->a:Ljava/util/regex/Pattern;

    .line 2
    .line 3
    const-string v0, "urn:x-cast:com.google.cast.media"

    .line 4
    .line 5
    sput-object v0, Ly4/n;->y:Ljava/lang/String;

    .line 6
    .line 7
    return-void
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
.end method

.method public constructor <init>()V
    .locals 22

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    sget-object v1, Ly4/n;->y:Ljava/lang/String;

    .line 4
    .line 5
    invoke-direct {v0, v1}, LX3/d;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    const/4 v1, -0x1

    .line 9
    iput v1, v0, Ly4/n;->i:I

    .line 10
    .line 11
    new-instance v1, Ly4/p;

    .line 12
    .line 13
    const-string v2, "load"

    .line 14
    .line 15
    const-wide/32 v3, 0x5265c00

    .line 16
    .line 17
    .line 18
    invoke-direct {v1, v3, v4, v2}, Ly4/p;-><init>(JLjava/lang/String;)V

    .line 19
    .line 20
    .line 21
    iput-object v1, v0, Ly4/n;->j:Ly4/p;

    .line 22
    .line 23
    new-instance v2, Ly4/p;

    .line 24
    .line 25
    const-string v5, "pause"

    .line 26
    .line 27
    invoke-direct {v2, v3, v4, v5}, Ly4/p;-><init>(JLjava/lang/String;)V

    .line 28
    .line 29
    .line 30
    iput-object v2, v0, Ly4/n;->k:Ly4/p;

    .line 31
    .line 32
    new-instance v5, Ly4/p;

    .line 33
    .line 34
    const-string v6, "play"

    .line 35
    .line 36
    invoke-direct {v5, v3, v4, v6}, Ly4/p;-><init>(JLjava/lang/String;)V

    .line 37
    .line 38
    .line 39
    iput-object v5, v0, Ly4/n;->l:Ly4/p;

    .line 40
    .line 41
    new-instance v6, Ly4/p;

    .line 42
    .line 43
    const-string v7, "stop"

    .line 44
    .line 45
    invoke-direct {v6, v3, v4, v7}, Ly4/p;-><init>(JLjava/lang/String;)V

    .line 46
    .line 47
    .line 48
    iput-object v6, v0, Ly4/n;->m:Ly4/p;

    .line 49
    .line 50
    new-instance v7, Ly4/p;

    .line 51
    .line 52
    const-wide/16 v8, 0x2710

    .line 53
    .line 54
    const-string v10, "seek"

    .line 55
    .line 56
    invoke-direct {v7, v8, v9, v10}, Ly4/p;-><init>(JLjava/lang/String;)V

    .line 57
    .line 58
    .line 59
    iput-object v7, v0, Ly4/n;->n:Ly4/p;

    .line 60
    .line 61
    new-instance v8, Ly4/p;

    .line 62
    .line 63
    const-string v9, "volume"

    .line 64
    .line 65
    invoke-direct {v8, v3, v4, v9}, Ly4/p;-><init>(JLjava/lang/String;)V

    .line 66
    .line 67
    .line 68
    iput-object v8, v0, Ly4/n;->o:Ly4/p;

    .line 69
    .line 70
    new-instance v9, Ly4/p;

    .line 71
    .line 72
    const-string v10, "mute"

    .line 73
    .line 74
    invoke-direct {v9, v3, v4, v10}, Ly4/p;-><init>(JLjava/lang/String;)V

    .line 75
    .line 76
    .line 77
    iput-object v9, v0, Ly4/n;->p:Ly4/p;

    .line 78
    .line 79
    new-instance v10, Ly4/p;

    .line 80
    .line 81
    const-string v11, "status"

    .line 82
    .line 83
    invoke-direct {v10, v3, v4, v11}, Ly4/p;-><init>(JLjava/lang/String;)V

    .line 84
    .line 85
    .line 86
    iput-object v10, v0, Ly4/n;->q:Ly4/p;

    .line 87
    .line 88
    new-instance v11, Ly4/p;

    .line 89
    .line 90
    const-string v12, "activeTracks"

    .line 91
    .line 92
    invoke-direct {v11, v3, v4, v12}, Ly4/p;-><init>(JLjava/lang/String;)V

    .line 93
    .line 94
    .line 95
    iput-object v11, v0, Ly4/n;->r:Ly4/p;

    .line 96
    .line 97
    new-instance v12, Ly4/p;

    .line 98
    .line 99
    const-string v13, "trackStyle"

    .line 100
    .line 101
    invoke-direct {v12, v3, v4, v13}, Ly4/p;-><init>(JLjava/lang/String;)V

    .line 102
    .line 103
    .line 104
    new-instance v13, Ly4/p;

    .line 105
    .line 106
    const-string v14, "queueInsert"

    .line 107
    .line 108
    invoke-direct {v13, v3, v4, v14}, Ly4/p;-><init>(JLjava/lang/String;)V

    .line 109
    .line 110
    .line 111
    new-instance v14, Ly4/p;

    .line 112
    .line 113
    const-string v15, "queueUpdate"

    .line 114
    .line 115
    invoke-direct {v14, v3, v4, v15}, Ly4/p;-><init>(JLjava/lang/String;)V

    .line 116
    .line 117
    .line 118
    iput-object v14, v0, Ly4/n;->s:Ly4/p;

    .line 119
    .line 120
    new-instance v15, Ly4/p;

    .line 121
    .line 122
    move-object/from16 v16, v14

    .line 123
    .line 124
    const-string v14, "queueRemove"

    .line 125
    .line 126
    invoke-direct {v15, v3, v4, v14}, Ly4/p;-><init>(JLjava/lang/String;)V

    .line 127
    .line 128
    .line 129
    iput-object v15, v0, Ly4/n;->t:Ly4/p;

    .line 130
    .line 131
    new-instance v14, Ly4/p;

    .line 132
    .line 133
    move-object/from16 v17, v15

    .line 134
    .line 135
    const-string v15, "queueReorder"

    .line 136
    .line 137
    invoke-direct {v14, v3, v4, v15}, Ly4/p;-><init>(JLjava/lang/String;)V

    .line 138
    .line 139
    .line 140
    new-instance v15, Ly4/p;

    .line 141
    .line 142
    move-object/from16 v18, v14

    .line 143
    .line 144
    const-string v14, "queueFetchItemIds"

    .line 145
    .line 146
    invoke-direct {v15, v3, v4, v14}, Ly4/p;-><init>(JLjava/lang/String;)V

    .line 147
    .line 148
    .line 149
    iput-object v15, v0, Ly4/n;->u:Ly4/p;

    .line 150
    .line 151
    new-instance v14, Ly4/p;

    .line 152
    .line 153
    move-object/from16 v19, v15

    .line 154
    .line 155
    const-string v15, "queueFetchItemRange"

    .line 156
    .line 157
    invoke-direct {v14, v3, v4, v15}, Ly4/p;-><init>(JLjava/lang/String;)V

    .line 158
    .line 159
    .line 160
    iput-object v14, v0, Ly4/n;->w:Ly4/p;

    .line 161
    .line 162
    new-instance v15, Ly4/p;

    .line 163
    .line 164
    move-object/from16 v20, v14

    .line 165
    .line 166
    const-string v14, "queueFetchItems"

    .line 167
    .line 168
    invoke-direct {v15, v3, v4, v14}, Ly4/p;-><init>(JLjava/lang/String;)V

    .line 169
    .line 170
    .line 171
    iput-object v15, v0, Ly4/n;->v:Ly4/p;

    .line 172
    .line 173
    new-instance v14, Ly4/p;

    .line 174
    .line 175
    const-string v15, "setPlaybackRate"

    .line 176
    .line 177
    invoke-direct {v14, v3, v4, v15}, Ly4/p;-><init>(JLjava/lang/String;)V

    .line 178
    .line 179
    .line 180
    iput-object v14, v0, Ly4/n;->x:Ly4/p;

    .line 181
    .line 182
    new-instance v15, Ly4/p;

    .line 183
    .line 184
    move-object/from16 v21, v14

    .line 185
    .line 186
    const-string v14, "skipAd"

    .line 187
    .line 188
    invoke-direct {v15, v3, v4, v14}, Ly4/p;-><init>(JLjava/lang/String;)V

    .line 189
    .line 190
    .line 191
    invoke-virtual {v0, v1}, LX3/d;->m(Ly4/p;)V

    .line 192
    .line 193
    .line 194
    invoke-virtual {v0, v2}, LX3/d;->m(Ly4/p;)V

    .line 195
    .line 196
    .line 197
    invoke-virtual {v0, v5}, LX3/d;->m(Ly4/p;)V

    .line 198
    .line 199
    .line 200
    invoke-virtual {v0, v6}, LX3/d;->m(Ly4/p;)V

    .line 201
    .line 202
    .line 203
    invoke-virtual {v0, v7}, LX3/d;->m(Ly4/p;)V

    .line 204
    .line 205
    .line 206
    invoke-virtual {v0, v8}, LX3/d;->m(Ly4/p;)V

    .line 207
    .line 208
    .line 209
    invoke-virtual {v0, v9}, LX3/d;->m(Ly4/p;)V

    .line 210
    .line 211
    .line 212
    invoke-virtual {v0, v10}, LX3/d;->m(Ly4/p;)V

    .line 213
    .line 214
    .line 215
    invoke-virtual {v0, v11}, LX3/d;->m(Ly4/p;)V

    .line 216
    .line 217
    .line 218
    invoke-virtual {v0, v12}, LX3/d;->m(Ly4/p;)V

    .line 219
    .line 220
    .line 221
    invoke-virtual {v0, v13}, LX3/d;->m(Ly4/p;)V

    .line 222
    .line 223
    .line 224
    move-object/from16 v1, v16

    .line 225
    .line 226
    invoke-virtual {v0, v1}, LX3/d;->m(Ly4/p;)V

    .line 227
    .line 228
    .line 229
    move-object/from16 v1, v17

    .line 230
    .line 231
    invoke-virtual {v0, v1}, LX3/d;->m(Ly4/p;)V

    .line 232
    .line 233
    .line 234
    move-object/from16 v1, v18

    .line 235
    .line 236
    invoke-virtual {v0, v1}, LX3/d;->m(Ly4/p;)V

    .line 237
    .line 238
    .line 239
    move-object/from16 v1, v19

    .line 240
    .line 241
    invoke-virtual {v0, v1}, LX3/d;->m(Ly4/p;)V

    .line 242
    .line 243
    .line 244
    move-object/from16 v1, v20

    .line 245
    .line 246
    invoke-virtual {v0, v1}, LX3/d;->m(Ly4/p;)V

    .line 247
    .line 248
    .line 249
    invoke-virtual {v0, v1}, LX3/d;->m(Ly4/p;)V

    .line 250
    .line 251
    .line 252
    move-object/from16 v1, v21

    .line 253
    .line 254
    invoke-virtual {v0, v1}, LX3/d;->m(Ly4/p;)V

    .line 255
    .line 256
    .line 257
    invoke-virtual {v0, v15}, LX3/d;->m(Ly4/p;)V

    .line 258
    .line 259
    .line 260
    invoke-virtual {v0}, Ly4/n;->s()V

    .line 261
    .line 262
    .line 263
    return-void
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
.end method

.method public static r(Lorg/json/JSONObject;)Ld0/w;
    .locals 3

    .line 1
    invoke-static {p0}, Lcom/google/android/gms/cast/MediaError;->f(Lorg/json/JSONObject;)Lcom/google/android/gms/cast/MediaError;

    .line 2
    .line 3
    .line 4
    new-instance v0, Ld0/w;

    .line 5
    .line 6
    const/16 v1, 0x10

    .line 7
    .line 8
    invoke-direct {v0, v1}, Ld0/w;-><init>(I)V

    .line 9
    .line 10
    .line 11
    sget-object v1, Ly4/a;->a:Ljava/util/regex/Pattern;

    .line 12
    .line 13
    const-string v1, "customData"

    .line 14
    .line 15
    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    .line 16
    .line 17
    .line 18
    move-result v2

    .line 19
    if-eqz v2, :cond_0

    .line 20
    .line 21
    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    .line 22
    .line 23
    .line 24
    :cond_0
    return-object v0
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

.method public static y(Lorg/json/JSONArray;)[I
    .locals 3

    .line 1
    if-nez p0, :cond_0

    .line 2
    .line 3
    const/4 p0, 0x0

    .line 4
    return-object p0

    .line 5
    :cond_0
    invoke-virtual {p0}, Lorg/json/JSONArray;->length()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    new-array v0, v0, [I

    .line 10
    .line 11
    const/4 v1, 0x0

    .line 12
    :goto_0
    invoke-virtual {p0}, Lorg/json/JSONArray;->length()I

    .line 13
    .line 14
    .line 15
    move-result v2

    .line 16
    if-ge v1, v2, :cond_1

    .line 17
    .line 18
    invoke-virtual {p0, v1}, Lorg/json/JSONArray;->getInt(I)I

    .line 19
    .line 20
    .line 21
    move-result v2

    .line 22
    aput v2, v0, v1

    .line 23
    .line 24
    add-int/lit8 v1, v1, 0x1

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_1
    return-object v0
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
.method public final A()J
    .locals 11

    .line 1
    iget-object v0, p0, Ly4/n;->f:Lt4/p;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    move-object v2, v1

    .line 7
    goto :goto_0

    .line 8
    :cond_0
    iget-object v2, v0, Lt4/p;->a:Lcom/google/android/gms/cast/MediaInfo;

    .line 9
    .line 10
    :goto_0
    const-wide/16 v3, 0x0

    .line 11
    .line 12
    if-eqz v2, :cond_10

    .line 13
    .line 14
    if-nez v0, :cond_1

    .line 15
    .line 16
    goto/16 :goto_7

    .line 17
    .line 18
    :cond_1
    iget-object v5, p0, Ly4/n;->g:Ljava/lang/Long;

    .line 19
    .line 20
    if-eqz v5, :cond_c

    .line 21
    .line 22
    const-wide v6, 0x3e800000000L

    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    invoke-virtual {v5, v0}, Ljava/lang/Long;->equals(Ljava/lang/Object;)Z

    .line 32
    .line 33
    .line 34
    move-result v0

    .line 35
    if-eqz v0, :cond_a

    .line 36
    .line 37
    iget-object v0, p0, Ly4/n;->f:Lt4/p;

    .line 38
    .line 39
    iget-object v2, v0, Lt4/p;->u:Lt4/j;

    .line 40
    .line 41
    if-eqz v2, :cond_5

    .line 42
    .line 43
    invoke-virtual {v5}, Ljava/lang/Long;->longValue()J

    .line 44
    .line 45
    .line 46
    move-result-wide v0

    .line 47
    iget-object v2, p0, Ly4/n;->f:Lt4/p;

    .line 48
    .line 49
    if-nez v2, :cond_2

    .line 50
    .line 51
    :goto_1
    move-object v6, p0

    .line 52
    goto :goto_2

    .line 53
    :cond_2
    iget-object v2, v2, Lt4/p;->u:Lt4/j;

    .line 54
    .line 55
    if-nez v2, :cond_3

    .line 56
    .line 57
    goto :goto_1

    .line 58
    :cond_3
    iget-boolean v3, v2, Lt4/j;->d:Z

    .line 59
    .line 60
    iget-wide v7, v2, Lt4/j;->b:J

    .line 61
    .line 62
    if-nez v3, :cond_4

    .line 63
    .line 64
    const-wide/high16 v5, 0x3ff0000000000000L    # 1.0

    .line 65
    .line 66
    const-wide/16 v9, -0x1

    .line 67
    .line 68
    move-object v4, p0

    .line 69
    invoke-virtual/range {v4 .. v10}, Ly4/n;->q(DJJ)J

    .line 70
    .line 71
    .line 72
    move-result-wide v2

    .line 73
    move-object v6, v4

    .line 74
    move-wide v3, v2

    .line 75
    goto :goto_2

    .line 76
    :cond_4
    move-object v6, p0

    .line 77
    move-wide v3, v7

    .line 78
    :goto_2
    invoke-static {v0, v1, v3, v4}, Ljava/lang/Math;->min(JJ)J

    .line 79
    .line 80
    .line 81
    move-result-wide v0

    .line 82
    return-wide v0

    .line 83
    :cond_5
    move-object v6, p0

    .line 84
    if-nez v0, :cond_6

    .line 85
    .line 86
    move-object v0, v1

    .line 87
    goto :goto_3

    .line 88
    :cond_6
    iget-object v0, v0, Lt4/p;->a:Lcom/google/android/gms/cast/MediaInfo;

    .line 89
    .line 90
    :goto_3
    if-eqz v0, :cond_7

    .line 91
    .line 92
    iget-wide v7, v0, Lcom/google/android/gms/cast/MediaInfo;->e:J

    .line 93
    .line 94
    goto :goto_4

    .line 95
    :cond_7
    move-wide v7, v3

    .line 96
    :goto_4
    cmp-long v0, v7, v3

    .line 97
    .line 98
    if-ltz v0, :cond_b

    .line 99
    .line 100
    invoke-virtual {v5}, Ljava/lang/Long;->longValue()J

    .line 101
    .line 102
    .line 103
    move-result-wide v7

    .line 104
    iget-object v0, v6, Ly4/n;->f:Lt4/p;

    .line 105
    .line 106
    if-nez v0, :cond_8

    .line 107
    .line 108
    goto :goto_5

    .line 109
    :cond_8
    iget-object v1, v0, Lt4/p;->a:Lcom/google/android/gms/cast/MediaInfo;

    .line 110
    .line 111
    :goto_5
    if-eqz v1, :cond_9

    .line 112
    .line 113
    iget-wide v3, v1, Lcom/google/android/gms/cast/MediaInfo;->e:J

    .line 114
    .line 115
    :cond_9
    invoke-static {v7, v8, v3, v4}, Ljava/lang/Math;->min(JJ)J

    .line 116
    .line 117
    .line 118
    move-result-wide v0

    .line 119
    return-wide v0

    .line 120
    :cond_a
    move-object v6, p0

    .line 121
    :cond_b
    invoke-virtual {v5}, Ljava/lang/Long;->longValue()J

    .line 122
    .line 123
    .line 124
    move-result-wide v0

    .line 125
    return-wide v0

    .line 126
    :cond_c
    move-object v6, p0

    .line 127
    iget-wide v7, v6, Ly4/n;->e:J

    .line 128
    .line 129
    cmp-long v1, v7, v3

    .line 130
    .line 131
    if-nez v1, :cond_d

    .line 132
    .line 133
    goto :goto_7

    .line 134
    :cond_d
    iget-wide v5, v0, Lt4/p;->d:D

    .line 135
    .line 136
    iget-wide v7, v0, Lt4/p;->g:J

    .line 137
    .line 138
    iget v0, v0, Lt4/p;->e:I

    .line 139
    .line 140
    const-wide/16 v3, 0x0

    .line 141
    .line 142
    cmpl-double v1, v5, v3

    .line 143
    .line 144
    if-eqz v1, :cond_f

    .line 145
    .line 146
    const/4 v1, 0x2

    .line 147
    if-eq v0, v1, :cond_e

    .line 148
    .line 149
    goto :goto_6

    .line 150
    :cond_e
    iget-wide v9, v2, Lcom/google/android/gms/cast/MediaInfo;->e:J

    .line 151
    .line 152
    move-object v4, p0

    .line 153
    invoke-virtual/range {v4 .. v10}, Ly4/n;->q(DJJ)J

    .line 154
    .line 155
    .line 156
    move-result-wide v0

    .line 157
    return-wide v0

    .line 158
    :cond_f
    :goto_6
    return-wide v7

    .line 159
    :cond_10
    :goto_7
    return-wide v3
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
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
.end method

.method public final B()J
    .locals 2

    .line 1
    iget-object v0, p0, Ly4/n;->f:Lt4/p;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-wide v0, v0, Lt4/p;->b:J

    .line 6
    .line 7
    return-wide v0

    .line 8
    :cond_0
    new-instance v0, Ly4/m;

    .line 9
    .line 10
    invoke-direct {v0}, Ljava/lang/Exception;-><init>()V

    .line 11
    .line 12
    .line 13
    throw v0
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
.end method

.method public final p(Ly4/o;IJILjava/lang/Integer;)V
    .locals 8

    .line 1
    const/4 v0, 0x1

    .line 2
    const-wide/16 v1, -0x1

    .line 3
    .line 4
    cmp-long v1, p3, v1

    .line 5
    .line 6
    if-eqz v1, :cond_1

    .line 7
    .line 8
    const-wide/16 v2, 0x0

    .line 9
    .line 10
    cmp-long v2, p3, v2

    .line 11
    .line 12
    if-ltz v2, :cond_0

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 16
    .line 17
    const-string p2, "playPosition cannot be negative: "

    .line 18
    .line 19
    invoke-static {p3, p4, p2}, Lcom/google/android/gms/internal/measurement/k1;->k(JLjava/lang/String;)Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object p2

    .line 23
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    throw p1

    .line 27
    :cond_1
    :goto_0
    new-instance v2, Lorg/json/JSONObject;

    .line 28
    .line 29
    invoke-direct {v2}, Lorg/json/JSONObject;-><init>()V

    .line 30
    .line 31
    .line 32
    invoke-virtual {p0}, LX3/d;->n()J

    .line 33
    .line 34
    .line 35
    move-result-wide v3

    .line 36
    :try_start_0
    const-string v5, "requestId"

    .line 37
    .line 38
    invoke-virtual {v2, v5, v3, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    .line 39
    .line 40
    .line 41
    const-string v5, "type"

    .line 42
    .line 43
    const-string v6, "QUEUE_UPDATE"

    .line 44
    .line 45
    invoke-virtual {v2, v5, v6}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 46
    .line 47
    .line 48
    const-string v5, "mediaSessionId"

    .line 49
    .line 50
    invoke-virtual {p0}, Ly4/n;->B()J

    .line 51
    .line 52
    .line 53
    move-result-wide v6

    .line 54
    invoke-virtual {v2, v5, v6, v7}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    .line 55
    .line 56
    .line 57
    if-eqz p2, :cond_2

    .line 58
    .line 59
    const-string v5, "currentItemId"

    .line 60
    .line 61
    invoke-virtual {v2, v5, p2}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 62
    .line 63
    .line 64
    :cond_2
    if-eqz p5, :cond_3

    .line 65
    .line 66
    const-string p2, "jump"

    .line 67
    .line 68
    invoke-virtual {v2, p2, p5}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 69
    .line 70
    .line 71
    :cond_3
    invoke-static {p6}, Lcom/google/android/gms/internal/measurement/u1;->k0(Ljava/lang/Integer;)Ljava/lang/String;

    .line 72
    .line 73
    .line 74
    move-result-object p2

    .line 75
    if-eqz p2, :cond_4

    .line 76
    .line 77
    const-string p5, "repeatMode"

    .line 78
    .line 79
    invoke-virtual {v2, p5, p2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 80
    .line 81
    .line 82
    :cond_4
    if-eqz v1, :cond_5

    .line 83
    .line 84
    const-string p2, "currentTime"

    .line 85
    .line 86
    sget-object p5, Ly4/a;->a:Ljava/util/regex/Pattern;

    .line 87
    .line 88
    long-to-double p3, p3

    .line 89
    const-wide p5, 0x408f400000000000L    # 1000.0

    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    div-double/2addr p3, p5

    .line 95
    invoke-virtual {v2, p2, p3, p4}, Lorg/json/JSONObject;->put(Ljava/lang/String;D)Lorg/json/JSONObject;

    .line 96
    .line 97
    .line 98
    :cond_5
    iget p2, p0, Ly4/n;->i:I

    .line 99
    .line 100
    const/4 p3, -0x1

    .line 101
    if-eq p2, p3, :cond_6

    .line 102
    .line 103
    move p3, v0

    .line 104
    goto :goto_1

    .line 105
    :cond_6
    const/4 p3, 0x0

    .line 106
    :goto_1
    if-eqz p3, :cond_7

    .line 107
    .line 108
    const-string p3, "sequenceNumber"

    .line 109
    .line 110
    invoke-virtual {v2, p3, p2}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 111
    .line 112
    .line 113
    :catch_0
    :cond_7
    invoke-virtual {v2}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    .line 114
    .line 115
    .line 116
    move-result-object p2

    .line 117
    invoke-virtual {p0, v3, v4, p2}, LX3/d;->o(JLjava/lang/String;)V

    .line 118
    .line 119
    .line 120
    new-instance p2, Ly4/l;

    .line 121
    .line 122
    invoke-direct {p2, p0, p1, v0}, Ly4/l;-><init>(Ly4/n;Ly4/o;I)V

    .line 123
    .line 124
    .line 125
    iget-object p1, p0, Ly4/n;->s:Ly4/p;

    .line 126
    .line 127
    invoke-virtual {p1, v3, v4, p2}, Ly4/p;->a(JLy4/o;)V

    .line 128
    .line 129
    .line 130
    return-void
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
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    .line 487
    .line 488
    .line 489
    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    .line 510
    .line 511
    .line 512
    .line 513
    .line 514
    .line 515
    .line 516
    .line 517
    .line 518
    .line 519
    .line 520
    .line 521
    .line 522
    .line 523
    .line 524
    .line 525
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
.end method

.method public final q(DJJ)J
    .locals 5

    .line 1
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    iget-wide v2, p0, Ly4/n;->e:J

    .line 6
    .line 7
    sub-long/2addr v0, v2

    .line 8
    const-wide/16 v2, 0x0

    .line 9
    .line 10
    cmp-long v4, v0, v2

    .line 11
    .line 12
    if-gez v4, :cond_0

    .line 13
    .line 14
    move-wide v0, v2

    .line 15
    :cond_0
    cmp-long v4, v0, v2

    .line 16
    .line 17
    if-nez v4, :cond_1

    .line 18
    .line 19
    return-wide p3

    .line 20
    :cond_1
    long-to-double v0, v0

    .line 21
    mul-double/2addr v0, p1

    .line 22
    double-to-long p1, v0

    .line 23
    add-long/2addr p3, p1

    .line 24
    cmp-long p1, p5, v2

    .line 25
    .line 26
    if-lez p1, :cond_2

    .line 27
    .line 28
    cmp-long p1, p3, p5

    .line 29
    .line 30
    if-lez p1, :cond_2

    .line 31
    .line 32
    return-wide p5

    .line 33
    :cond_2
    cmp-long p1, p3, v2

    .line 34
    .line 35
    if-ltz p1, :cond_3

    .line 36
    .line 37
    return-wide p3

    .line 38
    :cond_3
    return-wide v2
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
.end method

.method public final s()V
    .locals 3

    .line 1
    const-wide/16 v0, 0x0

    .line 2
    .line 3
    iput-wide v0, p0, Ly4/n;->e:J

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    iput-object v0, p0, Ly4/n;->f:Lt4/p;

    .line 7
    .line 8
    iget-object v0, p0, LX3/d;->d:Ljava/util/List;

    .line 9
    .line 10
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

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
    if-eqz v1, :cond_0

    .line 19
    .line 20
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    check-cast v1, Ly4/p;

    .line 25
    .line 26
    const/16 v2, 0x7d2

    .line 27
    .line 28
    invoke-virtual {v1, v2}, Ly4/p;->f(I)Z

    .line 29
    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_0
    return-void
.end method

.method public final t(Lorg/json/JSONObject;Ljava/lang/String;)V
    .locals 2

    .line 1
    const-string v0, "sequenceNumber"

    .line 2
    .line 3
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    const/4 p2, -0x1

    .line 10
    invoke-virtual {p1, v0, p2}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    .line 11
    .line 12
    .line 13
    move-result p1

    .line 14
    iput p1, p0, Ly4/n;->i:I

    .line 15
    .line 16
    return-void

    .line 17
    :cond_0
    const-string p1, " message is missing a sequence number."

    .line 18
    .line 19
    invoke-virtual {p2, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    const/4 p2, 0x0

    .line 24
    new-array p2, p2, [Ljava/lang/Object;

    .line 25
    .line 26
    iget-object v0, p0, LX3/d;->b:Ljava/lang/Object;

    .line 27
    .line 28
    check-cast v0, Ly4/b;

    .line 29
    .line 30
    iget-object v1, v0, Ly4/b;->a:Ljava/lang/String;

    .line 31
    .line 32
    invoke-virtual {v0, p1, p2}, Ly4/b;->d(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    invoke-static {v1, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 37
    .line 38
    .line 39
    return-void
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

.method public final u()V
    .locals 3

    .line 1
    iget-object v0, p0, Ly4/n;->h:Li/G;

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    iget-object v0, v0, Li/G;->b:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v0, Lv4/h;

    .line 8
    .line 9
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    iget-object v1, v0, Lv4/h;->g:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 13
    .line 14
    invoke-virtual {v1}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 19
    .line 20
    .line 21
    move-result v2

    .line 22
    if-nez v2, :cond_0

    .line 23
    .line 24
    iget-object v0, v0, Lv4/h;->h:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 25
    .line 26
    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 31
    .line 32
    .line 33
    move-result v1

    .line 34
    if-eqz v1, :cond_1

    .line 35
    .line 36
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    check-cast v1, Lv4/g;

    .line 41
    .line 42
    invoke-virtual {v1}, Lv4/g;->c()V

    .line 43
    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_0
    invoke-static {v1}, LA0/a;->h(Ljava/util/Iterator;)Ljava/lang/ClassCastException;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    throw v0

    .line 51
    :cond_1
    return-void
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

.method public final v()V
    .locals 3

    .line 1
    iget-object v0, p0, Ly4/n;->h:Li/G;

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    iget-object v0, v0, Li/G;->b:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v0, Lv4/h;

    .line 8
    .line 9
    iget-object v1, v0, Lv4/h;->g:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 10
    .line 11
    invoke-virtual {v1}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 16
    .line 17
    .line 18
    move-result v2

    .line 19
    if-nez v2, :cond_0

    .line 20
    .line 21
    iget-object v0, v0, Lv4/h;->h:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 22
    .line 23
    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 28
    .line 29
    .line 30
    move-result v1

    .line 31
    if-eqz v1, :cond_1

    .line 32
    .line 33
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    check-cast v1, Lv4/g;

    .line 38
    .line 39
    invoke-virtual {v1}, Lv4/g;->l()V

    .line 40
    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_0
    invoke-static {v1}, LA0/a;->h(Ljava/util/Iterator;)Ljava/lang/ClassCastException;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    throw v0

    .line 48
    :cond_1
    return-void
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

.method public final w()V
    .locals 3

    .line 1
    iget-object v0, p0, Ly4/n;->h:Li/G;

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    iget-object v0, v0, Li/G;->b:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v0, Lv4/h;

    .line 8
    .line 9
    iget-object v1, v0, Lv4/h;->g:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 10
    .line 11
    invoke-virtual {v1}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 16
    .line 17
    .line 18
    move-result v2

    .line 19
    if-nez v2, :cond_0

    .line 20
    .line 21
    iget-object v0, v0, Lv4/h;->h:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 22
    .line 23
    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 28
    .line 29
    .line 30
    move-result v1

    .line 31
    if-eqz v1, :cond_1

    .line 32
    .line 33
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    check-cast v1, Lv4/g;

    .line 38
    .line 39
    invoke-virtual {v1}, Lv4/g;->m()V

    .line 40
    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_0
    invoke-static {v1}, LA0/a;->h(Ljava/util/Iterator;)Ljava/lang/ClassCastException;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    throw v0

    .line 48
    :cond_1
    return-void
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

.method public final x()V
    .locals 8

    .line 1
    iget-object v0, p0, Ly4/n;->h:Li/G;

    .line 2
    .line 3
    if-eqz v0, :cond_6

    .line 4
    .line 5
    iget-object v0, v0, Li/G;->b:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v0, Lv4/h;

    .line 8
    .line 9
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    iget-object v1, v0, Lv4/h;->j:Ljava/util/concurrent/ConcurrentHashMap;

    .line 13
    .line 14
    invoke-virtual {v1}, Ljava/util/concurrent/ConcurrentHashMap;->values()Ljava/util/Collection;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    invoke-interface {v1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 23
    .line 24
    .line 25
    move-result v2

    .line 26
    if-eqz v2, :cond_4

    .line 27
    .line 28
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v2

    .line 32
    check-cast v2, Lv4/u;

    .line 33
    .line 34
    invoke-virtual {v0}, Lv4/h;->g()Z

    .line 35
    .line 36
    .line 37
    move-result v3

    .line 38
    if-eqz v3, :cond_1

    .line 39
    .line 40
    iget-boolean v3, v2, Lv4/u;->d:Z

    .line 41
    .line 42
    if-nez v3, :cond_1

    .line 43
    .line 44
    iget-object v3, v2, Lv4/u;->e:Lv4/h;

    .line 45
    .line 46
    iget-object v4, v3, Lv4/h;->b:LT4/d;

    .line 47
    .line 48
    iget-object v5, v2, Lv4/u;->c:Lv4/t;

    .line 49
    .line 50
    invoke-virtual {v4, v5}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 51
    .line 52
    .line 53
    const/4 v4, 0x1

    .line 54
    iput-boolean v4, v2, Lv4/u;->d:Z

    .line 55
    .line 56
    iget-wide v6, v2, Lv4/u;->b:J

    .line 57
    .line 58
    iget-object v3, v3, Lv4/h;->b:LT4/d;

    .line 59
    .line 60
    invoke-virtual {v3, v5, v6, v7}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 61
    .line 62
    .line 63
    goto :goto_1

    .line 64
    :cond_1
    invoke-virtual {v0}, Lv4/h;->g()Z

    .line 65
    .line 66
    .line 67
    move-result v3

    .line 68
    if-nez v3, :cond_2

    .line 69
    .line 70
    iget-boolean v3, v2, Lv4/u;->d:Z

    .line 71
    .line 72
    if-eqz v3, :cond_2

    .line 73
    .line 74
    iget-object v3, v2, Lv4/u;->e:Lv4/h;

    .line 75
    .line 76
    iget-object v3, v3, Lv4/h;->b:LT4/d;

    .line 77
    .line 78
    iget-object v4, v2, Lv4/u;->c:Lv4/t;

    .line 79
    .line 80
    invoke-virtual {v3, v4}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 81
    .line 82
    .line 83
    const/4 v3, 0x0

    .line 84
    iput-boolean v3, v2, Lv4/u;->d:Z

    .line 85
    .line 86
    :cond_2
    :goto_1
    iget-boolean v3, v2, Lv4/u;->d:Z

    .line 87
    .line 88
    if-eqz v3, :cond_0

    .line 89
    .line 90
    invoke-virtual {v0}, Lv4/h;->h()Z

    .line 91
    .line 92
    .line 93
    move-result v3

    .line 94
    if-nez v3, :cond_3

    .line 95
    .line 96
    invoke-virtual {v0}, Lv4/h;->u()Z

    .line 97
    .line 98
    .line 99
    move-result v3

    .line 100
    if-nez v3, :cond_3

    .line 101
    .line 102
    invoke-virtual {v0}, Lv4/h;->k()Z

    .line 103
    .line 104
    .line 105
    move-result v3

    .line 106
    if-nez v3, :cond_3

    .line 107
    .line 108
    invoke-virtual {v0}, Lv4/h;->j()Z

    .line 109
    .line 110
    .line 111
    move-result v3

    .line 112
    if-eqz v3, :cond_0

    .line 113
    .line 114
    :cond_3
    iget-object v2, v2, Lv4/u;->a:Ljava/util/HashSet;

    .line 115
    .line 116
    invoke-virtual {v0, v2}, Lv4/h;->v(Ljava/util/HashSet;)V

    .line 117
    .line 118
    .line 119
    goto :goto_0

    .line 120
    :cond_4
    iget-object v1, v0, Lv4/h;->g:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 121
    .line 122
    invoke-virtual {v1}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    .line 123
    .line 124
    .line 125
    move-result-object v1

    .line 126
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 127
    .line 128
    .line 129
    move-result v2

    .line 130
    if-nez v2, :cond_5

    .line 131
    .line 132
    iget-object v0, v0, Lv4/h;->h:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 133
    .line 134
    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    .line 135
    .line 136
    .line 137
    move-result-object v0

    .line 138
    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 139
    .line 140
    .line 141
    move-result v1

    .line 142
    if-eqz v1, :cond_6

    .line 143
    .line 144
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 145
    .line 146
    .line 147
    move-result-object v1

    .line 148
    check-cast v1, Lv4/g;

    .line 149
    .line 150
    invoke-virtual {v1}, Lv4/g;->n()V

    .line 151
    .line 152
    .line 153
    goto :goto_2

    .line 154
    :cond_5
    invoke-static {v1}, LA0/a;->h(Ljava/util/Iterator;)Ljava/lang/ClassCastException;

    .line 155
    .line 156
    .line 157
    move-result-object v0

    .line 158
    throw v0

    .line 159
    :cond_6
    return-void
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
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
.end method

.method public final z()V
    .locals 4

    .line 1
    iget-object v0, p0, LX3/d;->d:Ljava/util/List;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 5
    .line 6
    .line 7
    move-result-object v1

    .line 8
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 9
    .line 10
    .line 11
    move-result v2

    .line 12
    if-eqz v2, :cond_0

    .line 13
    .line 14
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v2

    .line 18
    check-cast v2, Ly4/p;

    .line 19
    .line 20
    const/16 v3, 0x7d2

    .line 21
    .line 22
    invoke-virtual {v2, v3}, Ly4/p;->f(I)Z

    .line 23
    .line 24
    .line 25
    goto :goto_0

    .line 26
    :catchall_0
    move-exception v1

    .line 27
    goto :goto_1

    .line 28
    :cond_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 29
    invoke-virtual {p0}, Ly4/n;->s()V

    .line 30
    .line 31
    .line 32
    return-void

    .line 33
    :goto_1
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 34
    throw v1
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
