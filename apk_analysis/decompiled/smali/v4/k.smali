.class public final Lv4/k;
.super Lv4/s;
.source "SourceFile"


# instance fields
.field public final synthetic A:I

.field public final synthetic B:Lv4/h;


# direct methods
.method public constructor <init>(Lv4/h;)V
    .locals 1

    const/4 v0, 0x2

    iput v0, p0, Lv4/k;->A:I

    .line 2
    iput-object p1, p0, Lv4/k;->B:Lv4/h;

    const/4 v0, 0x1

    invoke-direct {p0, p1, v0}, Lv4/s;-><init>(Lv4/h;Z)V

    return-void
.end method

.method public synthetic constructor <init>(Lv4/h;I)V
    .locals 0

    .line 1
    iput p2, p0, Lv4/k;->A:I

    iput-object p1, p0, Lv4/k;->B:Lv4/h;

    const/4 p2, 0x0

    invoke-direct {p0, p1, p2}, Lv4/s;-><init>(Lv4/h;Z)V

    return-void
.end method


# virtual methods
.method public final N()V
    .locals 9

    .line 1
    iget v0, p0, Lv4/k;->A:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lv4/k;->B:Lv4/h;

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
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    new-instance v2, Lorg/json/JSONObject;

    .line 18
    .line 19
    invoke-direct {v2}, Lorg/json/JSONObject;-><init>()V

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0}, LX3/d;->n()J

    .line 23
    .line 24
    .line 25
    move-result-wide v3

    .line 26
    :try_start_0
    const-string v5, "requestId"

    .line 27
    .line 28
    invoke-virtual {v2, v5, v3, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    .line 29
    .line 30
    .line 31
    const-string v5, "type"

    .line 32
    .line 33
    const-string v6, "GET_STATUS"

    .line 34
    .line 35
    invoke-virtual {v2, v5, v6}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 36
    .line 37
    .line 38
    iget-object v5, v0, Ly4/n;->f:Lt4/p;

    .line 39
    .line 40
    if-eqz v5, :cond_0

    .line 41
    .line 42
    const-string v6, "mediaSessionId"

    .line 43
    .line 44
    iget-wide v7, v5, Lt4/p;->b:J

    .line 45
    .line 46
    invoke-virtual {v2, v6, v7, v8}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 47
    .line 48
    .line 49
    :catch_0
    :cond_0
    invoke-virtual {v2}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object v2

    .line 53
    invoke-virtual {v0, v3, v4, v2}, LX3/d;->o(JLjava/lang/String;)V

    .line 54
    .line 55
    .line 56
    iget-object v0, v0, Ly4/n;->q:Ly4/p;

    .line 57
    .line 58
    invoke-virtual {v0, v3, v4, v1}, Ly4/p;->a(JLy4/o;)V

    .line 59
    .line 60
    .line 61
    return-void

    .line 62
    :pswitch_0
    iget-object v0, p0, Lv4/k;->B:Lv4/h;

    .line 63
    .line 64
    iget-object v0, v0, Lv4/h;->c:Ly4/n;

    .line 65
    .line 66
    invoke-virtual {p0}, Lv4/s;->O()Ly4/o;

    .line 67
    .line 68
    .line 69
    move-result-object v1

    .line 70
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 71
    .line 72
    .line 73
    new-instance v2, Lorg/json/JSONObject;

    .line 74
    .line 75
    invoke-direct {v2}, Lorg/json/JSONObject;-><init>()V

    .line 76
    .line 77
    .line 78
    invoke-virtual {v0}, LX3/d;->n()J

    .line 79
    .line 80
    .line 81
    move-result-wide v3

    .line 82
    :try_start_1
    const-string v5, "requestId"

    .line 83
    .line 84
    invoke-virtual {v2, v5, v3, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    .line 85
    .line 86
    .line 87
    const-string v5, "type"

    .line 88
    .line 89
    const-string v6, "PLAY"

    .line 90
    .line 91
    invoke-virtual {v2, v5, v6}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 92
    .line 93
    .line 94
    const-string v5, "mediaSessionId"

    .line 95
    .line 96
    invoke-virtual {v0}, Ly4/n;->B()J

    .line 97
    .line 98
    .line 99
    move-result-wide v6

    .line 100
    invoke-virtual {v2, v5, v6, v7}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;
    :try_end_1
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_1

    .line 101
    .line 102
    .line 103
    :catch_1
    invoke-virtual {v2}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    .line 104
    .line 105
    .line 106
    move-result-object v2

    .line 107
    invoke-virtual {v0, v3, v4, v2}, LX3/d;->o(JLjava/lang/String;)V

    .line 108
    .line 109
    .line 110
    iget-object v0, v0, Ly4/n;->l:Ly4/p;

    .line 111
    .line 112
    invoke-virtual {v0, v3, v4, v1}, Ly4/p;->a(JLy4/o;)V

    .line 113
    .line 114
    .line 115
    return-void

    .line 116
    :pswitch_1
    iget-object v0, p0, Lv4/k;->B:Lv4/h;

    .line 117
    .line 118
    iget-object v0, v0, Lv4/h;->c:Ly4/n;

    .line 119
    .line 120
    invoke-virtual {p0}, Lv4/s;->O()Ly4/o;

    .line 121
    .line 122
    .line 123
    move-result-object v1

    .line 124
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 125
    .line 126
    .line 127
    new-instance v2, Lorg/json/JSONObject;

    .line 128
    .line 129
    invoke-direct {v2}, Lorg/json/JSONObject;-><init>()V

    .line 130
    .line 131
    .line 132
    invoke-virtual {v0}, LX3/d;->n()J

    .line 133
    .line 134
    .line 135
    move-result-wide v3

    .line 136
    :try_start_2
    const-string v5, "requestId"

    .line 137
    .line 138
    invoke-virtual {v2, v5, v3, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    .line 139
    .line 140
    .line 141
    const-string v5, "type"

    .line 142
    .line 143
    const-string v6, "STOP"

    .line 144
    .line 145
    invoke-virtual {v2, v5, v6}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 146
    .line 147
    .line 148
    const-string v5, "mediaSessionId"

    .line 149
    .line 150
    invoke-virtual {v0}, Ly4/n;->B()J

    .line 151
    .line 152
    .line 153
    move-result-wide v6

    .line 154
    invoke-virtual {v2, v5, v6, v7}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;
    :try_end_2
    .catch Lorg/json/JSONException; {:try_start_2 .. :try_end_2} :catch_2

    .line 155
    .line 156
    .line 157
    :catch_2
    invoke-virtual {v2}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    .line 158
    .line 159
    .line 160
    move-result-object v2

    .line 161
    invoke-virtual {v0, v3, v4, v2}, LX3/d;->o(JLjava/lang/String;)V

    .line 162
    .line 163
    .line 164
    iget-object v0, v0, Ly4/n;->m:Ly4/p;

    .line 165
    .line 166
    invoke-virtual {v0, v3, v4, v1}, Ly4/p;->a(JLy4/o;)V

    .line 167
    .line 168
    .line 169
    return-void

    .line 170
    :pswitch_2
    iget-object v0, p0, Lv4/k;->B:Lv4/h;

    .line 171
    .line 172
    iget-object v0, v0, Lv4/h;->c:Ly4/n;

    .line 173
    .line 174
    invoke-virtual {p0}, Lv4/s;->O()Ly4/o;

    .line 175
    .line 176
    .line 177
    move-result-object v1

    .line 178
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 179
    .line 180
    .line 181
    new-instance v2, Lorg/json/JSONObject;

    .line 182
    .line 183
    invoke-direct {v2}, Lorg/json/JSONObject;-><init>()V

    .line 184
    .line 185
    .line 186
    invoke-virtual {v0}, LX3/d;->n()J

    .line 187
    .line 188
    .line 189
    move-result-wide v3

    .line 190
    :try_start_3
    const-string v5, "requestId"

    .line 191
    .line 192
    invoke-virtual {v2, v5, v3, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    .line 193
    .line 194
    .line 195
    const-string v5, "type"

    .line 196
    .line 197
    const-string v6, "PAUSE"

    .line 198
    .line 199
    invoke-virtual {v2, v5, v6}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 200
    .line 201
    .line 202
    const-string v5, "mediaSessionId"

    .line 203
    .line 204
    invoke-virtual {v0}, Ly4/n;->B()J

    .line 205
    .line 206
    .line 207
    move-result-wide v6

    .line 208
    invoke-virtual {v2, v5, v6, v7}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;
    :try_end_3
    .catch Lorg/json/JSONException; {:try_start_3 .. :try_end_3} :catch_3

    .line 209
    .line 210
    .line 211
    :catch_3
    invoke-virtual {v2}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    .line 212
    .line 213
    .line 214
    move-result-object v2

    .line 215
    invoke-virtual {v0, v3, v4, v2}, LX3/d;->o(JLjava/lang/String;)V

    .line 216
    .line 217
    .line 218
    iget-object v0, v0, Ly4/n;->k:Ly4/p;

    .line 219
    .line 220
    invoke-virtual {v0, v3, v4, v1}, Ly4/p;->a(JLy4/o;)V

    .line 221
    .line 222
    .line 223
    return-void

    .line 224
    :pswitch_3
    iget-object v0, p0, Lv4/k;->B:Lv4/h;

    .line 225
    .line 226
    iget-object v0, v0, Lv4/h;->c:Ly4/n;

    .line 227
    .line 228
    invoke-virtual {p0}, Lv4/s;->O()Ly4/o;

    .line 229
    .line 230
    .line 231
    move-result-object v1

    .line 232
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 233
    .line 234
    .line 235
    new-instance v2, Lorg/json/JSONObject;

    .line 236
    .line 237
    invoke-direct {v2}, Lorg/json/JSONObject;-><init>()V

    .line 238
    .line 239
    .line 240
    invoke-virtual {v0}, LX3/d;->n()J

    .line 241
    .line 242
    .line 243
    move-result-wide v3

    .line 244
    :try_start_4
    const-string v5, "requestId"

    .line 245
    .line 246
    invoke-virtual {v2, v5, v3, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    .line 247
    .line 248
    .line 249
    const-string v5, "type"

    .line 250
    .line 251
    const-string v6, "QUEUE_GET_ITEM_IDS"

    .line 252
    .line 253
    invoke-virtual {v2, v5, v6}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 254
    .line 255
    .line 256
    const-string v5, "mediaSessionId"

    .line 257
    .line 258
    invoke-virtual {v0}, Ly4/n;->B()J

    .line 259
    .line 260
    .line 261
    move-result-wide v6

    .line 262
    invoke-virtual {v2, v5, v6, v7}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;
    :try_end_4
    .catch Lorg/json/JSONException; {:try_start_4 .. :try_end_4} :catch_4

    .line 263
    .line 264
    .line 265
    :catch_4
    invoke-virtual {v2}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    .line 266
    .line 267
    .line 268
    move-result-object v2

    .line 269
    invoke-virtual {v0, v3, v4, v2}, LX3/d;->o(JLjava/lang/String;)V

    .line 270
    .line 271
    .line 272
    iget-object v0, v0, Ly4/n;->u:Ly4/p;

    .line 273
    .line 274
    invoke-virtual {v0, v3, v4, v1}, Ly4/p;->a(JLy4/o;)V

    .line 275
    .line 276
    .line 277
    return-void

    .line 278
    :pswitch_4
    iget-object v0, p0, Lv4/k;->B:Lv4/h;

    .line 279
    .line 280
    iget-object v1, v0, Lv4/h;->c:Ly4/n;

    .line 281
    .line 282
    invoke-virtual {p0}, Lv4/s;->O()Ly4/o;

    .line 283
    .line 284
    .line 285
    move-result-object v2

    .line 286
    const-wide/16 v4, -0x1

    .line 287
    .line 288
    const/4 v6, 0x1

    .line 289
    const/4 v3, 0x0

    .line 290
    const/4 v7, 0x0

    .line 291
    invoke-virtual/range {v1 .. v7}, Ly4/n;->p(Ly4/o;IJILjava/lang/Integer;)V

    .line 292
    .line 293
    .line 294
    return-void

    .line 295
    :pswitch_5
    iget-object v0, p0, Lv4/k;->B:Lv4/h;

    .line 296
    .line 297
    iget-object v1, v0, Lv4/h;->c:Ly4/n;

    .line 298
    .line 299
    invoke-virtual {p0}, Lv4/s;->O()Ly4/o;

    .line 300
    .line 301
    .line 302
    move-result-object v2

    .line 303
    const-wide/16 v4, -0x1

    .line 304
    .line 305
    const/4 v6, -0x1

    .line 306
    const/4 v3, 0x0

    .line 307
    const/4 v7, 0x0

    .line 308
    invoke-virtual/range {v1 .. v7}, Ly4/n;->p(Ly4/o;IJILjava/lang/Integer;)V

    .line 309
    .line 310
    .line 311
    return-void

    .line 312
    nop

    .line 313
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
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
