.class public final LS2/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LY3/g;


# instance fields
.field public final synthetic a:I

.field public final b:Ljava/util/List;

.field public final c:[J

.field public final d:[J


# direct methods
.method public constructor <init>(ILjava/util/ArrayList;)V
    .locals 7

    .line 1
    iput p1, p0, LS2/d;->a:I

    .line 2
    .line 3
    packed-switch p1, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    new-instance p1, Ljava/util/ArrayList;

    .line 10
    .line 11
    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    invoke-direct {p1, v0}, Ljava/util/ArrayList;-><init>(I)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    const/4 v1, 0x0

    .line 23
    move v2, v1

    .line 24
    :goto_0
    if-ge v2, v0, :cond_0

    .line 25
    .line 26
    invoke-virtual {p2, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v3

    .line 30
    add-int/lit8 v2, v2, 0x1

    .line 31
    .line 32
    invoke-static {v3}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    invoke-virtual {p1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 36
    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_0
    invoke-static {p1}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    iput-object p1, p0, LS2/d;->b:Ljava/util/List;

    .line 44
    .line 45
    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    .line 46
    .line 47
    .line 48
    move-result p1

    .line 49
    mul-int/lit8 p1, p1, 0x2

    .line 50
    .line 51
    new-array p1, p1, [J

    .line 52
    .line 53
    iput-object p1, p0, LS2/d;->c:[J

    .line 54
    .line 55
    sget-object p1, LQ2/O;->a:Ljava/util/concurrent/atomic/AtomicLong;

    .line 56
    .line 57
    invoke-virtual {p1}, Ljava/util/concurrent/atomic/AtomicLong;->get()J

    .line 58
    .line 59
    .line 60
    move-result-wide v2

    .line 61
    :goto_1
    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    .line 62
    .line 63
    .line 64
    move-result p1

    .line 65
    if-ge v1, p1, :cond_1

    .line 66
    .line 67
    invoke-virtual {p2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    move-result-object p1

    .line 71
    check-cast p1, Lh4/c;

    .line 72
    .line 73
    mul-int/lit8 v0, v1, 0x2

    .line 74
    .line 75
    iget-object v4, p0, LS2/d;->c:[J

    .line 76
    .line 77
    iget-wide v5, p1, Lh4/c;->b:J

    .line 78
    .line 79
    add-long/2addr v5, v2

    .line 80
    aput-wide v5, v4, v0

    .line 81
    .line 82
    add-int/lit8 v0, v0, 0x1

    .line 83
    .line 84
    iget-wide v5, p1, Lh4/c;->c:J

    .line 85
    .line 86
    add-long/2addr v5, v2

    .line 87
    aput-wide v5, v4, v0

    .line 88
    .line 89
    add-int/lit8 v1, v1, 0x1

    .line 90
    .line 91
    goto :goto_1

    .line 92
    :cond_1
    iget-object p1, p0, LS2/d;->c:[J

    .line 93
    .line 94
    array-length p2, p1

    .line 95
    invoke-static {p1, p2}, Ljava/util/Arrays;->copyOf([JI)[J

    .line 96
    .line 97
    .line 98
    move-result-object p1

    .line 99
    iput-object p1, p0, LS2/d;->d:[J

    .line 100
    .line 101
    invoke-static {p1}, Ljava/util/Arrays;->sort([J)V

    .line 102
    .line 103
    .line 104
    return-void

    .line 105
    :pswitch_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 106
    .line 107
    .line 108
    new-instance p1, Ljava/util/ArrayList;

    .line 109
    .line 110
    invoke-direct {p1, p2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 111
    .line 112
    .line 113
    invoke-static {p1}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    .line 114
    .line 115
    .line 116
    move-result-object p1

    .line 117
    iput-object p1, p0, LS2/d;->b:Ljava/util/List;

    .line 118
    .line 119
    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    .line 120
    .line 121
    .line 122
    move-result p1

    .line 123
    mul-int/lit8 p1, p1, 0x2

    .line 124
    .line 125
    new-array p1, p1, [J

    .line 126
    .line 127
    iput-object p1, p0, LS2/d;->c:[J

    .line 128
    .line 129
    const/4 p1, 0x0

    .line 130
    :goto_2
    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    .line 131
    .line 132
    .line 133
    move-result v0

    .line 134
    if-ge p1, v0, :cond_2

    .line 135
    .line 136
    invoke-virtual {p2, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 137
    .line 138
    .line 139
    move-result-object v0

    .line 140
    check-cast v0, Lh4/c;

    .line 141
    .line 142
    mul-int/lit8 v1, p1, 0x2

    .line 143
    .line 144
    iget-object v2, p0, LS2/d;->c:[J

    .line 145
    .line 146
    iget-wide v3, v0, Lh4/c;->b:J

    .line 147
    .line 148
    aput-wide v3, v2, v1

    .line 149
    .line 150
    add-int/lit8 v1, v1, 0x1

    .line 151
    .line 152
    iget-wide v3, v0, Lh4/c;->c:J

    .line 153
    .line 154
    aput-wide v3, v2, v1

    .line 155
    .line 156
    add-int/lit8 p1, p1, 0x1

    .line 157
    .line 158
    goto :goto_2

    .line 159
    :cond_2
    iget-object p1, p0, LS2/d;->c:[J

    .line 160
    .line 161
    array-length p2, p1

    .line 162
    invoke-static {p1, p2}, Ljava/util/Arrays;->copyOf([JI)[J

    .line 163
    .line 164
    .line 165
    move-result-object p1

    .line 166
    iput-object p1, p0, LS2/d;->d:[J

    .line 167
    .line 168
    invoke-static {p1}, Ljava/util/Arrays;->sort([J)V

    .line 169
    .line 170
    .line 171
    return-void

    .line 172
    nop

    .line 173
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
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
.method public final J()I
    .locals 1

    .line 1
    iget v0, p0, LS2/d;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LS2/d;->d:[J

    .line 7
    .line 8
    array-length v0, v0

    .line 9
    return v0

    .line 10
    :pswitch_0
    iget-object v0, p0, LS2/d;->d:[J

    .line 11
    .line 12
    array-length v0, v0

    .line 13
    return v0

    .line 14
    nop

    .line 15
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
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

.method public final a(J)I
    .locals 2

    .line 1
    iget v0, p0, LS2/d;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LS2/d;->d:[J

    .line 7
    .line 8
    const/4 v1, 0x0

    .line 9
    invoke-static {v0, p1, p2, v1}, Ll4/y;->b([JJZ)I

    .line 10
    .line 11
    .line 12
    move-result p1

    .line 13
    array-length p2, v0

    .line 14
    if-ge p1, p2, :cond_0

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_0
    const/4 p1, -0x1

    .line 18
    :goto_0
    return p1

    .line 19
    :pswitch_0
    iget-object v0, p0, LS2/d;->d:[J

    .line 20
    .line 21
    const/4 v1, 0x0

    .line 22
    invoke-static {v0, p1, p2, v1}, Ll4/y;->b([JJZ)I

    .line 23
    .line 24
    .line 25
    move-result p1

    .line 26
    array-length p2, v0

    .line 27
    if-ge p1, p2, :cond_1

    .line 28
    .line 29
    goto :goto_1

    .line 30
    :cond_1
    const/4 p1, -0x1

    .line 31
    :goto_1
    return p1

    .line 32
    nop

    .line 33
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
.end method

.method public final m(I)J
    .locals 4

    .line 1
    iget v0, p0, LS2/d;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    const/4 v0, 0x0

    .line 7
    const/4 v1, 0x1

    .line 8
    if-ltz p1, :cond_0

    .line 9
    .line 10
    move v2, v1

    .line 11
    goto :goto_0

    .line 12
    :cond_0
    move v2, v0

    .line 13
    :goto_0
    invoke-static {v2}, Ll4/a;->h(Z)V

    .line 14
    .line 15
    .line 16
    iget-object v2, p0, LS2/d;->d:[J

    .line 17
    .line 18
    array-length v3, v2

    .line 19
    if-ge p1, v3, :cond_1

    .line 20
    .line 21
    move v0, v1

    .line 22
    :cond_1
    invoke-static {v0}, Ll4/a;->h(Z)V

    .line 23
    .line 24
    .line 25
    aget-wide v0, v2, p1

    .line 26
    .line 27
    return-wide v0

    .line 28
    :pswitch_0
    const/4 v0, 0x0

    .line 29
    const/4 v1, 0x1

    .line 30
    if-ltz p1, :cond_2

    .line 31
    .line 32
    move v2, v1

    .line 33
    goto :goto_1

    .line 34
    :cond_2
    move v2, v0

    .line 35
    :goto_1
    invoke-static {v2}, Ll4/a;->h(Z)V

    .line 36
    .line 37
    .line 38
    iget-object v2, p0, LS2/d;->d:[J

    .line 39
    .line 40
    array-length v3, v2

    .line 41
    if-ge p1, v3, :cond_3

    .line 42
    .line 43
    move v0, v1

    .line 44
    :cond_3
    invoke-static {v0}, Ll4/a;->h(Z)V

    .line 45
    .line 46
    .line 47
    aget-wide v0, v2, p1

    .line 48
    .line 49
    return-wide v0

    .line 50
    nop

    .line 51
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
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

.method public final w(J)Ljava/util/List;
    .locals 9

    .line 1
    iget v0, p0, LS2/d;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-instance v0, Ljava/util/ArrayList;

    .line 7
    .line 8
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 9
    .line 10
    .line 11
    new-instance v1, Ljava/util/ArrayList;

    .line 12
    .line 13
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 14
    .line 15
    .line 16
    const/4 v2, 0x0

    .line 17
    move v3, v2

    .line 18
    :goto_0
    iget-object v4, p0, LS2/d;->b:Ljava/util/List;

    .line 19
    .line 20
    invoke-interface {v4}, Ljava/util/List;->size()I

    .line 21
    .line 22
    .line 23
    move-result v5

    .line 24
    if-ge v3, v5, :cond_2

    .line 25
    .line 26
    mul-int/lit8 v5, v3, 0x2

    .line 27
    .line 28
    iget-object v6, p0, LS2/d;->c:[J

    .line 29
    .line 30
    aget-wide v7, v6, v5

    .line 31
    .line 32
    cmp-long v7, v7, p1

    .line 33
    .line 34
    if-gtz v7, :cond_1

    .line 35
    .line 36
    add-int/lit8 v5, v5, 0x1

    .line 37
    .line 38
    aget-wide v5, v6, v5

    .line 39
    .line 40
    cmp-long v5, p1, v5

    .line 41
    .line 42
    if-gez v5, :cond_1

    .line 43
    .line 44
    invoke-interface {v4, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object v4

    .line 48
    check-cast v4, Lh4/c;

    .line 49
    .line 50
    iget-object v5, v4, Lh4/c;->a:LY3/b;

    .line 51
    .line 52
    iget v6, v5, LY3/b;->e:F

    .line 53
    .line 54
    const v7, -0x800001

    .line 55
    .line 56
    .line 57
    cmpl-float v6, v6, v7

    .line 58
    .line 59
    if-nez v6, :cond_0

    .line 60
    .line 61
    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 62
    .line 63
    .line 64
    goto :goto_1

    .line 65
    :cond_0
    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 66
    .line 67
    .line 68
    :cond_1
    :goto_1
    add-int/lit8 v3, v3, 0x1

    .line 69
    .line 70
    goto :goto_0

    .line 71
    :cond_2
    new-instance p1, LE6/a;

    .line 72
    .line 73
    const/16 p2, 0xa

    .line 74
    .line 75
    invoke-direct {p1, p2}, LE6/a;-><init>(I)V

    .line 76
    .line 77
    .line 78
    invoke-static {v1, p1}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    .line 79
    .line 80
    .line 81
    :goto_2
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 82
    .line 83
    .line 84
    move-result p1

    .line 85
    if-ge v2, p1, :cond_3

    .line 86
    .line 87
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 88
    .line 89
    .line 90
    move-result-object p1

    .line 91
    check-cast p1, Lh4/c;

    .line 92
    .line 93
    iget-object p1, p1, Lh4/c;->a:LY3/b;

    .line 94
    .line 95
    invoke-virtual {p1}, LY3/b;->a()LY3/a;

    .line 96
    .line 97
    .line 98
    move-result-object p1

    .line 99
    rsub-int/lit8 p2, v2, -0x1

    .line 100
    .line 101
    int-to-float p2, p2

    .line 102
    iput p2, p1, LY3/a;->e:F

    .line 103
    .line 104
    const/4 p2, 0x1

    .line 105
    iput p2, p1, LY3/a;->f:I

    .line 106
    .line 107
    invoke-virtual {p1}, LY3/a;->a()LY3/b;

    .line 108
    .line 109
    .line 110
    move-result-object p1

    .line 111
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 112
    .line 113
    .line 114
    add-int/lit8 v2, v2, 0x1

    .line 115
    .line 116
    goto :goto_2

    .line 117
    :cond_3
    return-object v0

    .line 118
    :pswitch_0
    new-instance v0, Ljava/util/ArrayList;

    .line 119
    .line 120
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 121
    .line 122
    .line 123
    new-instance v1, Ljava/util/ArrayList;

    .line 124
    .line 125
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 126
    .line 127
    .line 128
    const/4 v2, 0x0

    .line 129
    move v3, v2

    .line 130
    :goto_3
    iget-object v4, p0, LS2/d;->b:Ljava/util/List;

    .line 131
    .line 132
    invoke-interface {v4}, Ljava/util/List;->size()I

    .line 133
    .line 134
    .line 135
    move-result v5

    .line 136
    if-ge v3, v5, :cond_6

    .line 137
    .line 138
    mul-int/lit8 v5, v3, 0x2

    .line 139
    .line 140
    iget-object v6, p0, LS2/d;->c:[J

    .line 141
    .line 142
    aget-wide v7, v6, v5

    .line 143
    .line 144
    cmp-long v7, v7, p1

    .line 145
    .line 146
    if-gtz v7, :cond_5

    .line 147
    .line 148
    add-int/lit8 v5, v5, 0x1

    .line 149
    .line 150
    aget-wide v5, v6, v5

    .line 151
    .line 152
    cmp-long v5, p1, v5

    .line 153
    .line 154
    if-gez v5, :cond_5

    .line 155
    .line 156
    invoke-interface {v4, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 157
    .line 158
    .line 159
    move-result-object v4

    .line 160
    check-cast v4, Lh4/c;

    .line 161
    .line 162
    iget-object v5, v4, Lh4/c;->a:LY3/b;

    .line 163
    .line 164
    iget v6, v5, LY3/b;->e:F

    .line 165
    .line 166
    const v7, -0x800001

    .line 167
    .line 168
    .line 169
    cmpl-float v6, v6, v7

    .line 170
    .line 171
    if-nez v6, :cond_4

    .line 172
    .line 173
    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 174
    .line 175
    .line 176
    goto :goto_4

    .line 177
    :cond_4
    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 178
    .line 179
    .line 180
    :cond_5
    :goto_4
    add-int/lit8 v3, v3, 0x1

    .line 181
    .line 182
    goto :goto_3

    .line 183
    :cond_6
    new-instance p1, LE6/a;

    .line 184
    .line 185
    const/4 p2, 0x6

    .line 186
    invoke-direct {p1, p2}, LE6/a;-><init>(I)V

    .line 187
    .line 188
    .line 189
    invoke-static {v1, p1}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    .line 190
    .line 191
    .line 192
    :goto_5
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 193
    .line 194
    .line 195
    move-result p1

    .line 196
    if-ge v2, p1, :cond_7

    .line 197
    .line 198
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 199
    .line 200
    .line 201
    move-result-object p1

    .line 202
    check-cast p1, Lh4/c;

    .line 203
    .line 204
    iget-object p1, p1, Lh4/c;->a:LY3/b;

    .line 205
    .line 206
    invoke-virtual {p1}, LY3/b;->a()LY3/a;

    .line 207
    .line 208
    .line 209
    move-result-object p1

    .line 210
    rsub-int/lit8 p2, v2, -0x1

    .line 211
    .line 212
    int-to-float p2, p2

    .line 213
    iput p2, p1, LY3/a;->e:F

    .line 214
    .line 215
    const/4 p2, 0x1

    .line 216
    iput p2, p1, LY3/a;->f:I

    .line 217
    .line 218
    invoke-virtual {p1}, LY3/a;->a()LY3/b;

    .line 219
    .line 220
    .line 221
    move-result-object p1

    .line 222
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 223
    .line 224
    .line 225
    add-int/lit8 v2, v2, 0x1

    .line 226
    .line 227
    goto :goto_5

    .line 228
    :cond_7
    return-object v0

    .line 229
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
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
