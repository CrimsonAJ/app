.class public final Lv4/j;
.super Lv4/s;
.source "SourceFile"


# instance fields
.field public final synthetic A:I

.field public final synthetic B:[I

.field public final synthetic C:Lv4/h;


# direct methods
.method public constructor <init>(Lv4/h;[II)V
    .locals 0

    .line 1
    iput p3, p0, Lv4/j;->A:I

    .line 2
    .line 3
    packed-switch p3, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iput-object p2, p0, Lv4/j;->B:[I

    .line 7
    .line 8
    iput-object p1, p0, Lv4/j;->C:Lv4/h;

    .line 9
    .line 10
    const/4 p2, 0x0

    .line 11
    invoke-direct {p0, p1, p2}, Lv4/s;-><init>(Lv4/h;Z)V

    .line 12
    .line 13
    .line 14
    return-void

    .line 15
    :pswitch_0
    iput-object p2, p0, Lv4/j;->B:[I

    .line 16
    .line 17
    iput-object p1, p0, Lv4/j;->C:Lv4/h;

    .line 18
    .line 19
    const/4 p2, 0x1

    .line 20
    invoke-direct {p0, p1, p2}, Lv4/s;-><init>(Lv4/h;Z)V

    .line 21
    .line 22
    .line 23
    return-void

    .line 24
    nop

    .line 25
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
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


# virtual methods
.method public final N()V
    .locals 10

    .line 1
    iget v0, p0, Lv4/j;->A:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lv4/j;->C:Lv4/h;

    .line 7
    .line 8
    iget-object v0, v0, Lv4/h;->c:Ly4/n;

    .line 9
    .line 10
    invoke-virtual {p0}, Lv4/s;->O()Ly4/o;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    iget-object v2, p0, Lv4/j;->B:[I

    .line 15
    .line 16
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    new-instance v3, Lorg/json/JSONObject;

    .line 20
    .line 21
    invoke-direct {v3}, Lorg/json/JSONObject;-><init>()V

    .line 22
    .line 23
    .line 24
    invoke-virtual {v0}, LX3/d;->n()J

    .line 25
    .line 26
    .line 27
    move-result-wide v4

    .line 28
    :try_start_0
    const-string v6, "requestId"

    .line 29
    .line 30
    invoke-virtual {v3, v6, v4, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    .line 31
    .line 32
    .line 33
    const-string v6, "type"

    .line 34
    .line 35
    const-string v7, "QUEUE_GET_ITEMS"

    .line 36
    .line 37
    invoke-virtual {v3, v6, v7}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 38
    .line 39
    .line 40
    const-string v6, "mediaSessionId"

    .line 41
    .line 42
    invoke-virtual {v0}, Ly4/n;->B()J

    .line 43
    .line 44
    .line 45
    move-result-wide v7

    .line 46
    invoke-virtual {v3, v6, v7, v8}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    .line 47
    .line 48
    .line 49
    new-instance v6, Lorg/json/JSONArray;

    .line 50
    .line 51
    invoke-direct {v6}, Lorg/json/JSONArray;-><init>()V

    .line 52
    .line 53
    .line 54
    array-length v7, v2

    .line 55
    const/4 v8, 0x0

    .line 56
    :goto_0
    if-ge v8, v7, :cond_0

    .line 57
    .line 58
    aget v9, v2, v8

    .line 59
    .line 60
    invoke-virtual {v6, v9}, Lorg/json/JSONArray;->put(I)Lorg/json/JSONArray;

    .line 61
    .line 62
    .line 63
    add-int/lit8 v8, v8, 0x1

    .line 64
    .line 65
    goto :goto_0

    .line 66
    :cond_0
    const-string v2, "itemIds"

    .line 67
    .line 68
    invoke-virtual {v3, v2, v6}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 69
    .line 70
    .line 71
    :catch_0
    invoke-virtual {v3}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    .line 72
    .line 73
    .line 74
    move-result-object v2

    .line 75
    invoke-virtual {v0, v4, v5, v2}, LX3/d;->o(JLjava/lang/String;)V

    .line 76
    .line 77
    .line 78
    iget-object v0, v0, Ly4/n;->v:Ly4/p;

    .line 79
    .line 80
    invoke-virtual {v0, v4, v5, v1}, Ly4/p;->a(JLy4/o;)V

    .line 81
    .line 82
    .line 83
    return-void

    .line 84
    :pswitch_0
    iget-object v0, p0, Lv4/j;->C:Lv4/h;

    .line 85
    .line 86
    iget-object v0, v0, Lv4/h;->c:Ly4/n;

    .line 87
    .line 88
    invoke-virtual {p0}, Lv4/s;->O()Ly4/o;

    .line 89
    .line 90
    .line 91
    move-result-object v1

    .line 92
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 93
    .line 94
    .line 95
    iget-object v2, p0, Lv4/j;->B:[I

    .line 96
    .line 97
    array-length v3, v2

    .line 98
    if-eqz v3, :cond_4

    .line 99
    .line 100
    new-instance v3, Lorg/json/JSONObject;

    .line 101
    .line 102
    invoke-direct {v3}, Lorg/json/JSONObject;-><init>()V

    .line 103
    .line 104
    .line 105
    invoke-virtual {v0}, LX3/d;->n()J

    .line 106
    .line 107
    .line 108
    move-result-wide v4

    .line 109
    :try_start_1
    const-string v6, "requestId"

    .line 110
    .line 111
    invoke-virtual {v3, v6, v4, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    .line 112
    .line 113
    .line 114
    const-string v6, "type"

    .line 115
    .line 116
    const-string v7, "QUEUE_REMOVE"

    .line 117
    .line 118
    invoke-virtual {v3, v6, v7}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 119
    .line 120
    .line 121
    const-string v6, "mediaSessionId"

    .line 122
    .line 123
    invoke-virtual {v0}, Ly4/n;->B()J

    .line 124
    .line 125
    .line 126
    move-result-wide v7

    .line 127
    invoke-virtual {v3, v6, v7, v8}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    .line 128
    .line 129
    .line 130
    new-instance v6, Lorg/json/JSONArray;

    .line 131
    .line 132
    invoke-direct {v6}, Lorg/json/JSONArray;-><init>()V

    .line 133
    .line 134
    .line 135
    const/4 v7, 0x0

    .line 136
    move v8, v7

    .line 137
    :goto_1
    array-length v9, v2

    .line 138
    if-ge v8, v9, :cond_1

    .line 139
    .line 140
    aget v9, v2, v8

    .line 141
    .line 142
    invoke-virtual {v6, v8, v9}, Lorg/json/JSONArray;->put(II)Lorg/json/JSONArray;

    .line 143
    .line 144
    .line 145
    add-int/lit8 v8, v8, 0x1

    .line 146
    .line 147
    goto :goto_1

    .line 148
    :cond_1
    const-string v2, "itemIds"

    .line 149
    .line 150
    invoke-virtual {v3, v2, v6}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 151
    .line 152
    .line 153
    iget v2, v0, Ly4/n;->i:I

    .line 154
    .line 155
    const/4 v6, -0x1

    .line 156
    if-eq v2, v6, :cond_2

    .line 157
    .line 158
    const/4 v7, 0x1

    .line 159
    :cond_2
    if-eqz v7, :cond_3

    .line 160
    .line 161
    const-string v6, "sequenceNumber"

    .line 162
    .line 163
    invoke-virtual {v3, v6, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;
    :try_end_1
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_1

    .line 164
    .line 165
    .line 166
    :catch_1
    :cond_3
    invoke-virtual {v3}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    .line 167
    .line 168
    .line 169
    move-result-object v2

    .line 170
    invoke-virtual {v0, v4, v5, v2}, LX3/d;->o(JLjava/lang/String;)V

    .line 171
    .line 172
    .line 173
    new-instance v2, Ly4/l;

    .line 174
    .line 175
    const/4 v3, 0x1

    .line 176
    invoke-direct {v2, v0, v1, v3}, Ly4/l;-><init>(Ly4/n;Ly4/o;I)V

    .line 177
    .line 178
    .line 179
    iget-object v0, v0, Ly4/n;->t:Ly4/p;

    .line 180
    .line 181
    invoke-virtual {v0, v4, v5, v2}, Ly4/p;->a(JLy4/o;)V

    .line 182
    .line 183
    .line 184
    return-void

    .line 185
    :cond_4
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 186
    .line 187
    const-string v1, "itemIdsToRemove must not be null or empty."

    .line 188
    .line 189
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 190
    .line 191
    .line 192
    throw v0

    .line 193
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
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
