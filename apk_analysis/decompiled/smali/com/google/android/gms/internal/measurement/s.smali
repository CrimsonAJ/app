.class public final Lcom/google/android/gms/internal/measurement/s;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ljava/util/ArrayList;

.field public final synthetic b:I


# direct methods
.method public constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/google/android/gms/internal/measurement/s;->b:I

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    new-instance p1, Ljava/util/ArrayList;

    .line 7
    .line 8
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 9
    .line 10
    .line 11
    iput-object p1, p0, Lcom/google/android/gms/internal/measurement/s;->a:Ljava/util/ArrayList;

    .line 12
    .line 13
    return-void
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

.method public static c(Lcom/google/firebase/messaging/s;Ljava/util/ArrayList;)Lcom/google/android/gms/internal/measurement/m;
    .locals 5

    .line 1
    sget-object v0, Lcom/google/android/gms/internal/measurement/w;->b:Lcom/google/android/gms/internal/measurement/w;

    .line 2
    .line 3
    const-string v0, "FN"

    .line 4
    .line 5
    const/4 v1, 0x2

    .line 6
    invoke-static {v1, v0, p1}, Ls8/n;->b0(ILjava/lang/String;Ljava/util/List;)V

    .line 7
    .line 8
    .line 9
    const/4 v0, 0x0

    .line 10
    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    check-cast v0, Lcom/google/android/gms/internal/measurement/n;

    .line 15
    .line 16
    iget-object v2, p0, Lcom/google/firebase/messaging/s;->c:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast v2, Lcom/google/android/gms/internal/measurement/t;

    .line 19
    .line 20
    invoke-virtual {v2, p0, v0}, Lcom/google/android/gms/internal/measurement/t;->a(Lcom/google/firebase/messaging/s;Lcom/google/android/gms/internal/measurement/n;)Lcom/google/android/gms/internal/measurement/n;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    const/4 v2, 0x1

    .line 25
    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v2

    .line 29
    check-cast v2, Lcom/google/android/gms/internal/measurement/n;

    .line 30
    .line 31
    iget-object v3, p0, Lcom/google/firebase/messaging/s;->c:Ljava/lang/Object;

    .line 32
    .line 33
    check-cast v3, Lcom/google/android/gms/internal/measurement/t;

    .line 34
    .line 35
    invoke-virtual {v3, p0, v2}, Lcom/google/android/gms/internal/measurement/t;->a(Lcom/google/firebase/messaging/s;Lcom/google/android/gms/internal/measurement/n;)Lcom/google/android/gms/internal/measurement/n;

    .line 36
    .line 37
    .line 38
    move-result-object v2

    .line 39
    instance-of v3, v2, Lcom/google/android/gms/internal/measurement/d;

    .line 40
    .line 41
    if-eqz v3, :cond_1

    .line 42
    .line 43
    check-cast v2, Lcom/google/android/gms/internal/measurement/d;

    .line 44
    .line 45
    invoke-virtual {v2}, Lcom/google/android/gms/internal/measurement/d;->t()Ljava/util/ArrayList;

    .line 46
    .line 47
    .line 48
    move-result-object v2

    .line 49
    new-instance v3, Ljava/util/ArrayList;

    .line 50
    .line 51
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 52
    .line 53
    .line 54
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 55
    .line 56
    .line 57
    move-result v4

    .line 58
    if-le v4, v1, :cond_0

    .line 59
    .line 60
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 61
    .line 62
    .line 63
    move-result v3

    .line 64
    invoke-interface {p1, v1, v3}, Ljava/util/List;->subList(II)Ljava/util/List;

    .line 65
    .line 66
    .line 67
    move-result-object v3

    .line 68
    :cond_0
    new-instance p1, Lcom/google/android/gms/internal/measurement/m;

    .line 69
    .line 70
    invoke-interface {v0}, Lcom/google/android/gms/internal/measurement/n;->c()Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    move-result-object v0

    .line 74
    invoke-direct {p1, v0, v2, v3, p0}, Lcom/google/android/gms/internal/measurement/m;-><init>(Ljava/lang/String;Ljava/util/ArrayList;Ljava/util/List;Lcom/google/firebase/messaging/s;)V

    .line 75
    .line 76
    .line 77
    return-object p1

    .line 78
    :cond_1
    new-instance p0, Ljava/lang/IllegalArgumentException;

    .line 79
    .line 80
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 81
    .line 82
    .line 83
    move-result-object p1

    .line 84
    invoke-virtual {p1}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    .line 85
    .line 86
    .line 87
    move-result-object p1

    .line 88
    const-string v0, "FN requires an ArrayValue of parameter names found "

    .line 89
    .line 90
    invoke-static {v0, p1}, Lu0/z;->e(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 91
    .line 92
    .line 93
    move-result-object p1

    .line 94
    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 95
    .line 96
    .line 97
    throw p0
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

.method public static d(Lcom/google/android/gms/internal/measurement/v;Ljava/util/Iterator;Lcom/google/android/gms/internal/measurement/n;)Lcom/google/android/gms/internal/measurement/n;
    .locals 4

    .line 1
    if-eqz p1, :cond_2

    .line 2
    .line 3
    :cond_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_2

    .line 8
    .line 9
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    check-cast v0, Lcom/google/android/gms/internal/measurement/n;

    .line 14
    .line 15
    iget v1, p0, Lcom/google/android/gms/internal/measurement/v;->a:I

    .line 16
    .line 17
    packed-switch v1, :pswitch_data_0

    .line 18
    .line 19
    .line 20
    iget-object v1, p0, Lcom/google/android/gms/internal/measurement/v;->c:Ljava/lang/String;

    .line 21
    .line 22
    iget-object v2, p0, Lcom/google/android/gms/internal/measurement/v;->b:Lcom/google/firebase/messaging/s;

    .line 23
    .line 24
    invoke-virtual {v2, v1, v0}, Lcom/google/firebase/messaging/s;->E(Ljava/lang/String;Lcom/google/android/gms/internal/measurement/n;)V

    .line 25
    .line 26
    .line 27
    goto :goto_0

    .line 28
    :pswitch_0
    iget-object v1, p0, Lcom/google/android/gms/internal/measurement/v;->b:Lcom/google/firebase/messaging/s;

    .line 29
    .line 30
    invoke-virtual {v1}, Lcom/google/firebase/messaging/s;->y()Lcom/google/firebase/messaging/s;

    .line 31
    .line 32
    .line 33
    move-result-object v2

    .line 34
    iget-object v1, p0, Lcom/google/android/gms/internal/measurement/v;->c:Ljava/lang/String;

    .line 35
    .line 36
    invoke-virtual {v2, v1, v0}, Lcom/google/firebase/messaging/s;->E(Ljava/lang/String;Lcom/google/android/gms/internal/measurement/n;)V

    .line 37
    .line 38
    .line 39
    goto :goto_0

    .line 40
    :pswitch_1
    iget-object v1, p0, Lcom/google/android/gms/internal/measurement/v;->b:Lcom/google/firebase/messaging/s;

    .line 41
    .line 42
    invoke-virtual {v1}, Lcom/google/firebase/messaging/s;->y()Lcom/google/firebase/messaging/s;

    .line 43
    .line 44
    .line 45
    move-result-object v2

    .line 46
    iget-object v1, p0, Lcom/google/android/gms/internal/measurement/v;->c:Ljava/lang/String;

    .line 47
    .line 48
    invoke-virtual {v2, v1, v0}, Lcom/google/firebase/messaging/s;->E(Ljava/lang/String;Lcom/google/android/gms/internal/measurement/n;)V

    .line 49
    .line 50
    .line 51
    iget-object v0, v2, Lcom/google/firebase/messaging/s;->e:Ljava/lang/Object;

    .line 52
    .line 53
    check-cast v0, Ljava/util/HashMap;

    .line 54
    .line 55
    sget-object v3, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 56
    .line 57
    invoke-virtual {v0, v1, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    :goto_0
    move-object v0, p2

    .line 61
    check-cast v0, Lcom/google/android/gms/internal/measurement/d;

    .line 62
    .line 63
    invoke-virtual {v2, v0}, Lcom/google/firebase/messaging/s;->B(Lcom/google/android/gms/internal/measurement/d;)Lcom/google/android/gms/internal/measurement/n;

    .line 64
    .line 65
    .line 66
    move-result-object v0

    .line 67
    instance-of v1, v0, Lcom/google/android/gms/internal/measurement/f;

    .line 68
    .line 69
    if-eqz v1, :cond_0

    .line 70
    .line 71
    check-cast v0, Lcom/google/android/gms/internal/measurement/f;

    .line 72
    .line 73
    iget-object v1, v0, Lcom/google/android/gms/internal/measurement/f;->b:Ljava/lang/String;

    .line 74
    .line 75
    const-string v2, "break"

    .line 76
    .line 77
    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 78
    .line 79
    .line 80
    move-result v1

    .line 81
    if-eqz v1, :cond_1

    .line 82
    .line 83
    sget-object p0, Lcom/google/android/gms/internal/measurement/n;->N:Lcom/google/android/gms/internal/measurement/r;

    .line 84
    .line 85
    return-object p0

    .line 86
    :cond_1
    iget-object v1, v0, Lcom/google/android/gms/internal/measurement/f;->b:Ljava/lang/String;

    .line 87
    .line 88
    const-string v2, "return"

    .line 89
    .line 90
    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 91
    .line 92
    .line 93
    move-result v1

    .line 94
    if-eqz v1, :cond_0

    .line 95
    .line 96
    return-object v0

    .line 97
    :cond_2
    sget-object p0, Lcom/google/android/gms/internal/measurement/n;->N:Lcom/google/android/gms/internal/measurement/r;

    .line 98
    .line 99
    return-object p0

    .line 100
    nop

    .line 101
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
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

.method public static e(Lcom/google/android/gms/internal/measurement/n;Lcom/google/android/gms/internal/measurement/n;)Z
    .locals 5

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    const/4 v1, 0x0

    .line 14
    const/4 v2, 0x1

    .line 15
    if-eqz v0, :cond_8

    .line 16
    .line 17
    instance-of v0, p0, Lcom/google/android/gms/internal/measurement/r;

    .line 18
    .line 19
    if-nez v0, :cond_7

    .line 20
    .line 21
    instance-of v0, p0, Lcom/google/android/gms/internal/measurement/l;

    .line 22
    .line 23
    if-eqz v0, :cond_0

    .line 24
    .line 25
    goto :goto_1

    .line 26
    :cond_0
    instance-of v0, p0, Lcom/google/android/gms/internal/measurement/g;

    .line 27
    .line 28
    if-eqz v0, :cond_3

    .line 29
    .line 30
    invoke-interface {p0}, Lcom/google/android/gms/internal/measurement/n;->b()Ljava/lang/Double;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    invoke-virtual {v0}, Ljava/lang/Double;->doubleValue()D

    .line 35
    .line 36
    .line 37
    move-result-wide v3

    .line 38
    invoke-static {v3, v4}, Ljava/lang/Double;->isNaN(D)Z

    .line 39
    .line 40
    .line 41
    move-result v0

    .line 42
    if-nez v0, :cond_2

    .line 43
    .line 44
    invoke-interface {p1}, Lcom/google/android/gms/internal/measurement/n;->b()Ljava/lang/Double;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    invoke-virtual {v0}, Ljava/lang/Double;->doubleValue()D

    .line 49
    .line 50
    .line 51
    move-result-wide v3

    .line 52
    invoke-static {v3, v4}, Ljava/lang/Double;->isNaN(D)Z

    .line 53
    .line 54
    .line 55
    move-result v0

    .line 56
    if-eqz v0, :cond_1

    .line 57
    .line 58
    goto :goto_0

    .line 59
    :cond_1
    invoke-interface {p0}, Lcom/google/android/gms/internal/measurement/n;->b()Ljava/lang/Double;

    .line 60
    .line 61
    .line 62
    move-result-object p0

    .line 63
    invoke-virtual {p0}, Ljava/lang/Double;->doubleValue()D

    .line 64
    .line 65
    .line 66
    move-result-wide v3

    .line 67
    invoke-interface {p1}, Lcom/google/android/gms/internal/measurement/n;->b()Ljava/lang/Double;

    .line 68
    .line 69
    .line 70
    move-result-object p0

    .line 71
    invoke-virtual {p0}, Ljava/lang/Double;->doubleValue()D

    .line 72
    .line 73
    .line 74
    move-result-wide p0

    .line 75
    cmpl-double p0, v3, p0

    .line 76
    .line 77
    if-nez p0, :cond_2

    .line 78
    .line 79
    return v2

    .line 80
    :cond_2
    :goto_0
    return v1

    .line 81
    :cond_3
    instance-of v0, p0, Lcom/google/android/gms/internal/measurement/q;

    .line 82
    .line 83
    if-eqz v0, :cond_4

    .line 84
    .line 85
    invoke-interface {p0}, Lcom/google/android/gms/internal/measurement/n;->c()Ljava/lang/String;

    .line 86
    .line 87
    .line 88
    move-result-object p0

    .line 89
    invoke-interface {p1}, Lcom/google/android/gms/internal/measurement/n;->c()Ljava/lang/String;

    .line 90
    .line 91
    .line 92
    move-result-object p1

    .line 93
    invoke-virtual {p0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 94
    .line 95
    .line 96
    move-result p0

    .line 97
    return p0

    .line 98
    :cond_4
    instance-of v0, p0, Lcom/google/android/gms/internal/measurement/e;

    .line 99
    .line 100
    if-eqz v0, :cond_5

    .line 101
    .line 102
    invoke-interface {p0}, Lcom/google/android/gms/internal/measurement/n;->o()Ljava/lang/Boolean;

    .line 103
    .line 104
    .line 105
    move-result-object p0

    .line 106
    invoke-interface {p1}, Lcom/google/android/gms/internal/measurement/n;->o()Ljava/lang/Boolean;

    .line 107
    .line 108
    .line 109
    move-result-object p1

    .line 110
    invoke-virtual {p0, p1}, Ljava/lang/Boolean;->equals(Ljava/lang/Object;)Z

    .line 111
    .line 112
    .line 113
    move-result p0

    .line 114
    return p0

    .line 115
    :cond_5
    if-ne p0, p1, :cond_6

    .line 116
    .line 117
    return v2

    .line 118
    :cond_6
    return v1

    .line 119
    :cond_7
    :goto_1
    return v2

    .line 120
    :cond_8
    instance-of v0, p0, Lcom/google/android/gms/internal/measurement/r;

    .line 121
    .line 122
    if-nez v0, :cond_9

    .line 123
    .line 124
    instance-of v0, p0, Lcom/google/android/gms/internal/measurement/l;

    .line 125
    .line 126
    if-eqz v0, :cond_a

    .line 127
    .line 128
    :cond_9
    instance-of v0, p1, Lcom/google/android/gms/internal/measurement/r;

    .line 129
    .line 130
    if-nez v0, :cond_16

    .line 131
    .line 132
    instance-of v0, p1, Lcom/google/android/gms/internal/measurement/l;

    .line 133
    .line 134
    if-nez v0, :cond_16

    .line 135
    .line 136
    :cond_a
    instance-of v0, p0, Lcom/google/android/gms/internal/measurement/g;

    .line 137
    .line 138
    if-eqz v0, :cond_c

    .line 139
    .line 140
    instance-of v2, p1, Lcom/google/android/gms/internal/measurement/q;

    .line 141
    .line 142
    if-nez v2, :cond_b

    .line 143
    .line 144
    goto :goto_2

    .line 145
    :cond_b
    new-instance v0, Lcom/google/android/gms/internal/measurement/g;

    .line 146
    .line 147
    invoke-interface {p1}, Lcom/google/android/gms/internal/measurement/n;->b()Ljava/lang/Double;

    .line 148
    .line 149
    .line 150
    move-result-object p1

    .line 151
    invoke-direct {v0, p1}, Lcom/google/android/gms/internal/measurement/g;-><init>(Ljava/lang/Double;)V

    .line 152
    .line 153
    .line 154
    invoke-static {p0, v0}, Lcom/google/android/gms/internal/measurement/s;->e(Lcom/google/android/gms/internal/measurement/n;Lcom/google/android/gms/internal/measurement/n;)Z

    .line 155
    .line 156
    .line 157
    move-result p0

    .line 158
    return p0

    .line 159
    :cond_c
    :goto_2
    instance-of v2, p0, Lcom/google/android/gms/internal/measurement/q;

    .line 160
    .line 161
    if-eqz v2, :cond_e

    .line 162
    .line 163
    instance-of v3, p1, Lcom/google/android/gms/internal/measurement/g;

    .line 164
    .line 165
    if-nez v3, :cond_d

    .line 166
    .line 167
    goto :goto_3

    .line 168
    :cond_d
    new-instance v0, Lcom/google/android/gms/internal/measurement/g;

    .line 169
    .line 170
    invoke-interface {p0}, Lcom/google/android/gms/internal/measurement/n;->b()Ljava/lang/Double;

    .line 171
    .line 172
    .line 173
    move-result-object p0

    .line 174
    invoke-direct {v0, p0}, Lcom/google/android/gms/internal/measurement/g;-><init>(Ljava/lang/Double;)V

    .line 175
    .line 176
    .line 177
    invoke-static {v0, p1}, Lcom/google/android/gms/internal/measurement/s;->e(Lcom/google/android/gms/internal/measurement/n;Lcom/google/android/gms/internal/measurement/n;)Z

    .line 178
    .line 179
    .line 180
    move-result p0

    .line 181
    return p0

    .line 182
    :cond_e
    :goto_3
    instance-of v3, p0, Lcom/google/android/gms/internal/measurement/e;

    .line 183
    .line 184
    if-eqz v3, :cond_f

    .line 185
    .line 186
    new-instance v0, Lcom/google/android/gms/internal/measurement/g;

    .line 187
    .line 188
    invoke-interface {p0}, Lcom/google/android/gms/internal/measurement/n;->b()Ljava/lang/Double;

    .line 189
    .line 190
    .line 191
    move-result-object p0

    .line 192
    invoke-direct {v0, p0}, Lcom/google/android/gms/internal/measurement/g;-><init>(Ljava/lang/Double;)V

    .line 193
    .line 194
    .line 195
    invoke-static {v0, p1}, Lcom/google/android/gms/internal/measurement/s;->e(Lcom/google/android/gms/internal/measurement/n;Lcom/google/android/gms/internal/measurement/n;)Z

    .line 196
    .line 197
    .line 198
    move-result p0

    .line 199
    return p0

    .line 200
    :cond_f
    instance-of v3, p1, Lcom/google/android/gms/internal/measurement/e;

    .line 201
    .line 202
    if-eqz v3, :cond_10

    .line 203
    .line 204
    new-instance v0, Lcom/google/android/gms/internal/measurement/g;

    .line 205
    .line 206
    invoke-interface {p1}, Lcom/google/android/gms/internal/measurement/n;->b()Ljava/lang/Double;

    .line 207
    .line 208
    .line 209
    move-result-object p1

    .line 210
    invoke-direct {v0, p1}, Lcom/google/android/gms/internal/measurement/g;-><init>(Ljava/lang/Double;)V

    .line 211
    .line 212
    .line 213
    invoke-static {p0, v0}, Lcom/google/android/gms/internal/measurement/s;->e(Lcom/google/android/gms/internal/measurement/n;Lcom/google/android/gms/internal/measurement/n;)Z

    .line 214
    .line 215
    .line 216
    move-result p0

    .line 217
    return p0

    .line 218
    :cond_10
    if-nez v2, :cond_11

    .line 219
    .line 220
    if-eqz v0, :cond_12

    .line 221
    .line 222
    :cond_11
    instance-of v0, p1, Lcom/google/android/gms/internal/measurement/j;

    .line 223
    .line 224
    if-nez v0, :cond_15

    .line 225
    .line 226
    :cond_12
    instance-of v0, p0, Lcom/google/android/gms/internal/measurement/j;

    .line 227
    .line 228
    if-eqz v0, :cond_14

    .line 229
    .line 230
    instance-of v0, p1, Lcom/google/android/gms/internal/measurement/q;

    .line 231
    .line 232
    if-nez v0, :cond_13

    .line 233
    .line 234
    instance-of v0, p1, Lcom/google/android/gms/internal/measurement/g;

    .line 235
    .line 236
    if-eqz v0, :cond_14

    .line 237
    .line 238
    :cond_13
    new-instance v0, Lcom/google/android/gms/internal/measurement/q;

    .line 239
    .line 240
    invoke-interface {p0}, Lcom/google/android/gms/internal/measurement/n;->c()Ljava/lang/String;

    .line 241
    .line 242
    .line 243
    move-result-object p0

    .line 244
    invoke-direct {v0, p0}, Lcom/google/android/gms/internal/measurement/q;-><init>(Ljava/lang/String;)V

    .line 245
    .line 246
    .line 247
    invoke-static {v0, p1}, Lcom/google/android/gms/internal/measurement/s;->e(Lcom/google/android/gms/internal/measurement/n;Lcom/google/android/gms/internal/measurement/n;)Z

    .line 248
    .line 249
    .line 250
    move-result p0

    .line 251
    return p0

    .line 252
    :cond_14
    return v1

    .line 253
    :cond_15
    new-instance v0, Lcom/google/android/gms/internal/measurement/q;

    .line 254
    .line 255
    invoke-interface {p1}, Lcom/google/android/gms/internal/measurement/n;->c()Ljava/lang/String;

    .line 256
    .line 257
    .line 258
    move-result-object p1

    .line 259
    invoke-direct {v0, p1}, Lcom/google/android/gms/internal/measurement/q;-><init>(Ljava/lang/String;)V

    .line 260
    .line 261
    .line 262
    :try_start_0
    invoke-static {p0, v0}, Lcom/google/android/gms/internal/measurement/s;->e(Lcom/google/android/gms/internal/measurement/n;Lcom/google/android/gms/internal/measurement/n;)Z

    .line 263
    .line 264
    .line 265
    move-result p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 266
    return p0

    .line 267
    :catchall_0
    move-exception p0

    .line 268
    throw p0

    .line 269
    :cond_16
    return v2
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

.method public static f(Lcom/google/android/gms/internal/measurement/n;Lcom/google/android/gms/internal/measurement/n;)Z
    .locals 8

    .line 1
    instance-of v0, p0, Lcom/google/android/gms/internal/measurement/j;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Lcom/google/android/gms/internal/measurement/q;

    .line 6
    .line 7
    invoke-interface {p0}, Lcom/google/android/gms/internal/measurement/n;->c()Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    invoke-direct {v0, p0}, Lcom/google/android/gms/internal/measurement/q;-><init>(Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    move-object p0, v0

    .line 15
    :cond_0
    instance-of v0, p1, Lcom/google/android/gms/internal/measurement/j;

    .line 16
    .line 17
    if-eqz v0, :cond_1

    .line 18
    .line 19
    new-instance v0, Lcom/google/android/gms/internal/measurement/q;

    .line 20
    .line 21
    invoke-interface {p1}, Lcom/google/android/gms/internal/measurement/n;->c()Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    invoke-direct {v0, p1}, Lcom/google/android/gms/internal/measurement/q;-><init>(Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    move-object p1, v0

    .line 29
    :cond_1
    instance-of v0, p0, Lcom/google/android/gms/internal/measurement/q;

    .line 30
    .line 31
    const/4 v1, 0x1

    .line 32
    const/4 v2, 0x0

    .line 33
    if-eqz v0, :cond_4

    .line 34
    .line 35
    instance-of v0, p1, Lcom/google/android/gms/internal/measurement/q;

    .line 36
    .line 37
    if-nez v0, :cond_2

    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_2
    check-cast p0, Lcom/google/android/gms/internal/measurement/q;

    .line 41
    .line 42
    iget-object p0, p0, Lcom/google/android/gms/internal/measurement/q;->a:Ljava/lang/String;

    .line 43
    .line 44
    check-cast p1, Lcom/google/android/gms/internal/measurement/q;

    .line 45
    .line 46
    iget-object p1, p1, Lcom/google/android/gms/internal/measurement/q;->a:Ljava/lang/String;

    .line 47
    .line 48
    invoke-virtual {p0, p1}, Ljava/lang/String;->compareTo(Ljava/lang/String;)I

    .line 49
    .line 50
    .line 51
    move-result p0

    .line 52
    if-gez p0, :cond_3

    .line 53
    .line 54
    return v1

    .line 55
    :cond_3
    return v2

    .line 56
    :cond_4
    :goto_0
    invoke-interface {p0}, Lcom/google/android/gms/internal/measurement/n;->b()Ljava/lang/Double;

    .line 57
    .line 58
    .line 59
    move-result-object p0

    .line 60
    invoke-virtual {p0}, Ljava/lang/Double;->doubleValue()D

    .line 61
    .line 62
    .line 63
    move-result-wide v3

    .line 64
    invoke-interface {p1}, Lcom/google/android/gms/internal/measurement/n;->b()Ljava/lang/Double;

    .line 65
    .line 66
    .line 67
    move-result-object p0

    .line 68
    invoke-virtual {p0}, Ljava/lang/Double;->doubleValue()D

    .line 69
    .line 70
    .line 71
    move-result-wide p0

    .line 72
    invoke-static {v3, v4}, Ljava/lang/Double;->isNaN(D)Z

    .line 73
    .line 74
    .line 75
    move-result v0

    .line 76
    if-nez v0, :cond_9

    .line 77
    .line 78
    invoke-static {p0, p1}, Ljava/lang/Double;->isNaN(D)Z

    .line 79
    .line 80
    .line 81
    move-result v0

    .line 82
    if-eqz v0, :cond_5

    .line 83
    .line 84
    goto :goto_2

    .line 85
    :cond_5
    const-wide/16 v5, 0x0

    .line 86
    .line 87
    cmpl-double v0, v3, v5

    .line 88
    .line 89
    if-nez v0, :cond_6

    .line 90
    .line 91
    cmpl-double v7, p0, v5

    .line 92
    .line 93
    if-eqz v7, :cond_7

    .line 94
    .line 95
    :cond_6
    if-nez v0, :cond_8

    .line 96
    .line 97
    cmpl-double v0, p0, v5

    .line 98
    .line 99
    if-eqz v0, :cond_7

    .line 100
    .line 101
    goto :goto_1

    .line 102
    :cond_7
    return v2

    .line 103
    :cond_8
    :goto_1
    invoke-static {v3, v4, p0, p1}, Ljava/lang/Double;->compare(DD)I

    .line 104
    .line 105
    .line 106
    move-result p0

    .line 107
    if-gez p0, :cond_9

    .line 108
    .line 109
    return v1

    .line 110
    :cond_9
    :goto_2
    return v2
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

.method public static g(Lcom/google/android/gms/internal/measurement/v;Lcom/google/android/gms/internal/measurement/n;Lcom/google/android/gms/internal/measurement/n;)Lcom/google/android/gms/internal/measurement/n;
    .locals 1

    .line 1
    instance-of v0, p1, Ljava/lang/Iterable;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    check-cast p1, Ljava/lang/Iterable;

    .line 6
    .line 7
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    invoke-static {p0, p1, p2}, Lcom/google/android/gms/internal/measurement/s;->d(Lcom/google/android/gms/internal/measurement/v;Ljava/util/Iterator;Lcom/google/android/gms/internal/measurement/n;)Lcom/google/android/gms/internal/measurement/n;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    return-object p0

    .line 16
    :cond_0
    new-instance p0, Ljava/lang/IllegalArgumentException;

    .line 17
    .line 18
    const-string p1, "Non-iterable type in for...of loop."

    .line 19
    .line 20
    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    throw p0
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

.method public static h(Lcom/google/android/gms/internal/measurement/n;Lcom/google/android/gms/internal/measurement/n;)Z
    .locals 4

    .line 1
    instance-of v0, p0, Lcom/google/android/gms/internal/measurement/j;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Lcom/google/android/gms/internal/measurement/q;

    .line 6
    .line 7
    invoke-interface {p0}, Lcom/google/android/gms/internal/measurement/n;->c()Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    invoke-direct {v0, p0}, Lcom/google/android/gms/internal/measurement/q;-><init>(Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    move-object p0, v0

    .line 15
    :cond_0
    instance-of v0, p1, Lcom/google/android/gms/internal/measurement/j;

    .line 16
    .line 17
    if-eqz v0, :cond_1

    .line 18
    .line 19
    new-instance v0, Lcom/google/android/gms/internal/measurement/q;

    .line 20
    .line 21
    invoke-interface {p1}, Lcom/google/android/gms/internal/measurement/n;->c()Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    invoke-direct {v0, p1}, Lcom/google/android/gms/internal/measurement/q;-><init>(Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    move-object p1, v0

    .line 29
    :cond_1
    instance-of v0, p0, Lcom/google/android/gms/internal/measurement/q;

    .line 30
    .line 31
    const/4 v1, 0x0

    .line 32
    if-eqz v0, :cond_2

    .line 33
    .line 34
    instance-of v0, p1, Lcom/google/android/gms/internal/measurement/q;

    .line 35
    .line 36
    if-nez v0, :cond_3

    .line 37
    .line 38
    :cond_2
    invoke-interface {p0}, Lcom/google/android/gms/internal/measurement/n;->b()Ljava/lang/Double;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    invoke-virtual {v0}, Ljava/lang/Double;->doubleValue()D

    .line 43
    .line 44
    .line 45
    move-result-wide v2

    .line 46
    invoke-static {v2, v3}, Ljava/lang/Double;->isNaN(D)Z

    .line 47
    .line 48
    .line 49
    move-result v0

    .line 50
    if-nez v0, :cond_4

    .line 51
    .line 52
    invoke-interface {p1}, Lcom/google/android/gms/internal/measurement/n;->b()Ljava/lang/Double;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    invoke-virtual {v0}, Ljava/lang/Double;->doubleValue()D

    .line 57
    .line 58
    .line 59
    move-result-wide v2

    .line 60
    invoke-static {v2, v3}, Ljava/lang/Double;->isNaN(D)Z

    .line 61
    .line 62
    .line 63
    move-result v0

    .line 64
    if-nez v0, :cond_4

    .line 65
    .line 66
    :cond_3
    invoke-static {p1, p0}, Lcom/google/android/gms/internal/measurement/s;->f(Lcom/google/android/gms/internal/measurement/n;Lcom/google/android/gms/internal/measurement/n;)Z

    .line 67
    .line 68
    .line 69
    move-result p0

    .line 70
    if-nez p0, :cond_4

    .line 71
    .line 72
    const/4 p0, 0x1

    .line 73
    return p0

    .line 74
    :cond_4
    return v1
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
.end method


# virtual methods
.method public final a(Ljava/lang/String;Lcom/google/firebase/messaging/s;Ljava/util/ArrayList;)Lcom/google/android/gms/internal/measurement/n;
    .locals 12

    .line 1
    const-string v0, "return"

    .line 2
    .line 3
    const-string v1, "break"

    .line 4
    .line 5
    const/4 v2, 0x3

    .line 6
    const/4 v3, 0x0

    .line 7
    const/4 v4, 0x2

    .line 8
    const/4 v5, 0x0

    .line 9
    const/4 v6, 0x1

    .line 10
    iget v7, p0, Lcom/google/android/gms/internal/measurement/s;->b:I

    .line 11
    .line 12
    packed-switch v7, :pswitch_data_0

    .line 13
    .line 14
    .line 15
    sget-object v0, Lcom/google/android/gms/internal/measurement/w;->b:Lcom/google/android/gms/internal/measurement/w;

    .line 16
    .line 17
    invoke-static {p1}, Ls8/n;->X(Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/w;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    if-eq v0, v2, :cond_21

    .line 26
    .line 27
    const/16 v1, 0xe

    .line 28
    .line 29
    if-eq v0, v1, :cond_1d

    .line 30
    .line 31
    const/16 v1, 0x18

    .line 32
    .line 33
    if-eq v0, v1, :cond_1b

    .line 34
    .line 35
    const/16 v1, 0x21

    .line 36
    .line 37
    if-eq v0, v1, :cond_19

    .line 38
    .line 39
    const/16 v1, 0x31

    .line 40
    .line 41
    if-eq v0, v1, :cond_18

    .line 42
    .line 43
    const/16 v1, 0x3a

    .line 44
    .line 45
    if-eq v0, v1, :cond_14

    .line 46
    .line 47
    const/16 v1, 0x11

    .line 48
    .line 49
    if-eq v0, v1, :cond_11

    .line 50
    .line 51
    const/16 v1, 0x12

    .line 52
    .line 53
    if-eq v0, v1, :cond_d

    .line 54
    .line 55
    const/16 v1, 0x23

    .line 56
    .line 57
    if-eq v0, v1, :cond_8

    .line 58
    .line 59
    const/16 v1, 0x24

    .line 60
    .line 61
    if-eq v0, v1, :cond_8

    .line 62
    .line 63
    packed-switch v0, :pswitch_data_1

    .line 64
    .line 65
    .line 66
    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/measurement/s;->b(Ljava/lang/String;)V

    .line 67
    .line 68
    .line 69
    throw v3

    .line 70
    :pswitch_0
    const-string p1, "VAR"

    .line 71
    .line 72
    invoke-static {v6, p1, p3}, Ls8/n;->b0(ILjava/lang/String;Ljava/util/List;)V

    .line 73
    .line 74
    .line 75
    invoke-virtual {p3}, Ljava/util/ArrayList;->size()I

    .line 76
    .line 77
    .line 78
    move-result p1

    .line 79
    :goto_0
    if-ge v5, p1, :cond_1

    .line 80
    .line 81
    invoke-virtual {p3, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    move-result-object v0

    .line 85
    add-int/2addr v5, v6

    .line 86
    check-cast v0, Lcom/google/android/gms/internal/measurement/n;

    .line 87
    .line 88
    iget-object v1, p2, Lcom/google/firebase/messaging/s;->c:Ljava/lang/Object;

    .line 89
    .line 90
    check-cast v1, Lcom/google/android/gms/internal/measurement/t;

    .line 91
    .line 92
    invoke-virtual {v1, p2, v0}, Lcom/google/android/gms/internal/measurement/t;->a(Lcom/google/firebase/messaging/s;Lcom/google/android/gms/internal/measurement/n;)Lcom/google/android/gms/internal/measurement/n;

    .line 93
    .line 94
    .line 95
    move-result-object v0

    .line 96
    instance-of v1, v0, Lcom/google/android/gms/internal/measurement/q;

    .line 97
    .line 98
    if-eqz v1, :cond_0

    .line 99
    .line 100
    check-cast v0, Lcom/google/android/gms/internal/measurement/q;

    .line 101
    .line 102
    iget-object v0, v0, Lcom/google/android/gms/internal/measurement/q;->a:Ljava/lang/String;

    .line 103
    .line 104
    sget-object v1, Lcom/google/android/gms/internal/measurement/n;->N:Lcom/google/android/gms/internal/measurement/r;

    .line 105
    .line 106
    invoke-virtual {p2, v0, v1}, Lcom/google/firebase/messaging/s;->E(Ljava/lang/String;Lcom/google/android/gms/internal/measurement/n;)V

    .line 107
    .line 108
    .line 109
    goto :goto_0

    .line 110
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 111
    .line 112
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 113
    .line 114
    .line 115
    move-result-object p2

    .line 116
    invoke-virtual {p2}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    .line 117
    .line 118
    .line 119
    move-result-object p2

    .line 120
    const-string p3, "Expected string for var name. got "

    .line 121
    .line 122
    invoke-static {p3, p2}, Lu0/z;->e(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 123
    .line 124
    .line 125
    move-result-object p2

    .line 126
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 127
    .line 128
    .line 129
    throw p1

    .line 130
    :cond_1
    sget-object p1, Lcom/google/android/gms/internal/measurement/n;->N:Lcom/google/android/gms/internal/measurement/r;

    .line 131
    .line 132
    goto/16 :goto_8

    .line 133
    .line 134
    :pswitch_1
    const-string p1, "UNDEFINED"

    .line 135
    .line 136
    invoke-static {v5, p1, p3}, Ls8/n;->a0(ILjava/lang/String;Ljava/util/List;)V

    .line 137
    .line 138
    .line 139
    sget-object p1, Lcom/google/android/gms/internal/measurement/n;->N:Lcom/google/android/gms/internal/measurement/r;

    .line 140
    .line 141
    goto/16 :goto_8

    .line 142
    .line 143
    :pswitch_2
    const-string p1, "TYPEOF"

    .line 144
    .line 145
    invoke-static {v6, p1, p3}, Ls8/n;->a0(ILjava/lang/String;Ljava/util/List;)V

    .line 146
    .line 147
    .line 148
    invoke-interface {p3, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 149
    .line 150
    .line 151
    move-result-object p1

    .line 152
    check-cast p1, Lcom/google/android/gms/internal/measurement/n;

    .line 153
    .line 154
    iget-object p3, p2, Lcom/google/firebase/messaging/s;->c:Ljava/lang/Object;

    .line 155
    .line 156
    check-cast p3, Lcom/google/android/gms/internal/measurement/t;

    .line 157
    .line 158
    invoke-virtual {p3, p2, p1}, Lcom/google/android/gms/internal/measurement/t;->a(Lcom/google/firebase/messaging/s;Lcom/google/android/gms/internal/measurement/n;)Lcom/google/android/gms/internal/measurement/n;

    .line 159
    .line 160
    .line 161
    move-result-object p1

    .line 162
    instance-of p2, p1, Lcom/google/android/gms/internal/measurement/r;

    .line 163
    .line 164
    if-eqz p2, :cond_2

    .line 165
    .line 166
    const-string p1, "undefined"

    .line 167
    .line 168
    goto :goto_1

    .line 169
    :cond_2
    instance-of p2, p1, Lcom/google/android/gms/internal/measurement/e;

    .line 170
    .line 171
    if-eqz p2, :cond_3

    .line 172
    .line 173
    const-string p1, "boolean"

    .line 174
    .line 175
    goto :goto_1

    .line 176
    :cond_3
    instance-of p2, p1, Lcom/google/android/gms/internal/measurement/g;

    .line 177
    .line 178
    if-eqz p2, :cond_4

    .line 179
    .line 180
    const-string p1, "number"

    .line 181
    .line 182
    goto :goto_1

    .line 183
    :cond_4
    instance-of p2, p1, Lcom/google/android/gms/internal/measurement/q;

    .line 184
    .line 185
    if-eqz p2, :cond_5

    .line 186
    .line 187
    const-string p1, "string"

    .line 188
    .line 189
    goto :goto_1

    .line 190
    :cond_5
    instance-of p2, p1, Lcom/google/android/gms/internal/measurement/m;

    .line 191
    .line 192
    if-eqz p2, :cond_6

    .line 193
    .line 194
    const-string p1, "function"

    .line 195
    .line 196
    goto :goto_1

    .line 197
    :cond_6
    instance-of p2, p1, Lcom/google/android/gms/internal/measurement/o;

    .line 198
    .line 199
    if-nez p2, :cond_7

    .line 200
    .line 201
    instance-of p2, p1, Lcom/google/android/gms/internal/measurement/f;

    .line 202
    .line 203
    if-nez p2, :cond_7

    .line 204
    .line 205
    const-string p1, "object"

    .line 206
    .line 207
    :goto_1
    new-instance p2, Lcom/google/android/gms/internal/measurement/q;

    .line 208
    .line 209
    invoke-direct {p2, p1}, Lcom/google/android/gms/internal/measurement/q;-><init>(Ljava/lang/String;)V

    .line 210
    .line 211
    .line 212
    :goto_2
    move-object p1, p2

    .line 213
    goto/16 :goto_8

    .line 214
    .line 215
    :cond_7
    new-instance p2, Ljava/lang/IllegalArgumentException;

    .line 216
    .line 217
    new-array p3, v6, [Ljava/lang/Object;

    .line 218
    .line 219
    aput-object p1, p3, v5

    .line 220
    .line 221
    const-string p1, "Unsupported value type %s in typeof"

    .line 222
    .line 223
    invoke-static {p1, p3}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 224
    .line 225
    .line 226
    move-result-object p1

    .line 227
    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 228
    .line 229
    .line 230
    throw p2

    .line 231
    :cond_8
    const-string p1, "GET_PROPERTY"

    .line 232
    .line 233
    invoke-static {v4, p1, p3}, Ls8/n;->a0(ILjava/lang/String;Ljava/util/List;)V

    .line 234
    .line 235
    .line 236
    invoke-interface {p3, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 237
    .line 238
    .line 239
    move-result-object p1

    .line 240
    check-cast p1, Lcom/google/android/gms/internal/measurement/n;

    .line 241
    .line 242
    iget-object v0, p2, Lcom/google/firebase/messaging/s;->c:Ljava/lang/Object;

    .line 243
    .line 244
    check-cast v0, Lcom/google/android/gms/internal/measurement/t;

    .line 245
    .line 246
    invoke-virtual {v0, p2, p1}, Lcom/google/android/gms/internal/measurement/t;->a(Lcom/google/firebase/messaging/s;Lcom/google/android/gms/internal/measurement/n;)Lcom/google/android/gms/internal/measurement/n;

    .line 247
    .line 248
    .line 249
    move-result-object p1

    .line 250
    invoke-interface {p3, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 251
    .line 252
    .line 253
    move-result-object p3

    .line 254
    check-cast p3, Lcom/google/android/gms/internal/measurement/n;

    .line 255
    .line 256
    iget-object v0, p2, Lcom/google/firebase/messaging/s;->c:Ljava/lang/Object;

    .line 257
    .line 258
    check-cast v0, Lcom/google/android/gms/internal/measurement/t;

    .line 259
    .line 260
    invoke-virtual {v0, p2, p3}, Lcom/google/android/gms/internal/measurement/t;->a(Lcom/google/firebase/messaging/s;Lcom/google/android/gms/internal/measurement/n;)Lcom/google/android/gms/internal/measurement/n;

    .line 261
    .line 262
    .line 263
    move-result-object p2

    .line 264
    instance-of p3, p1, Lcom/google/android/gms/internal/measurement/d;

    .line 265
    .line 266
    if-eqz p3, :cond_9

    .line 267
    .line 268
    invoke-static {p2}, Ls8/n;->d0(Lcom/google/android/gms/internal/measurement/n;)Z

    .line 269
    .line 270
    .line 271
    move-result p3

    .line 272
    if-eqz p3, :cond_9

    .line 273
    .line 274
    check-cast p1, Lcom/google/android/gms/internal/measurement/d;

    .line 275
    .line 276
    invoke-interface {p2}, Lcom/google/android/gms/internal/measurement/n;->b()Ljava/lang/Double;

    .line 277
    .line 278
    .line 279
    move-result-object p2

    .line 280
    invoke-virtual {p2}, Ljava/lang/Double;->intValue()I

    .line 281
    .line 282
    .line 283
    move-result p2

    .line 284
    invoke-virtual {p1, p2}, Lcom/google/android/gms/internal/measurement/d;->q(I)Lcom/google/android/gms/internal/measurement/n;

    .line 285
    .line 286
    .line 287
    move-result-object p1

    .line 288
    goto/16 :goto_8

    .line 289
    .line 290
    :cond_9
    instance-of p3, p1, Lcom/google/android/gms/internal/measurement/j;

    .line 291
    .line 292
    if-eqz p3, :cond_a

    .line 293
    .line 294
    check-cast p1, Lcom/google/android/gms/internal/measurement/j;

    .line 295
    .line 296
    invoke-interface {p2}, Lcom/google/android/gms/internal/measurement/n;->c()Ljava/lang/String;

    .line 297
    .line 298
    .line 299
    move-result-object p2

    .line 300
    invoke-interface {p1, p2}, Lcom/google/android/gms/internal/measurement/j;->i(Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/n;

    .line 301
    .line 302
    .line 303
    move-result-object p1

    .line 304
    goto/16 :goto_8

    .line 305
    .line 306
    :cond_a
    instance-of p3, p1, Lcom/google/android/gms/internal/measurement/q;

    .line 307
    .line 308
    if-eqz p3, :cond_c

    .line 309
    .line 310
    invoke-interface {p2}, Lcom/google/android/gms/internal/measurement/n;->c()Ljava/lang/String;

    .line 311
    .line 312
    .line 313
    move-result-object p3

    .line 314
    const-string v0, "length"

    .line 315
    .line 316
    invoke-virtual {v0, p3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 317
    .line 318
    .line 319
    move-result p3

    .line 320
    if-eqz p3, :cond_b

    .line 321
    .line 322
    new-instance p2, Lcom/google/android/gms/internal/measurement/g;

    .line 323
    .line 324
    check-cast p1, Lcom/google/android/gms/internal/measurement/q;

    .line 325
    .line 326
    iget-object p1, p1, Lcom/google/android/gms/internal/measurement/q;->a:Ljava/lang/String;

    .line 327
    .line 328
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 329
    .line 330
    .line 331
    move-result p1

    .line 332
    int-to-double v0, p1

    .line 333
    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 334
    .line 335
    .line 336
    move-result-object p1

    .line 337
    invoke-direct {p2, p1}, Lcom/google/android/gms/internal/measurement/g;-><init>(Ljava/lang/Double;)V

    .line 338
    .line 339
    .line 340
    goto/16 :goto_2

    .line 341
    .line 342
    :cond_b
    invoke-static {p2}, Ls8/n;->d0(Lcom/google/android/gms/internal/measurement/n;)Z

    .line 343
    .line 344
    .line 345
    move-result p3

    .line 346
    if-eqz p3, :cond_c

    .line 347
    .line 348
    invoke-interface {p2}, Lcom/google/android/gms/internal/measurement/n;->b()Ljava/lang/Double;

    .line 349
    .line 350
    .line 351
    move-result-object p3

    .line 352
    invoke-virtual {p3}, Ljava/lang/Double;->doubleValue()D

    .line 353
    .line 354
    .line 355
    move-result-wide v0

    .line 356
    check-cast p1, Lcom/google/android/gms/internal/measurement/q;

    .line 357
    .line 358
    iget-object p3, p1, Lcom/google/android/gms/internal/measurement/q;->a:Ljava/lang/String;

    .line 359
    .line 360
    invoke-virtual {p3}, Ljava/lang/String;->length()I

    .line 361
    .line 362
    .line 363
    move-result p3

    .line 364
    int-to-double v2, p3

    .line 365
    cmpg-double p3, v0, v2

    .line 366
    .line 367
    if-gez p3, :cond_c

    .line 368
    .line 369
    new-instance p3, Lcom/google/android/gms/internal/measurement/q;

    .line 370
    .line 371
    invoke-interface {p2}, Lcom/google/android/gms/internal/measurement/n;->b()Ljava/lang/Double;

    .line 372
    .line 373
    .line 374
    move-result-object p2

    .line 375
    invoke-virtual {p2}, Ljava/lang/Double;->intValue()I

    .line 376
    .line 377
    .line 378
    move-result p2

    .line 379
    iget-object p1, p1, Lcom/google/android/gms/internal/measurement/q;->a:Ljava/lang/String;

    .line 380
    .line 381
    invoke-virtual {p1, p2}, Ljava/lang/String;->charAt(I)C

    .line 382
    .line 383
    .line 384
    move-result p1

    .line 385
    invoke-static {p1}, Ljava/lang/String;->valueOf(C)Ljava/lang/String;

    .line 386
    .line 387
    .line 388
    move-result-object p1

    .line 389
    invoke-direct {p3, p1}, Lcom/google/android/gms/internal/measurement/q;-><init>(Ljava/lang/String;)V

    .line 390
    .line 391
    .line 392
    :goto_3
    move-object p1, p3

    .line 393
    goto/16 :goto_8

    .line 394
    .line 395
    :cond_c
    sget-object p1, Lcom/google/android/gms/internal/measurement/n;->N:Lcom/google/android/gms/internal/measurement/r;

    .line 396
    .line 397
    goto/16 :goto_8

    .line 398
    .line 399
    :cond_d
    invoke-interface {p3}, Ljava/util/List;->isEmpty()Z

    .line 400
    .line 401
    .line 402
    move-result p1

    .line 403
    if-eqz p1, :cond_e

    .line 404
    .line 405
    new-instance p1, Lcom/google/android/gms/internal/measurement/k;

    .line 406
    .line 407
    invoke-direct {p1}, Lcom/google/android/gms/internal/measurement/k;-><init>()V

    .line 408
    .line 409
    .line 410
    goto/16 :goto_8

    .line 411
    .line 412
    :cond_e
    invoke-interface {p3}, Ljava/util/List;->size()I

    .line 413
    .line 414
    .line 415
    move-result p1

    .line 416
    rem-int/2addr p1, v4

    .line 417
    if-nez p1, :cond_10

    .line 418
    .line 419
    new-instance p1, Lcom/google/android/gms/internal/measurement/k;

    .line 420
    .line 421
    invoke-direct {p1}, Lcom/google/android/gms/internal/measurement/k;-><init>()V

    .line 422
    .line 423
    .line 424
    :goto_4
    invoke-interface {p3}, Ljava/util/List;->size()I

    .line 425
    .line 426
    .line 427
    move-result v0

    .line 428
    add-int/lit8 v0, v0, -0x1

    .line 429
    .line 430
    if-ge v5, v0, :cond_22

    .line 431
    .line 432
    invoke-interface {p3, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 433
    .line 434
    .line 435
    move-result-object v0

    .line 436
    check-cast v0, Lcom/google/android/gms/internal/measurement/n;

    .line 437
    .line 438
    iget-object v1, p2, Lcom/google/firebase/messaging/s;->c:Ljava/lang/Object;

    .line 439
    .line 440
    check-cast v1, Lcom/google/android/gms/internal/measurement/t;

    .line 441
    .line 442
    invoke-virtual {v1, p2, v0}, Lcom/google/android/gms/internal/measurement/t;->a(Lcom/google/firebase/messaging/s;Lcom/google/android/gms/internal/measurement/n;)Lcom/google/android/gms/internal/measurement/n;

    .line 443
    .line 444
    .line 445
    move-result-object v0

    .line 446
    add-int/lit8 v1, v5, 0x1

    .line 447
    .line 448
    invoke-interface {p3, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 449
    .line 450
    .line 451
    move-result-object v1

    .line 452
    check-cast v1, Lcom/google/android/gms/internal/measurement/n;

    .line 453
    .line 454
    iget-object v2, p2, Lcom/google/firebase/messaging/s;->c:Ljava/lang/Object;

    .line 455
    .line 456
    check-cast v2, Lcom/google/android/gms/internal/measurement/t;

    .line 457
    .line 458
    invoke-virtual {v2, p2, v1}, Lcom/google/android/gms/internal/measurement/t;->a(Lcom/google/firebase/messaging/s;Lcom/google/android/gms/internal/measurement/n;)Lcom/google/android/gms/internal/measurement/n;

    .line 459
    .line 460
    .line 461
    move-result-object v1

    .line 462
    instance-of v2, v0, Lcom/google/android/gms/internal/measurement/f;

    .line 463
    .line 464
    if-nez v2, :cond_f

    .line 465
    .line 466
    instance-of v2, v1, Lcom/google/android/gms/internal/measurement/f;

    .line 467
    .line 468
    if-nez v2, :cond_f

    .line 469
    .line 470
    invoke-interface {v0}, Lcom/google/android/gms/internal/measurement/n;->c()Ljava/lang/String;

    .line 471
    .line 472
    .line 473
    move-result-object v0

    .line 474
    invoke-virtual {p1, v0, v1}, Lcom/google/android/gms/internal/measurement/k;->k(Ljava/lang/String;Lcom/google/android/gms/internal/measurement/n;)V

    .line 475
    .line 476
    .line 477
    add-int/2addr v5, v4

    .line 478
    goto :goto_4

    .line 479
    :cond_f
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 480
    .line 481
    const-string p2, "Failed to evaluate map entry"

    .line 482
    .line 483
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 484
    .line 485
    .line 486
    throw p1

    .line 487
    :cond_10
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 488
    .line 489
    invoke-interface {p3}, Ljava/util/List;->size()I

    .line 490
    .line 491
    .line 492
    move-result p2

    .line 493
    const-string p3, "CREATE_OBJECT requires an even number of arguments, found "

    .line 494
    .line 495
    invoke-static {p2, p3}, Lcom/google/android/gms/internal/measurement/k1;->j(ILjava/lang/String;)Ljava/lang/String;

    .line 496
    .line 497
    .line 498
    move-result-object p2

    .line 499
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 500
    .line 501
    .line 502
    throw p1

    .line 503
    :cond_11
    invoke-interface {p3}, Ljava/util/List;->isEmpty()Z

    .line 504
    .line 505
    .line 506
    move-result p1

    .line 507
    if-eqz p1, :cond_12

    .line 508
    .line 509
    new-instance p1, Lcom/google/android/gms/internal/measurement/d;

    .line 510
    .line 511
    invoke-direct {p1}, Lcom/google/android/gms/internal/measurement/d;-><init>()V

    .line 512
    .line 513
    .line 514
    goto/16 :goto_8

    .line 515
    .line 516
    :cond_12
    new-instance p1, Lcom/google/android/gms/internal/measurement/d;

    .line 517
    .line 518
    invoke-direct {p1}, Lcom/google/android/gms/internal/measurement/d;-><init>()V

    .line 519
    .line 520
    .line 521
    invoke-virtual {p3}, Ljava/util/ArrayList;->size()I

    .line 522
    .line 523
    .line 524
    move-result v0

    .line 525
    move v1, v5

    .line 526
    :goto_5
    if-ge v1, v0, :cond_22

    .line 527
    .line 528
    invoke-virtual {p3, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 529
    .line 530
    .line 531
    move-result-object v2

    .line 532
    add-int/2addr v1, v6

    .line 533
    check-cast v2, Lcom/google/android/gms/internal/measurement/n;

    .line 534
    .line 535
    iget-object v3, p2, Lcom/google/firebase/messaging/s;->c:Ljava/lang/Object;

    .line 536
    .line 537
    check-cast v3, Lcom/google/android/gms/internal/measurement/t;

    .line 538
    .line 539
    invoke-virtual {v3, p2, v2}, Lcom/google/android/gms/internal/measurement/t;->a(Lcom/google/firebase/messaging/s;Lcom/google/android/gms/internal/measurement/n;)Lcom/google/android/gms/internal/measurement/n;

    .line 540
    .line 541
    .line 542
    move-result-object v2

    .line 543
    instance-of v3, v2, Lcom/google/android/gms/internal/measurement/f;

    .line 544
    .line 545
    if-nez v3, :cond_13

    .line 546
    .line 547
    add-int/lit8 v3, v5, 0x1

    .line 548
    .line 549
    invoke-virtual {p1, v5, v2}, Lcom/google/android/gms/internal/measurement/d;->v(ILcom/google/android/gms/internal/measurement/n;)V

    .line 550
    .line 551
    .line 552
    move v5, v3

    .line 553
    goto :goto_5

    .line 554
    :cond_13
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 555
    .line 556
    const-string p2, "Failed to evaluate array element"

    .line 557
    .line 558
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 559
    .line 560
    .line 561
    throw p1

    .line 562
    :cond_14
    const-string p1, "SET_PROPERTY"

    .line 563
    .line 564
    invoke-static {v2, p1, p3}, Ls8/n;->a0(ILjava/lang/String;Ljava/util/List;)V

    .line 565
    .line 566
    .line 567
    invoke-interface {p3, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 568
    .line 569
    .line 570
    move-result-object p1

    .line 571
    check-cast p1, Lcom/google/android/gms/internal/measurement/n;

    .line 572
    .line 573
    iget-object v0, p2, Lcom/google/firebase/messaging/s;->c:Ljava/lang/Object;

    .line 574
    .line 575
    check-cast v0, Lcom/google/android/gms/internal/measurement/t;

    .line 576
    .line 577
    invoke-virtual {v0, p2, p1}, Lcom/google/android/gms/internal/measurement/t;->a(Lcom/google/firebase/messaging/s;Lcom/google/android/gms/internal/measurement/n;)Lcom/google/android/gms/internal/measurement/n;

    .line 578
    .line 579
    .line 580
    move-result-object p1

    .line 581
    invoke-interface {p3, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 582
    .line 583
    .line 584
    move-result-object v0

    .line 585
    check-cast v0, Lcom/google/android/gms/internal/measurement/n;

    .line 586
    .line 587
    iget-object v1, p2, Lcom/google/firebase/messaging/s;->c:Ljava/lang/Object;

    .line 588
    .line 589
    check-cast v1, Lcom/google/android/gms/internal/measurement/t;

    .line 590
    .line 591
    invoke-virtual {v1, p2, v0}, Lcom/google/android/gms/internal/measurement/t;->a(Lcom/google/firebase/messaging/s;Lcom/google/android/gms/internal/measurement/n;)Lcom/google/android/gms/internal/measurement/n;

    .line 592
    .line 593
    .line 594
    move-result-object v0

    .line 595
    invoke-interface {p3, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 596
    .line 597
    .line 598
    move-result-object p3

    .line 599
    check-cast p3, Lcom/google/android/gms/internal/measurement/n;

    .line 600
    .line 601
    invoke-virtual {v1, p2, p3}, Lcom/google/android/gms/internal/measurement/t;->a(Lcom/google/firebase/messaging/s;Lcom/google/android/gms/internal/measurement/n;)Lcom/google/android/gms/internal/measurement/n;

    .line 602
    .line 603
    .line 604
    move-result-object p2

    .line 605
    sget-object p3, Lcom/google/android/gms/internal/measurement/n;->N:Lcom/google/android/gms/internal/measurement/r;

    .line 606
    .line 607
    if-eq p1, p3, :cond_17

    .line 608
    .line 609
    sget-object p3, Lcom/google/android/gms/internal/measurement/n;->O:Lcom/google/android/gms/internal/measurement/l;

    .line 610
    .line 611
    if-eq p1, p3, :cond_17

    .line 612
    .line 613
    instance-of p3, p1, Lcom/google/android/gms/internal/measurement/d;

    .line 614
    .line 615
    if-eqz p3, :cond_15

    .line 616
    .line 617
    instance-of p3, v0, Lcom/google/android/gms/internal/measurement/g;

    .line 618
    .line 619
    if-eqz p3, :cond_15

    .line 620
    .line 621
    check-cast p1, Lcom/google/android/gms/internal/measurement/d;

    .line 622
    .line 623
    check-cast v0, Lcom/google/android/gms/internal/measurement/g;

    .line 624
    .line 625
    iget-object p3, v0, Lcom/google/android/gms/internal/measurement/g;->a:Ljava/lang/Double;

    .line 626
    .line 627
    invoke-virtual {p3}, Ljava/lang/Double;->intValue()I

    .line 628
    .line 629
    .line 630
    move-result p3

    .line 631
    invoke-virtual {p1, p3, p2}, Lcom/google/android/gms/internal/measurement/d;->v(ILcom/google/android/gms/internal/measurement/n;)V

    .line 632
    .line 633
    .line 634
    goto/16 :goto_2

    .line 635
    .line 636
    :cond_15
    instance-of p3, p1, Lcom/google/android/gms/internal/measurement/j;

    .line 637
    .line 638
    if-nez p3, :cond_16

    .line 639
    .line 640
    goto/16 :goto_2

    .line 641
    .line 642
    :cond_16
    check-cast p1, Lcom/google/android/gms/internal/measurement/j;

    .line 643
    .line 644
    invoke-interface {v0}, Lcom/google/android/gms/internal/measurement/n;->c()Ljava/lang/String;

    .line 645
    .line 646
    .line 647
    move-result-object p3

    .line 648
    invoke-interface {p1, p3, p2}, Lcom/google/android/gms/internal/measurement/j;->k(Ljava/lang/String;Lcom/google/android/gms/internal/measurement/n;)V

    .line 649
    .line 650
    .line 651
    goto/16 :goto_2

    .line 652
    .line 653
    :cond_17
    new-instance p2, Ljava/lang/IllegalStateException;

    .line 654
    .line 655
    invoke-interface {v0}, Lcom/google/android/gms/internal/measurement/n;->c()Ljava/lang/String;

    .line 656
    .line 657
    .line 658
    move-result-object p3

    .line 659
    invoke-interface {p1}, Lcom/google/android/gms/internal/measurement/n;->c()Ljava/lang/String;

    .line 660
    .line 661
    .line 662
    move-result-object p1

    .line 663
    new-instance v0, Ljava/lang/StringBuilder;

    .line 664
    .line 665
    const-string v1, "Can\'t set property "

    .line 666
    .line 667
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 668
    .line 669
    .line 670
    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 671
    .line 672
    .line 673
    const-string p3, " of "

    .line 674
    .line 675
    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 676
    .line 677
    .line 678
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 679
    .line 680
    .line 681
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 682
    .line 683
    .line 684
    move-result-object p1

    .line 685
    invoke-direct {p2, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 686
    .line 687
    .line 688
    throw p2

    .line 689
    :cond_18
    const-string p1, "NULL"

    .line 690
    .line 691
    invoke-static {v5, p1, p3}, Ls8/n;->a0(ILjava/lang/String;Ljava/util/List;)V

    .line 692
    .line 693
    .line 694
    sget-object p1, Lcom/google/android/gms/internal/measurement/n;->O:Lcom/google/android/gms/internal/measurement/l;

    .line 695
    .line 696
    goto/16 :goto_8

    .line 697
    .line 698
    :cond_19
    const-string p1, "GET"

    .line 699
    .line 700
    invoke-static {v6, p1, p3}, Ls8/n;->a0(ILjava/lang/String;Ljava/util/List;)V

    .line 701
    .line 702
    .line 703
    invoke-interface {p3, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 704
    .line 705
    .line 706
    move-result-object p1

    .line 707
    check-cast p1, Lcom/google/android/gms/internal/measurement/n;

    .line 708
    .line 709
    iget-object p3, p2, Lcom/google/firebase/messaging/s;->c:Ljava/lang/Object;

    .line 710
    .line 711
    check-cast p3, Lcom/google/android/gms/internal/measurement/t;

    .line 712
    .line 713
    invoke-virtual {p3, p2, p1}, Lcom/google/android/gms/internal/measurement/t;->a(Lcom/google/firebase/messaging/s;Lcom/google/android/gms/internal/measurement/n;)Lcom/google/android/gms/internal/measurement/n;

    .line 714
    .line 715
    .line 716
    move-result-object p1

    .line 717
    instance-of p3, p1, Lcom/google/android/gms/internal/measurement/q;

    .line 718
    .line 719
    if-eqz p3, :cond_1a

    .line 720
    .line 721
    check-cast p1, Lcom/google/android/gms/internal/measurement/q;

    .line 722
    .line 723
    iget-object p1, p1, Lcom/google/android/gms/internal/measurement/q;->a:Ljava/lang/String;

    .line 724
    .line 725
    invoke-virtual {p2, p1}, Lcom/google/firebase/messaging/s;->C(Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/n;

    .line 726
    .line 727
    .line 728
    move-result-object p1

    .line 729
    goto/16 :goto_8

    .line 730
    .line 731
    :cond_1a
    new-instance p2, Ljava/lang/IllegalArgumentException;

    .line 732
    .line 733
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 734
    .line 735
    .line 736
    move-result-object p1

    .line 737
    invoke-virtual {p1}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    .line 738
    .line 739
    .line 740
    move-result-object p1

    .line 741
    const-string p3, "Expected string for get var. got "

    .line 742
    .line 743
    invoke-static {p3, p1}, Lu0/z;->e(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 744
    .line 745
    .line 746
    move-result-object p1

    .line 747
    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 748
    .line 749
    .line 750
    throw p2

    .line 751
    :cond_1b
    const-string p1, "EXPRESSION_LIST"

    .line 752
    .line 753
    invoke-static {v6, p1, p3}, Ls8/n;->b0(ILjava/lang/String;Ljava/util/List;)V

    .line 754
    .line 755
    .line 756
    sget-object p1, Lcom/google/android/gms/internal/measurement/n;->N:Lcom/google/android/gms/internal/measurement/r;

    .line 757
    .line 758
    :goto_6
    invoke-interface {p3}, Ljava/util/List;->size()I

    .line 759
    .line 760
    .line 761
    move-result v0

    .line 762
    if-ge v5, v0, :cond_22

    .line 763
    .line 764
    invoke-interface {p3, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 765
    .line 766
    .line 767
    move-result-object p1

    .line 768
    check-cast p1, Lcom/google/android/gms/internal/measurement/n;

    .line 769
    .line 770
    iget-object v0, p2, Lcom/google/firebase/messaging/s;->c:Ljava/lang/Object;

    .line 771
    .line 772
    check-cast v0, Lcom/google/android/gms/internal/measurement/t;

    .line 773
    .line 774
    invoke-virtual {v0, p2, p1}, Lcom/google/android/gms/internal/measurement/t;->a(Lcom/google/firebase/messaging/s;Lcom/google/android/gms/internal/measurement/n;)Lcom/google/android/gms/internal/measurement/n;

    .line 775
    .line 776
    .line 777
    move-result-object p1

    .line 778
    instance-of v0, p1, Lcom/google/android/gms/internal/measurement/f;

    .line 779
    .line 780
    if-nez v0, :cond_1c

    .line 781
    .line 782
    add-int/2addr v5, v6

    .line 783
    goto :goto_6

    .line 784
    :cond_1c
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 785
    .line 786
    const-string p2, "ControlValue cannot be in an expression list"

    .line 787
    .line 788
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 789
    .line 790
    .line 791
    throw p1

    .line 792
    :cond_1d
    const-string p1, "CONST"

    .line 793
    .line 794
    invoke-static {v4, p1, p3}, Ls8/n;->b0(ILjava/lang/String;Ljava/util/List;)V

    .line 795
    .line 796
    .line 797
    invoke-interface {p3}, Ljava/util/List;->size()I

    .line 798
    .line 799
    .line 800
    move-result p1

    .line 801
    rem-int/2addr p1, v4

    .line 802
    if-nez p1, :cond_20

    .line 803
    .line 804
    :goto_7
    invoke-interface {p3}, Ljava/util/List;->size()I

    .line 805
    .line 806
    .line 807
    move-result p1

    .line 808
    add-int/lit8 p1, p1, -0x1

    .line 809
    .line 810
    if-ge v5, p1, :cond_1f

    .line 811
    .line 812
    invoke-interface {p3, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 813
    .line 814
    .line 815
    move-result-object p1

    .line 816
    check-cast p1, Lcom/google/android/gms/internal/measurement/n;

    .line 817
    .line 818
    iget-object v0, p2, Lcom/google/firebase/messaging/s;->c:Ljava/lang/Object;

    .line 819
    .line 820
    check-cast v0, Lcom/google/android/gms/internal/measurement/t;

    .line 821
    .line 822
    invoke-virtual {v0, p2, p1}, Lcom/google/android/gms/internal/measurement/t;->a(Lcom/google/firebase/messaging/s;Lcom/google/android/gms/internal/measurement/n;)Lcom/google/android/gms/internal/measurement/n;

    .line 823
    .line 824
    .line 825
    move-result-object p1

    .line 826
    instance-of v0, p1, Lcom/google/android/gms/internal/measurement/q;

    .line 827
    .line 828
    if-eqz v0, :cond_1e

    .line 829
    .line 830
    check-cast p1, Lcom/google/android/gms/internal/measurement/q;

    .line 831
    .line 832
    iget-object p1, p1, Lcom/google/android/gms/internal/measurement/q;->a:Ljava/lang/String;

    .line 833
    .line 834
    add-int/lit8 v0, v5, 0x1

    .line 835
    .line 836
    invoke-interface {p3, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 837
    .line 838
    .line 839
    move-result-object v0

    .line 840
    check-cast v0, Lcom/google/android/gms/internal/measurement/n;

    .line 841
    .line 842
    iget-object v1, p2, Lcom/google/firebase/messaging/s;->c:Ljava/lang/Object;

    .line 843
    .line 844
    check-cast v1, Lcom/google/android/gms/internal/measurement/t;

    .line 845
    .line 846
    invoke-virtual {v1, p2, v0}, Lcom/google/android/gms/internal/measurement/t;->a(Lcom/google/firebase/messaging/s;Lcom/google/android/gms/internal/measurement/n;)Lcom/google/android/gms/internal/measurement/n;

    .line 847
    .line 848
    .line 849
    move-result-object v0

    .line 850
    invoke-virtual {p2, p1, v0}, Lcom/google/firebase/messaging/s;->E(Ljava/lang/String;Lcom/google/android/gms/internal/measurement/n;)V

    .line 851
    .line 852
    .line 853
    iget-object v0, p2, Lcom/google/firebase/messaging/s;->e:Ljava/lang/Object;

    .line 854
    .line 855
    check-cast v0, Ljava/util/HashMap;

    .line 856
    .line 857
    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 858
    .line 859
    invoke-virtual {v0, p1, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 860
    .line 861
    .line 862
    add-int/2addr v5, v4

    .line 863
    goto :goto_7

    .line 864
    :cond_1e
    new-instance p2, Ljava/lang/IllegalArgumentException;

    .line 865
    .line 866
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 867
    .line 868
    .line 869
    move-result-object p1

    .line 870
    invoke-virtual {p1}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    .line 871
    .line 872
    .line 873
    move-result-object p1

    .line 874
    const-string p3, "Expected string for const name. got "

    .line 875
    .line 876
    invoke-static {p3, p1}, Lu0/z;->e(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 877
    .line 878
    .line 879
    move-result-object p1

    .line 880
    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 881
    .line 882
    .line 883
    throw p2

    .line 884
    :cond_1f
    sget-object p1, Lcom/google/android/gms/internal/measurement/n;->N:Lcom/google/android/gms/internal/measurement/r;

    .line 885
    .line 886
    goto :goto_8

    .line 887
    :cond_20
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 888
    .line 889
    invoke-interface {p3}, Ljava/util/List;->size()I

    .line 890
    .line 891
    .line 892
    move-result p2

    .line 893
    const-string p3, "CONST requires an even number of arguments, found "

    .line 894
    .line 895
    invoke-static {p2, p3}, Lcom/google/android/gms/internal/measurement/k1;->j(ILjava/lang/String;)Ljava/lang/String;

    .line 896
    .line 897
    .line 898
    move-result-object p2

    .line 899
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 900
    .line 901
    .line 902
    throw p1

    .line 903
    :cond_21
    const-string p1, "ASSIGN"

    .line 904
    .line 905
    invoke-static {v4, p1, p3}, Ls8/n;->a0(ILjava/lang/String;Ljava/util/List;)V

    .line 906
    .line 907
    .line 908
    invoke-interface {p3, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 909
    .line 910
    .line 911
    move-result-object p1

    .line 912
    check-cast p1, Lcom/google/android/gms/internal/measurement/n;

    .line 913
    .line 914
    iget-object v0, p2, Lcom/google/firebase/messaging/s;->c:Ljava/lang/Object;

    .line 915
    .line 916
    check-cast v0, Lcom/google/android/gms/internal/measurement/t;

    .line 917
    .line 918
    invoke-virtual {v0, p2, p1}, Lcom/google/android/gms/internal/measurement/t;->a(Lcom/google/firebase/messaging/s;Lcom/google/android/gms/internal/measurement/n;)Lcom/google/android/gms/internal/measurement/n;

    .line 919
    .line 920
    .line 921
    move-result-object p1

    .line 922
    instance-of v0, p1, Lcom/google/android/gms/internal/measurement/q;

    .line 923
    .line 924
    if-eqz v0, :cond_24

    .line 925
    .line 926
    check-cast p1, Lcom/google/android/gms/internal/measurement/q;

    .line 927
    .line 928
    iget-object v0, p1, Lcom/google/android/gms/internal/measurement/q;->a:Ljava/lang/String;

    .line 929
    .line 930
    invoke-virtual {p2, v0}, Lcom/google/firebase/messaging/s;->G(Ljava/lang/String;)Z

    .line 931
    .line 932
    .line 933
    move-result v0

    .line 934
    iget-object p1, p1, Lcom/google/android/gms/internal/measurement/q;->a:Ljava/lang/String;

    .line 935
    .line 936
    if-eqz v0, :cond_23

    .line 937
    .line 938
    invoke-interface {p3, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 939
    .line 940
    .line 941
    move-result-object p3

    .line 942
    check-cast p3, Lcom/google/android/gms/internal/measurement/n;

    .line 943
    .line 944
    iget-object v0, p2, Lcom/google/firebase/messaging/s;->c:Ljava/lang/Object;

    .line 945
    .line 946
    check-cast v0, Lcom/google/android/gms/internal/measurement/t;

    .line 947
    .line 948
    invoke-virtual {v0, p2, p3}, Lcom/google/android/gms/internal/measurement/t;->a(Lcom/google/firebase/messaging/s;Lcom/google/android/gms/internal/measurement/n;)Lcom/google/android/gms/internal/measurement/n;

    .line 949
    .line 950
    .line 951
    move-result-object p3

    .line 952
    invoke-virtual {p2, p1, p3}, Lcom/google/firebase/messaging/s;->F(Ljava/lang/String;Lcom/google/android/gms/internal/measurement/n;)V

    .line 953
    .line 954
    .line 955
    goto/16 :goto_3

    .line 956
    .line 957
    :cond_22
    :goto_8
    return-object p1

    .line 958
    :cond_23
    new-instance p2, Ljava/lang/IllegalArgumentException;

    .line 959
    .line 960
    const-string p3, "Attempting to assign undefined value "

    .line 961
    .line 962
    invoke-static {p3, p1}, Lu0/z;->e(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 963
    .line 964
    .line 965
    move-result-object p1

    .line 966
    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 967
    .line 968
    .line 969
    throw p2

    .line 970
    :cond_24
    new-instance p2, Ljava/lang/IllegalArgumentException;

    .line 971
    .line 972
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 973
    .line 974
    .line 975
    move-result-object p1

    .line 976
    invoke-virtual {p1}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    .line 977
    .line 978
    .line 979
    move-result-object p1

    .line 980
    const-string p3, "Expected string for assign var. got "

    .line 981
    .line 982
    invoke-static {p3, p1}, Lu0/z;->e(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 983
    .line 984
    .line 985
    move-result-object p1

    .line 986
    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 987
    .line 988
    .line 989
    throw p2

    .line 990
    :pswitch_3
    if-eqz p1, :cond_26

    .line 991
    .line 992
    invoke-virtual {p1}, Ljava/lang/String;->isEmpty()Z

    .line 993
    .line 994
    .line 995
    move-result v0

    .line 996
    if-nez v0, :cond_26

    .line 997
    .line 998
    invoke-virtual {p2, p1}, Lcom/google/firebase/messaging/s;->G(Ljava/lang/String;)Z

    .line 999
    .line 1000
    .line 1001
    move-result v0

    .line 1002
    if-eqz v0, :cond_26

    .line 1003
    .line 1004
    invoke-virtual {p2, p1}, Lcom/google/firebase/messaging/s;->C(Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/n;

    .line 1005
    .line 1006
    .line 1007
    move-result-object v0

    .line 1008
    instance-of v1, v0, Lcom/google/android/gms/internal/measurement/h;

    .line 1009
    .line 1010
    if-eqz v1, :cond_25

    .line 1011
    .line 1012
    check-cast v0, Lcom/google/android/gms/internal/measurement/h;

    .line 1013
    .line 1014
    invoke-virtual {v0, p2, p3}, Lcom/google/android/gms/internal/measurement/h;->a(Lcom/google/firebase/messaging/s;Ljava/util/List;)Lcom/google/android/gms/internal/measurement/n;

    .line 1015
    .line 1016
    .line 1017
    move-result-object p1

    .line 1018
    return-object p1

    .line 1019
    :cond_25
    new-instance p2, Ljava/lang/IllegalArgumentException;

    .line 1020
    .line 1021
    const-string p3, "Function "

    .line 1022
    .line 1023
    const-string v0, " is not defined"

    .line 1024
    .line 1025
    invoke-static {p3, p1, v0}, LA0/a;->n(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 1026
    .line 1027
    .line 1028
    move-result-object p1

    .line 1029
    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 1030
    .line 1031
    .line 1032
    throw p2

    .line 1033
    :cond_26
    new-instance p2, Ljava/lang/IllegalArgumentException;

    .line 1034
    .line 1035
    const-string p3, "Command not found: "

    .line 1036
    .line 1037
    invoke-static {p3, p1}, Lu0/z;->e(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 1038
    .line 1039
    .line 1040
    move-result-object p1

    .line 1041
    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 1042
    .line 1043
    .line 1044
    throw p2

    .line 1045
    :pswitch_4
    sget-object v0, Lcom/google/android/gms/internal/measurement/w;->b:Lcom/google/android/gms/internal/measurement/w;

    .line 1046
    .line 1047
    invoke-static {p1}, Ls8/n;->X(Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/w;

    .line 1048
    .line 1049
    .line 1050
    move-result-object v0

    .line 1051
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 1052
    .line 1053
    .line 1054
    move-result v0

    .line 1055
    if-eqz v0, :cond_2b

    .line 1056
    .line 1057
    const/16 v1, 0x15

    .line 1058
    .line 1059
    if-eq v0, v1, :cond_2a

    .line 1060
    .line 1061
    const/16 v1, 0x3b

    .line 1062
    .line 1063
    if-eq v0, v1, :cond_29

    .line 1064
    .line 1065
    const/16 v1, 0x34

    .line 1066
    .line 1067
    if-eq v0, v1, :cond_28

    .line 1068
    .line 1069
    const/16 v1, 0x35

    .line 1070
    .line 1071
    if-eq v0, v1, :cond_28

    .line 1072
    .line 1073
    const/16 v1, 0x37

    .line 1074
    .line 1075
    if-eq v0, v1, :cond_27

    .line 1076
    .line 1077
    const/16 v1, 0x38

    .line 1078
    .line 1079
    if-eq v0, v1, :cond_27

    .line 1080
    .line 1081
    packed-switch v0, :pswitch_data_2

    .line 1082
    .line 1083
    .line 1084
    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/measurement/s;->b(Ljava/lang/String;)V

    .line 1085
    .line 1086
    .line 1087
    throw v3

    .line 1088
    :pswitch_5
    const-string p1, "NEGATE"

    .line 1089
    .line 1090
    invoke-static {v6, p1, p3}, Ls8/n;->a0(ILjava/lang/String;Ljava/util/List;)V

    .line 1091
    .line 1092
    .line 1093
    invoke-interface {p3, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1094
    .line 1095
    .line 1096
    move-result-object p1

    .line 1097
    check-cast p1, Lcom/google/android/gms/internal/measurement/n;

    .line 1098
    .line 1099
    iget-object p3, p2, Lcom/google/firebase/messaging/s;->c:Ljava/lang/Object;

    .line 1100
    .line 1101
    check-cast p3, Lcom/google/android/gms/internal/measurement/t;

    .line 1102
    .line 1103
    invoke-virtual {p3, p2, p1}, Lcom/google/android/gms/internal/measurement/t;->a(Lcom/google/firebase/messaging/s;Lcom/google/android/gms/internal/measurement/n;)Lcom/google/android/gms/internal/measurement/n;

    .line 1104
    .line 1105
    .line 1106
    move-result-object p1

    .line 1107
    new-instance p2, Lcom/google/android/gms/internal/measurement/g;

    .line 1108
    .line 1109
    invoke-interface {p1}, Lcom/google/android/gms/internal/measurement/n;->b()Ljava/lang/Double;

    .line 1110
    .line 1111
    .line 1112
    move-result-object p1

    .line 1113
    invoke-virtual {p1}, Ljava/lang/Double;->doubleValue()D

    .line 1114
    .line 1115
    .line 1116
    move-result-wide v0

    .line 1117
    neg-double v0, v0

    .line 1118
    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 1119
    .line 1120
    .line 1121
    move-result-object p1

    .line 1122
    invoke-direct {p2, p1}, Lcom/google/android/gms/internal/measurement/g;-><init>(Ljava/lang/Double;)V

    .line 1123
    .line 1124
    .line 1125
    goto/16 :goto_b

    .line 1126
    .line 1127
    :pswitch_6
    const-string p1, "MULTIPLY"

    .line 1128
    .line 1129
    invoke-static {v4, p1, p3}, Ls8/n;->a0(ILjava/lang/String;Ljava/util/List;)V

    .line 1130
    .line 1131
    .line 1132
    invoke-interface {p3, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1133
    .line 1134
    .line 1135
    move-result-object p1

    .line 1136
    check-cast p1, Lcom/google/android/gms/internal/measurement/n;

    .line 1137
    .line 1138
    iget-object v0, p2, Lcom/google/firebase/messaging/s;->c:Ljava/lang/Object;

    .line 1139
    .line 1140
    check-cast v0, Lcom/google/android/gms/internal/measurement/t;

    .line 1141
    .line 1142
    invoke-virtual {v0, p2, p1}, Lcom/google/android/gms/internal/measurement/t;->a(Lcom/google/firebase/messaging/s;Lcom/google/android/gms/internal/measurement/n;)Lcom/google/android/gms/internal/measurement/n;

    .line 1143
    .line 1144
    .line 1145
    move-result-object p1

    .line 1146
    invoke-interface {p1}, Lcom/google/android/gms/internal/measurement/n;->b()Ljava/lang/Double;

    .line 1147
    .line 1148
    .line 1149
    move-result-object p1

    .line 1150
    invoke-virtual {p1}, Ljava/lang/Double;->doubleValue()D

    .line 1151
    .line 1152
    .line 1153
    move-result-wide v0

    .line 1154
    invoke-interface {p3, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1155
    .line 1156
    .line 1157
    move-result-object p1

    .line 1158
    check-cast p1, Lcom/google/android/gms/internal/measurement/n;

    .line 1159
    .line 1160
    iget-object p3, p2, Lcom/google/firebase/messaging/s;->c:Ljava/lang/Object;

    .line 1161
    .line 1162
    check-cast p3, Lcom/google/android/gms/internal/measurement/t;

    .line 1163
    .line 1164
    invoke-virtual {p3, p2, p1}, Lcom/google/android/gms/internal/measurement/t;->a(Lcom/google/firebase/messaging/s;Lcom/google/android/gms/internal/measurement/n;)Lcom/google/android/gms/internal/measurement/n;

    .line 1165
    .line 1166
    .line 1167
    move-result-object p1

    .line 1168
    invoke-interface {p1}, Lcom/google/android/gms/internal/measurement/n;->b()Ljava/lang/Double;

    .line 1169
    .line 1170
    .line 1171
    move-result-object p1

    .line 1172
    invoke-virtual {p1}, Ljava/lang/Double;->doubleValue()D

    .line 1173
    .line 1174
    .line 1175
    move-result-wide p1

    .line 1176
    mul-double/2addr p1, v0

    .line 1177
    new-instance p3, Lcom/google/android/gms/internal/measurement/g;

    .line 1178
    .line 1179
    invoke-static {p1, p2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 1180
    .line 1181
    .line 1182
    move-result-object p1

    .line 1183
    invoke-direct {p3, p1}, Lcom/google/android/gms/internal/measurement/g;-><init>(Ljava/lang/Double;)V

    .line 1184
    .line 1185
    .line 1186
    :goto_9
    move-object p2, p3

    .line 1187
    goto/16 :goto_b

    .line 1188
    .line 1189
    :pswitch_7
    const-string p1, "MODULUS"

    .line 1190
    .line 1191
    invoke-static {v4, p1, p3}, Ls8/n;->a0(ILjava/lang/String;Ljava/util/List;)V

    .line 1192
    .line 1193
    .line 1194
    invoke-interface {p3, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1195
    .line 1196
    .line 1197
    move-result-object p1

    .line 1198
    check-cast p1, Lcom/google/android/gms/internal/measurement/n;

    .line 1199
    .line 1200
    iget-object v0, p2, Lcom/google/firebase/messaging/s;->c:Ljava/lang/Object;

    .line 1201
    .line 1202
    check-cast v0, Lcom/google/android/gms/internal/measurement/t;

    .line 1203
    .line 1204
    invoke-virtual {v0, p2, p1}, Lcom/google/android/gms/internal/measurement/t;->a(Lcom/google/firebase/messaging/s;Lcom/google/android/gms/internal/measurement/n;)Lcom/google/android/gms/internal/measurement/n;

    .line 1205
    .line 1206
    .line 1207
    move-result-object p1

    .line 1208
    invoke-interface {p1}, Lcom/google/android/gms/internal/measurement/n;->b()Ljava/lang/Double;

    .line 1209
    .line 1210
    .line 1211
    move-result-object p1

    .line 1212
    invoke-virtual {p1}, Ljava/lang/Double;->doubleValue()D

    .line 1213
    .line 1214
    .line 1215
    move-result-wide v0

    .line 1216
    invoke-interface {p3, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1217
    .line 1218
    .line 1219
    move-result-object p1

    .line 1220
    check-cast p1, Lcom/google/android/gms/internal/measurement/n;

    .line 1221
    .line 1222
    iget-object p3, p2, Lcom/google/firebase/messaging/s;->c:Ljava/lang/Object;

    .line 1223
    .line 1224
    check-cast p3, Lcom/google/android/gms/internal/measurement/t;

    .line 1225
    .line 1226
    invoke-virtual {p3, p2, p1}, Lcom/google/android/gms/internal/measurement/t;->a(Lcom/google/firebase/messaging/s;Lcom/google/android/gms/internal/measurement/n;)Lcom/google/android/gms/internal/measurement/n;

    .line 1227
    .line 1228
    .line 1229
    move-result-object p1

    .line 1230
    invoke-interface {p1}, Lcom/google/android/gms/internal/measurement/n;->b()Ljava/lang/Double;

    .line 1231
    .line 1232
    .line 1233
    move-result-object p1

    .line 1234
    invoke-virtual {p1}, Ljava/lang/Double;->doubleValue()D

    .line 1235
    .line 1236
    .line 1237
    move-result-wide p1

    .line 1238
    rem-double/2addr v0, p1

    .line 1239
    new-instance p2, Lcom/google/android/gms/internal/measurement/g;

    .line 1240
    .line 1241
    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 1242
    .line 1243
    .line 1244
    move-result-object p1

    .line 1245
    invoke-direct {p2, p1}, Lcom/google/android/gms/internal/measurement/g;-><init>(Ljava/lang/Double;)V

    .line 1246
    .line 1247
    .line 1248
    goto/16 :goto_b

    .line 1249
    .line 1250
    :cond_27
    invoke-static {v6, p1, p3}, Ls8/n;->a0(ILjava/lang/String;Ljava/util/List;)V

    .line 1251
    .line 1252
    .line 1253
    invoke-interface {p3, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1254
    .line 1255
    .line 1256
    move-result-object p1

    .line 1257
    check-cast p1, Lcom/google/android/gms/internal/measurement/n;

    .line 1258
    .line 1259
    iget-object p3, p2, Lcom/google/firebase/messaging/s;->c:Ljava/lang/Object;

    .line 1260
    .line 1261
    check-cast p3, Lcom/google/android/gms/internal/measurement/t;

    .line 1262
    .line 1263
    invoke-virtual {p3, p2, p1}, Lcom/google/android/gms/internal/measurement/t;->a(Lcom/google/firebase/messaging/s;Lcom/google/android/gms/internal/measurement/n;)Lcom/google/android/gms/internal/measurement/n;

    .line 1264
    .line 1265
    .line 1266
    move-result-object p2

    .line 1267
    goto/16 :goto_b

    .line 1268
    .line 1269
    :cond_28
    invoke-static {v4, p1, p3}, Ls8/n;->a0(ILjava/lang/String;Ljava/util/List;)V

    .line 1270
    .line 1271
    .line 1272
    invoke-interface {p3, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1273
    .line 1274
    .line 1275
    move-result-object p1

    .line 1276
    check-cast p1, Lcom/google/android/gms/internal/measurement/n;

    .line 1277
    .line 1278
    iget-object v0, p2, Lcom/google/firebase/messaging/s;->c:Ljava/lang/Object;

    .line 1279
    .line 1280
    check-cast v0, Lcom/google/android/gms/internal/measurement/t;

    .line 1281
    .line 1282
    invoke-virtual {v0, p2, p1}, Lcom/google/android/gms/internal/measurement/t;->a(Lcom/google/firebase/messaging/s;Lcom/google/android/gms/internal/measurement/n;)Lcom/google/android/gms/internal/measurement/n;

    .line 1283
    .line 1284
    .line 1285
    move-result-object p1

    .line 1286
    invoke-interface {p3, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1287
    .line 1288
    .line 1289
    move-result-object p3

    .line 1290
    check-cast p3, Lcom/google/android/gms/internal/measurement/n;

    .line 1291
    .line 1292
    invoke-virtual {p2, p3}, Lcom/google/firebase/messaging/s;->z(Lcom/google/android/gms/internal/measurement/n;)Lcom/google/android/gms/internal/measurement/n;

    .line 1293
    .line 1294
    .line 1295
    move-object p2, p1

    .line 1296
    goto/16 :goto_b

    .line 1297
    .line 1298
    :cond_29
    const-string p1, "SUBTRACT"

    .line 1299
    .line 1300
    invoke-static {v4, p1, p3}, Ls8/n;->a0(ILjava/lang/String;Ljava/util/List;)V

    .line 1301
    .line 1302
    .line 1303
    invoke-interface {p3, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1304
    .line 1305
    .line 1306
    move-result-object p1

    .line 1307
    check-cast p1, Lcom/google/android/gms/internal/measurement/n;

    .line 1308
    .line 1309
    iget-object v0, p2, Lcom/google/firebase/messaging/s;->c:Ljava/lang/Object;

    .line 1310
    .line 1311
    check-cast v0, Lcom/google/android/gms/internal/measurement/t;

    .line 1312
    .line 1313
    invoke-virtual {v0, p2, p1}, Lcom/google/android/gms/internal/measurement/t;->a(Lcom/google/firebase/messaging/s;Lcom/google/android/gms/internal/measurement/n;)Lcom/google/android/gms/internal/measurement/n;

    .line 1314
    .line 1315
    .line 1316
    move-result-object p1

    .line 1317
    invoke-interface {p3, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1318
    .line 1319
    .line 1320
    move-result-object p3

    .line 1321
    check-cast p3, Lcom/google/android/gms/internal/measurement/n;

    .line 1322
    .line 1323
    iget-object v0, p2, Lcom/google/firebase/messaging/s;->c:Ljava/lang/Object;

    .line 1324
    .line 1325
    check-cast v0, Lcom/google/android/gms/internal/measurement/t;

    .line 1326
    .line 1327
    invoke-virtual {v0, p2, p3}, Lcom/google/android/gms/internal/measurement/t;->a(Lcom/google/firebase/messaging/s;Lcom/google/android/gms/internal/measurement/n;)Lcom/google/android/gms/internal/measurement/n;

    .line 1328
    .line 1329
    .line 1330
    move-result-object p2

    .line 1331
    invoke-interface {p2}, Lcom/google/android/gms/internal/measurement/n;->b()Ljava/lang/Double;

    .line 1332
    .line 1333
    .line 1334
    move-result-object p2

    .line 1335
    invoke-virtual {p2}, Ljava/lang/Double;->doubleValue()D

    .line 1336
    .line 1337
    .line 1338
    move-result-wide p2

    .line 1339
    neg-double p2, p2

    .line 1340
    new-instance v0, Lcom/google/android/gms/internal/measurement/g;

    .line 1341
    .line 1342
    invoke-interface {p1}, Lcom/google/android/gms/internal/measurement/n;->b()Ljava/lang/Double;

    .line 1343
    .line 1344
    .line 1345
    move-result-object p1

    .line 1346
    invoke-virtual {p1}, Ljava/lang/Double;->doubleValue()D

    .line 1347
    .line 1348
    .line 1349
    move-result-wide v1

    .line 1350
    add-double/2addr v1, p2

    .line 1351
    invoke-static {v1, v2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 1352
    .line 1353
    .line 1354
    move-result-object p1

    .line 1355
    invoke-direct {v0, p1}, Lcom/google/android/gms/internal/measurement/g;-><init>(Ljava/lang/Double;)V

    .line 1356
    .line 1357
    .line 1358
    move-object p2, v0

    .line 1359
    goto/16 :goto_b

    .line 1360
    .line 1361
    :cond_2a
    const-string p1, "DIVIDE"

    .line 1362
    .line 1363
    invoke-static {v4, p1, p3}, Ls8/n;->a0(ILjava/lang/String;Ljava/util/List;)V

    .line 1364
    .line 1365
    .line 1366
    invoke-interface {p3, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1367
    .line 1368
    .line 1369
    move-result-object p1

    .line 1370
    check-cast p1, Lcom/google/android/gms/internal/measurement/n;

    .line 1371
    .line 1372
    iget-object v0, p2, Lcom/google/firebase/messaging/s;->c:Ljava/lang/Object;

    .line 1373
    .line 1374
    check-cast v0, Lcom/google/android/gms/internal/measurement/t;

    .line 1375
    .line 1376
    invoke-virtual {v0, p2, p1}, Lcom/google/android/gms/internal/measurement/t;->a(Lcom/google/firebase/messaging/s;Lcom/google/android/gms/internal/measurement/n;)Lcom/google/android/gms/internal/measurement/n;

    .line 1377
    .line 1378
    .line 1379
    move-result-object p1

    .line 1380
    invoke-interface {p1}, Lcom/google/android/gms/internal/measurement/n;->b()Ljava/lang/Double;

    .line 1381
    .line 1382
    .line 1383
    move-result-object p1

    .line 1384
    invoke-virtual {p1}, Ljava/lang/Double;->doubleValue()D

    .line 1385
    .line 1386
    .line 1387
    move-result-wide v0

    .line 1388
    invoke-interface {p3, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1389
    .line 1390
    .line 1391
    move-result-object p1

    .line 1392
    check-cast p1, Lcom/google/android/gms/internal/measurement/n;

    .line 1393
    .line 1394
    iget-object p3, p2, Lcom/google/firebase/messaging/s;->c:Ljava/lang/Object;

    .line 1395
    .line 1396
    check-cast p3, Lcom/google/android/gms/internal/measurement/t;

    .line 1397
    .line 1398
    invoke-virtual {p3, p2, p1}, Lcom/google/android/gms/internal/measurement/t;->a(Lcom/google/firebase/messaging/s;Lcom/google/android/gms/internal/measurement/n;)Lcom/google/android/gms/internal/measurement/n;

    .line 1399
    .line 1400
    .line 1401
    move-result-object p1

    .line 1402
    invoke-interface {p1}, Lcom/google/android/gms/internal/measurement/n;->b()Ljava/lang/Double;

    .line 1403
    .line 1404
    .line 1405
    move-result-object p1

    .line 1406
    invoke-virtual {p1}, Ljava/lang/Double;->doubleValue()D

    .line 1407
    .line 1408
    .line 1409
    move-result-wide p1

    .line 1410
    div-double/2addr v0, p1

    .line 1411
    new-instance p2, Lcom/google/android/gms/internal/measurement/g;

    .line 1412
    .line 1413
    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 1414
    .line 1415
    .line 1416
    move-result-object p1

    .line 1417
    invoke-direct {p2, p1}, Lcom/google/android/gms/internal/measurement/g;-><init>(Ljava/lang/Double;)V

    .line 1418
    .line 1419
    .line 1420
    goto :goto_b

    .line 1421
    :cond_2b
    const-string p1, "ADD"

    .line 1422
    .line 1423
    invoke-static {v4, p1, p3}, Ls8/n;->a0(ILjava/lang/String;Ljava/util/List;)V

    .line 1424
    .line 1425
    .line 1426
    invoke-interface {p3, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1427
    .line 1428
    .line 1429
    move-result-object p1

    .line 1430
    check-cast p1, Lcom/google/android/gms/internal/measurement/n;

    .line 1431
    .line 1432
    iget-object v0, p2, Lcom/google/firebase/messaging/s;->c:Ljava/lang/Object;

    .line 1433
    .line 1434
    check-cast v0, Lcom/google/android/gms/internal/measurement/t;

    .line 1435
    .line 1436
    invoke-virtual {v0, p2, p1}, Lcom/google/android/gms/internal/measurement/t;->a(Lcom/google/firebase/messaging/s;Lcom/google/android/gms/internal/measurement/n;)Lcom/google/android/gms/internal/measurement/n;

    .line 1437
    .line 1438
    .line 1439
    move-result-object p1

    .line 1440
    invoke-interface {p3, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1441
    .line 1442
    .line 1443
    move-result-object p3

    .line 1444
    check-cast p3, Lcom/google/android/gms/internal/measurement/n;

    .line 1445
    .line 1446
    iget-object v0, p2, Lcom/google/firebase/messaging/s;->c:Ljava/lang/Object;

    .line 1447
    .line 1448
    check-cast v0, Lcom/google/android/gms/internal/measurement/t;

    .line 1449
    .line 1450
    invoke-virtual {v0, p2, p3}, Lcom/google/android/gms/internal/measurement/t;->a(Lcom/google/firebase/messaging/s;Lcom/google/android/gms/internal/measurement/n;)Lcom/google/android/gms/internal/measurement/n;

    .line 1451
    .line 1452
    .line 1453
    move-result-object p2

    .line 1454
    instance-of p3, p1, Lcom/google/android/gms/internal/measurement/j;

    .line 1455
    .line 1456
    if-nez p3, :cond_2d

    .line 1457
    .line 1458
    instance-of p3, p1, Lcom/google/android/gms/internal/measurement/q;

    .line 1459
    .line 1460
    if-nez p3, :cond_2d

    .line 1461
    .line 1462
    instance-of p3, p2, Lcom/google/android/gms/internal/measurement/j;

    .line 1463
    .line 1464
    if-nez p3, :cond_2d

    .line 1465
    .line 1466
    instance-of p3, p2, Lcom/google/android/gms/internal/measurement/q;

    .line 1467
    .line 1468
    if-eqz p3, :cond_2c

    .line 1469
    .line 1470
    goto :goto_a

    .line 1471
    :cond_2c
    new-instance p3, Lcom/google/android/gms/internal/measurement/g;

    .line 1472
    .line 1473
    invoke-interface {p1}, Lcom/google/android/gms/internal/measurement/n;->b()Ljava/lang/Double;

    .line 1474
    .line 1475
    .line 1476
    move-result-object p1

    .line 1477
    invoke-virtual {p1}, Ljava/lang/Double;->doubleValue()D

    .line 1478
    .line 1479
    .line 1480
    move-result-wide v0

    .line 1481
    invoke-interface {p2}, Lcom/google/android/gms/internal/measurement/n;->b()Ljava/lang/Double;

    .line 1482
    .line 1483
    .line 1484
    move-result-object p1

    .line 1485
    invoke-virtual {p1}, Ljava/lang/Double;->doubleValue()D

    .line 1486
    .line 1487
    .line 1488
    move-result-wide p1

    .line 1489
    add-double/2addr p1, v0

    .line 1490
    invoke-static {p1, p2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 1491
    .line 1492
    .line 1493
    move-result-object p1

    .line 1494
    invoke-direct {p3, p1}, Lcom/google/android/gms/internal/measurement/g;-><init>(Ljava/lang/Double;)V

    .line 1495
    .line 1496
    .line 1497
    goto/16 :goto_9

    .line 1498
    .line 1499
    :cond_2d
    :goto_a
    new-instance p3, Lcom/google/android/gms/internal/measurement/q;

    .line 1500
    .line 1501
    invoke-interface {p1}, Lcom/google/android/gms/internal/measurement/n;->c()Ljava/lang/String;

    .line 1502
    .line 1503
    .line 1504
    move-result-object p1

    .line 1505
    invoke-interface {p2}, Lcom/google/android/gms/internal/measurement/n;->c()Ljava/lang/String;

    .line 1506
    .line 1507
    .line 1508
    move-result-object p2

    .line 1509
    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 1510
    .line 1511
    .line 1512
    move-result-object p1

    .line 1513
    invoke-static {p2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 1514
    .line 1515
    .line 1516
    move-result-object p2

    .line 1517
    invoke-virtual {p1, p2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 1518
    .line 1519
    .line 1520
    move-result-object p1

    .line 1521
    invoke-direct {p3, p1}, Lcom/google/android/gms/internal/measurement/q;-><init>(Ljava/lang/String;)V

    .line 1522
    .line 1523
    .line 1524
    goto/16 :goto_9

    .line 1525
    .line 1526
    :goto_b
    return-object p2

    .line 1527
    :pswitch_8
    sget-object v7, Lcom/google/android/gms/internal/measurement/w;->b:Lcom/google/android/gms/internal/measurement/w;

    .line 1528
    .line 1529
    invoke-static {p1}, Ls8/n;->X(Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/w;

    .line 1530
    .line 1531
    .line 1532
    move-result-object v7

    .line 1533
    invoke-virtual {v7}, Ljava/lang/Enum;->ordinal()I

    .line 1534
    .line 1535
    .line 1536
    move-result v7

    .line 1537
    const/16 v8, 0x41

    .line 1538
    .line 1539
    const/4 v9, 0x4

    .line 1540
    if-eq v7, v8, :cond_40

    .line 1541
    .line 1542
    packed-switch v7, :pswitch_data_3

    .line 1543
    .line 1544
    .line 1545
    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/measurement/s;->b(Ljava/lang/String;)V

    .line 1546
    .line 1547
    .line 1548
    throw v3

    .line 1549
    :pswitch_9
    const-string p1, "FOR_OF_LET"

    .line 1550
    .line 1551
    invoke-static {v2, p1, p3}, Ls8/n;->a0(ILjava/lang/String;Ljava/util/List;)V

    .line 1552
    .line 1553
    .line 1554
    invoke-interface {p3, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1555
    .line 1556
    .line 1557
    move-result-object p1

    .line 1558
    instance-of p1, p1, Lcom/google/android/gms/internal/measurement/q;

    .line 1559
    .line 1560
    if-eqz p1, :cond_2e

    .line 1561
    .line 1562
    invoke-interface {p3, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1563
    .line 1564
    .line 1565
    move-result-object p1

    .line 1566
    check-cast p1, Lcom/google/android/gms/internal/measurement/n;

    .line 1567
    .line 1568
    invoke-interface {p1}, Lcom/google/android/gms/internal/measurement/n;->c()Ljava/lang/String;

    .line 1569
    .line 1570
    .line 1571
    move-result-object p1

    .line 1572
    invoke-interface {p3, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1573
    .line 1574
    .line 1575
    move-result-object v0

    .line 1576
    check-cast v0, Lcom/google/android/gms/internal/measurement/n;

    .line 1577
    .line 1578
    iget-object v1, p2, Lcom/google/firebase/messaging/s;->c:Ljava/lang/Object;

    .line 1579
    .line 1580
    check-cast v1, Lcom/google/android/gms/internal/measurement/t;

    .line 1581
    .line 1582
    invoke-virtual {v1, p2, v0}, Lcom/google/android/gms/internal/measurement/t;->a(Lcom/google/firebase/messaging/s;Lcom/google/android/gms/internal/measurement/n;)Lcom/google/android/gms/internal/measurement/n;

    .line 1583
    .line 1584
    .line 1585
    move-result-object v0

    .line 1586
    invoke-interface {p3, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1587
    .line 1588
    .line 1589
    move-result-object p3

    .line 1590
    check-cast p3, Lcom/google/android/gms/internal/measurement/n;

    .line 1591
    .line 1592
    iget-object v1, p2, Lcom/google/firebase/messaging/s;->c:Ljava/lang/Object;

    .line 1593
    .line 1594
    check-cast v1, Lcom/google/android/gms/internal/measurement/t;

    .line 1595
    .line 1596
    invoke-virtual {v1, p2, p3}, Lcom/google/android/gms/internal/measurement/t;->a(Lcom/google/firebase/messaging/s;Lcom/google/android/gms/internal/measurement/n;)Lcom/google/android/gms/internal/measurement/n;

    .line 1597
    .line 1598
    .line 1599
    move-result-object p3

    .line 1600
    new-instance v1, Lcom/google/android/gms/internal/measurement/v;

    .line 1601
    .line 1602
    invoke-direct {v1, p2, p1, v6}, Lcom/google/android/gms/internal/measurement/v;-><init>(Lcom/google/firebase/messaging/s;Ljava/lang/String;I)V

    .line 1603
    .line 1604
    .line 1605
    invoke-static {v1, v0, p3}, Lcom/google/android/gms/internal/measurement/s;->g(Lcom/google/android/gms/internal/measurement/v;Lcom/google/android/gms/internal/measurement/n;Lcom/google/android/gms/internal/measurement/n;)Lcom/google/android/gms/internal/measurement/n;

    .line 1606
    .line 1607
    .line 1608
    move-result-object p1

    .line 1609
    goto/16 :goto_12

    .line 1610
    .line 1611
    :cond_2e
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 1612
    .line 1613
    const-string p2, "Variable name in FOR_OF_LET must be a string"

    .line 1614
    .line 1615
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 1616
    .line 1617
    .line 1618
    throw p1

    .line 1619
    :pswitch_a
    const-string p1, "FOR_OF_CONST"

    .line 1620
    .line 1621
    invoke-static {v2, p1, p3}, Ls8/n;->a0(ILjava/lang/String;Ljava/util/List;)V

    .line 1622
    .line 1623
    .line 1624
    invoke-interface {p3, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1625
    .line 1626
    .line 1627
    move-result-object p1

    .line 1628
    instance-of p1, p1, Lcom/google/android/gms/internal/measurement/q;

    .line 1629
    .line 1630
    if-eqz p1, :cond_2f

    .line 1631
    .line 1632
    invoke-interface {p3, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1633
    .line 1634
    .line 1635
    move-result-object p1

    .line 1636
    check-cast p1, Lcom/google/android/gms/internal/measurement/n;

    .line 1637
    .line 1638
    invoke-interface {p1}, Lcom/google/android/gms/internal/measurement/n;->c()Ljava/lang/String;

    .line 1639
    .line 1640
    .line 1641
    move-result-object p1

    .line 1642
    invoke-interface {p3, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1643
    .line 1644
    .line 1645
    move-result-object v0

    .line 1646
    check-cast v0, Lcom/google/android/gms/internal/measurement/n;

    .line 1647
    .line 1648
    iget-object v1, p2, Lcom/google/firebase/messaging/s;->c:Ljava/lang/Object;

    .line 1649
    .line 1650
    check-cast v1, Lcom/google/android/gms/internal/measurement/t;

    .line 1651
    .line 1652
    invoke-virtual {v1, p2, v0}, Lcom/google/android/gms/internal/measurement/t;->a(Lcom/google/firebase/messaging/s;Lcom/google/android/gms/internal/measurement/n;)Lcom/google/android/gms/internal/measurement/n;

    .line 1653
    .line 1654
    .line 1655
    move-result-object v0

    .line 1656
    invoke-interface {p3, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1657
    .line 1658
    .line 1659
    move-result-object p3

    .line 1660
    check-cast p3, Lcom/google/android/gms/internal/measurement/n;

    .line 1661
    .line 1662
    iget-object v1, p2, Lcom/google/firebase/messaging/s;->c:Ljava/lang/Object;

    .line 1663
    .line 1664
    check-cast v1, Lcom/google/android/gms/internal/measurement/t;

    .line 1665
    .line 1666
    invoke-virtual {v1, p2, p3}, Lcom/google/android/gms/internal/measurement/t;->a(Lcom/google/firebase/messaging/s;Lcom/google/android/gms/internal/measurement/n;)Lcom/google/android/gms/internal/measurement/n;

    .line 1667
    .line 1668
    .line 1669
    move-result-object p3

    .line 1670
    new-instance v1, Lcom/google/android/gms/internal/measurement/v;

    .line 1671
    .line 1672
    invoke-direct {v1, p2, p1, v5}, Lcom/google/android/gms/internal/measurement/v;-><init>(Lcom/google/firebase/messaging/s;Ljava/lang/String;I)V

    .line 1673
    .line 1674
    .line 1675
    invoke-static {v1, v0, p3}, Lcom/google/android/gms/internal/measurement/s;->g(Lcom/google/android/gms/internal/measurement/v;Lcom/google/android/gms/internal/measurement/n;Lcom/google/android/gms/internal/measurement/n;)Lcom/google/android/gms/internal/measurement/n;

    .line 1676
    .line 1677
    .line 1678
    move-result-object p1

    .line 1679
    goto/16 :goto_12

    .line 1680
    .line 1681
    :cond_2f
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 1682
    .line 1683
    const-string p2, "Variable name in FOR_OF_CONST must be a string"

    .line 1684
    .line 1685
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 1686
    .line 1687
    .line 1688
    throw p1

    .line 1689
    :pswitch_b
    const-string p1, "FOR_OF"

    .line 1690
    .line 1691
    invoke-static {v2, p1, p3}, Ls8/n;->a0(ILjava/lang/String;Ljava/util/List;)V

    .line 1692
    .line 1693
    .line 1694
    invoke-interface {p3, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1695
    .line 1696
    .line 1697
    move-result-object p1

    .line 1698
    instance-of p1, p1, Lcom/google/android/gms/internal/measurement/q;

    .line 1699
    .line 1700
    if-eqz p1, :cond_30

    .line 1701
    .line 1702
    invoke-interface {p3, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1703
    .line 1704
    .line 1705
    move-result-object p1

    .line 1706
    check-cast p1, Lcom/google/android/gms/internal/measurement/n;

    .line 1707
    .line 1708
    invoke-interface {p1}, Lcom/google/android/gms/internal/measurement/n;->c()Ljava/lang/String;

    .line 1709
    .line 1710
    .line 1711
    move-result-object p1

    .line 1712
    invoke-interface {p3, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1713
    .line 1714
    .line 1715
    move-result-object v0

    .line 1716
    check-cast v0, Lcom/google/android/gms/internal/measurement/n;

    .line 1717
    .line 1718
    iget-object v1, p2, Lcom/google/firebase/messaging/s;->c:Ljava/lang/Object;

    .line 1719
    .line 1720
    check-cast v1, Lcom/google/android/gms/internal/measurement/t;

    .line 1721
    .line 1722
    invoke-virtual {v1, p2, v0}, Lcom/google/android/gms/internal/measurement/t;->a(Lcom/google/firebase/messaging/s;Lcom/google/android/gms/internal/measurement/n;)Lcom/google/android/gms/internal/measurement/n;

    .line 1723
    .line 1724
    .line 1725
    move-result-object v0

    .line 1726
    invoke-interface {p3, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1727
    .line 1728
    .line 1729
    move-result-object p3

    .line 1730
    check-cast p3, Lcom/google/android/gms/internal/measurement/n;

    .line 1731
    .line 1732
    iget-object v1, p2, Lcom/google/firebase/messaging/s;->c:Ljava/lang/Object;

    .line 1733
    .line 1734
    check-cast v1, Lcom/google/android/gms/internal/measurement/t;

    .line 1735
    .line 1736
    invoke-virtual {v1, p2, p3}, Lcom/google/android/gms/internal/measurement/t;->a(Lcom/google/firebase/messaging/s;Lcom/google/android/gms/internal/measurement/n;)Lcom/google/android/gms/internal/measurement/n;

    .line 1737
    .line 1738
    .line 1739
    move-result-object p3

    .line 1740
    new-instance v1, Lcom/google/android/gms/internal/measurement/v;

    .line 1741
    .line 1742
    invoke-direct {v1, p2, p1, v4}, Lcom/google/android/gms/internal/measurement/v;-><init>(Lcom/google/firebase/messaging/s;Ljava/lang/String;I)V

    .line 1743
    .line 1744
    .line 1745
    invoke-static {v1, v0, p3}, Lcom/google/android/gms/internal/measurement/s;->g(Lcom/google/android/gms/internal/measurement/v;Lcom/google/android/gms/internal/measurement/n;Lcom/google/android/gms/internal/measurement/n;)Lcom/google/android/gms/internal/measurement/n;

    .line 1746
    .line 1747
    .line 1748
    move-result-object p1

    .line 1749
    goto/16 :goto_12

    .line 1750
    .line 1751
    :cond_30
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 1752
    .line 1753
    const-string p2, "Variable name in FOR_OF must be a string"

    .line 1754
    .line 1755
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 1756
    .line 1757
    .line 1758
    throw p1

    .line 1759
    :pswitch_c
    const-string p1, "FOR_LET"

    .line 1760
    .line 1761
    invoke-static {v9, p1, p3}, Ls8/n;->a0(ILjava/lang/String;Ljava/util/List;)V

    .line 1762
    .line 1763
    .line 1764
    invoke-interface {p3, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1765
    .line 1766
    .line 1767
    move-result-object p1

    .line 1768
    check-cast p1, Lcom/google/android/gms/internal/measurement/n;

    .line 1769
    .line 1770
    iget-object v3, p2, Lcom/google/firebase/messaging/s;->c:Ljava/lang/Object;

    .line 1771
    .line 1772
    check-cast v3, Lcom/google/android/gms/internal/measurement/t;

    .line 1773
    .line 1774
    invoke-virtual {v3, p2, p1}, Lcom/google/android/gms/internal/measurement/t;->a(Lcom/google/firebase/messaging/s;Lcom/google/android/gms/internal/measurement/n;)Lcom/google/android/gms/internal/measurement/n;

    .line 1775
    .line 1776
    .line 1777
    move-result-object p1

    .line 1778
    instance-of v3, p1, Lcom/google/android/gms/internal/measurement/d;

    .line 1779
    .line 1780
    if-eqz v3, :cond_36

    .line 1781
    .line 1782
    check-cast p1, Lcom/google/android/gms/internal/measurement/d;

    .line 1783
    .line 1784
    invoke-interface {p3, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1785
    .line 1786
    .line 1787
    move-result-object v3

    .line 1788
    check-cast v3, Lcom/google/android/gms/internal/measurement/n;

    .line 1789
    .line 1790
    invoke-interface {p3, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1791
    .line 1792
    .line 1793
    move-result-object v4

    .line 1794
    check-cast v4, Lcom/google/android/gms/internal/measurement/n;

    .line 1795
    .line 1796
    invoke-interface {p3, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1797
    .line 1798
    .line 1799
    move-result-object p3

    .line 1800
    check-cast p3, Lcom/google/android/gms/internal/measurement/n;

    .line 1801
    .line 1802
    iget-object v2, p2, Lcom/google/firebase/messaging/s;->c:Ljava/lang/Object;

    .line 1803
    .line 1804
    check-cast v2, Lcom/google/android/gms/internal/measurement/t;

    .line 1805
    .line 1806
    invoke-virtual {v2, p2, p3}, Lcom/google/android/gms/internal/measurement/t;->a(Lcom/google/firebase/messaging/s;Lcom/google/android/gms/internal/measurement/n;)Lcom/google/android/gms/internal/measurement/n;

    .line 1807
    .line 1808
    .line 1809
    move-result-object p3

    .line 1810
    invoke-virtual {p2}, Lcom/google/firebase/messaging/s;->y()Lcom/google/firebase/messaging/s;

    .line 1811
    .line 1812
    .line 1813
    move-result-object v7

    .line 1814
    move v8, v5

    .line 1815
    :goto_c
    invoke-virtual {p1}, Lcom/google/android/gms/internal/measurement/d;->p()I

    .line 1816
    .line 1817
    .line 1818
    move-result v9

    .line 1819
    if-ge v8, v9, :cond_31

    .line 1820
    .line 1821
    invoke-virtual {p1, v8}, Lcom/google/android/gms/internal/measurement/d;->q(I)Lcom/google/android/gms/internal/measurement/n;

    .line 1822
    .line 1823
    .line 1824
    move-result-object v9

    .line 1825
    invoke-interface {v9}, Lcom/google/android/gms/internal/measurement/n;->c()Ljava/lang/String;

    .line 1826
    .line 1827
    .line 1828
    move-result-object v9

    .line 1829
    invoke-virtual {p2, v9}, Lcom/google/firebase/messaging/s;->C(Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/n;

    .line 1830
    .line 1831
    .line 1832
    move-result-object v10

    .line 1833
    invoke-virtual {v7, v9, v10}, Lcom/google/firebase/messaging/s;->F(Ljava/lang/String;Lcom/google/android/gms/internal/measurement/n;)V

    .line 1834
    .line 1835
    .line 1836
    add-int/2addr v8, v6

    .line 1837
    goto :goto_c

    .line 1838
    :cond_31
    :goto_d
    invoke-virtual {v2, p2, v3}, Lcom/google/android/gms/internal/measurement/t;->a(Lcom/google/firebase/messaging/s;Lcom/google/android/gms/internal/measurement/n;)Lcom/google/android/gms/internal/measurement/n;

    .line 1839
    .line 1840
    .line 1841
    move-result-object v8

    .line 1842
    invoke-interface {v8}, Lcom/google/android/gms/internal/measurement/n;->o()Ljava/lang/Boolean;

    .line 1843
    .line 1844
    .line 1845
    move-result-object v8

    .line 1846
    invoke-virtual {v8}, Ljava/lang/Boolean;->booleanValue()Z

    .line 1847
    .line 1848
    .line 1849
    move-result v8

    .line 1850
    if-eqz v8, :cond_35

    .line 1851
    .line 1852
    move-object v8, p3

    .line 1853
    check-cast v8, Lcom/google/android/gms/internal/measurement/d;

    .line 1854
    .line 1855
    invoke-virtual {p2, v8}, Lcom/google/firebase/messaging/s;->B(Lcom/google/android/gms/internal/measurement/d;)Lcom/google/android/gms/internal/measurement/n;

    .line 1856
    .line 1857
    .line 1858
    move-result-object v8

    .line 1859
    instance-of v9, v8, Lcom/google/android/gms/internal/measurement/f;

    .line 1860
    .line 1861
    if-eqz v9, :cond_33

    .line 1862
    .line 1863
    check-cast v8, Lcom/google/android/gms/internal/measurement/f;

    .line 1864
    .line 1865
    iget-object v9, v8, Lcom/google/android/gms/internal/measurement/f;->b:Ljava/lang/String;

    .line 1866
    .line 1867
    invoke-virtual {v1, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1868
    .line 1869
    .line 1870
    move-result v9

    .line 1871
    if-eqz v9, :cond_32

    .line 1872
    .line 1873
    sget-object p1, Lcom/google/android/gms/internal/measurement/n;->N:Lcom/google/android/gms/internal/measurement/r;

    .line 1874
    .line 1875
    goto/16 :goto_12

    .line 1876
    .line 1877
    :cond_32
    iget-object v9, v8, Lcom/google/android/gms/internal/measurement/f;->b:Ljava/lang/String;

    .line 1878
    .line 1879
    invoke-virtual {v0, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1880
    .line 1881
    .line 1882
    move-result v9

    .line 1883
    if-eqz v9, :cond_33

    .line 1884
    .line 1885
    move-object p1, v8

    .line 1886
    goto/16 :goto_12

    .line 1887
    .line 1888
    :cond_33
    invoke-virtual {p2}, Lcom/google/firebase/messaging/s;->y()Lcom/google/firebase/messaging/s;

    .line 1889
    .line 1890
    .line 1891
    move-result-object v8

    .line 1892
    move v9, v5

    .line 1893
    :goto_e
    invoke-virtual {p1}, Lcom/google/android/gms/internal/measurement/d;->p()I

    .line 1894
    .line 1895
    .line 1896
    move-result v10

    .line 1897
    if-ge v9, v10, :cond_34

    .line 1898
    .line 1899
    invoke-virtual {p1, v9}, Lcom/google/android/gms/internal/measurement/d;->q(I)Lcom/google/android/gms/internal/measurement/n;

    .line 1900
    .line 1901
    .line 1902
    move-result-object v10

    .line 1903
    invoke-interface {v10}, Lcom/google/android/gms/internal/measurement/n;->c()Ljava/lang/String;

    .line 1904
    .line 1905
    .line 1906
    move-result-object v10

    .line 1907
    invoke-virtual {v7, v10}, Lcom/google/firebase/messaging/s;->C(Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/n;

    .line 1908
    .line 1909
    .line 1910
    move-result-object v11

    .line 1911
    invoke-virtual {v8, v10, v11}, Lcom/google/firebase/messaging/s;->F(Ljava/lang/String;Lcom/google/android/gms/internal/measurement/n;)V

    .line 1912
    .line 1913
    .line 1914
    add-int/2addr v9, v6

    .line 1915
    goto :goto_e

    .line 1916
    :cond_34
    invoke-virtual {v8, v4}, Lcom/google/firebase/messaging/s;->z(Lcom/google/android/gms/internal/measurement/n;)Lcom/google/android/gms/internal/measurement/n;

    .line 1917
    .line 1918
    .line 1919
    move-object v7, v8

    .line 1920
    goto :goto_d

    .line 1921
    :cond_35
    sget-object p1, Lcom/google/android/gms/internal/measurement/n;->N:Lcom/google/android/gms/internal/measurement/r;

    .line 1922
    .line 1923
    goto/16 :goto_12

    .line 1924
    .line 1925
    :cond_36
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 1926
    .line 1927
    const-string p2, "Initializer variables in FOR_LET must be an ArrayList"

    .line 1928
    .line 1929
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 1930
    .line 1931
    .line 1932
    throw p1

    .line 1933
    :pswitch_d
    const-string p1, "FOR_IN_LET"

    .line 1934
    .line 1935
    invoke-static {v2, p1, p3}, Ls8/n;->a0(ILjava/lang/String;Ljava/util/List;)V

    .line 1936
    .line 1937
    .line 1938
    invoke-interface {p3, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1939
    .line 1940
    .line 1941
    move-result-object p1

    .line 1942
    instance-of p1, p1, Lcom/google/android/gms/internal/measurement/q;

    .line 1943
    .line 1944
    if-eqz p1, :cond_3a

    .line 1945
    .line 1946
    invoke-interface {p3, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1947
    .line 1948
    .line 1949
    move-result-object p1

    .line 1950
    check-cast p1, Lcom/google/android/gms/internal/measurement/n;

    .line 1951
    .line 1952
    invoke-interface {p1}, Lcom/google/android/gms/internal/measurement/n;->c()Ljava/lang/String;

    .line 1953
    .line 1954
    .line 1955
    move-result-object p1

    .line 1956
    invoke-interface {p3, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1957
    .line 1958
    .line 1959
    move-result-object v2

    .line 1960
    check-cast v2, Lcom/google/android/gms/internal/measurement/n;

    .line 1961
    .line 1962
    iget-object v3, p2, Lcom/google/firebase/messaging/s;->c:Ljava/lang/Object;

    .line 1963
    .line 1964
    check-cast v3, Lcom/google/android/gms/internal/measurement/t;

    .line 1965
    .line 1966
    invoke-virtual {v3, p2, v2}, Lcom/google/android/gms/internal/measurement/t;->a(Lcom/google/firebase/messaging/s;Lcom/google/android/gms/internal/measurement/n;)Lcom/google/android/gms/internal/measurement/n;

    .line 1967
    .line 1968
    .line 1969
    move-result-object v2

    .line 1970
    invoke-interface {p3, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1971
    .line 1972
    .line 1973
    move-result-object p3

    .line 1974
    check-cast p3, Lcom/google/android/gms/internal/measurement/n;

    .line 1975
    .line 1976
    iget-object v3, p2, Lcom/google/firebase/messaging/s;->c:Ljava/lang/Object;

    .line 1977
    .line 1978
    check-cast v3, Lcom/google/android/gms/internal/measurement/t;

    .line 1979
    .line 1980
    invoke-virtual {v3, p2, p3}, Lcom/google/android/gms/internal/measurement/t;->a(Lcom/google/firebase/messaging/s;Lcom/google/android/gms/internal/measurement/n;)Lcom/google/android/gms/internal/measurement/n;

    .line 1981
    .line 1982
    .line 1983
    move-result-object p3

    .line 1984
    invoke-interface {v2}, Lcom/google/android/gms/internal/measurement/n;->e()Ljava/util/Iterator;

    .line 1985
    .line 1986
    .line 1987
    move-result-object v2

    .line 1988
    if-eqz v2, :cond_39

    .line 1989
    .line 1990
    :cond_37
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 1991
    .line 1992
    .line 1993
    move-result v3

    .line 1994
    if-eqz v3, :cond_39

    .line 1995
    .line 1996
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1997
    .line 1998
    .line 1999
    move-result-object v3

    .line 2000
    check-cast v3, Lcom/google/android/gms/internal/measurement/n;

    .line 2001
    .line 2002
    invoke-virtual {p2}, Lcom/google/firebase/messaging/s;->y()Lcom/google/firebase/messaging/s;

    .line 2003
    .line 2004
    .line 2005
    move-result-object v4

    .line 2006
    invoke-virtual {v4, p1, v3}, Lcom/google/firebase/messaging/s;->E(Ljava/lang/String;Lcom/google/android/gms/internal/measurement/n;)V

    .line 2007
    .line 2008
    .line 2009
    move-object v3, p3

    .line 2010
    check-cast v3, Lcom/google/android/gms/internal/measurement/d;

    .line 2011
    .line 2012
    invoke-virtual {v4, v3}, Lcom/google/firebase/messaging/s;->B(Lcom/google/android/gms/internal/measurement/d;)Lcom/google/android/gms/internal/measurement/n;

    .line 2013
    .line 2014
    .line 2015
    move-result-object v3

    .line 2016
    instance-of v4, v3, Lcom/google/android/gms/internal/measurement/f;

    .line 2017
    .line 2018
    if-eqz v4, :cond_37

    .line 2019
    .line 2020
    check-cast v3, Lcom/google/android/gms/internal/measurement/f;

    .line 2021
    .line 2022
    iget-object v4, v3, Lcom/google/android/gms/internal/measurement/f;->b:Ljava/lang/String;

    .line 2023
    .line 2024
    invoke-virtual {v1, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 2025
    .line 2026
    .line 2027
    move-result v4

    .line 2028
    if-eqz v4, :cond_38

    .line 2029
    .line 2030
    sget-object p1, Lcom/google/android/gms/internal/measurement/n;->N:Lcom/google/android/gms/internal/measurement/r;

    .line 2031
    .line 2032
    goto/16 :goto_12

    .line 2033
    .line 2034
    :cond_38
    iget-object v4, v3, Lcom/google/android/gms/internal/measurement/f;->b:Ljava/lang/String;

    .line 2035
    .line 2036
    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 2037
    .line 2038
    .line 2039
    move-result v4

    .line 2040
    if-eqz v4, :cond_37

    .line 2041
    .line 2042
    :goto_f
    move-object p1, v3

    .line 2043
    goto/16 :goto_12

    .line 2044
    .line 2045
    :cond_39
    sget-object p1, Lcom/google/android/gms/internal/measurement/n;->N:Lcom/google/android/gms/internal/measurement/r;

    .line 2046
    .line 2047
    goto/16 :goto_12

    .line 2048
    .line 2049
    :cond_3a
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 2050
    .line 2051
    const-string p2, "Variable name in FOR_IN_LET must be a string"

    .line 2052
    .line 2053
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 2054
    .line 2055
    .line 2056
    throw p1

    .line 2057
    :pswitch_e
    const-string p1, "FOR_IN_CONST"

    .line 2058
    .line 2059
    invoke-static {v2, p1, p3}, Ls8/n;->a0(ILjava/lang/String;Ljava/util/List;)V

    .line 2060
    .line 2061
    .line 2062
    invoke-interface {p3, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 2063
    .line 2064
    .line 2065
    move-result-object p1

    .line 2066
    instance-of p1, p1, Lcom/google/android/gms/internal/measurement/q;

    .line 2067
    .line 2068
    if-eqz p1, :cond_3b

    .line 2069
    .line 2070
    invoke-interface {p3, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 2071
    .line 2072
    .line 2073
    move-result-object p1

    .line 2074
    check-cast p1, Lcom/google/android/gms/internal/measurement/n;

    .line 2075
    .line 2076
    invoke-interface {p1}, Lcom/google/android/gms/internal/measurement/n;->c()Ljava/lang/String;

    .line 2077
    .line 2078
    .line 2079
    move-result-object p1

    .line 2080
    invoke-interface {p3, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 2081
    .line 2082
    .line 2083
    move-result-object v0

    .line 2084
    check-cast v0, Lcom/google/android/gms/internal/measurement/n;

    .line 2085
    .line 2086
    iget-object v1, p2, Lcom/google/firebase/messaging/s;->c:Ljava/lang/Object;

    .line 2087
    .line 2088
    check-cast v1, Lcom/google/android/gms/internal/measurement/t;

    .line 2089
    .line 2090
    invoke-virtual {v1, p2, v0}, Lcom/google/android/gms/internal/measurement/t;->a(Lcom/google/firebase/messaging/s;Lcom/google/android/gms/internal/measurement/n;)Lcom/google/android/gms/internal/measurement/n;

    .line 2091
    .line 2092
    .line 2093
    move-result-object v0

    .line 2094
    invoke-interface {p3, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 2095
    .line 2096
    .line 2097
    move-result-object p3

    .line 2098
    check-cast p3, Lcom/google/android/gms/internal/measurement/n;

    .line 2099
    .line 2100
    iget-object v1, p2, Lcom/google/firebase/messaging/s;->c:Ljava/lang/Object;

    .line 2101
    .line 2102
    check-cast v1, Lcom/google/android/gms/internal/measurement/t;

    .line 2103
    .line 2104
    invoke-virtual {v1, p2, p3}, Lcom/google/android/gms/internal/measurement/t;->a(Lcom/google/firebase/messaging/s;Lcom/google/android/gms/internal/measurement/n;)Lcom/google/android/gms/internal/measurement/n;

    .line 2105
    .line 2106
    .line 2107
    move-result-object p3

    .line 2108
    new-instance v1, Lcom/google/android/gms/internal/measurement/v;

    .line 2109
    .line 2110
    invoke-direct {v1, p2, p1, v5}, Lcom/google/android/gms/internal/measurement/v;-><init>(Lcom/google/firebase/messaging/s;Ljava/lang/String;I)V

    .line 2111
    .line 2112
    .line 2113
    invoke-interface {v0}, Lcom/google/android/gms/internal/measurement/n;->e()Ljava/util/Iterator;

    .line 2114
    .line 2115
    .line 2116
    move-result-object p1

    .line 2117
    invoke-static {v1, p1, p3}, Lcom/google/android/gms/internal/measurement/s;->d(Lcom/google/android/gms/internal/measurement/v;Ljava/util/Iterator;Lcom/google/android/gms/internal/measurement/n;)Lcom/google/android/gms/internal/measurement/n;

    .line 2118
    .line 2119
    .line 2120
    move-result-object p1

    .line 2121
    goto/16 :goto_12

    .line 2122
    .line 2123
    :cond_3b
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 2124
    .line 2125
    const-string p2, "Variable name in FOR_IN_CONST must be a string"

    .line 2126
    .line 2127
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 2128
    .line 2129
    .line 2130
    throw p1

    .line 2131
    :pswitch_f
    const-string p1, "FOR_IN"

    .line 2132
    .line 2133
    invoke-static {v2, p1, p3}, Ls8/n;->a0(ILjava/lang/String;Ljava/util/List;)V

    .line 2134
    .line 2135
    .line 2136
    invoke-interface {p3, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 2137
    .line 2138
    .line 2139
    move-result-object p1

    .line 2140
    instance-of p1, p1, Lcom/google/android/gms/internal/measurement/q;

    .line 2141
    .line 2142
    if-eqz p1, :cond_3f

    .line 2143
    .line 2144
    invoke-interface {p3, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 2145
    .line 2146
    .line 2147
    move-result-object p1

    .line 2148
    check-cast p1, Lcom/google/android/gms/internal/measurement/n;

    .line 2149
    .line 2150
    invoke-interface {p1}, Lcom/google/android/gms/internal/measurement/n;->c()Ljava/lang/String;

    .line 2151
    .line 2152
    .line 2153
    move-result-object p1

    .line 2154
    invoke-interface {p3, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 2155
    .line 2156
    .line 2157
    move-result-object v2

    .line 2158
    check-cast v2, Lcom/google/android/gms/internal/measurement/n;

    .line 2159
    .line 2160
    iget-object v3, p2, Lcom/google/firebase/messaging/s;->c:Ljava/lang/Object;

    .line 2161
    .line 2162
    check-cast v3, Lcom/google/android/gms/internal/measurement/t;

    .line 2163
    .line 2164
    invoke-virtual {v3, p2, v2}, Lcom/google/android/gms/internal/measurement/t;->a(Lcom/google/firebase/messaging/s;Lcom/google/android/gms/internal/measurement/n;)Lcom/google/android/gms/internal/measurement/n;

    .line 2165
    .line 2166
    .line 2167
    move-result-object v2

    .line 2168
    invoke-interface {p3, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 2169
    .line 2170
    .line 2171
    move-result-object p3

    .line 2172
    check-cast p3, Lcom/google/android/gms/internal/measurement/n;

    .line 2173
    .line 2174
    iget-object v3, p2, Lcom/google/firebase/messaging/s;->c:Ljava/lang/Object;

    .line 2175
    .line 2176
    check-cast v3, Lcom/google/android/gms/internal/measurement/t;

    .line 2177
    .line 2178
    invoke-virtual {v3, p2, p3}, Lcom/google/android/gms/internal/measurement/t;->a(Lcom/google/firebase/messaging/s;Lcom/google/android/gms/internal/measurement/n;)Lcom/google/android/gms/internal/measurement/n;

    .line 2179
    .line 2180
    .line 2181
    move-result-object p3

    .line 2182
    invoke-interface {v2}, Lcom/google/android/gms/internal/measurement/n;->e()Ljava/util/Iterator;

    .line 2183
    .line 2184
    .line 2185
    move-result-object v2

    .line 2186
    if-eqz v2, :cond_3e

    .line 2187
    .line 2188
    :cond_3c
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 2189
    .line 2190
    .line 2191
    move-result v3

    .line 2192
    if-eqz v3, :cond_3e

    .line 2193
    .line 2194
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 2195
    .line 2196
    .line 2197
    move-result-object v3

    .line 2198
    check-cast v3, Lcom/google/android/gms/internal/measurement/n;

    .line 2199
    .line 2200
    invoke-virtual {p2, p1, v3}, Lcom/google/firebase/messaging/s;->E(Ljava/lang/String;Lcom/google/android/gms/internal/measurement/n;)V

    .line 2201
    .line 2202
    .line 2203
    move-object v3, p3

    .line 2204
    check-cast v3, Lcom/google/android/gms/internal/measurement/d;

    .line 2205
    .line 2206
    invoke-virtual {p2, v3}, Lcom/google/firebase/messaging/s;->B(Lcom/google/android/gms/internal/measurement/d;)Lcom/google/android/gms/internal/measurement/n;

    .line 2207
    .line 2208
    .line 2209
    move-result-object v3

    .line 2210
    instance-of v4, v3, Lcom/google/android/gms/internal/measurement/f;

    .line 2211
    .line 2212
    if-eqz v4, :cond_3c

    .line 2213
    .line 2214
    check-cast v3, Lcom/google/android/gms/internal/measurement/f;

    .line 2215
    .line 2216
    iget-object v4, v3, Lcom/google/android/gms/internal/measurement/f;->b:Ljava/lang/String;

    .line 2217
    .line 2218
    invoke-virtual {v1, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 2219
    .line 2220
    .line 2221
    move-result v4

    .line 2222
    if-eqz v4, :cond_3d

    .line 2223
    .line 2224
    sget-object p1, Lcom/google/android/gms/internal/measurement/n;->N:Lcom/google/android/gms/internal/measurement/r;

    .line 2225
    .line 2226
    goto/16 :goto_12

    .line 2227
    .line 2228
    :cond_3d
    iget-object v4, v3, Lcom/google/android/gms/internal/measurement/f;->b:Ljava/lang/String;

    .line 2229
    .line 2230
    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 2231
    .line 2232
    .line 2233
    move-result v4

    .line 2234
    if-eqz v4, :cond_3c

    .line 2235
    .line 2236
    goto/16 :goto_f

    .line 2237
    .line 2238
    :cond_3e
    sget-object p1, Lcom/google/android/gms/internal/measurement/n;->N:Lcom/google/android/gms/internal/measurement/r;

    .line 2239
    .line 2240
    goto/16 :goto_12

    .line 2241
    .line 2242
    :cond_3f
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 2243
    .line 2244
    const-string p2, "Variable name in FOR_IN must be a string"

    .line 2245
    .line 2246
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 2247
    .line 2248
    .line 2249
    throw p1

    .line 2250
    :cond_40
    const-string p1, "WHILE"

    .line 2251
    .line 2252
    invoke-static {v9, p1, p3}, Ls8/n;->a0(ILjava/lang/String;Ljava/util/List;)V

    .line 2253
    .line 2254
    .line 2255
    invoke-interface {p3, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 2256
    .line 2257
    .line 2258
    move-result-object p1

    .line 2259
    check-cast p1, Lcom/google/android/gms/internal/measurement/n;

    .line 2260
    .line 2261
    invoke-interface {p3, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 2262
    .line 2263
    .line 2264
    move-result-object v3

    .line 2265
    check-cast v3, Lcom/google/android/gms/internal/measurement/n;

    .line 2266
    .line 2267
    invoke-interface {p3, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 2268
    .line 2269
    .line 2270
    move-result-object v4

    .line 2271
    check-cast v4, Lcom/google/android/gms/internal/measurement/n;

    .line 2272
    .line 2273
    invoke-interface {p3, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 2274
    .line 2275
    .line 2276
    move-result-object p3

    .line 2277
    check-cast p3, Lcom/google/android/gms/internal/measurement/n;

    .line 2278
    .line 2279
    iget-object v2, p2, Lcom/google/firebase/messaging/s;->c:Ljava/lang/Object;

    .line 2280
    .line 2281
    check-cast v2, Lcom/google/android/gms/internal/measurement/t;

    .line 2282
    .line 2283
    invoke-virtual {v2, p2, p3}, Lcom/google/android/gms/internal/measurement/t;->a(Lcom/google/firebase/messaging/s;Lcom/google/android/gms/internal/measurement/n;)Lcom/google/android/gms/internal/measurement/n;

    .line 2284
    .line 2285
    .line 2286
    move-result-object p3

    .line 2287
    iget-object v2, p2, Lcom/google/firebase/messaging/s;->c:Ljava/lang/Object;

    .line 2288
    .line 2289
    check-cast v2, Lcom/google/android/gms/internal/measurement/t;

    .line 2290
    .line 2291
    invoke-virtual {v2, p2, v4}, Lcom/google/android/gms/internal/measurement/t;->a(Lcom/google/firebase/messaging/s;Lcom/google/android/gms/internal/measurement/n;)Lcom/google/android/gms/internal/measurement/n;

    .line 2292
    .line 2293
    .line 2294
    move-result-object v4

    .line 2295
    invoke-interface {v4}, Lcom/google/android/gms/internal/measurement/n;->o()Ljava/lang/Boolean;

    .line 2296
    .line 2297
    .line 2298
    move-result-object v4

    .line 2299
    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    .line 2300
    .line 2301
    .line 2302
    move-result v4

    .line 2303
    if-nez v4, :cond_41

    .line 2304
    .line 2305
    goto :goto_11

    .line 2306
    :cond_41
    move-object v4, p3

    .line 2307
    check-cast v4, Lcom/google/android/gms/internal/measurement/d;

    .line 2308
    .line 2309
    invoke-virtual {p2, v4}, Lcom/google/firebase/messaging/s;->B(Lcom/google/android/gms/internal/measurement/d;)Lcom/google/android/gms/internal/measurement/n;

    .line 2310
    .line 2311
    .line 2312
    move-result-object v4

    .line 2313
    instance-of v5, v4, Lcom/google/android/gms/internal/measurement/f;

    .line 2314
    .line 2315
    if-eqz v5, :cond_43

    .line 2316
    .line 2317
    check-cast v4, Lcom/google/android/gms/internal/measurement/f;

    .line 2318
    .line 2319
    iget-object v5, v4, Lcom/google/android/gms/internal/measurement/f;->b:Ljava/lang/String;

    .line 2320
    .line 2321
    invoke-virtual {v1, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 2322
    .line 2323
    .line 2324
    move-result v5

    .line 2325
    if-eqz v5, :cond_42

    .line 2326
    .line 2327
    sget-object p1, Lcom/google/android/gms/internal/measurement/n;->N:Lcom/google/android/gms/internal/measurement/r;

    .line 2328
    .line 2329
    goto :goto_12

    .line 2330
    :cond_42
    iget-object v5, v4, Lcom/google/android/gms/internal/measurement/f;->b:Ljava/lang/String;

    .line 2331
    .line 2332
    invoke-virtual {v0, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 2333
    .line 2334
    .line 2335
    move-result v5

    .line 2336
    if-eqz v5, :cond_43

    .line 2337
    .line 2338
    :goto_10
    move-object p1, v4

    .line 2339
    goto :goto_12

    .line 2340
    :cond_43
    :goto_11
    invoke-virtual {v2, p2, p1}, Lcom/google/android/gms/internal/measurement/t;->a(Lcom/google/firebase/messaging/s;Lcom/google/android/gms/internal/measurement/n;)Lcom/google/android/gms/internal/measurement/n;

    .line 2341
    .line 2342
    .line 2343
    move-result-object v4

    .line 2344
    invoke-interface {v4}, Lcom/google/android/gms/internal/measurement/n;->o()Ljava/lang/Boolean;

    .line 2345
    .line 2346
    .line 2347
    move-result-object v4

    .line 2348
    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    .line 2349
    .line 2350
    .line 2351
    move-result v4

    .line 2352
    if-eqz v4, :cond_46

    .line 2353
    .line 2354
    move-object v4, p3

    .line 2355
    check-cast v4, Lcom/google/android/gms/internal/measurement/d;

    .line 2356
    .line 2357
    invoke-virtual {p2, v4}, Lcom/google/firebase/messaging/s;->B(Lcom/google/android/gms/internal/measurement/d;)Lcom/google/android/gms/internal/measurement/n;

    .line 2358
    .line 2359
    .line 2360
    move-result-object v4

    .line 2361
    instance-of v5, v4, Lcom/google/android/gms/internal/measurement/f;

    .line 2362
    .line 2363
    if-eqz v5, :cond_45

    .line 2364
    .line 2365
    check-cast v4, Lcom/google/android/gms/internal/measurement/f;

    .line 2366
    .line 2367
    iget-object v5, v4, Lcom/google/android/gms/internal/measurement/f;->b:Ljava/lang/String;

    .line 2368
    .line 2369
    invoke-virtual {v1, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 2370
    .line 2371
    .line 2372
    move-result v5

    .line 2373
    if-eqz v5, :cond_44

    .line 2374
    .line 2375
    sget-object p1, Lcom/google/android/gms/internal/measurement/n;->N:Lcom/google/android/gms/internal/measurement/r;

    .line 2376
    .line 2377
    goto :goto_12

    .line 2378
    :cond_44
    iget-object v5, v4, Lcom/google/android/gms/internal/measurement/f;->b:Ljava/lang/String;

    .line 2379
    .line 2380
    invoke-virtual {v0, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 2381
    .line 2382
    .line 2383
    move-result v5

    .line 2384
    if-eqz v5, :cond_45

    .line 2385
    .line 2386
    goto :goto_10

    .line 2387
    :cond_45
    invoke-virtual {p2, v3}, Lcom/google/firebase/messaging/s;->z(Lcom/google/android/gms/internal/measurement/n;)Lcom/google/android/gms/internal/measurement/n;

    .line 2388
    .line 2389
    .line 2390
    goto :goto_11

    .line 2391
    :cond_46
    sget-object p1, Lcom/google/android/gms/internal/measurement/n;->N:Lcom/google/android/gms/internal/measurement/r;

    .line 2392
    .line 2393
    :goto_12
    return-object p1

    .line 2394
    :pswitch_10
    sget-object v0, Lcom/google/android/gms/internal/measurement/w;->b:Lcom/google/android/gms/internal/measurement/w;

    .line 2395
    .line 2396
    invoke-static {p1}, Ls8/n;->X(Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/w;

    .line 2397
    .line 2398
    .line 2399
    move-result-object v0

    .line 2400
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 2401
    .line 2402
    .line 2403
    move-result v0

    .line 2404
    if-eq v0, v6, :cond_4a

    .line 2405
    .line 2406
    const/16 v1, 0x2f

    .line 2407
    .line 2408
    if-eq v0, v1, :cond_49

    .line 2409
    .line 2410
    const/16 v1, 0x32

    .line 2411
    .line 2412
    if-ne v0, v1, :cond_48

    .line 2413
    .line 2414
    const-string p1, "OR"

    .line 2415
    .line 2416
    invoke-static {v4, p1, p3}, Ls8/n;->a0(ILjava/lang/String;Ljava/util/List;)V

    .line 2417
    .line 2418
    .line 2419
    invoke-interface {p3, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 2420
    .line 2421
    .line 2422
    move-result-object p1

    .line 2423
    check-cast p1, Lcom/google/android/gms/internal/measurement/n;

    .line 2424
    .line 2425
    iget-object v0, p2, Lcom/google/firebase/messaging/s;->c:Ljava/lang/Object;

    .line 2426
    .line 2427
    check-cast v0, Lcom/google/android/gms/internal/measurement/t;

    .line 2428
    .line 2429
    invoke-virtual {v0, p2, p1}, Lcom/google/android/gms/internal/measurement/t;->a(Lcom/google/firebase/messaging/s;Lcom/google/android/gms/internal/measurement/n;)Lcom/google/android/gms/internal/measurement/n;

    .line 2430
    .line 2431
    .line 2432
    move-result-object p1

    .line 2433
    invoke-interface {p1}, Lcom/google/android/gms/internal/measurement/n;->o()Ljava/lang/Boolean;

    .line 2434
    .line 2435
    .line 2436
    move-result-object v0

    .line 2437
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 2438
    .line 2439
    .line 2440
    move-result v0

    .line 2441
    if-eqz v0, :cond_47

    .line 2442
    .line 2443
    goto :goto_13

    .line 2444
    :cond_47
    invoke-interface {p3, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 2445
    .line 2446
    .line 2447
    move-result-object p1

    .line 2448
    check-cast p1, Lcom/google/android/gms/internal/measurement/n;

    .line 2449
    .line 2450
    iget-object p3, p2, Lcom/google/firebase/messaging/s;->c:Ljava/lang/Object;

    .line 2451
    .line 2452
    check-cast p3, Lcom/google/android/gms/internal/measurement/t;

    .line 2453
    .line 2454
    invoke-virtual {p3, p2, p1}, Lcom/google/android/gms/internal/measurement/t;->a(Lcom/google/firebase/messaging/s;Lcom/google/android/gms/internal/measurement/n;)Lcom/google/android/gms/internal/measurement/n;

    .line 2455
    .line 2456
    .line 2457
    move-result-object p1

    .line 2458
    goto :goto_13

    .line 2459
    :cond_48
    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/measurement/s;->b(Ljava/lang/String;)V

    .line 2460
    .line 2461
    .line 2462
    throw v3

    .line 2463
    :cond_49
    const-string p1, "NOT"

    .line 2464
    .line 2465
    invoke-static {v6, p1, p3}, Ls8/n;->a0(ILjava/lang/String;Ljava/util/List;)V

    .line 2466
    .line 2467
    .line 2468
    invoke-interface {p3, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 2469
    .line 2470
    .line 2471
    move-result-object p1

    .line 2472
    check-cast p1, Lcom/google/android/gms/internal/measurement/n;

    .line 2473
    .line 2474
    iget-object p3, p2, Lcom/google/firebase/messaging/s;->c:Ljava/lang/Object;

    .line 2475
    .line 2476
    check-cast p3, Lcom/google/android/gms/internal/measurement/t;

    .line 2477
    .line 2478
    invoke-virtual {p3, p2, p1}, Lcom/google/android/gms/internal/measurement/t;->a(Lcom/google/firebase/messaging/s;Lcom/google/android/gms/internal/measurement/n;)Lcom/google/android/gms/internal/measurement/n;

    .line 2479
    .line 2480
    .line 2481
    move-result-object p1

    .line 2482
    new-instance p2, Lcom/google/android/gms/internal/measurement/e;

    .line 2483
    .line 2484
    invoke-interface {p1}, Lcom/google/android/gms/internal/measurement/n;->o()Ljava/lang/Boolean;

    .line 2485
    .line 2486
    .line 2487
    move-result-object p1

    .line 2488
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 2489
    .line 2490
    .line 2491
    move-result p1

    .line 2492
    xor-int/2addr p1, v6

    .line 2493
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 2494
    .line 2495
    .line 2496
    move-result-object p1

    .line 2497
    invoke-direct {p2, p1}, Lcom/google/android/gms/internal/measurement/e;-><init>(Ljava/lang/Boolean;)V

    .line 2498
    .line 2499
    .line 2500
    move-object p1, p2

    .line 2501
    goto :goto_13

    .line 2502
    :cond_4a
    const-string p1, "AND"

    .line 2503
    .line 2504
    invoke-static {v4, p1, p3}, Ls8/n;->a0(ILjava/lang/String;Ljava/util/List;)V

    .line 2505
    .line 2506
    .line 2507
    invoke-interface {p3, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 2508
    .line 2509
    .line 2510
    move-result-object p1

    .line 2511
    check-cast p1, Lcom/google/android/gms/internal/measurement/n;

    .line 2512
    .line 2513
    iget-object v0, p2, Lcom/google/firebase/messaging/s;->c:Ljava/lang/Object;

    .line 2514
    .line 2515
    check-cast v0, Lcom/google/android/gms/internal/measurement/t;

    .line 2516
    .line 2517
    invoke-virtual {v0, p2, p1}, Lcom/google/android/gms/internal/measurement/t;->a(Lcom/google/firebase/messaging/s;Lcom/google/android/gms/internal/measurement/n;)Lcom/google/android/gms/internal/measurement/n;

    .line 2518
    .line 2519
    .line 2520
    move-result-object p1

    .line 2521
    invoke-interface {p1}, Lcom/google/android/gms/internal/measurement/n;->o()Ljava/lang/Boolean;

    .line 2522
    .line 2523
    .line 2524
    move-result-object v0

    .line 2525
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 2526
    .line 2527
    .line 2528
    move-result v0

    .line 2529
    if-nez v0, :cond_4b

    .line 2530
    .line 2531
    goto :goto_13

    .line 2532
    :cond_4b
    invoke-interface {p3, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 2533
    .line 2534
    .line 2535
    move-result-object p1

    .line 2536
    check-cast p1, Lcom/google/android/gms/internal/measurement/n;

    .line 2537
    .line 2538
    iget-object p3, p2, Lcom/google/firebase/messaging/s;->c:Ljava/lang/Object;

    .line 2539
    .line 2540
    check-cast p3, Lcom/google/android/gms/internal/measurement/t;

    .line 2541
    .line 2542
    invoke-virtual {p3, p2, p1}, Lcom/google/android/gms/internal/measurement/t;->a(Lcom/google/firebase/messaging/s;Lcom/google/android/gms/internal/measurement/n;)Lcom/google/android/gms/internal/measurement/n;

    .line 2543
    .line 2544
    .line 2545
    move-result-object p1

    .line 2546
    :goto_13
    return-object p1

    .line 2547
    :pswitch_11
    sget-object v7, Lcom/google/android/gms/internal/measurement/w;->b:Lcom/google/android/gms/internal/measurement/w;

    .line 2548
    .line 2549
    invoke-static {p1}, Ls8/n;->X(Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/w;

    .line 2550
    .line 2551
    .line 2552
    move-result-object v7

    .line 2553
    invoke-virtual {v7}, Ljava/lang/Enum;->ordinal()I

    .line 2554
    .line 2555
    .line 2556
    move-result v7

    .line 2557
    if-eq v7, v4, :cond_65

    .line 2558
    .line 2559
    const/16 v8, 0xf

    .line 2560
    .line 2561
    const-string v9, "BREAK"

    .line 2562
    .line 2563
    if-eq v7, v8, :cond_64

    .line 2564
    .line 2565
    const/16 v8, 0x19

    .line 2566
    .line 2567
    if-eq v7, v8, :cond_63

    .line 2568
    .line 2569
    const/16 v8, 0x29

    .line 2570
    .line 2571
    if-eq v7, v8, :cond_5e

    .line 2572
    .line 2573
    const/16 v8, 0x36

    .line 2574
    .line 2575
    if-eq v7, v8, :cond_5d

    .line 2576
    .line 2577
    const/16 v8, 0x39

    .line 2578
    .line 2579
    if-eq v7, v8, :cond_5b

    .line 2580
    .line 2581
    const/16 v8, 0x13

    .line 2582
    .line 2583
    if-eq v7, v8, :cond_58

    .line 2584
    .line 2585
    const/16 v8, 0x14

    .line 2586
    .line 2587
    if-eq v7, v8, :cond_56

    .line 2588
    .line 2589
    const/16 v8, 0x3c

    .line 2590
    .line 2591
    if-eq v7, v8, :cond_4e

    .line 2592
    .line 2593
    const/16 v0, 0x3d

    .line 2594
    .line 2595
    if-eq v7, v0, :cond_4c

    .line 2596
    .line 2597
    packed-switch v7, :pswitch_data_4

    .line 2598
    .line 2599
    .line 2600
    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/measurement/s;->b(Ljava/lang/String;)V

    .line 2601
    .line 2602
    .line 2603
    throw v3

    .line 2604
    :pswitch_12
    invoke-static {v5, v9, p3}, Ls8/n;->a0(ILjava/lang/String;Ljava/util/List;)V

    .line 2605
    .line 2606
    .line 2607
    sget-object p1, Lcom/google/android/gms/internal/measurement/n;->Q:Lcom/google/android/gms/internal/measurement/f;

    .line 2608
    .line 2609
    goto/16 :goto_19

    .line 2610
    .line 2611
    :pswitch_13
    invoke-virtual {p2}, Lcom/google/firebase/messaging/s;->y()Lcom/google/firebase/messaging/s;

    .line 2612
    .line 2613
    .line 2614
    move-result-object p1

    .line 2615
    new-instance p2, Lcom/google/android/gms/internal/measurement/d;

    .line 2616
    .line 2617
    invoke-direct {p2, p3}, Lcom/google/android/gms/internal/measurement/d;-><init>(Ljava/util/List;)V

    .line 2618
    .line 2619
    .line 2620
    invoke-virtual {p1, p2}, Lcom/google/firebase/messaging/s;->B(Lcom/google/android/gms/internal/measurement/d;)Lcom/google/android/gms/internal/measurement/n;

    .line 2621
    .line 2622
    .line 2623
    move-result-object p1

    .line 2624
    goto/16 :goto_19

    .line 2625
    .line 2626
    :cond_4c
    const-string p1, "TERNARY"

    .line 2627
    .line 2628
    invoke-static {v2, p1, p3}, Ls8/n;->a0(ILjava/lang/String;Ljava/util/List;)V

    .line 2629
    .line 2630
    .line 2631
    invoke-interface {p3, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 2632
    .line 2633
    .line 2634
    move-result-object p1

    .line 2635
    check-cast p1, Lcom/google/android/gms/internal/measurement/n;

    .line 2636
    .line 2637
    iget-object v0, p2, Lcom/google/firebase/messaging/s;->c:Ljava/lang/Object;

    .line 2638
    .line 2639
    check-cast v0, Lcom/google/android/gms/internal/measurement/t;

    .line 2640
    .line 2641
    invoke-virtual {v0, p2, p1}, Lcom/google/android/gms/internal/measurement/t;->a(Lcom/google/firebase/messaging/s;Lcom/google/android/gms/internal/measurement/n;)Lcom/google/android/gms/internal/measurement/n;

    .line 2642
    .line 2643
    .line 2644
    move-result-object p1

    .line 2645
    invoke-interface {p1}, Lcom/google/android/gms/internal/measurement/n;->o()Ljava/lang/Boolean;

    .line 2646
    .line 2647
    .line 2648
    move-result-object p1

    .line 2649
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 2650
    .line 2651
    .line 2652
    move-result p1

    .line 2653
    iget-object v0, p2, Lcom/google/firebase/messaging/s;->c:Ljava/lang/Object;

    .line 2654
    .line 2655
    check-cast v0, Lcom/google/android/gms/internal/measurement/t;

    .line 2656
    .line 2657
    if-eqz p1, :cond_4d

    .line 2658
    .line 2659
    invoke-interface {p3, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 2660
    .line 2661
    .line 2662
    move-result-object p1

    .line 2663
    check-cast p1, Lcom/google/android/gms/internal/measurement/n;

    .line 2664
    .line 2665
    invoke-virtual {v0, p2, p1}, Lcom/google/android/gms/internal/measurement/t;->a(Lcom/google/firebase/messaging/s;Lcom/google/android/gms/internal/measurement/n;)Lcom/google/android/gms/internal/measurement/n;

    .line 2666
    .line 2667
    .line 2668
    move-result-object p1

    .line 2669
    goto/16 :goto_19

    .line 2670
    .line 2671
    :cond_4d
    invoke-interface {p3, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 2672
    .line 2673
    .line 2674
    move-result-object p1

    .line 2675
    check-cast p1, Lcom/google/android/gms/internal/measurement/n;

    .line 2676
    .line 2677
    invoke-virtual {v0, p2, p1}, Lcom/google/android/gms/internal/measurement/t;->a(Lcom/google/firebase/messaging/s;Lcom/google/android/gms/internal/measurement/n;)Lcom/google/android/gms/internal/measurement/n;

    .line 2678
    .line 2679
    .line 2680
    move-result-object p1

    .line 2681
    goto/16 :goto_19

    .line 2682
    .line 2683
    :cond_4e
    const-string p1, "SWITCH"

    .line 2684
    .line 2685
    invoke-static {v2, p1, p3}, Ls8/n;->a0(ILjava/lang/String;Ljava/util/List;)V

    .line 2686
    .line 2687
    .line 2688
    invoke-interface {p3, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 2689
    .line 2690
    .line 2691
    move-result-object p1

    .line 2692
    check-cast p1, Lcom/google/android/gms/internal/measurement/n;

    .line 2693
    .line 2694
    iget-object v2, p2, Lcom/google/firebase/messaging/s;->c:Ljava/lang/Object;

    .line 2695
    .line 2696
    check-cast v2, Lcom/google/android/gms/internal/measurement/t;

    .line 2697
    .line 2698
    invoke-virtual {v2, p2, p1}, Lcom/google/android/gms/internal/measurement/t;->a(Lcom/google/firebase/messaging/s;Lcom/google/android/gms/internal/measurement/n;)Lcom/google/android/gms/internal/measurement/n;

    .line 2699
    .line 2700
    .line 2701
    move-result-object p1

    .line 2702
    invoke-interface {p3, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 2703
    .line 2704
    .line 2705
    move-result-object v2

    .line 2706
    check-cast v2, Lcom/google/android/gms/internal/measurement/n;

    .line 2707
    .line 2708
    iget-object v3, p2, Lcom/google/firebase/messaging/s;->c:Ljava/lang/Object;

    .line 2709
    .line 2710
    check-cast v3, Lcom/google/android/gms/internal/measurement/t;

    .line 2711
    .line 2712
    invoke-virtual {v3, p2, v2}, Lcom/google/android/gms/internal/measurement/t;->a(Lcom/google/firebase/messaging/s;Lcom/google/android/gms/internal/measurement/n;)Lcom/google/android/gms/internal/measurement/n;

    .line 2713
    .line 2714
    .line 2715
    move-result-object v2

    .line 2716
    invoke-interface {p3, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 2717
    .line 2718
    .line 2719
    move-result-object p3

    .line 2720
    check-cast p3, Lcom/google/android/gms/internal/measurement/n;

    .line 2721
    .line 2722
    invoke-virtual {v3, p2, p3}, Lcom/google/android/gms/internal/measurement/t;->a(Lcom/google/firebase/messaging/s;Lcom/google/android/gms/internal/measurement/n;)Lcom/google/android/gms/internal/measurement/n;

    .line 2723
    .line 2724
    .line 2725
    move-result-object p3

    .line 2726
    instance-of v4, v2, Lcom/google/android/gms/internal/measurement/d;

    .line 2727
    .line 2728
    if-eqz v4, :cond_55

    .line 2729
    .line 2730
    instance-of v4, p3, Lcom/google/android/gms/internal/measurement/d;

    .line 2731
    .line 2732
    if-eqz v4, :cond_54

    .line 2733
    .line 2734
    check-cast v2, Lcom/google/android/gms/internal/measurement/d;

    .line 2735
    .line 2736
    check-cast p3, Lcom/google/android/gms/internal/measurement/d;

    .line 2737
    .line 2738
    move v4, v5

    .line 2739
    move v7, v4

    .line 2740
    :goto_14
    invoke-virtual {v2}, Lcom/google/android/gms/internal/measurement/d;->p()I

    .line 2741
    .line 2742
    .line 2743
    move-result v8

    .line 2744
    if-ge v4, v8, :cond_53

    .line 2745
    .line 2746
    if-nez v7, :cond_50

    .line 2747
    .line 2748
    invoke-virtual {v2, v4}, Lcom/google/android/gms/internal/measurement/d;->q(I)Lcom/google/android/gms/internal/measurement/n;

    .line 2749
    .line 2750
    .line 2751
    move-result-object v7

    .line 2752
    invoke-virtual {v3, p2, v7}, Lcom/google/android/gms/internal/measurement/t;->a(Lcom/google/firebase/messaging/s;Lcom/google/android/gms/internal/measurement/n;)Lcom/google/android/gms/internal/measurement/n;

    .line 2753
    .line 2754
    .line 2755
    move-result-object v7

    .line 2756
    invoke-virtual {p1, v7}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 2757
    .line 2758
    .line 2759
    move-result v7

    .line 2760
    if-eqz v7, :cond_4f

    .line 2761
    .line 2762
    goto :goto_15

    .line 2763
    :cond_4f
    move v7, v5

    .line 2764
    goto :goto_16

    .line 2765
    :cond_50
    :goto_15
    invoke-virtual {p3, v4}, Lcom/google/android/gms/internal/measurement/d;->q(I)Lcom/google/android/gms/internal/measurement/n;

    .line 2766
    .line 2767
    .line 2768
    move-result-object v7

    .line 2769
    invoke-virtual {v3, p2, v7}, Lcom/google/android/gms/internal/measurement/t;->a(Lcom/google/firebase/messaging/s;Lcom/google/android/gms/internal/measurement/n;)Lcom/google/android/gms/internal/measurement/n;

    .line 2770
    .line 2771
    .line 2772
    move-result-object v7

    .line 2773
    instance-of v8, v7, Lcom/google/android/gms/internal/measurement/f;

    .line 2774
    .line 2775
    if-eqz v8, :cond_52

    .line 2776
    .line 2777
    move-object p1, v7

    .line 2778
    check-cast p1, Lcom/google/android/gms/internal/measurement/f;

    .line 2779
    .line 2780
    iget-object p1, p1, Lcom/google/android/gms/internal/measurement/f;->b:Ljava/lang/String;

    .line 2781
    .line 2782
    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 2783
    .line 2784
    .line 2785
    move-result p1

    .line 2786
    if-eqz p1, :cond_51

    .line 2787
    .line 2788
    goto/16 :goto_18

    .line 2789
    .line 2790
    :cond_51
    move-object p1, v7

    .line 2791
    goto/16 :goto_19

    .line 2792
    .line 2793
    :cond_52
    move v7, v6

    .line 2794
    :goto_16
    add-int/2addr v4, v6

    .line 2795
    goto :goto_14

    .line 2796
    :cond_53
    invoke-virtual {v2}, Lcom/google/android/gms/internal/measurement/d;->p()I

    .line 2797
    .line 2798
    .line 2799
    move-result p1

    .line 2800
    add-int/2addr p1, v6

    .line 2801
    invoke-virtual {p3}, Lcom/google/android/gms/internal/measurement/d;->p()I

    .line 2802
    .line 2803
    .line 2804
    move-result v1

    .line 2805
    if-ne p1, v1, :cond_62

    .line 2806
    .line 2807
    invoke-virtual {v2}, Lcom/google/android/gms/internal/measurement/d;->p()I

    .line 2808
    .line 2809
    .line 2810
    move-result p1

    .line 2811
    invoke-virtual {p3, p1}, Lcom/google/android/gms/internal/measurement/d;->q(I)Lcom/google/android/gms/internal/measurement/n;

    .line 2812
    .line 2813
    .line 2814
    move-result-object p1

    .line 2815
    invoke-virtual {v3, p2, p1}, Lcom/google/android/gms/internal/measurement/t;->a(Lcom/google/firebase/messaging/s;Lcom/google/android/gms/internal/measurement/n;)Lcom/google/android/gms/internal/measurement/n;

    .line 2816
    .line 2817
    .line 2818
    move-result-object p1

    .line 2819
    instance-of p2, p1, Lcom/google/android/gms/internal/measurement/f;

    .line 2820
    .line 2821
    if-eqz p2, :cond_62

    .line 2822
    .line 2823
    move-object p2, p1

    .line 2824
    check-cast p2, Lcom/google/android/gms/internal/measurement/f;

    .line 2825
    .line 2826
    iget-object p2, p2, Lcom/google/android/gms/internal/measurement/f;->b:Ljava/lang/String;

    .line 2827
    .line 2828
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 2829
    .line 2830
    .line 2831
    move-result p3

    .line 2832
    if-nez p3, :cond_66

    .line 2833
    .line 2834
    const-string p3, "continue"

    .line 2835
    .line 2836
    invoke-virtual {p2, p3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 2837
    .line 2838
    .line 2839
    move-result p2

    .line 2840
    if-eqz p2, :cond_62

    .line 2841
    .line 2842
    goto/16 :goto_19

    .line 2843
    .line 2844
    :cond_54
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 2845
    .line 2846
    const-string p2, "Malformed SWITCH statement, case statements are not a list"

    .line 2847
    .line 2848
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 2849
    .line 2850
    .line 2851
    throw p1

    .line 2852
    :cond_55
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 2853
    .line 2854
    const-string p2, "Malformed SWITCH statement, cases are not a list"

    .line 2855
    .line 2856
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 2857
    .line 2858
    .line 2859
    throw p1

    .line 2860
    :cond_56
    const-string p1, "DEFINE_FUNCTION"

    .line 2861
    .line 2862
    invoke-static {v4, p1, p3}, Ls8/n;->b0(ILjava/lang/String;Ljava/util/List;)V

    .line 2863
    .line 2864
    .line 2865
    invoke-static {p2, p3}, Lcom/google/android/gms/internal/measurement/s;->c(Lcom/google/firebase/messaging/s;Ljava/util/ArrayList;)Lcom/google/android/gms/internal/measurement/m;

    .line 2866
    .line 2867
    .line 2868
    move-result-object p1

    .line 2869
    iget-object p3, p1, Lcom/google/android/gms/internal/measurement/h;->a:Ljava/lang/String;

    .line 2870
    .line 2871
    if-nez p3, :cond_57

    .line 2872
    .line 2873
    const-string p3, ""

    .line 2874
    .line 2875
    invoke-virtual {p2, p3, p1}, Lcom/google/firebase/messaging/s;->F(Ljava/lang/String;Lcom/google/android/gms/internal/measurement/n;)V

    .line 2876
    .line 2877
    .line 2878
    goto/16 :goto_19

    .line 2879
    .line 2880
    :cond_57
    invoke-virtual {p2, p3, p1}, Lcom/google/firebase/messaging/s;->F(Ljava/lang/String;Lcom/google/android/gms/internal/measurement/n;)V

    .line 2881
    .line 2882
    .line 2883
    goto/16 :goto_19

    .line 2884
    .line 2885
    :cond_58
    :pswitch_14
    invoke-interface {p3}, Ljava/util/List;->isEmpty()Z

    .line 2886
    .line 2887
    .line 2888
    move-result p1

    .line 2889
    if-eqz p1, :cond_59

    .line 2890
    .line 2891
    sget-object p1, Lcom/google/android/gms/internal/measurement/n;->N:Lcom/google/android/gms/internal/measurement/r;

    .line 2892
    .line 2893
    goto/16 :goto_19

    .line 2894
    .line 2895
    :cond_59
    invoke-interface {p3, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 2896
    .line 2897
    .line 2898
    move-result-object p1

    .line 2899
    check-cast p1, Lcom/google/android/gms/internal/measurement/n;

    .line 2900
    .line 2901
    iget-object p3, p2, Lcom/google/firebase/messaging/s;->c:Ljava/lang/Object;

    .line 2902
    .line 2903
    check-cast p3, Lcom/google/android/gms/internal/measurement/t;

    .line 2904
    .line 2905
    invoke-virtual {p3, p2, p1}, Lcom/google/android/gms/internal/measurement/t;->a(Lcom/google/firebase/messaging/s;Lcom/google/android/gms/internal/measurement/n;)Lcom/google/android/gms/internal/measurement/n;

    .line 2906
    .line 2907
    .line 2908
    move-result-object p1

    .line 2909
    instance-of p3, p1, Lcom/google/android/gms/internal/measurement/d;

    .line 2910
    .line 2911
    if-eqz p3, :cond_5a

    .line 2912
    .line 2913
    check-cast p1, Lcom/google/android/gms/internal/measurement/d;

    .line 2914
    .line 2915
    invoke-virtual {p2, p1}, Lcom/google/firebase/messaging/s;->B(Lcom/google/android/gms/internal/measurement/d;)Lcom/google/android/gms/internal/measurement/n;

    .line 2916
    .line 2917
    .line 2918
    move-result-object p1

    .line 2919
    goto/16 :goto_19

    .line 2920
    .line 2921
    :cond_5a
    sget-object p1, Lcom/google/android/gms/internal/measurement/n;->N:Lcom/google/android/gms/internal/measurement/r;

    .line 2922
    .line 2923
    goto/16 :goto_19

    .line 2924
    .line 2925
    :cond_5b
    invoke-interface {p3}, Ljava/util/List;->isEmpty()Z

    .line 2926
    .line 2927
    .line 2928
    move-result p1

    .line 2929
    if-eqz p1, :cond_5c

    .line 2930
    .line 2931
    sget-object p1, Lcom/google/android/gms/internal/measurement/n;->R:Lcom/google/android/gms/internal/measurement/f;

    .line 2932
    .line 2933
    goto/16 :goto_19

    .line 2934
    .line 2935
    :cond_5c
    const-string p1, "RETURN"

    .line 2936
    .line 2937
    invoke-static {v6, p1, p3}, Ls8/n;->a0(ILjava/lang/String;Ljava/util/List;)V

    .line 2938
    .line 2939
    .line 2940
    invoke-interface {p3, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 2941
    .line 2942
    .line 2943
    move-result-object p1

    .line 2944
    check-cast p1, Lcom/google/android/gms/internal/measurement/n;

    .line 2945
    .line 2946
    iget-object p3, p2, Lcom/google/firebase/messaging/s;->c:Ljava/lang/Object;

    .line 2947
    .line 2948
    check-cast p3, Lcom/google/android/gms/internal/measurement/t;

    .line 2949
    .line 2950
    invoke-virtual {p3, p2, p1}, Lcom/google/android/gms/internal/measurement/t;->a(Lcom/google/firebase/messaging/s;Lcom/google/android/gms/internal/measurement/n;)Lcom/google/android/gms/internal/measurement/n;

    .line 2951
    .line 2952
    .line 2953
    move-result-object p1

    .line 2954
    new-instance p2, Lcom/google/android/gms/internal/measurement/f;

    .line 2955
    .line 2956
    invoke-direct {p2, v0, p1}, Lcom/google/android/gms/internal/measurement/f;-><init>(Ljava/lang/String;Lcom/google/android/gms/internal/measurement/n;)V

    .line 2957
    .line 2958
    .line 2959
    move-object p1, p2

    .line 2960
    goto/16 :goto_19

    .line 2961
    .line 2962
    :cond_5d
    new-instance p1, Lcom/google/android/gms/internal/measurement/d;

    .line 2963
    .line 2964
    invoke-direct {p1, p3}, Lcom/google/android/gms/internal/measurement/d;-><init>(Ljava/util/List;)V

    .line 2965
    .line 2966
    .line 2967
    goto/16 :goto_19

    .line 2968
    .line 2969
    :cond_5e
    const-string p1, "IF"

    .line 2970
    .line 2971
    invoke-static {v4, p1, p3}, Ls8/n;->b0(ILjava/lang/String;Ljava/util/List;)V

    .line 2972
    .line 2973
    .line 2974
    invoke-interface {p3, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 2975
    .line 2976
    .line 2977
    move-result-object p1

    .line 2978
    check-cast p1, Lcom/google/android/gms/internal/measurement/n;

    .line 2979
    .line 2980
    iget-object v0, p2, Lcom/google/firebase/messaging/s;->c:Ljava/lang/Object;

    .line 2981
    .line 2982
    check-cast v0, Lcom/google/android/gms/internal/measurement/t;

    .line 2983
    .line 2984
    invoke-virtual {v0, p2, p1}, Lcom/google/android/gms/internal/measurement/t;->a(Lcom/google/firebase/messaging/s;Lcom/google/android/gms/internal/measurement/n;)Lcom/google/android/gms/internal/measurement/n;

    .line 2985
    .line 2986
    .line 2987
    move-result-object p1

    .line 2988
    invoke-interface {p3, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 2989
    .line 2990
    .line 2991
    move-result-object v0

    .line 2992
    check-cast v0, Lcom/google/android/gms/internal/measurement/n;

    .line 2993
    .line 2994
    iget-object v1, p2, Lcom/google/firebase/messaging/s;->c:Ljava/lang/Object;

    .line 2995
    .line 2996
    check-cast v1, Lcom/google/android/gms/internal/measurement/t;

    .line 2997
    .line 2998
    invoke-virtual {v1, p2, v0}, Lcom/google/android/gms/internal/measurement/t;->a(Lcom/google/firebase/messaging/s;Lcom/google/android/gms/internal/measurement/n;)Lcom/google/android/gms/internal/measurement/n;

    .line 2999
    .line 3000
    .line 3001
    move-result-object v0

    .line 3002
    invoke-interface {p3}, Ljava/util/List;->size()I

    .line 3003
    .line 3004
    .line 3005
    move-result v2

    .line 3006
    if-le v2, v4, :cond_5f

    .line 3007
    .line 3008
    invoke-interface {p3, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 3009
    .line 3010
    .line 3011
    move-result-object p3

    .line 3012
    check-cast p3, Lcom/google/android/gms/internal/measurement/n;

    .line 3013
    .line 3014
    invoke-virtual {v1, p2, p3}, Lcom/google/android/gms/internal/measurement/t;->a(Lcom/google/firebase/messaging/s;Lcom/google/android/gms/internal/measurement/n;)Lcom/google/android/gms/internal/measurement/n;

    .line 3015
    .line 3016
    .line 3017
    move-result-object v3

    .line 3018
    :cond_5f
    sget-object p3, Lcom/google/android/gms/internal/measurement/n;->N:Lcom/google/android/gms/internal/measurement/r;

    .line 3019
    .line 3020
    invoke-interface {p1}, Lcom/google/android/gms/internal/measurement/n;->o()Ljava/lang/Boolean;

    .line 3021
    .line 3022
    .line 3023
    move-result-object p1

    .line 3024
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 3025
    .line 3026
    .line 3027
    move-result p1

    .line 3028
    if-eqz p1, :cond_60

    .line 3029
    .line 3030
    check-cast v0, Lcom/google/android/gms/internal/measurement/d;

    .line 3031
    .line 3032
    invoke-virtual {p2, v0}, Lcom/google/firebase/messaging/s;->B(Lcom/google/android/gms/internal/measurement/d;)Lcom/google/android/gms/internal/measurement/n;

    .line 3033
    .line 3034
    .line 3035
    move-result-object p1

    .line 3036
    goto :goto_17

    .line 3037
    :cond_60
    if-eqz v3, :cond_61

    .line 3038
    .line 3039
    check-cast v3, Lcom/google/android/gms/internal/measurement/d;

    .line 3040
    .line 3041
    invoke-virtual {p2, v3}, Lcom/google/firebase/messaging/s;->B(Lcom/google/android/gms/internal/measurement/d;)Lcom/google/android/gms/internal/measurement/n;

    .line 3042
    .line 3043
    .line 3044
    move-result-object p1

    .line 3045
    goto :goto_17

    .line 3046
    :cond_61
    move-object p1, p3

    .line 3047
    :goto_17
    instance-of p2, p1, Lcom/google/android/gms/internal/measurement/f;

    .line 3048
    .line 3049
    if-nez p2, :cond_66

    .line 3050
    .line 3051
    :cond_62
    :goto_18
    sget-object p1, Lcom/google/android/gms/internal/measurement/n;->N:Lcom/google/android/gms/internal/measurement/r;

    .line 3052
    .line 3053
    goto :goto_19

    .line 3054
    :cond_63
    invoke-static {p2, p3}, Lcom/google/android/gms/internal/measurement/s;->c(Lcom/google/firebase/messaging/s;Ljava/util/ArrayList;)Lcom/google/android/gms/internal/measurement/m;

    .line 3055
    .line 3056
    .line 3057
    move-result-object p1

    .line 3058
    goto :goto_19

    .line 3059
    :cond_64
    invoke-static {v5, v9, p3}, Ls8/n;->a0(ILjava/lang/String;Ljava/util/List;)V

    .line 3060
    .line 3061
    .line 3062
    sget-object p1, Lcom/google/android/gms/internal/measurement/n;->P:Lcom/google/android/gms/internal/measurement/f;

    .line 3063
    .line 3064
    goto :goto_19

    .line 3065
    :cond_65
    const-string p1, "APPLY"

    .line 3066
    .line 3067
    invoke-static {v2, p1, p3}, Ls8/n;->a0(ILjava/lang/String;Ljava/util/List;)V

    .line 3068
    .line 3069
    .line 3070
    invoke-interface {p3, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 3071
    .line 3072
    .line 3073
    move-result-object p1

    .line 3074
    check-cast p1, Lcom/google/android/gms/internal/measurement/n;

    .line 3075
    .line 3076
    iget-object v0, p2, Lcom/google/firebase/messaging/s;->c:Ljava/lang/Object;

    .line 3077
    .line 3078
    check-cast v0, Lcom/google/android/gms/internal/measurement/t;

    .line 3079
    .line 3080
    invoke-virtual {v0, p2, p1}, Lcom/google/android/gms/internal/measurement/t;->a(Lcom/google/firebase/messaging/s;Lcom/google/android/gms/internal/measurement/n;)Lcom/google/android/gms/internal/measurement/n;

    .line 3081
    .line 3082
    .line 3083
    move-result-object p1

    .line 3084
    invoke-interface {p3, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 3085
    .line 3086
    .line 3087
    move-result-object v0

    .line 3088
    check-cast v0, Lcom/google/android/gms/internal/measurement/n;

    .line 3089
    .line 3090
    iget-object v1, p2, Lcom/google/firebase/messaging/s;->c:Ljava/lang/Object;

    .line 3091
    .line 3092
    check-cast v1, Lcom/google/android/gms/internal/measurement/t;

    .line 3093
    .line 3094
    invoke-virtual {v1, p2, v0}, Lcom/google/android/gms/internal/measurement/t;->a(Lcom/google/firebase/messaging/s;Lcom/google/android/gms/internal/measurement/n;)Lcom/google/android/gms/internal/measurement/n;

    .line 3095
    .line 3096
    .line 3097
    move-result-object v0

    .line 3098
    invoke-interface {v0}, Lcom/google/android/gms/internal/measurement/n;->c()Ljava/lang/String;

    .line 3099
    .line 3100
    .line 3101
    move-result-object v0

    .line 3102
    invoke-interface {p3, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 3103
    .line 3104
    .line 3105
    move-result-object p3

    .line 3106
    check-cast p3, Lcom/google/android/gms/internal/measurement/n;

    .line 3107
    .line 3108
    invoke-virtual {v1, p2, p3}, Lcom/google/android/gms/internal/measurement/t;->a(Lcom/google/firebase/messaging/s;Lcom/google/android/gms/internal/measurement/n;)Lcom/google/android/gms/internal/measurement/n;

    .line 3109
    .line 3110
    .line 3111
    move-result-object p3

    .line 3112
    instance-of v1, p3, Lcom/google/android/gms/internal/measurement/d;

    .line 3113
    .line 3114
    if-eqz v1, :cond_68

    .line 3115
    .line 3116
    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    .line 3117
    .line 3118
    .line 3119
    move-result v1

    .line 3120
    if-nez v1, :cond_67

    .line 3121
    .line 3122
    check-cast p3, Lcom/google/android/gms/internal/measurement/d;

    .line 3123
    .line 3124
    invoke-virtual {p3}, Lcom/google/android/gms/internal/measurement/d;->t()Ljava/util/ArrayList;

    .line 3125
    .line 3126
    .line 3127
    move-result-object p3

    .line 3128
    invoke-interface {p1, v0, p2, p3}, Lcom/google/android/gms/internal/measurement/n;->g(Ljava/lang/String;Lcom/google/firebase/messaging/s;Ljava/util/ArrayList;)Lcom/google/android/gms/internal/measurement/n;

    .line 3129
    .line 3130
    .line 3131
    move-result-object p1

    .line 3132
    :cond_66
    :goto_19
    return-object p1

    .line 3133
    :cond_67
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 3134
    .line 3135
    const-string p2, "Function name for apply is undefined"

    .line 3136
    .line 3137
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 3138
    .line 3139
    .line 3140
    throw p1

    .line 3141
    :cond_68
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 3142
    .line 3143
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 3144
    .line 3145
    .line 3146
    move-result-object p2

    .line 3147
    invoke-virtual {p2}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    .line 3148
    .line 3149
    .line 3150
    move-result-object p2

    .line 3151
    const-string p3, "Function arguments for Apply are not a list found "

    .line 3152
    .line 3153
    invoke-static {p3, p2}, Lu0/z;->e(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 3154
    .line 3155
    .line 3156
    move-result-object p2

    .line 3157
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 3158
    .line 3159
    .line 3160
    throw p1

    .line 3161
    :pswitch_15
    invoke-static {p1}, Ls8/n;->X(Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/w;

    .line 3162
    .line 3163
    .line 3164
    move-result-object v0

    .line 3165
    invoke-virtual {v0}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 3166
    .line 3167
    .line 3168
    move-result-object v0

    .line 3169
    invoke-static {v4, v0, p3}, Ls8/n;->a0(ILjava/lang/String;Ljava/util/List;)V

    .line 3170
    .line 3171
    .line 3172
    invoke-interface {p3, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 3173
    .line 3174
    .line 3175
    move-result-object v0

    .line 3176
    check-cast v0, Lcom/google/android/gms/internal/measurement/n;

    .line 3177
    .line 3178
    iget-object v1, p2, Lcom/google/firebase/messaging/s;->c:Ljava/lang/Object;

    .line 3179
    .line 3180
    check-cast v1, Lcom/google/android/gms/internal/measurement/t;

    .line 3181
    .line 3182
    invoke-virtual {v1, p2, v0}, Lcom/google/android/gms/internal/measurement/t;->a(Lcom/google/firebase/messaging/s;Lcom/google/android/gms/internal/measurement/n;)Lcom/google/android/gms/internal/measurement/n;

    .line 3183
    .line 3184
    .line 3185
    move-result-object v0

    .line 3186
    invoke-interface {p3, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 3187
    .line 3188
    .line 3189
    move-result-object p3

    .line 3190
    check-cast p3, Lcom/google/android/gms/internal/measurement/n;

    .line 3191
    .line 3192
    iget-object v1, p2, Lcom/google/firebase/messaging/s;->c:Ljava/lang/Object;

    .line 3193
    .line 3194
    check-cast v1, Lcom/google/android/gms/internal/measurement/t;

    .line 3195
    .line 3196
    invoke-virtual {v1, p2, p3}, Lcom/google/android/gms/internal/measurement/t;->a(Lcom/google/firebase/messaging/s;Lcom/google/android/gms/internal/measurement/n;)Lcom/google/android/gms/internal/measurement/n;

    .line 3197
    .line 3198
    .line 3199
    move-result-object p2

    .line 3200
    invoke-static {p1}, Ls8/n;->X(Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/w;

    .line 3201
    .line 3202
    .line 3203
    move-result-object p3

    .line 3204
    invoke-virtual {p3}, Ljava/lang/Enum;->ordinal()I

    .line 3205
    .line 3206
    .line 3207
    move-result p3

    .line 3208
    const/16 v1, 0x17

    .line 3209
    .line 3210
    if-eq p3, v1, :cond_6c

    .line 3211
    .line 3212
    const/16 v1, 0x30

    .line 3213
    .line 3214
    if-eq p3, v1, :cond_6b

    .line 3215
    .line 3216
    const/16 v1, 0x2a

    .line 3217
    .line 3218
    if-eq p3, v1, :cond_6a

    .line 3219
    .line 3220
    const/16 v1, 0x2b

    .line 3221
    .line 3222
    if-eq p3, v1, :cond_69

    .line 3223
    .line 3224
    packed-switch p3, :pswitch_data_5

    .line 3225
    .line 3226
    .line 3227
    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/measurement/s;->b(Ljava/lang/String;)V

    .line 3228
    .line 3229
    .line 3230
    throw v3

    .line 3231
    :pswitch_16
    invoke-static {v0, p2}, Ls8/n;->e0(Lcom/google/android/gms/internal/measurement/n;Lcom/google/android/gms/internal/measurement/n;)Z

    .line 3232
    .line 3233
    .line 3234
    move-result p1

    .line 3235
    :goto_1a
    xor-int/2addr p1, v6

    .line 3236
    goto :goto_1b

    .line 3237
    :pswitch_17
    invoke-static {v0, p2}, Ls8/n;->e0(Lcom/google/android/gms/internal/measurement/n;Lcom/google/android/gms/internal/measurement/n;)Z

    .line 3238
    .line 3239
    .line 3240
    move-result p1

    .line 3241
    goto :goto_1b

    .line 3242
    :pswitch_18
    invoke-static {p2, v0}, Lcom/google/android/gms/internal/measurement/s;->h(Lcom/google/android/gms/internal/measurement/n;Lcom/google/android/gms/internal/measurement/n;)Z

    .line 3243
    .line 3244
    .line 3245
    move-result p1

    .line 3246
    goto :goto_1b

    .line 3247
    :pswitch_19
    invoke-static {p2, v0}, Lcom/google/android/gms/internal/measurement/s;->f(Lcom/google/android/gms/internal/measurement/n;Lcom/google/android/gms/internal/measurement/n;)Z

    .line 3248
    .line 3249
    .line 3250
    move-result p1

    .line 3251
    goto :goto_1b

    .line 3252
    :cond_69
    invoke-static {v0, p2}, Lcom/google/android/gms/internal/measurement/s;->h(Lcom/google/android/gms/internal/measurement/n;Lcom/google/android/gms/internal/measurement/n;)Z

    .line 3253
    .line 3254
    .line 3255
    move-result p1

    .line 3256
    goto :goto_1b

    .line 3257
    :cond_6a
    invoke-static {v0, p2}, Lcom/google/android/gms/internal/measurement/s;->f(Lcom/google/android/gms/internal/measurement/n;Lcom/google/android/gms/internal/measurement/n;)Z

    .line 3258
    .line 3259
    .line 3260
    move-result p1

    .line 3261
    goto :goto_1b

    .line 3262
    :cond_6b
    invoke-static {v0, p2}, Lcom/google/android/gms/internal/measurement/s;->e(Lcom/google/android/gms/internal/measurement/n;Lcom/google/android/gms/internal/measurement/n;)Z

    .line 3263
    .line 3264
    .line 3265
    move-result p1

    .line 3266
    goto :goto_1a

    .line 3267
    :cond_6c
    invoke-static {v0, p2}, Lcom/google/android/gms/internal/measurement/s;->e(Lcom/google/android/gms/internal/measurement/n;Lcom/google/android/gms/internal/measurement/n;)Z

    .line 3268
    .line 3269
    .line 3270
    move-result p1

    .line 3271
    :goto_1b
    if-eqz p1, :cond_6d

    .line 3272
    .line 3273
    sget-object p1, Lcom/google/android/gms/internal/measurement/n;->S:Lcom/google/android/gms/internal/measurement/e;

    .line 3274
    .line 3275
    goto :goto_1c

    .line 3276
    :cond_6d
    sget-object p1, Lcom/google/android/gms/internal/measurement/n;->T:Lcom/google/android/gms/internal/measurement/e;

    .line 3277
    .line 3278
    :goto_1c
    return-object p1

    .line 3279
    :pswitch_1a
    sget-object v0, Lcom/google/android/gms/internal/measurement/w;->b:Lcom/google/android/gms/internal/measurement/w;

    .line 3280
    .line 3281
    invoke-static {p1}, Ls8/n;->X(Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/w;

    .line 3282
    .line 3283
    .line 3284
    move-result-object v0

    .line 3285
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 3286
    .line 3287
    .line 3288
    move-result v0

    .line 3289
    const-wide/16 v1, 0x1f

    .line 3290
    .line 3291
    packed-switch v0, :pswitch_data_6

    .line 3292
    .line 3293
    .line 3294
    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/measurement/s;->b(Ljava/lang/String;)V

    .line 3295
    .line 3296
    .line 3297
    throw v3

    .line 3298
    :pswitch_1b
    const-string p1, "BITWISE_XOR"

    .line 3299
    .line 3300
    invoke-static {v4, p1, p3}, Ls8/n;->a0(ILjava/lang/String;Ljava/util/List;)V

    .line 3301
    .line 3302
    .line 3303
    invoke-interface {p3, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 3304
    .line 3305
    .line 3306
    move-result-object p1

    .line 3307
    check-cast p1, Lcom/google/android/gms/internal/measurement/n;

    .line 3308
    .line 3309
    iget-object v0, p2, Lcom/google/firebase/messaging/s;->c:Ljava/lang/Object;

    .line 3310
    .line 3311
    check-cast v0, Lcom/google/android/gms/internal/measurement/t;

    .line 3312
    .line 3313
    invoke-virtual {v0, p2, p1}, Lcom/google/android/gms/internal/measurement/t;->a(Lcom/google/firebase/messaging/s;Lcom/google/android/gms/internal/measurement/n;)Lcom/google/android/gms/internal/measurement/n;

    .line 3314
    .line 3315
    .line 3316
    move-result-object p1

    .line 3317
    invoke-interface {p1}, Lcom/google/android/gms/internal/measurement/n;->b()Ljava/lang/Double;

    .line 3318
    .line 3319
    .line 3320
    move-result-object p1

    .line 3321
    invoke-virtual {p1}, Ljava/lang/Double;->doubleValue()D

    .line 3322
    .line 3323
    .line 3324
    move-result-wide v0

    .line 3325
    invoke-static {v0, v1}, Ls8/n;->T(D)I

    .line 3326
    .line 3327
    .line 3328
    move-result p1

    .line 3329
    invoke-interface {p3, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 3330
    .line 3331
    .line 3332
    move-result-object p3

    .line 3333
    check-cast p3, Lcom/google/android/gms/internal/measurement/n;

    .line 3334
    .line 3335
    iget-object v0, p2, Lcom/google/firebase/messaging/s;->c:Ljava/lang/Object;

    .line 3336
    .line 3337
    check-cast v0, Lcom/google/android/gms/internal/measurement/t;

    .line 3338
    .line 3339
    invoke-virtual {v0, p2, p3}, Lcom/google/android/gms/internal/measurement/t;->a(Lcom/google/firebase/messaging/s;Lcom/google/android/gms/internal/measurement/n;)Lcom/google/android/gms/internal/measurement/n;

    .line 3340
    .line 3341
    .line 3342
    move-result-object p2

    .line 3343
    invoke-interface {p2}, Lcom/google/android/gms/internal/measurement/n;->b()Ljava/lang/Double;

    .line 3344
    .line 3345
    .line 3346
    move-result-object p2

    .line 3347
    invoke-virtual {p2}, Ljava/lang/Double;->doubleValue()D

    .line 3348
    .line 3349
    .line 3350
    move-result-wide p2

    .line 3351
    invoke-static {p2, p3}, Ls8/n;->T(D)I

    .line 3352
    .line 3353
    .line 3354
    move-result p2

    .line 3355
    xor-int/2addr p1, p2

    .line 3356
    int-to-double p1, p1

    .line 3357
    new-instance p3, Lcom/google/android/gms/internal/measurement/g;

    .line 3358
    .line 3359
    invoke-static {p1, p2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 3360
    .line 3361
    .line 3362
    move-result-object p1

    .line 3363
    invoke-direct {p3, p1}, Lcom/google/android/gms/internal/measurement/g;-><init>(Ljava/lang/Double;)V

    .line 3364
    .line 3365
    .line 3366
    goto/16 :goto_1d

    .line 3367
    .line 3368
    :pswitch_1c
    const-string p1, "BITWISE_UNSIGNED_RIGHT_SHIFT"

    .line 3369
    .line 3370
    invoke-static {v4, p1, p3}, Ls8/n;->a0(ILjava/lang/String;Ljava/util/List;)V

    .line 3371
    .line 3372
    .line 3373
    invoke-interface {p3, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 3374
    .line 3375
    .line 3376
    move-result-object p1

    .line 3377
    check-cast p1, Lcom/google/android/gms/internal/measurement/n;

    .line 3378
    .line 3379
    iget-object v0, p2, Lcom/google/firebase/messaging/s;->c:Ljava/lang/Object;

    .line 3380
    .line 3381
    check-cast v0, Lcom/google/android/gms/internal/measurement/t;

    .line 3382
    .line 3383
    invoke-virtual {v0, p2, p1}, Lcom/google/android/gms/internal/measurement/t;->a(Lcom/google/firebase/messaging/s;Lcom/google/android/gms/internal/measurement/n;)Lcom/google/android/gms/internal/measurement/n;

    .line 3384
    .line 3385
    .line 3386
    move-result-object p1

    .line 3387
    invoke-interface {p1}, Lcom/google/android/gms/internal/measurement/n;->b()Ljava/lang/Double;

    .line 3388
    .line 3389
    .line 3390
    move-result-object p1

    .line 3391
    invoke-virtual {p1}, Ljava/lang/Double;->doubleValue()D

    .line 3392
    .line 3393
    .line 3394
    move-result-wide v3

    .line 3395
    invoke-static {v3, v4}, Ls8/n;->T(D)I

    .line 3396
    .line 3397
    .line 3398
    move-result p1

    .line 3399
    int-to-long v3, p1

    .line 3400
    const-wide v7, 0xffffffffL

    .line 3401
    .line 3402
    .line 3403
    .line 3404
    .line 3405
    and-long/2addr v3, v7

    .line 3406
    invoke-interface {p3, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 3407
    .line 3408
    .line 3409
    move-result-object p1

    .line 3410
    check-cast p1, Lcom/google/android/gms/internal/measurement/n;

    .line 3411
    .line 3412
    iget-object p3, p2, Lcom/google/firebase/messaging/s;->c:Ljava/lang/Object;

    .line 3413
    .line 3414
    check-cast p3, Lcom/google/android/gms/internal/measurement/t;

    .line 3415
    .line 3416
    invoke-virtual {p3, p2, p1}, Lcom/google/android/gms/internal/measurement/t;->a(Lcom/google/firebase/messaging/s;Lcom/google/android/gms/internal/measurement/n;)Lcom/google/android/gms/internal/measurement/n;

    .line 3417
    .line 3418
    .line 3419
    move-result-object p1

    .line 3420
    invoke-interface {p1}, Lcom/google/android/gms/internal/measurement/n;->b()Ljava/lang/Double;

    .line 3421
    .line 3422
    .line 3423
    move-result-object p1

    .line 3424
    invoke-virtual {p1}, Ljava/lang/Double;->doubleValue()D

    .line 3425
    .line 3426
    .line 3427
    move-result-wide p1

    .line 3428
    invoke-static {p1, p2}, Ls8/n;->T(D)I

    .line 3429
    .line 3430
    .line 3431
    move-result p1

    .line 3432
    int-to-long p1, p1

    .line 3433
    and-long/2addr p1, v1

    .line 3434
    long-to-int p1, p1

    .line 3435
    ushr-long p1, v3, p1

    .line 3436
    .line 3437
    long-to-double p1, p1

    .line 3438
    new-instance p3, Lcom/google/android/gms/internal/measurement/g;

    .line 3439
    .line 3440
    invoke-static {p1, p2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 3441
    .line 3442
    .line 3443
    move-result-object p1

    .line 3444
    invoke-direct {p3, p1}, Lcom/google/android/gms/internal/measurement/g;-><init>(Ljava/lang/Double;)V

    .line 3445
    .line 3446
    .line 3447
    goto/16 :goto_1d

    .line 3448
    .line 3449
    :pswitch_1d
    const-string p1, "BITWISE_RIGHT_SHIFT"

    .line 3450
    .line 3451
    invoke-static {v4, p1, p3}, Ls8/n;->a0(ILjava/lang/String;Ljava/util/List;)V

    .line 3452
    .line 3453
    .line 3454
    invoke-interface {p3, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 3455
    .line 3456
    .line 3457
    move-result-object p1

    .line 3458
    check-cast p1, Lcom/google/android/gms/internal/measurement/n;

    .line 3459
    .line 3460
    iget-object v0, p2, Lcom/google/firebase/messaging/s;->c:Ljava/lang/Object;

    .line 3461
    .line 3462
    check-cast v0, Lcom/google/android/gms/internal/measurement/t;

    .line 3463
    .line 3464
    invoke-virtual {v0, p2, p1}, Lcom/google/android/gms/internal/measurement/t;->a(Lcom/google/firebase/messaging/s;Lcom/google/android/gms/internal/measurement/n;)Lcom/google/android/gms/internal/measurement/n;

    .line 3465
    .line 3466
    .line 3467
    move-result-object p1

    .line 3468
    invoke-interface {p1}, Lcom/google/android/gms/internal/measurement/n;->b()Ljava/lang/Double;

    .line 3469
    .line 3470
    .line 3471
    move-result-object p1

    .line 3472
    invoke-virtual {p1}, Ljava/lang/Double;->doubleValue()D

    .line 3473
    .line 3474
    .line 3475
    move-result-wide v3

    .line 3476
    invoke-static {v3, v4}, Ls8/n;->T(D)I

    .line 3477
    .line 3478
    .line 3479
    move-result p1

    .line 3480
    invoke-interface {p3, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 3481
    .line 3482
    .line 3483
    move-result-object p3

    .line 3484
    check-cast p3, Lcom/google/android/gms/internal/measurement/n;

    .line 3485
    .line 3486
    iget-object v0, p2, Lcom/google/firebase/messaging/s;->c:Ljava/lang/Object;

    .line 3487
    .line 3488
    check-cast v0, Lcom/google/android/gms/internal/measurement/t;

    .line 3489
    .line 3490
    invoke-virtual {v0, p2, p3}, Lcom/google/android/gms/internal/measurement/t;->a(Lcom/google/firebase/messaging/s;Lcom/google/android/gms/internal/measurement/n;)Lcom/google/android/gms/internal/measurement/n;

    .line 3491
    .line 3492
    .line 3493
    move-result-object p2

    .line 3494
    invoke-interface {p2}, Lcom/google/android/gms/internal/measurement/n;->b()Ljava/lang/Double;

    .line 3495
    .line 3496
    .line 3497
    move-result-object p2

    .line 3498
    invoke-virtual {p2}, Ljava/lang/Double;->doubleValue()D

    .line 3499
    .line 3500
    .line 3501
    move-result-wide p2

    .line 3502
    invoke-static {p2, p3}, Ls8/n;->T(D)I

    .line 3503
    .line 3504
    .line 3505
    move-result p2

    .line 3506
    int-to-long p2, p2

    .line 3507
    and-long/2addr p2, v1

    .line 3508
    long-to-int p2, p2

    .line 3509
    shr-int/2addr p1, p2

    .line 3510
    int-to-double p1, p1

    .line 3511
    new-instance p3, Lcom/google/android/gms/internal/measurement/g;

    .line 3512
    .line 3513
    invoke-static {p1, p2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 3514
    .line 3515
    .line 3516
    move-result-object p1

    .line 3517
    invoke-direct {p3, p1}, Lcom/google/android/gms/internal/measurement/g;-><init>(Ljava/lang/Double;)V

    .line 3518
    .line 3519
    .line 3520
    goto/16 :goto_1d

    .line 3521
    .line 3522
    :pswitch_1e
    const-string p1, "BITWISE_OR"

    .line 3523
    .line 3524
    invoke-static {v4, p1, p3}, Ls8/n;->a0(ILjava/lang/String;Ljava/util/List;)V

    .line 3525
    .line 3526
    .line 3527
    invoke-interface {p3, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 3528
    .line 3529
    .line 3530
    move-result-object p1

    .line 3531
    check-cast p1, Lcom/google/android/gms/internal/measurement/n;

    .line 3532
    .line 3533
    iget-object v0, p2, Lcom/google/firebase/messaging/s;->c:Ljava/lang/Object;

    .line 3534
    .line 3535
    check-cast v0, Lcom/google/android/gms/internal/measurement/t;

    .line 3536
    .line 3537
    invoke-virtual {v0, p2, p1}, Lcom/google/android/gms/internal/measurement/t;->a(Lcom/google/firebase/messaging/s;Lcom/google/android/gms/internal/measurement/n;)Lcom/google/android/gms/internal/measurement/n;

    .line 3538
    .line 3539
    .line 3540
    move-result-object p1

    .line 3541
    invoke-interface {p1}, Lcom/google/android/gms/internal/measurement/n;->b()Ljava/lang/Double;

    .line 3542
    .line 3543
    .line 3544
    move-result-object p1

    .line 3545
    invoke-virtual {p1}, Ljava/lang/Double;->doubleValue()D

    .line 3546
    .line 3547
    .line 3548
    move-result-wide v0

    .line 3549
    invoke-static {v0, v1}, Ls8/n;->T(D)I

    .line 3550
    .line 3551
    .line 3552
    move-result p1

    .line 3553
    invoke-interface {p3, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 3554
    .line 3555
    .line 3556
    move-result-object p3

    .line 3557
    check-cast p3, Lcom/google/android/gms/internal/measurement/n;

    .line 3558
    .line 3559
    iget-object v0, p2, Lcom/google/firebase/messaging/s;->c:Ljava/lang/Object;

    .line 3560
    .line 3561
    check-cast v0, Lcom/google/android/gms/internal/measurement/t;

    .line 3562
    .line 3563
    invoke-virtual {v0, p2, p3}, Lcom/google/android/gms/internal/measurement/t;->a(Lcom/google/firebase/messaging/s;Lcom/google/android/gms/internal/measurement/n;)Lcom/google/android/gms/internal/measurement/n;

    .line 3564
    .line 3565
    .line 3566
    move-result-object p2

    .line 3567
    invoke-interface {p2}, Lcom/google/android/gms/internal/measurement/n;->b()Ljava/lang/Double;

    .line 3568
    .line 3569
    .line 3570
    move-result-object p2

    .line 3571
    invoke-virtual {p2}, Ljava/lang/Double;->doubleValue()D

    .line 3572
    .line 3573
    .line 3574
    move-result-wide p2

    .line 3575
    invoke-static {p2, p3}, Ls8/n;->T(D)I

    .line 3576
    .line 3577
    .line 3578
    move-result p2

    .line 3579
    or-int/2addr p1, p2

    .line 3580
    int-to-double p1, p1

    .line 3581
    new-instance p3, Lcom/google/android/gms/internal/measurement/g;

    .line 3582
    .line 3583
    invoke-static {p1, p2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 3584
    .line 3585
    .line 3586
    move-result-object p1

    .line 3587
    invoke-direct {p3, p1}, Lcom/google/android/gms/internal/measurement/g;-><init>(Ljava/lang/Double;)V

    .line 3588
    .line 3589
    .line 3590
    goto/16 :goto_1d

    .line 3591
    .line 3592
    :pswitch_1f
    const-string p1, "BITWISE_NOT"

    .line 3593
    .line 3594
    invoke-static {v6, p1, p3}, Ls8/n;->a0(ILjava/lang/String;Ljava/util/List;)V

    .line 3595
    .line 3596
    .line 3597
    invoke-interface {p3, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 3598
    .line 3599
    .line 3600
    move-result-object p1

    .line 3601
    check-cast p1, Lcom/google/android/gms/internal/measurement/n;

    .line 3602
    .line 3603
    iget-object p3, p2, Lcom/google/firebase/messaging/s;->c:Ljava/lang/Object;

    .line 3604
    .line 3605
    check-cast p3, Lcom/google/android/gms/internal/measurement/t;

    .line 3606
    .line 3607
    invoke-virtual {p3, p2, p1}, Lcom/google/android/gms/internal/measurement/t;->a(Lcom/google/firebase/messaging/s;Lcom/google/android/gms/internal/measurement/n;)Lcom/google/android/gms/internal/measurement/n;

    .line 3608
    .line 3609
    .line 3610
    move-result-object p1

    .line 3611
    invoke-interface {p1}, Lcom/google/android/gms/internal/measurement/n;->b()Ljava/lang/Double;

    .line 3612
    .line 3613
    .line 3614
    move-result-object p1

    .line 3615
    invoke-virtual {p1}, Ljava/lang/Double;->doubleValue()D

    .line 3616
    .line 3617
    .line 3618
    move-result-wide p1

    .line 3619
    invoke-static {p1, p2}, Ls8/n;->T(D)I

    .line 3620
    .line 3621
    .line 3622
    move-result p1

    .line 3623
    not-int p1, p1

    .line 3624
    int-to-double p1, p1

    .line 3625
    new-instance p3, Lcom/google/android/gms/internal/measurement/g;

    .line 3626
    .line 3627
    invoke-static {p1, p2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 3628
    .line 3629
    .line 3630
    move-result-object p1

    .line 3631
    invoke-direct {p3, p1}, Lcom/google/android/gms/internal/measurement/g;-><init>(Ljava/lang/Double;)V

    .line 3632
    .line 3633
    .line 3634
    goto/16 :goto_1d

    .line 3635
    .line 3636
    :pswitch_20
    const-string p1, "BITWISE_LEFT_SHIFT"

    .line 3637
    .line 3638
    invoke-static {v4, p1, p3}, Ls8/n;->a0(ILjava/lang/String;Ljava/util/List;)V

    .line 3639
    .line 3640
    .line 3641
    invoke-interface {p3, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 3642
    .line 3643
    .line 3644
    move-result-object p1

    .line 3645
    check-cast p1, Lcom/google/android/gms/internal/measurement/n;

    .line 3646
    .line 3647
    iget-object v0, p2, Lcom/google/firebase/messaging/s;->c:Ljava/lang/Object;

    .line 3648
    .line 3649
    check-cast v0, Lcom/google/android/gms/internal/measurement/t;

    .line 3650
    .line 3651
    invoke-virtual {v0, p2, p1}, Lcom/google/android/gms/internal/measurement/t;->a(Lcom/google/firebase/messaging/s;Lcom/google/android/gms/internal/measurement/n;)Lcom/google/android/gms/internal/measurement/n;

    .line 3652
    .line 3653
    .line 3654
    move-result-object p1

    .line 3655
    invoke-interface {p1}, Lcom/google/android/gms/internal/measurement/n;->b()Ljava/lang/Double;

    .line 3656
    .line 3657
    .line 3658
    move-result-object p1

    .line 3659
    invoke-virtual {p1}, Ljava/lang/Double;->doubleValue()D

    .line 3660
    .line 3661
    .line 3662
    move-result-wide v3

    .line 3663
    invoke-static {v3, v4}, Ls8/n;->T(D)I

    .line 3664
    .line 3665
    .line 3666
    move-result p1

    .line 3667
    invoke-interface {p3, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 3668
    .line 3669
    .line 3670
    move-result-object p3

    .line 3671
    check-cast p3, Lcom/google/android/gms/internal/measurement/n;

    .line 3672
    .line 3673
    iget-object v0, p2, Lcom/google/firebase/messaging/s;->c:Ljava/lang/Object;

    .line 3674
    .line 3675
    check-cast v0, Lcom/google/android/gms/internal/measurement/t;

    .line 3676
    .line 3677
    invoke-virtual {v0, p2, p3}, Lcom/google/android/gms/internal/measurement/t;->a(Lcom/google/firebase/messaging/s;Lcom/google/android/gms/internal/measurement/n;)Lcom/google/android/gms/internal/measurement/n;

    .line 3678
    .line 3679
    .line 3680
    move-result-object p2

    .line 3681
    invoke-interface {p2}, Lcom/google/android/gms/internal/measurement/n;->b()Ljava/lang/Double;

    .line 3682
    .line 3683
    .line 3684
    move-result-object p2

    .line 3685
    invoke-virtual {p2}, Ljava/lang/Double;->doubleValue()D

    .line 3686
    .line 3687
    .line 3688
    move-result-wide p2

    .line 3689
    invoke-static {p2, p3}, Ls8/n;->T(D)I

    .line 3690
    .line 3691
    .line 3692
    move-result p2

    .line 3693
    int-to-long p2, p2

    .line 3694
    and-long/2addr p2, v1

    .line 3695
    long-to-int p2, p2

    .line 3696
    shl-int/2addr p1, p2

    .line 3697
    int-to-double p1, p1

    .line 3698
    new-instance p3, Lcom/google/android/gms/internal/measurement/g;

    .line 3699
    .line 3700
    invoke-static {p1, p2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 3701
    .line 3702
    .line 3703
    move-result-object p1

    .line 3704
    invoke-direct {p3, p1}, Lcom/google/android/gms/internal/measurement/g;-><init>(Ljava/lang/Double;)V

    .line 3705
    .line 3706
    .line 3707
    goto :goto_1d

    .line 3708
    :pswitch_21
    const-string p1, "BITWISE_AND"

    .line 3709
    .line 3710
    invoke-static {v4, p1, p3}, Ls8/n;->a0(ILjava/lang/String;Ljava/util/List;)V

    .line 3711
    .line 3712
    .line 3713
    invoke-interface {p3, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 3714
    .line 3715
    .line 3716
    move-result-object p1

    .line 3717
    check-cast p1, Lcom/google/android/gms/internal/measurement/n;

    .line 3718
    .line 3719
    iget-object v0, p2, Lcom/google/firebase/messaging/s;->c:Ljava/lang/Object;

    .line 3720
    .line 3721
    check-cast v0, Lcom/google/android/gms/internal/measurement/t;

    .line 3722
    .line 3723
    invoke-virtual {v0, p2, p1}, Lcom/google/android/gms/internal/measurement/t;->a(Lcom/google/firebase/messaging/s;Lcom/google/android/gms/internal/measurement/n;)Lcom/google/android/gms/internal/measurement/n;

    .line 3724
    .line 3725
    .line 3726
    move-result-object p1

    .line 3727
    invoke-interface {p1}, Lcom/google/android/gms/internal/measurement/n;->b()Ljava/lang/Double;

    .line 3728
    .line 3729
    .line 3730
    move-result-object p1

    .line 3731
    invoke-virtual {p1}, Ljava/lang/Double;->doubleValue()D

    .line 3732
    .line 3733
    .line 3734
    move-result-wide v0

    .line 3735
    invoke-static {v0, v1}, Ls8/n;->T(D)I

    .line 3736
    .line 3737
    .line 3738
    move-result p1

    .line 3739
    invoke-interface {p3, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 3740
    .line 3741
    .line 3742
    move-result-object p3

    .line 3743
    check-cast p3, Lcom/google/android/gms/internal/measurement/n;

    .line 3744
    .line 3745
    iget-object v0, p2, Lcom/google/firebase/messaging/s;->c:Ljava/lang/Object;

    .line 3746
    .line 3747
    check-cast v0, Lcom/google/android/gms/internal/measurement/t;

    .line 3748
    .line 3749
    invoke-virtual {v0, p2, p3}, Lcom/google/android/gms/internal/measurement/t;->a(Lcom/google/firebase/messaging/s;Lcom/google/android/gms/internal/measurement/n;)Lcom/google/android/gms/internal/measurement/n;

    .line 3750
    .line 3751
    .line 3752
    move-result-object p2

    .line 3753
    invoke-interface {p2}, Lcom/google/android/gms/internal/measurement/n;->b()Ljava/lang/Double;

    .line 3754
    .line 3755
    .line 3756
    move-result-object p2

    .line 3757
    invoke-virtual {p2}, Ljava/lang/Double;->doubleValue()D

    .line 3758
    .line 3759
    .line 3760
    move-result-wide p2

    .line 3761
    invoke-static {p2, p3}, Ls8/n;->T(D)I

    .line 3762
    .line 3763
    .line 3764
    move-result p2

    .line 3765
    and-int/2addr p1, p2

    .line 3766
    int-to-double p1, p1

    .line 3767
    new-instance p3, Lcom/google/android/gms/internal/measurement/g;

    .line 3768
    .line 3769
    invoke-static {p1, p2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 3770
    .line 3771
    .line 3772
    move-result-object p1

    .line 3773
    invoke-direct {p3, p1}, Lcom/google/android/gms/internal/measurement/g;-><init>(Ljava/lang/Double;)V

    .line 3774
    .line 3775
    .line 3776
    :goto_1d
    return-object p3

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1a
        :pswitch_15
        :pswitch_11
        :pswitch_10
        :pswitch_8
        :pswitch_4
        :pswitch_3
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0x3e
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch

    :pswitch_data_2
    .packed-switch 0x2c
        :pswitch_7
        :pswitch_6
        :pswitch_5
    .end packed-switch

    :pswitch_data_3
    .packed-switch 0x1a
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
    .end packed-switch

    :pswitch_data_4
    .packed-switch 0xb
        :pswitch_13
        :pswitch_12
        :pswitch_14
    .end packed-switch

    :pswitch_data_5
    .packed-switch 0x25
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
    .end packed-switch

    :pswitch_data_6
    .packed-switch 0x4
        :pswitch_21
        :pswitch_20
        :pswitch_1f
        :pswitch_1e
        :pswitch_1d
        :pswitch_1c
        :pswitch_1b
    .end packed-switch
.end method

.method public final b(Ljava/lang/String;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/s;->a:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-static {p1}, Ls8/n;->X(Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/w;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    .line 18
    .line 19
    const-string v1, "Command not implemented: "

    .line 20
    .line 21
    invoke-virtual {v1, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    invoke-direct {v0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    throw v0

    .line 29
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 30
    .line 31
    const-string v0, "Command not supported"

    .line 32
    .line 33
    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    throw p1
    .line 37
    .line 38
.end method
