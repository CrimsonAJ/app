.class public final synthetic LG6/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, LG6/d;->a:I

    iput-object p2, p0, LG6/d;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 12

    .line 1
    iget v0, p0, LG6/d;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LG6/d;->b:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Ly6/p;

    .line 9
    .line 10
    iget-object v0, v0, Ly6/p;->g:Ly6/l;

    .line 11
    .line 12
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    invoke-static {}, Lz6/d;->a()V

    .line 16
    .line 17
    .line 18
    iget-object v1, v0, Ly6/l;->c:Lk4/E;

    .line 19
    .line 20
    iget-object v2, v1, Lk4/E;->b:Ljava/lang/Object;

    .line 21
    .line 22
    check-cast v2, Ljava/lang/String;

    .line 23
    .line 24
    iget-object v3, v1, Lk4/E;->c:Ljava/lang/Object;

    .line 25
    .line 26
    check-cast v3, LE6/e;

    .line 27
    .line 28
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 29
    .line 30
    .line 31
    new-instance v4, Ljava/io/File;

    .line 32
    .line 33
    iget-object v5, v3, LE6/e;->c:Ljava/lang/Object;

    .line 34
    .line 35
    check-cast v5, Ljava/io/File;

    .line 36
    .line 37
    invoke-direct {v4, v5, v2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    invoke-virtual {v4}, Ljava/io/File;->exists()Z

    .line 41
    .line 42
    .line 43
    move-result v2

    .line 44
    const/4 v4, 0x1

    .line 45
    if-nez v2, :cond_1

    .line 46
    .line 47
    invoke-virtual {v0}, Ly6/l;->e()Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object v1

    .line 51
    if-eqz v1, :cond_0

    .line 52
    .line 53
    iget-object v0, v0, Ly6/l;->j:Lv6/a;

    .line 54
    .line 55
    invoke-virtual {v0, v1}, Lv6/a;->c(Ljava/lang/String;)Z

    .line 56
    .line 57
    .line 58
    move-result v0

    .line 59
    if-eqz v0, :cond_0

    .line 60
    .line 61
    goto :goto_0

    .line 62
    :cond_0
    const/4 v4, 0x0

    .line 63
    goto :goto_0

    .line 64
    :cond_1
    const-string v0, "FirebaseCrashlytics"

    .line 65
    .line 66
    const/4 v2, 0x2

    .line 67
    invoke-static {v0, v2}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 68
    .line 69
    .line 70
    move-result v2

    .line 71
    if-eqz v2, :cond_2

    .line 72
    .line 73
    const/4 v2, 0x0

    .line 74
    const-string v5, "Found previous crash marker."

    .line 75
    .line 76
    invoke-static {v0, v5, v2}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 77
    .line 78
    .line 79
    :cond_2
    iget-object v0, v1, Lk4/E;->b:Ljava/lang/Object;

    .line 80
    .line 81
    check-cast v0, Ljava/lang/String;

    .line 82
    .line 83
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 84
    .line 85
    .line 86
    new-instance v1, Ljava/io/File;

    .line 87
    .line 88
    iget-object v2, v3, LE6/e;->c:Ljava/lang/Object;

    .line 89
    .line 90
    check-cast v2, Ljava/io/File;

    .line 91
    .line 92
    invoke-direct {v1, v2, v0}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 93
    .line 94
    .line 95
    invoke-virtual {v1}, Ljava/io/File;->delete()Z

    .line 96
    .line 97
    .line 98
    :goto_0
    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 99
    .line 100
    .line 101
    move-result-object v0

    .line 102
    return-object v0

    .line 103
    :pswitch_0
    iget-object v0, p0, LG6/d;->b:Ljava/lang/Object;

    .line 104
    .line 105
    check-cast v0, Ld7/n;

    .line 106
    .line 107
    monitor-enter v0

    .line 108
    const/4 v1, 0x0

    .line 109
    :try_start_0
    iget-object v2, v0, Ld7/n;->a:Landroid/content/Context;

    .line 110
    .line 111
    iget-object v3, v0, Ld7/n;->b:Ljava/lang/String;

    .line 112
    .line 113
    invoke-virtual {v2, v3}, Landroid/content/Context;->openFileInput(Ljava/lang/String;)Ljava/io/FileInputStream;

    .line 114
    .line 115
    .line 116
    move-result-object v2
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/io/FileNotFoundException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    .line 117
    :try_start_1
    invoke-virtual {v2}, Ljava/io/FileInputStream;->available()I

    .line 118
    .line 119
    .line 120
    move-result v3

    .line 121
    new-array v4, v3, [B

    .line 122
    .line 123
    const/4 v5, 0x0

    .line 124
    invoke-virtual {v2, v4, v5, v3}, Ljava/io/FileInputStream;->read([BII)I

    .line 125
    .line 126
    .line 127
    new-instance v3, Ljava/lang/String;

    .line 128
    .line 129
    const-string v5, "UTF-8"

    .line 130
    .line 131
    invoke-direct {v3, v4, v5}, Ljava/lang/String;-><init>([BLjava/lang/String;)V

    .line 132
    .line 133
    .line 134
    new-instance v4, Lorg/json/JSONObject;

    .line 135
    .line 136
    invoke-direct {v4, v3}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 137
    .line 138
    .line 139
    invoke-static {v4}, Ld7/e;->a(Lorg/json/JSONObject;)Ld7/e;

    .line 140
    .line 141
    .line 142
    move-result-object v1
    :try_end_1
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/io/FileNotFoundException; {:try_start_1 .. :try_end_1} :catch_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 143
    :try_start_2
    invoke-virtual {v2}, Ljava/io/FileInputStream;->close()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 144
    .line 145
    .line 146
    monitor-exit v0

    .line 147
    goto :goto_5

    .line 148
    :catchall_0
    move-exception v1

    .line 149
    goto :goto_3

    .line 150
    :catchall_1
    move-exception v1

    .line 151
    goto :goto_1

    .line 152
    :catchall_2
    move-exception v2

    .line 153
    move-object v11, v2

    .line 154
    move-object v2, v1

    .line 155
    move-object v1, v11

    .line 156
    goto :goto_1

    .line 157
    :catch_0
    move-object v2, v1

    .line 158
    goto :goto_2

    .line 159
    :goto_1
    if-eqz v2, :cond_3

    .line 160
    .line 161
    :try_start_3
    invoke-virtual {v2}, Ljava/io/FileInputStream;->close()V

    .line 162
    .line 163
    .line 164
    :cond_3
    throw v1

    .line 165
    :catch_1
    :goto_2
    if-eqz v2, :cond_4

    .line 166
    .line 167
    invoke-virtual {v2}, Ljava/io/FileInputStream;->close()V

    .line 168
    .line 169
    .line 170
    goto :goto_4

    .line 171
    :goto_3
    monitor-exit v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 172
    throw v1

    .line 173
    :cond_4
    :goto_4
    monitor-exit v0

    .line 174
    :goto_5
    return-object v1

    .line 175
    :pswitch_1
    iget-object v0, p0, LG6/d;->b:Ljava/lang/Object;

    .line 176
    .line 177
    check-cast v0, Lc7/n;

    .line 178
    .line 179
    invoke-virtual {v0}, Lc7/n;->a()Lc7/e;

    .line 180
    .line 181
    .line 182
    move-result-object v0

    .line 183
    return-object v0

    .line 184
    :pswitch_2
    iget-object v0, p0, LG6/d;->b:Ljava/lang/Object;

    .line 185
    .line 186
    check-cast v0, LA1/g;

    .line 187
    .line 188
    iget-object v0, v0, LA1/g;->c:Ljava/lang/Object;

    .line 189
    .line 190
    check-cast v0, LG6/e;

    .line 191
    .line 192
    iget-object v1, v0, LG6/e;->b:Ljava/lang/Object;

    .line 193
    .line 194
    check-cast v1, LG6/g;

    .line 195
    .line 196
    iget-object v0, v0, LG6/e;->f:Ljava/lang/Object;

    .line 197
    .line 198
    check-cast v0, LG6/a;

    .line 199
    .line 200
    iget-object v2, v0, LG6/a;->b:Ljava/lang/String;

    .line 201
    .line 202
    const-string v3, "FirebaseCrashlytics"

    .line 203
    .line 204
    const-string v4, "Settings query params were: "

    .line 205
    .line 206
    const-string v5, "Requesting settings from "

    .line 207
    .line 208
    invoke-static {}, Lz6/d;->b()V

    .line 209
    .line 210
    .line 211
    const/4 v6, 0x0

    .line 212
    :try_start_4
    invoke-static {v1}, LG6/a;->b(LG6/g;)Ljava/util/HashMap;

    .line 213
    .line 214
    .line 215
    move-result-object v7

    .line 216
    new-instance v8, Landroid/support/v4/media/session/y;

    .line 217
    .line 218
    invoke-direct {v8, v2, v7}, Landroid/support/v4/media/session/y;-><init>(Ljava/lang/String;Ljava/util/HashMap;)V

    .line 219
    .line 220
    .line 221
    const-string v9, "User-Agent"

    .line 222
    .line 223
    const-string v10, "Crashlytics Android SDK/19.4.4"

    .line 224
    .line 225
    invoke-virtual {v8, v9, v10}, Landroid/support/v4/media/session/y;->O(Ljava/lang/String;Ljava/lang/String;)V

    .line 226
    .line 227
    .line 228
    const-string v9, "X-CRASHLYTICS-DEVELOPER-TOKEN"

    .line 229
    .line 230
    const-string v10, "470fa2b4ae81cd56ecbcda9735803434cec591fa"

    .line 231
    .line 232
    invoke-virtual {v8, v9, v10}, Landroid/support/v4/media/session/y;->O(Ljava/lang/String;Ljava/lang/String;)V

    .line 233
    .line 234
    .line 235
    invoke-static {v8, v1}, LG6/a;->a(Landroid/support/v4/media/session/y;LG6/g;)V

    .line 236
    .line 237
    .line 238
    new-instance v1, Ljava/lang/StringBuilder;

    .line 239
    .line 240
    invoke-direct {v1, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 241
    .line 242
    .line 243
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 244
    .line 245
    .line 246
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 247
    .line 248
    .line 249
    move-result-object v1

    .line 250
    const/4 v2, 0x3

    .line 251
    invoke-static {v3, v2}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 252
    .line 253
    .line 254
    move-result v2

    .line 255
    if-eqz v2, :cond_5

    .line 256
    .line 257
    invoke-static {v3, v1, v6}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 258
    .line 259
    .line 260
    :cond_5
    new-instance v1, Ljava/lang/StringBuilder;

    .line 261
    .line 262
    invoke-direct {v1, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 263
    .line 264
    .line 265
    invoke-virtual {v1, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 266
    .line 267
    .line 268
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 269
    .line 270
    .line 271
    move-result-object v1

    .line 272
    const/4 v2, 0x2

    .line 273
    invoke-static {v3, v2}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 274
    .line 275
    .line 276
    move-result v2

    .line 277
    if-eqz v2, :cond_6

    .line 278
    .line 279
    invoke-static {v3, v1, v6}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 280
    .line 281
    .line 282
    :cond_6
    invoke-virtual {v8}, Landroid/support/v4/media/session/y;->H()LD6/a;

    .line 283
    .line 284
    .line 285
    move-result-object v1

    .line 286
    invoke-virtual {v0, v1}, LG6/a;->c(LD6/a;)Lorg/json/JSONObject;

    .line 287
    .line 288
    .line 289
    move-result-object v6
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_2

    .line 290
    goto :goto_6

    .line 291
    :catch_2
    move-exception v0

    .line 292
    const-string v1, "Settings request failed."

    .line 293
    .line 294
    invoke-static {v3, v1, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 295
    .line 296
    .line 297
    :goto_6
    return-object v6

    .line 298
    nop

    .line 299
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
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
