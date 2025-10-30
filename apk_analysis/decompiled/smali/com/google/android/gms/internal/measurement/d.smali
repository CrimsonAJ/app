.class public final Lcom/google/android/gms/internal/measurement/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Iterable;
.implements Lcom/google/android/gms/internal/measurement/n;
.implements Lcom/google/android/gms/internal/measurement/j;


# instance fields
.field public final a:Ljava/util/TreeMap;

.field public final b:Ljava/util/TreeMap;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/TreeMap;

    invoke-direct {v0}, Ljava/util/TreeMap;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/internal/measurement/d;->a:Ljava/util/TreeMap;

    new-instance v0, Ljava/util/TreeMap;

    .line 2
    invoke-direct {v0}, Ljava/util/TreeMap;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/internal/measurement/d;->b:Ljava/util/TreeMap;

    return-void
.end method

.method public constructor <init>(Ljava/util/List;)V
    .locals 2

    .line 3
    invoke-direct {p0}, Lcom/google/android/gms/internal/measurement/d;-><init>()V

    if-eqz p1, :cond_0

    const/4 v0, 0x0

    .line 4
    :goto_0
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v1

    if-ge v0, v1, :cond_0

    .line 5
    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/android/gms/internal/measurement/n;

    invoke-virtual {p0, v0, v1}, Lcom/google/android/gms/internal/measurement/d;->v(ILcom/google/android/gms/internal/measurement/n;)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method


# virtual methods
.method public final b()Ljava/lang/Double;
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/d;->a:Ljava/util/TreeMap;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/TreeMap;->size()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    const/4 v2, 0x1

    .line 8
    if-ne v1, v2, :cond_0

    .line 9
    .line 10
    const/4 v0, 0x0

    .line 11
    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/measurement/d;->q(I)Lcom/google/android/gms/internal/measurement/n;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-interface {v0}, Lcom/google/android/gms/internal/measurement/n;->b()Ljava/lang/Double;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    return-object v0

    .line 20
    :cond_0
    invoke-virtual {v0}, Ljava/util/TreeMap;->size()I

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    if-gtz v0, :cond_1

    .line 25
    .line 26
    const-wide/16 v0, 0x0

    .line 27
    .line 28
    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    return-object v0

    .line 33
    :cond_1
    const-wide/high16 v0, 0x7ff8000000000000L    # Double.NaN

    .line 34
    .line 35
    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    return-object v0
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

.method public final c()Ljava/lang/String;
    .locals 1

    .line 1
    const-string v0, ","

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/measurement/d;->r(Ljava/lang/String;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
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

.method public final d(Ljava/lang/String;)Z
    .locals 1

    .line 1
    const-string v0, "length"

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_1

    .line 8
    .line 9
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/d;->b:Ljava/util/TreeMap;

    .line 10
    .line 11
    invoke-virtual {v0, p1}, Ljava/util/TreeMap;->containsKey(Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    if-eqz p1, :cond_0

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    const/4 p1, 0x0

    .line 19
    return p1

    .line 20
    :cond_1
    :goto_0
    const/4 p1, 0x1

    .line 21
    return p1
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

.method public final e()Ljava/util/Iterator;
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/d;->a:Ljava/util/TreeMap;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/TreeMap;->keySet()Ljava/util/Set;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    iget-object v1, p0, Lcom/google/android/gms/internal/measurement/d;->b:Ljava/util/TreeMap;

    .line 12
    .line 13
    invoke-virtual {v1}, Ljava/util/TreeMap;->keySet()Ljava/util/Set;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    new-instance v2, Lcom/google/android/gms/internal/measurement/c;

    .line 22
    .line 23
    invoke-direct {v2, v0, v1}, Lcom/google/android/gms/internal/measurement/c;-><init>(Ljava/util/Iterator;Ljava/util/Iterator;)V

    .line 24
    .line 25
    .line 26
    return-object v2
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    .line 1
    if-ne p1, p0, :cond_0

    .line 2
    .line 3
    goto :goto_2

    .line 4
    :cond_0
    instance-of v0, p1, Lcom/google/android/gms/internal/measurement/d;

    .line 5
    .line 6
    if-nez v0, :cond_1

    .line 7
    .line 8
    goto :goto_1

    .line 9
    :cond_1
    check-cast p1, Lcom/google/android/gms/internal/measurement/d;

    .line 10
    .line 11
    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/d;->p()I

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    invoke-virtual {p1}, Lcom/google/android/gms/internal/measurement/d;->p()I

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    if-eq v0, v1, :cond_2

    .line 20
    .line 21
    goto :goto_1

    .line 22
    :cond_2
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/d;->a:Ljava/util/TreeMap;

    .line 23
    .line 24
    invoke-interface {v0}, Ljava/util/Map;->isEmpty()Z

    .line 25
    .line 26
    .line 27
    move-result v1

    .line 28
    if-eqz v1, :cond_3

    .line 29
    .line 30
    iget-object p1, p1, Lcom/google/android/gms/internal/measurement/d;->a:Ljava/util/TreeMap;

    .line 31
    .line 32
    invoke-interface {p1}, Ljava/util/Map;->isEmpty()Z

    .line 33
    .line 34
    .line 35
    move-result p1

    .line 36
    return p1

    .line 37
    :cond_3
    invoke-virtual {v0}, Ljava/util/TreeMap;->firstKey()Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    check-cast v1, Ljava/lang/Integer;

    .line 42
    .line 43
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 44
    .line 45
    .line 46
    move-result v1

    .line 47
    :goto_0
    invoke-virtual {v0}, Ljava/util/TreeMap;->lastKey()Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object v2

    .line 51
    check-cast v2, Ljava/lang/Integer;

    .line 52
    .line 53
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 54
    .line 55
    .line 56
    move-result v2

    .line 57
    if-gt v1, v2, :cond_5

    .line 58
    .line 59
    invoke-virtual {p0, v1}, Lcom/google/android/gms/internal/measurement/d;->q(I)Lcom/google/android/gms/internal/measurement/n;

    .line 60
    .line 61
    .line 62
    move-result-object v2

    .line 63
    invoke-virtual {p1, v1}, Lcom/google/android/gms/internal/measurement/d;->q(I)Lcom/google/android/gms/internal/measurement/n;

    .line 64
    .line 65
    .line 66
    move-result-object v3

    .line 67
    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 68
    .line 69
    .line 70
    move-result v2

    .line 71
    if-nez v2, :cond_4

    .line 72
    .line 73
    :goto_1
    const/4 p1, 0x0

    .line 74
    return p1

    .line 75
    :cond_4
    add-int/lit8 v1, v1, 0x1

    .line 76
    .line 77
    goto :goto_0

    .line 78
    :cond_5
    :goto_2
    const/4 p1, 0x1

    .line 79
    return p1
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

.method public final f()Lcom/google/android/gms/internal/measurement/n;
    .locals 5

    .line 1
    new-instance v0, Lcom/google/android/gms/internal/measurement/d;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/google/android/gms/internal/measurement/d;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Lcom/google/android/gms/internal/measurement/d;->a:Ljava/util/TreeMap;

    .line 7
    .line 8
    invoke-virtual {v1}, Ljava/util/TreeMap;->entrySet()Ljava/util/Set;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 17
    .line 18
    .line 19
    move-result v2

    .line 20
    if-eqz v2, :cond_1

    .line 21
    .line 22
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v2

    .line 26
    check-cast v2, Ljava/util/Map$Entry;

    .line 27
    .line 28
    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v3

    .line 32
    instance-of v3, v3, Lcom/google/android/gms/internal/measurement/j;

    .line 33
    .line 34
    iget-object v4, v0, Lcom/google/android/gms/internal/measurement/d;->a:Ljava/util/TreeMap;

    .line 35
    .line 36
    if-eqz v3, :cond_0

    .line 37
    .line 38
    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object v3

    .line 42
    check-cast v3, Ljava/lang/Integer;

    .line 43
    .line 44
    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object v2

    .line 48
    check-cast v2, Lcom/google/android/gms/internal/measurement/n;

    .line 49
    .line 50
    invoke-virtual {v4, v3, v2}, Ljava/util/TreeMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    goto :goto_0

    .line 54
    :cond_0
    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object v3

    .line 58
    check-cast v3, Ljava/lang/Integer;

    .line 59
    .line 60
    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object v2

    .line 64
    check-cast v2, Lcom/google/android/gms/internal/measurement/n;

    .line 65
    .line 66
    invoke-interface {v2}, Lcom/google/android/gms/internal/measurement/n;->f()Lcom/google/android/gms/internal/measurement/n;

    .line 67
    .line 68
    .line 69
    move-result-object v2

    .line 70
    invoke-virtual {v4, v3, v2}, Ljava/util/TreeMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    goto :goto_0

    .line 74
    :cond_1
    return-object v0
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

.method public final g(Ljava/lang/String;Lcom/google/firebase/messaging/s;Ljava/util/ArrayList;)Lcom/google/android/gms/internal/measurement/n;
    .locals 29

    .line 1
    move-object/from16 v1, p1

    .line 2
    .line 3
    const-string v9, "concat"

    .line 4
    .line 5
    invoke-virtual {v9, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    move-result v10

    .line 9
    const-string v11, "unshift"

    .line 10
    .line 11
    const-string v12, "toString"

    .line 12
    .line 13
    const-string v13, "splice"

    .line 14
    .line 15
    const-string v14, "sort"

    .line 16
    .line 17
    const-string v15, "some"

    .line 18
    .line 19
    const/16 v16, -0x1

    .line 20
    .line 21
    const-string v7, "slice"

    .line 22
    .line 23
    const-string v4, "shift"

    .line 24
    .line 25
    const-string v6, "reverse"

    .line 26
    .line 27
    const/16 v18, 0x1

    .line 28
    .line 29
    const-string v8, "reduceRight"

    .line 30
    .line 31
    const-string v5, "reduce"

    .line 32
    .line 33
    move/from16 v20, v10

    .line 34
    .line 35
    const-string v10, "push"

    .line 36
    .line 37
    move-object/from16 v21, v9

    .line 38
    .line 39
    const-string v9, "pop"

    .line 40
    .line 41
    const-string v0, "map"

    .line 42
    .line 43
    const-string v2, "lastIndexOf"

    .line 44
    .line 45
    const-string v3, "join"

    .line 46
    .line 47
    move-object/from16 v22, v11

    .line 48
    .line 49
    const-string v11, "indexOf"

    .line 50
    .line 51
    move-object/from16 v23, v12

    .line 52
    .line 53
    const-string v12, "forEach"

    .line 54
    .line 55
    move-object/from16 v24, v13

    .line 56
    .line 57
    const-string v13, "filter"

    .line 58
    .line 59
    move-object/from16 v25, v14

    .line 60
    .line 61
    const-string v14, "every"

    .line 62
    .line 63
    if-nez v20, :cond_4

    .line 64
    .line 65
    invoke-virtual {v14, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 66
    .line 67
    .line 68
    move-result v20

    .line 69
    if-nez v20, :cond_4

    .line 70
    .line 71
    invoke-virtual {v13, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 72
    .line 73
    .line 74
    move-result v20

    .line 75
    if-nez v20, :cond_4

    .line 76
    .line 77
    invoke-virtual {v12, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 78
    .line 79
    .line 80
    move-result v20

    .line 81
    if-nez v20, :cond_4

    .line 82
    .line 83
    invoke-virtual {v11, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 84
    .line 85
    .line 86
    move-result v20

    .line 87
    if-nez v20, :cond_4

    .line 88
    .line 89
    invoke-virtual {v3, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 90
    .line 91
    .line 92
    move-result v20

    .line 93
    if-nez v20, :cond_4

    .line 94
    .line 95
    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 96
    .line 97
    .line 98
    move-result v20

    .line 99
    if-nez v20, :cond_4

    .line 100
    .line 101
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 102
    .line 103
    .line 104
    move-result v20

    .line 105
    if-nez v20, :cond_4

    .line 106
    .line 107
    invoke-virtual {v9, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 108
    .line 109
    .line 110
    move-result v20

    .line 111
    if-nez v20, :cond_4

    .line 112
    .line 113
    invoke-virtual {v10, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 114
    .line 115
    .line 116
    move-result v20

    .line 117
    if-nez v20, :cond_4

    .line 118
    .line 119
    invoke-virtual {v5, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 120
    .line 121
    .line 122
    move-result v20

    .line 123
    if-nez v20, :cond_4

    .line 124
    .line 125
    invoke-virtual {v8, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 126
    .line 127
    .line 128
    move-result v20

    .line 129
    if-nez v20, :cond_4

    .line 130
    .line 131
    invoke-virtual {v6, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 132
    .line 133
    .line 134
    move-result v20

    .line 135
    if-nez v20, :cond_4

    .line 136
    .line 137
    invoke-virtual {v4, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 138
    .line 139
    .line 140
    move-result v20

    .line 141
    if-nez v20, :cond_4

    .line 142
    .line 143
    invoke-virtual {v7, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 144
    .line 145
    .line 146
    move-result v20

    .line 147
    if-nez v20, :cond_4

    .line 148
    .line 149
    invoke-virtual {v15, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 150
    .line 151
    .line 152
    move-result v20

    .line 153
    if-nez v20, :cond_4

    .line 154
    .line 155
    move-object/from16 v20, v13

    .line 156
    .line 157
    move-object/from16 v13, v25

    .line 158
    .line 159
    invoke-virtual {v13, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 160
    .line 161
    .line 162
    move-result v25

    .line 163
    if-nez v25, :cond_3

    .line 164
    .line 165
    move-object/from16 v25, v5

    .line 166
    .line 167
    move-object/from16 v5, v24

    .line 168
    .line 169
    invoke-virtual {v5, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 170
    .line 171
    .line 172
    move-result v24

    .line 173
    if-nez v24, :cond_2

    .line 174
    .line 175
    move-object/from16 v24, v5

    .line 176
    .line 177
    move-object/from16 v5, v23

    .line 178
    .line 179
    invoke-virtual {v5, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 180
    .line 181
    .line 182
    move-result v23

    .line 183
    if-nez v23, :cond_1

    .line 184
    .line 185
    move-object/from16 v23, v5

    .line 186
    .line 187
    move-object/from16 v5, v22

    .line 188
    .line 189
    invoke-virtual {v5, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 190
    .line 191
    .line 192
    move-result v22

    .line 193
    if-eqz v22, :cond_0

    .line 194
    .line 195
    goto :goto_2

    .line 196
    :cond_0
    new-instance v0, Lcom/google/android/gms/internal/measurement/q;

    .line 197
    .line 198
    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/measurement/q;-><init>(Ljava/lang/String;)V

    .line 199
    .line 200
    .line 201
    move-object/from16 v1, p0

    .line 202
    .line 203
    move-object/from16 v2, p2

    .line 204
    .line 205
    move-object/from16 v3, p3

    .line 206
    .line 207
    invoke-static {v1, v0, v2, v3}, Lcom/google/android/gms/internal/measurement/Y1;->I(Lcom/google/android/gms/internal/measurement/j;Lcom/google/android/gms/internal/measurement/q;Lcom/google/firebase/messaging/s;Ljava/util/ArrayList;)Lcom/google/android/gms/internal/measurement/n;

    .line 208
    .line 209
    .line 210
    move-result-object v0

    .line 211
    return-object v0

    .line 212
    :cond_1
    move-object/from16 v23, v5

    .line 213
    .line 214
    :goto_0
    move-object/from16 v5, v22

    .line 215
    .line 216
    goto :goto_2

    .line 217
    :cond_2
    move-object/from16 v24, v5

    .line 218
    .line 219
    goto :goto_0

    .line 220
    :cond_3
    :goto_1
    move-object/from16 v25, v5

    .line 221
    .line 222
    goto :goto_0

    .line 223
    :cond_4
    move-object/from16 v20, v13

    .line 224
    .line 225
    move-object/from16 v13, v25

    .line 226
    .line 227
    goto :goto_1

    .line 228
    :goto_2
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    .line 229
    .line 230
    .line 231
    move-result v22

    .line 232
    sparse-switch v22, :sswitch_data_0

    .line 233
    .line 234
    .line 235
    :cond_5
    move-object/from16 v5, v20

    .line 236
    .line 237
    :cond_6
    move-object/from16 v8, v23

    .line 238
    .line 239
    goto/16 :goto_4

    .line 240
    .line 241
    :sswitch_0
    invoke-virtual {v1, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 242
    .line 243
    .line 244
    move-result v1

    .line 245
    if-eqz v1, :cond_5

    .line 246
    .line 247
    const/4 v1, 0x4

    .line 248
    :goto_3
    move-object/from16 v5, v20

    .line 249
    .line 250
    move-object/from16 v8, v23

    .line 251
    .line 252
    goto/16 :goto_5

    .line 253
    .line 254
    :sswitch_1
    invoke-virtual {v1, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 255
    .line 256
    .line 257
    move-result v1

    .line 258
    if-eqz v1, :cond_5

    .line 259
    .line 260
    const/16 v1, 0xc

    .line 261
    .line 262
    goto :goto_3

    .line 263
    :sswitch_2
    invoke-virtual {v1, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 264
    .line 265
    .line 266
    move-result v1

    .line 267
    if-eqz v1, :cond_5

    .line 268
    .line 269
    const/16 v1, 0xb

    .line 270
    .line 271
    goto :goto_3

    .line 272
    :sswitch_3
    invoke-virtual {v1, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 273
    .line 274
    .line 275
    move-result v1

    .line 276
    if-eqz v1, :cond_5

    .line 277
    .line 278
    const/16 v1, 0xe

    .line 279
    .line 280
    goto :goto_3

    .line 281
    :sswitch_4
    invoke-virtual {v1, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 282
    .line 283
    .line 284
    move-result v1

    .line 285
    if-eqz v1, :cond_5

    .line 286
    .line 287
    const/16 v1, 0xd

    .line 288
    .line 289
    goto :goto_3

    .line 290
    :sswitch_5
    invoke-virtual {v1, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 291
    .line 292
    .line 293
    move-result v1

    .line 294
    if-eqz v1, :cond_5

    .line 295
    .line 296
    move/from16 v1, v18

    .line 297
    .line 298
    goto :goto_3

    .line 299
    :sswitch_6
    invoke-virtual {v1, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 300
    .line 301
    .line 302
    move-result v1

    .line 303
    if-eqz v1, :cond_5

    .line 304
    .line 305
    const/16 v1, 0x10

    .line 306
    .line 307
    goto :goto_3

    .line 308
    :sswitch_7
    invoke-virtual {v1, v15}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 309
    .line 310
    .line 311
    move-result v1

    .line 312
    if-eqz v1, :cond_5

    .line 313
    .line 314
    const/16 v1, 0xf

    .line 315
    .line 316
    goto :goto_3

    .line 317
    :sswitch_8
    invoke-virtual {v1, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 318
    .line 319
    .line 320
    move-result v1

    .line 321
    if-eqz v1, :cond_5

    .line 322
    .line 323
    const/16 v1, 0x9

    .line 324
    .line 325
    goto :goto_3

    .line 326
    :sswitch_9
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 327
    .line 328
    .line 329
    move-result v1

    .line 330
    if-eqz v1, :cond_5

    .line 331
    .line 332
    const/4 v1, 0x5

    .line 333
    goto :goto_3

    .line 334
    :sswitch_a
    invoke-virtual {v1, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 335
    .line 336
    .line 337
    move-result v1

    .line 338
    if-eqz v1, :cond_5

    .line 339
    .line 340
    const/16 v1, 0x8

    .line 341
    .line 342
    goto :goto_3

    .line 343
    :sswitch_b
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 344
    .line 345
    .line 346
    move-result v1

    .line 347
    if-eqz v1, :cond_5

    .line 348
    .line 349
    const/4 v1, 0x7

    .line 350
    goto :goto_3

    .line 351
    :sswitch_c
    invoke-virtual {v1, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 352
    .line 353
    .line 354
    move-result v1

    .line 355
    if-eqz v1, :cond_5

    .line 356
    .line 357
    const/16 v1, 0x13

    .line 358
    .line 359
    goto :goto_3

    .line 360
    :sswitch_d
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 361
    .line 362
    .line 363
    move-result v1

    .line 364
    if-eqz v1, :cond_5

    .line 365
    .line 366
    const/4 v1, 0x6

    .line 367
    goto :goto_3

    .line 368
    :sswitch_e
    invoke-virtual {v1, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 369
    .line 370
    .line 371
    move-result v1

    .line 372
    if-eqz v1, :cond_5

    .line 373
    .line 374
    move-object/from16 v5, v20

    .line 375
    .line 376
    move-object/from16 v8, v23

    .line 377
    .line 378
    const/4 v1, 0x3

    .line 379
    goto :goto_5

    .line 380
    :sswitch_f
    move-object/from16 v5, v24

    .line 381
    .line 382
    invoke-virtual {v1, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 383
    .line 384
    .line 385
    move-result v1

    .line 386
    if-eqz v1, :cond_5

    .line 387
    .line 388
    const/16 v1, 0x11

    .line 389
    .line 390
    goto/16 :goto_3

    .line 391
    .line 392
    :sswitch_10
    move-object/from16 v5, v25

    .line 393
    .line 394
    invoke-virtual {v1, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 395
    .line 396
    .line 397
    move-result v1

    .line 398
    if-eqz v1, :cond_5

    .line 399
    .line 400
    const/16 v1, 0xa

    .line 401
    .line 402
    goto/16 :goto_3

    .line 403
    .line 404
    :sswitch_11
    move-object/from16 v5, v20

    .line 405
    .line 406
    invoke-virtual {v1, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 407
    .line 408
    .line 409
    move-result v1

    .line 410
    if-eqz v1, :cond_6

    .line 411
    .line 412
    move-object/from16 v8, v23

    .line 413
    .line 414
    const/4 v1, 0x2

    .line 415
    goto :goto_5

    .line 416
    :sswitch_12
    move-object/from16 v5, v20

    .line 417
    .line 418
    move-object/from16 v8, v21

    .line 419
    .line 420
    invoke-virtual {v1, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 421
    .line 422
    .line 423
    move-result v1

    .line 424
    if-eqz v1, :cond_6

    .line 425
    .line 426
    move-object/from16 v8, v23

    .line 427
    .line 428
    const/4 v1, 0x0

    .line 429
    goto :goto_5

    .line 430
    :sswitch_13
    move-object/from16 v5, v20

    .line 431
    .line 432
    move-object/from16 v8, v23

    .line 433
    .line 434
    invoke-virtual {v1, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 435
    .line 436
    .line 437
    move-result v1

    .line 438
    if-eqz v1, :cond_7

    .line 439
    .line 440
    const/16 v1, 0x12

    .line 441
    .line 442
    goto :goto_5

    .line 443
    :cond_7
    :goto_4
    move/from16 v1, v16

    .line 444
    .line 445
    :goto_5
    sget-object v10, Lcom/google/android/gms/internal/measurement/n;->N:Lcom/google/android/gms/internal/measurement/r;

    .line 446
    .line 447
    move/from16 p1, v1

    .line 448
    .line 449
    const-string v1, ","

    .line 450
    .line 451
    move-object/from16 v20, v10

    .line 452
    .line 453
    move-object/from16 v21, v14

    .line 454
    .line 455
    move-object/from16 v10, p0

    .line 456
    .line 457
    iget-object v14, v10, Lcom/google/android/gms/internal/measurement/d;->a:Ljava/util/TreeMap;

    .line 458
    .line 459
    const-wide/high16 v22, -0x4010000000000000L    # -1.0

    .line 460
    .line 461
    move-object/from16 v24, v5

    .line 462
    .line 463
    const-string v5, "Callback should be a method"

    .line 464
    .line 465
    move-object/from16 v25, v11

    .line 466
    .line 467
    move-object/from16 v26, v12

    .line 468
    .line 469
    const-wide/16 v27, 0x0

    .line 470
    .line 471
    const/4 v11, 0x0

    .line 472
    packed-switch p1, :pswitch_data_0

    .line 473
    .line 474
    .line 475
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 476
    .line 477
    const-string v1, "Command not supported"

    .line 478
    .line 479
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 480
    .line 481
    .line 482
    throw v0

    .line 483
    :pswitch_0
    invoke-virtual/range {p3 .. p3}, Ljava/util/ArrayList;->isEmpty()Z

    .line 484
    .line 485
    .line 486
    move-result v0

    .line 487
    if-nez v0, :cond_b

    .line 488
    .line 489
    new-instance v0, Lcom/google/android/gms/internal/measurement/d;

    .line 490
    .line 491
    invoke-direct {v0}, Lcom/google/android/gms/internal/measurement/d;-><init>()V

    .line 492
    .line 493
    .line 494
    invoke-virtual/range {p3 .. p3}, Ljava/util/ArrayList;->size()I

    .line 495
    .line 496
    .line 497
    move-result v1

    .line 498
    const/4 v5, 0x0

    .line 499
    :goto_6
    if-ge v5, v1, :cond_9

    .line 500
    .line 501
    move-object/from16 v12, p3

    .line 502
    .line 503
    invoke-virtual {v12, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 504
    .line 505
    .line 506
    move-result-object v2

    .line 507
    add-int/lit8 v5, v5, 0x1

    .line 508
    .line 509
    check-cast v2, Lcom/google/android/gms/internal/measurement/n;

    .line 510
    .line 511
    move-object/from16 v4, p2

    .line 512
    .line 513
    iget-object v3, v4, Lcom/google/firebase/messaging/s;->c:Ljava/lang/Object;

    .line 514
    .line 515
    check-cast v3, Lcom/google/android/gms/internal/measurement/t;

    .line 516
    .line 517
    invoke-virtual {v3, v4, v2}, Lcom/google/android/gms/internal/measurement/t;->a(Lcom/google/firebase/messaging/s;Lcom/google/android/gms/internal/measurement/n;)Lcom/google/android/gms/internal/measurement/n;

    .line 518
    .line 519
    .line 520
    move-result-object v2

    .line 521
    instance-of v3, v2, Lcom/google/android/gms/internal/measurement/f;

    .line 522
    .line 523
    if-nez v3, :cond_8

    .line 524
    .line 525
    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/d;->p()I

    .line 526
    .line 527
    .line 528
    move-result v3

    .line 529
    invoke-virtual {v0, v3, v2}, Lcom/google/android/gms/internal/measurement/d;->v(ILcom/google/android/gms/internal/measurement/n;)V

    .line 530
    .line 531
    .line 532
    goto :goto_6

    .line 533
    :cond_8
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 534
    .line 535
    const-string v1, "Argument evaluation failed"

    .line 536
    .line 537
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 538
    .line 539
    .line 540
    throw v0

    .line 541
    :cond_9
    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/d;->p()I

    .line 542
    .line 543
    .line 544
    move-result v1

    .line 545
    invoke-virtual {v10}, Lcom/google/android/gms/internal/measurement/d;->s()Ljava/util/Iterator;

    .line 546
    .line 547
    .line 548
    move-result-object v2

    .line 549
    :goto_7
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 550
    .line 551
    .line 552
    move-result v3

    .line 553
    if-eqz v3, :cond_a

    .line 554
    .line 555
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 556
    .line 557
    .line 558
    move-result-object v3

    .line 559
    check-cast v3, Ljava/lang/Integer;

    .line 560
    .line 561
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 562
    .line 563
    .line 564
    move-result v4

    .line 565
    add-int/2addr v4, v1

    .line 566
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 567
    .line 568
    .line 569
    move-result v3

    .line 570
    invoke-virtual {v10, v3}, Lcom/google/android/gms/internal/measurement/d;->q(I)Lcom/google/android/gms/internal/measurement/n;

    .line 571
    .line 572
    .line 573
    move-result-object v3

    .line 574
    invoke-virtual {v0, v4, v3}, Lcom/google/android/gms/internal/measurement/d;->v(ILcom/google/android/gms/internal/measurement/n;)V

    .line 575
    .line 576
    .line 577
    goto :goto_7

    .line 578
    :cond_a
    invoke-virtual {v14}, Ljava/util/TreeMap;->clear()V

    .line 579
    .line 580
    .line 581
    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/d;->s()Ljava/util/Iterator;

    .line 582
    .line 583
    .line 584
    move-result-object v1

    .line 585
    :goto_8
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 586
    .line 587
    .line 588
    move-result v2

    .line 589
    if-eqz v2, :cond_b

    .line 590
    .line 591
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 592
    .line 593
    .line 594
    move-result-object v2

    .line 595
    check-cast v2, Ljava/lang/Integer;

    .line 596
    .line 597
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 598
    .line 599
    .line 600
    move-result v3

    .line 601
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 602
    .line 603
    .line 604
    move-result v2

    .line 605
    invoke-virtual {v0, v2}, Lcom/google/android/gms/internal/measurement/d;->q(I)Lcom/google/android/gms/internal/measurement/n;

    .line 606
    .line 607
    .line 608
    move-result-object v2

    .line 609
    invoke-virtual {v10, v3, v2}, Lcom/google/android/gms/internal/measurement/d;->v(ILcom/google/android/gms/internal/measurement/n;)V

    .line 610
    .line 611
    .line 612
    goto :goto_8

    .line 613
    :cond_b
    new-instance v0, Lcom/google/android/gms/internal/measurement/g;

    .line 614
    .line 615
    invoke-virtual {v10}, Lcom/google/android/gms/internal/measurement/d;->p()I

    .line 616
    .line 617
    .line 618
    move-result v1

    .line 619
    int-to-double v1, v1

    .line 620
    invoke-static {v1, v2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 621
    .line 622
    .line 623
    move-result-object v1

    .line 624
    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/measurement/g;-><init>(Ljava/lang/Double;)V

    .line 625
    .line 626
    .line 627
    return-object v0

    .line 628
    :pswitch_1
    move-object/from16 v12, p3

    .line 629
    .line 630
    const/4 v0, 0x0

    .line 631
    invoke-static {v0, v8, v12}, Ls8/n;->a0(ILjava/lang/String;Ljava/util/List;)V

    .line 632
    .line 633
    .line 634
    new-instance v0, Lcom/google/android/gms/internal/measurement/q;

    .line 635
    .line 636
    invoke-virtual {v10, v1}, Lcom/google/android/gms/internal/measurement/d;->r(Ljava/lang/String;)Ljava/lang/String;

    .line 637
    .line 638
    .line 639
    move-result-object v1

    .line 640
    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/measurement/q;-><init>(Ljava/lang/String;)V

    .line 641
    .line 642
    .line 643
    return-object v0

    .line 644
    :pswitch_2
    move-object/from16 v4, p2

    .line 645
    .line 646
    move-object/from16 v12, p3

    .line 647
    .line 648
    const/4 v0, 0x0

    .line 649
    invoke-virtual {v12}, Ljava/util/ArrayList;->isEmpty()Z

    .line 650
    .line 651
    .line 652
    move-result v1

    .line 653
    if-eqz v1, :cond_c

    .line 654
    .line 655
    new-instance v0, Lcom/google/android/gms/internal/measurement/d;

    .line 656
    .line 657
    invoke-direct {v0}, Lcom/google/android/gms/internal/measurement/d;-><init>()V

    .line 658
    .line 659
    .line 660
    return-object v0

    .line 661
    :cond_c
    invoke-virtual {v12, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 662
    .line 663
    .line 664
    move-result-object v1

    .line 665
    check-cast v1, Lcom/google/android/gms/internal/measurement/n;

    .line 666
    .line 667
    iget-object v0, v4, Lcom/google/firebase/messaging/s;->c:Ljava/lang/Object;

    .line 668
    .line 669
    check-cast v0, Lcom/google/android/gms/internal/measurement/t;

    .line 670
    .line 671
    invoke-virtual {v0, v4, v1}, Lcom/google/android/gms/internal/measurement/t;->a(Lcom/google/firebase/messaging/s;Lcom/google/android/gms/internal/measurement/n;)Lcom/google/android/gms/internal/measurement/n;

    .line 672
    .line 673
    .line 674
    move-result-object v0

    .line 675
    invoke-interface {v0}, Lcom/google/android/gms/internal/measurement/n;->b()Ljava/lang/Double;

    .line 676
    .line 677
    .line 678
    move-result-object v0

    .line 679
    invoke-virtual {v0}, Ljava/lang/Double;->doubleValue()D

    .line 680
    .line 681
    .line 682
    move-result-wide v0

    .line 683
    invoke-static {v0, v1}, Ls8/n;->Q(D)D

    .line 684
    .line 685
    .line 686
    move-result-wide v0

    .line 687
    double-to-int v0, v0

    .line 688
    if-gez v0, :cond_d

    .line 689
    .line 690
    invoke-virtual {v10}, Lcom/google/android/gms/internal/measurement/d;->p()I

    .line 691
    .line 692
    .line 693
    move-result v1

    .line 694
    add-int/2addr v1, v0

    .line 695
    const/4 v0, 0x0

    .line 696
    invoke-static {v0, v1}, Ljava/lang/Math;->max(II)I

    .line 697
    .line 698
    .line 699
    move-result v1

    .line 700
    move v0, v1

    .line 701
    goto :goto_9

    .line 702
    :cond_d
    invoke-virtual {v10}, Lcom/google/android/gms/internal/measurement/d;->p()I

    .line 703
    .line 704
    .line 705
    move-result v1

    .line 706
    if-le v0, v1, :cond_e

    .line 707
    .line 708
    invoke-virtual {v10}, Lcom/google/android/gms/internal/measurement/d;->p()I

    .line 709
    .line 710
    .line 711
    move-result v0

    .line 712
    :cond_e
    :goto_9
    invoke-virtual {v10}, Lcom/google/android/gms/internal/measurement/d;->p()I

    .line 713
    .line 714
    .line 715
    move-result v1

    .line 716
    new-instance v2, Lcom/google/android/gms/internal/measurement/d;

    .line 717
    .line 718
    invoke-direct {v2}, Lcom/google/android/gms/internal/measurement/d;-><init>()V

    .line 719
    .line 720
    .line 721
    invoke-virtual {v12}, Ljava/util/ArrayList;->size()I

    .line 722
    .line 723
    .line 724
    move-result v3

    .line 725
    move/from16 v5, v18

    .line 726
    .line 727
    if-le v3, v5, :cond_15

    .line 728
    .line 729
    invoke-virtual {v12, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 730
    .line 731
    .line 732
    move-result-object v3

    .line 733
    check-cast v3, Lcom/google/android/gms/internal/measurement/n;

    .line 734
    .line 735
    iget-object v5, v4, Lcom/google/firebase/messaging/s;->c:Ljava/lang/Object;

    .line 736
    .line 737
    check-cast v5, Lcom/google/android/gms/internal/measurement/t;

    .line 738
    .line 739
    invoke-virtual {v5, v4, v3}, Lcom/google/android/gms/internal/measurement/t;->a(Lcom/google/firebase/messaging/s;Lcom/google/android/gms/internal/measurement/n;)Lcom/google/android/gms/internal/measurement/n;

    .line 740
    .line 741
    .line 742
    move-result-object v3

    .line 743
    invoke-interface {v3}, Lcom/google/android/gms/internal/measurement/n;->b()Ljava/lang/Double;

    .line 744
    .line 745
    .line 746
    move-result-object v3

    .line 747
    invoke-virtual {v3}, Ljava/lang/Double;->doubleValue()D

    .line 748
    .line 749
    .line 750
    move-result-wide v6

    .line 751
    invoke-static {v6, v7}, Ls8/n;->Q(D)D

    .line 752
    .line 753
    .line 754
    move-result-wide v6

    .line 755
    double-to-int v3, v6

    .line 756
    const/4 v6, 0x0

    .line 757
    invoke-static {v6, v3}, Ljava/lang/Math;->max(II)I

    .line 758
    .line 759
    .line 760
    move-result v3

    .line 761
    if-lez v3, :cond_f

    .line 762
    .line 763
    move v6, v0

    .line 764
    :goto_a
    add-int v7, v0, v3

    .line 765
    .line 766
    invoke-static {v1, v7}, Ljava/lang/Math;->min(II)I

    .line 767
    .line 768
    .line 769
    move-result v7

    .line 770
    if-ge v6, v7, :cond_f

    .line 771
    .line 772
    invoke-virtual {v10, v0}, Lcom/google/android/gms/internal/measurement/d;->q(I)Lcom/google/android/gms/internal/measurement/n;

    .line 773
    .line 774
    .line 775
    move-result-object v7

    .line 776
    invoke-virtual {v2}, Lcom/google/android/gms/internal/measurement/d;->p()I

    .line 777
    .line 778
    .line 779
    move-result v8

    .line 780
    invoke-virtual {v2, v8, v7}, Lcom/google/android/gms/internal/measurement/d;->v(ILcom/google/android/gms/internal/measurement/n;)V

    .line 781
    .line 782
    .line 783
    invoke-virtual {v10, v0}, Lcom/google/android/gms/internal/measurement/d;->u(I)V

    .line 784
    .line 785
    .line 786
    const/16 v18, 0x1

    .line 787
    .line 788
    add-int/lit8 v6, v6, 0x1

    .line 789
    .line 790
    goto :goto_a

    .line 791
    :cond_f
    invoke-virtual {v12}, Ljava/util/ArrayList;->size()I

    .line 792
    .line 793
    .line 794
    move-result v1

    .line 795
    const/4 v3, 0x2

    .line 796
    if-le v1, v3, :cond_16

    .line 797
    .line 798
    const/4 v6, 0x2

    .line 799
    :goto_b
    invoke-virtual {v12}, Ljava/util/ArrayList;->size()I

    .line 800
    .line 801
    .line 802
    move-result v1

    .line 803
    if-ge v6, v1, :cond_16

    .line 804
    .line 805
    invoke-virtual {v12, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 806
    .line 807
    .line 808
    move-result-object v1

    .line 809
    check-cast v1, Lcom/google/android/gms/internal/measurement/n;

    .line 810
    .line 811
    invoke-virtual {v5, v4, v1}, Lcom/google/android/gms/internal/measurement/t;->a(Lcom/google/firebase/messaging/s;Lcom/google/android/gms/internal/measurement/n;)Lcom/google/android/gms/internal/measurement/n;

    .line 812
    .line 813
    .line 814
    move-result-object v1

    .line 815
    instance-of v3, v1, Lcom/google/android/gms/internal/measurement/f;

    .line 816
    .line 817
    if-nez v3, :cond_14

    .line 818
    .line 819
    add-int v3, v0, v6

    .line 820
    .line 821
    add-int/lit8 v3, v3, -0x2

    .line 822
    .line 823
    if-ltz v3, :cond_13

    .line 824
    .line 825
    invoke-virtual {v10}, Lcom/google/android/gms/internal/measurement/d;->p()I

    .line 826
    .line 827
    .line 828
    move-result v7

    .line 829
    if-lt v3, v7, :cond_10

    .line 830
    .line 831
    invoke-virtual {v10, v3, v1}, Lcom/google/android/gms/internal/measurement/d;->v(ILcom/google/android/gms/internal/measurement/n;)V

    .line 832
    .line 833
    .line 834
    const/16 v18, 0x1

    .line 835
    .line 836
    goto :goto_d

    .line 837
    :cond_10
    invoke-virtual {v14}, Ljava/util/TreeMap;->lastKey()Ljava/lang/Object;

    .line 838
    .line 839
    .line 840
    move-result-object v7

    .line 841
    check-cast v7, Ljava/lang/Integer;

    .line 842
    .line 843
    invoke-virtual {v7}, Ljava/lang/Integer;->intValue()I

    .line 844
    .line 845
    .line 846
    move-result v7

    .line 847
    :goto_c
    if-lt v7, v3, :cond_12

    .line 848
    .line 849
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 850
    .line 851
    .line 852
    move-result-object v8

    .line 853
    invoke-virtual {v14, v8}, Ljava/util/TreeMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 854
    .line 855
    .line 856
    move-result-object v9

    .line 857
    check-cast v9, Lcom/google/android/gms/internal/measurement/n;

    .line 858
    .line 859
    const/16 v18, 0x1

    .line 860
    .line 861
    if-eqz v9, :cond_11

    .line 862
    .line 863
    add-int/lit8 v11, v7, 0x1

    .line 864
    .line 865
    invoke-virtual {v10, v11, v9}, Lcom/google/android/gms/internal/measurement/d;->v(ILcom/google/android/gms/internal/measurement/n;)V

    .line 866
    .line 867
    .line 868
    invoke-virtual {v14, v8}, Ljava/util/TreeMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 869
    .line 870
    .line 871
    :cond_11
    add-int/lit8 v7, v7, -0x1

    .line 872
    .line 873
    goto :goto_c

    .line 874
    :cond_12
    const/16 v18, 0x1

    .line 875
    .line 876
    invoke-virtual {v10, v3, v1}, Lcom/google/android/gms/internal/measurement/d;->v(ILcom/google/android/gms/internal/measurement/n;)V

    .line 877
    .line 878
    .line 879
    :goto_d
    add-int/lit8 v6, v6, 0x1

    .line 880
    .line 881
    goto :goto_b

    .line 882
    :cond_13
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 883
    .line 884
    const-string v1, "Invalid value index: "

    .line 885
    .line 886
    invoke-static {v3, v1}, Lcom/google/android/gms/internal/measurement/k1;->j(ILjava/lang/String;)Ljava/lang/String;

    .line 887
    .line 888
    .line 889
    move-result-object v1

    .line 890
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 891
    .line 892
    .line 893
    throw v0

    .line 894
    :cond_14
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 895
    .line 896
    const-string v1, "Failed to parse elements to add"

    .line 897
    .line 898
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 899
    .line 900
    .line 901
    throw v0

    .line 902
    :cond_15
    :goto_e
    if-ge v0, v1, :cond_16

    .line 903
    .line 904
    invoke-virtual {v10, v0}, Lcom/google/android/gms/internal/measurement/d;->q(I)Lcom/google/android/gms/internal/measurement/n;

    .line 905
    .line 906
    .line 907
    move-result-object v3

    .line 908
    invoke-virtual {v2}, Lcom/google/android/gms/internal/measurement/d;->p()I

    .line 909
    .line 910
    .line 911
    move-result v4

    .line 912
    invoke-virtual {v2, v4, v3}, Lcom/google/android/gms/internal/measurement/d;->v(ILcom/google/android/gms/internal/measurement/n;)V

    .line 913
    .line 914
    .line 915
    invoke-virtual {v10, v0, v11}, Lcom/google/android/gms/internal/measurement/d;->v(ILcom/google/android/gms/internal/measurement/n;)V

    .line 916
    .line 917
    .line 918
    const/4 v5, 0x1

    .line 919
    add-int/2addr v0, v5

    .line 920
    goto :goto_e

    .line 921
    :cond_16
    return-object v2

    .line 922
    :pswitch_3
    move-object/from16 v4, p2

    .line 923
    .line 924
    move-object/from16 v12, p3

    .line 925
    .line 926
    move/from16 v5, v18

    .line 927
    .line 928
    invoke-static {v13, v5, v12}, Ls8/n;->c0(Ljava/lang/String;ILjava/util/ArrayList;)V

    .line 929
    .line 930
    .line 931
    invoke-virtual {v10}, Lcom/google/android/gms/internal/measurement/d;->p()I

    .line 932
    .line 933
    .line 934
    move-result v0

    .line 935
    const/4 v3, 0x2

    .line 936
    if-lt v0, v3, :cond_24

    .line 937
    .line 938
    invoke-virtual {v10}, Lcom/google/android/gms/internal/measurement/d;->t()Ljava/util/ArrayList;

    .line 939
    .line 940
    .line 941
    move-result-object v0

    .line 942
    invoke-virtual {v12}, Ljava/util/ArrayList;->isEmpty()Z

    .line 943
    .line 944
    .line 945
    move-result v1

    .line 946
    if-nez v1, :cond_18

    .line 947
    .line 948
    const/4 v6, 0x0

    .line 949
    invoke-virtual {v12, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 950
    .line 951
    .line 952
    move-result-object v1

    .line 953
    check-cast v1, Lcom/google/android/gms/internal/measurement/n;

    .line 954
    .line 955
    iget-object v2, v4, Lcom/google/firebase/messaging/s;->c:Ljava/lang/Object;

    .line 956
    .line 957
    check-cast v2, Lcom/google/android/gms/internal/measurement/t;

    .line 958
    .line 959
    invoke-virtual {v2, v4, v1}, Lcom/google/android/gms/internal/measurement/t;->a(Lcom/google/firebase/messaging/s;Lcom/google/android/gms/internal/measurement/n;)Lcom/google/android/gms/internal/measurement/n;

    .line 960
    .line 961
    .line 962
    move-result-object v1

    .line 963
    instance-of v2, v1, Lcom/google/android/gms/internal/measurement/h;

    .line 964
    .line 965
    if-eqz v2, :cond_17

    .line 966
    .line 967
    move-object v11, v1

    .line 968
    check-cast v11, Lcom/google/android/gms/internal/measurement/h;

    .line 969
    .line 970
    goto :goto_f

    .line 971
    :cond_17
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 972
    .line 973
    const-string v1, "Comparator should be a method"

    .line 974
    .line 975
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 976
    .line 977
    .line 978
    throw v0

    .line 979
    :cond_18
    :goto_f
    new-instance v1, Lcom/google/android/gms/internal/measurement/u;

    .line 980
    .line 981
    invoke-direct {v1, v11, v4}, Lcom/google/android/gms/internal/measurement/u;-><init>(Lcom/google/android/gms/internal/measurement/h;Lcom/google/firebase/messaging/s;)V

    .line 982
    .line 983
    .line 984
    invoke-static {v0, v1}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    .line 985
    .line 986
    .line 987
    invoke-virtual {v14}, Ljava/util/TreeMap;->clear()V

    .line 988
    .line 989
    .line 990
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 991
    .line 992
    .line 993
    move-result v1

    .line 994
    const/4 v2, 0x0

    .line 995
    const/4 v5, 0x0

    .line 996
    :goto_10
    if-ge v2, v1, :cond_24

    .line 997
    .line 998
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 999
    .line 1000
    .line 1001
    move-result-object v3

    .line 1002
    const/4 v6, 0x1

    .line 1003
    add-int/2addr v2, v6

    .line 1004
    check-cast v3, Lcom/google/android/gms/internal/measurement/n;

    .line 1005
    .line 1006
    add-int/lit8 v4, v5, 0x1

    .line 1007
    .line 1008
    invoke-virtual {v10, v5, v3}, Lcom/google/android/gms/internal/measurement/d;->v(ILcom/google/android/gms/internal/measurement/n;)V

    .line 1009
    .line 1010
    .line 1011
    move v5, v4

    .line 1012
    goto :goto_10

    .line 1013
    :pswitch_4
    move-object/from16 v4, p2

    .line 1014
    .line 1015
    move-object/from16 v12, p3

    .line 1016
    .line 1017
    move/from16 v6, v18

    .line 1018
    .line 1019
    invoke-static {v6, v15, v12}, Ls8/n;->a0(ILjava/lang/String;Ljava/util/List;)V

    .line 1020
    .line 1021
    .line 1022
    const/4 v0, 0x0

    .line 1023
    invoke-virtual {v12, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 1024
    .line 1025
    .line 1026
    move-result-object v1

    .line 1027
    check-cast v1, Lcom/google/android/gms/internal/measurement/n;

    .line 1028
    .line 1029
    iget-object v0, v4, Lcom/google/firebase/messaging/s;->c:Ljava/lang/Object;

    .line 1030
    .line 1031
    check-cast v0, Lcom/google/android/gms/internal/measurement/t;

    .line 1032
    .line 1033
    invoke-virtual {v0, v4, v1}, Lcom/google/android/gms/internal/measurement/t;->a(Lcom/google/firebase/messaging/s;Lcom/google/android/gms/internal/measurement/n;)Lcom/google/android/gms/internal/measurement/n;

    .line 1034
    .line 1035
    .line 1036
    move-result-object v0

    .line 1037
    instance-of v1, v0, Lcom/google/android/gms/internal/measurement/h;

    .line 1038
    .line 1039
    if-eqz v1, :cond_1b

    .line 1040
    .line 1041
    invoke-virtual {v10}, Lcom/google/android/gms/internal/measurement/d;->p()I

    .line 1042
    .line 1043
    .line 1044
    move-result v1

    .line 1045
    if-nez v1, :cond_19

    .line 1046
    .line 1047
    goto/16 :goto_21

    .line 1048
    .line 1049
    :cond_19
    check-cast v0, Lcom/google/android/gms/internal/measurement/h;

    .line 1050
    .line 1051
    invoke-virtual {v10}, Lcom/google/android/gms/internal/measurement/d;->s()Ljava/util/Iterator;

    .line 1052
    .line 1053
    .line 1054
    move-result-object v1

    .line 1055
    :cond_1a
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 1056
    .line 1057
    .line 1058
    move-result v2

    .line 1059
    if-eqz v2, :cond_40

    .line 1060
    .line 1061
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1062
    .line 1063
    .line 1064
    move-result-object v2

    .line 1065
    check-cast v2, Ljava/lang/Integer;

    .line 1066
    .line 1067
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 1068
    .line 1069
    .line 1070
    move-result v2

    .line 1071
    invoke-virtual {v10, v2}, Lcom/google/android/gms/internal/measurement/d;->w(I)Z

    .line 1072
    .line 1073
    .line 1074
    move-result v3

    .line 1075
    if-eqz v3, :cond_1a

    .line 1076
    .line 1077
    invoke-virtual {v10, v2}, Lcom/google/android/gms/internal/measurement/d;->q(I)Lcom/google/android/gms/internal/measurement/n;

    .line 1078
    .line 1079
    .line 1080
    move-result-object v3

    .line 1081
    int-to-double v5, v2

    .line 1082
    new-instance v2, Lcom/google/android/gms/internal/measurement/g;

    .line 1083
    .line 1084
    invoke-static {v5, v6}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 1085
    .line 1086
    .line 1087
    move-result-object v5

    .line 1088
    invoke-direct {v2, v5}, Lcom/google/android/gms/internal/measurement/g;-><init>(Ljava/lang/Double;)V

    .line 1089
    .line 1090
    .line 1091
    const/4 v5, 0x3

    .line 1092
    new-array v6, v5, [Lcom/google/android/gms/internal/measurement/n;

    .line 1093
    .line 1094
    const/16 v19, 0x0

    .line 1095
    .line 1096
    aput-object v3, v6, v19

    .line 1097
    .line 1098
    const/16 v18, 0x1

    .line 1099
    .line 1100
    aput-object v2, v6, v18

    .line 1101
    .line 1102
    const/16 v17, 0x2

    .line 1103
    .line 1104
    aput-object v10, v6, v17

    .line 1105
    .line 1106
    invoke-static {v6}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 1107
    .line 1108
    .line 1109
    move-result-object v2

    .line 1110
    invoke-virtual {v0, v4, v2}, Lcom/google/android/gms/internal/measurement/h;->a(Lcom/google/firebase/messaging/s;Ljava/util/List;)Lcom/google/android/gms/internal/measurement/n;

    .line 1111
    .line 1112
    .line 1113
    move-result-object v2

    .line 1114
    invoke-interface {v2}, Lcom/google/android/gms/internal/measurement/n;->o()Ljava/lang/Boolean;

    .line 1115
    .line 1116
    .line 1117
    move-result-object v2

    .line 1118
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 1119
    .line 1120
    .line 1121
    move-result v2

    .line 1122
    if-eqz v2, :cond_1a

    .line 1123
    .line 1124
    goto/16 :goto_22

    .line 1125
    .line 1126
    :cond_1b
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 1127
    .line 1128
    invoke-direct {v0, v5}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 1129
    .line 1130
    .line 1131
    throw v0

    .line 1132
    :pswitch_5
    move-object/from16 v4, p2

    .line 1133
    .line 1134
    move-object/from16 v12, p3

    .line 1135
    .line 1136
    const/4 v3, 0x2

    .line 1137
    invoke-static {v7, v3, v12}, Ls8/n;->c0(Ljava/lang/String;ILjava/util/ArrayList;)V

    .line 1138
    .line 1139
    .line 1140
    invoke-virtual {v12}, Ljava/util/ArrayList;->isEmpty()Z

    .line 1141
    .line 1142
    .line 1143
    move-result v0

    .line 1144
    if-eqz v0, :cond_1c

    .line 1145
    .line 1146
    invoke-virtual {v10}, Lcom/google/android/gms/internal/measurement/d;->f()Lcom/google/android/gms/internal/measurement/n;

    .line 1147
    .line 1148
    .line 1149
    move-result-object v0

    .line 1150
    return-object v0

    .line 1151
    :cond_1c
    invoke-virtual {v10}, Lcom/google/android/gms/internal/measurement/d;->p()I

    .line 1152
    .line 1153
    .line 1154
    move-result v0

    .line 1155
    int-to-double v0, v0

    .line 1156
    const/4 v6, 0x0

    .line 1157
    invoke-virtual {v12, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 1158
    .line 1159
    .line 1160
    move-result-object v2

    .line 1161
    check-cast v2, Lcom/google/android/gms/internal/measurement/n;

    .line 1162
    .line 1163
    iget-object v3, v4, Lcom/google/firebase/messaging/s;->c:Ljava/lang/Object;

    .line 1164
    .line 1165
    check-cast v3, Lcom/google/android/gms/internal/measurement/t;

    .line 1166
    .line 1167
    invoke-virtual {v3, v4, v2}, Lcom/google/android/gms/internal/measurement/t;->a(Lcom/google/firebase/messaging/s;Lcom/google/android/gms/internal/measurement/n;)Lcom/google/android/gms/internal/measurement/n;

    .line 1168
    .line 1169
    .line 1170
    move-result-object v2

    .line 1171
    invoke-interface {v2}, Lcom/google/android/gms/internal/measurement/n;->b()Ljava/lang/Double;

    .line 1172
    .line 1173
    .line 1174
    move-result-object v2

    .line 1175
    invoke-virtual {v2}, Ljava/lang/Double;->doubleValue()D

    .line 1176
    .line 1177
    .line 1178
    move-result-wide v2

    .line 1179
    invoke-static {v2, v3}, Ls8/n;->Q(D)D

    .line 1180
    .line 1181
    .line 1182
    move-result-wide v2

    .line 1183
    cmpg-double v5, v2, v27

    .line 1184
    .line 1185
    if-gez v5, :cond_1d

    .line 1186
    .line 1187
    add-double/2addr v2, v0

    .line 1188
    move-wide/from16 v5, v27

    .line 1189
    .line 1190
    invoke-static {v2, v3, v5, v6}, Ljava/lang/Math;->max(DD)D

    .line 1191
    .line 1192
    .line 1193
    move-result-wide v2

    .line 1194
    goto :goto_11

    .line 1195
    :cond_1d
    invoke-static {v2, v3, v0, v1}, Ljava/lang/Math;->min(DD)D

    .line 1196
    .line 1197
    .line 1198
    move-result-wide v2

    .line 1199
    :goto_11
    invoke-virtual {v12}, Ljava/util/ArrayList;->size()I

    .line 1200
    .line 1201
    .line 1202
    move-result v5

    .line 1203
    const/4 v6, 0x2

    .line 1204
    if-ne v5, v6, :cond_1f

    .line 1205
    .line 1206
    const/4 v5, 0x1

    .line 1207
    invoke-virtual {v12, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 1208
    .line 1209
    .line 1210
    move-result-object v6

    .line 1211
    check-cast v6, Lcom/google/android/gms/internal/measurement/n;

    .line 1212
    .line 1213
    iget-object v5, v4, Lcom/google/firebase/messaging/s;->c:Ljava/lang/Object;

    .line 1214
    .line 1215
    check-cast v5, Lcom/google/android/gms/internal/measurement/t;

    .line 1216
    .line 1217
    invoke-virtual {v5, v4, v6}, Lcom/google/android/gms/internal/measurement/t;->a(Lcom/google/firebase/messaging/s;Lcom/google/android/gms/internal/measurement/n;)Lcom/google/android/gms/internal/measurement/n;

    .line 1218
    .line 1219
    .line 1220
    move-result-object v4

    .line 1221
    invoke-interface {v4}, Lcom/google/android/gms/internal/measurement/n;->b()Ljava/lang/Double;

    .line 1222
    .line 1223
    .line 1224
    move-result-object v4

    .line 1225
    invoke-virtual {v4}, Ljava/lang/Double;->doubleValue()D

    .line 1226
    .line 1227
    .line 1228
    move-result-wide v4

    .line 1229
    invoke-static {v4, v5}, Ls8/n;->Q(D)D

    .line 1230
    .line 1231
    .line 1232
    move-result-wide v4

    .line 1233
    const-wide/16 v6, 0x0

    .line 1234
    .line 1235
    cmpg-double v8, v4, v6

    .line 1236
    .line 1237
    if-gez v8, :cond_1e

    .line 1238
    .line 1239
    add-double/2addr v0, v4

    .line 1240
    invoke-static {v0, v1, v6, v7}, Ljava/lang/Math;->max(DD)D

    .line 1241
    .line 1242
    .line 1243
    move-result-wide v0

    .line 1244
    goto :goto_12

    .line 1245
    :cond_1e
    invoke-static {v0, v1, v4, v5}, Ljava/lang/Math;->min(DD)D

    .line 1246
    .line 1247
    .line 1248
    move-result-wide v0

    .line 1249
    :cond_1f
    :goto_12
    new-instance v4, Lcom/google/android/gms/internal/measurement/d;

    .line 1250
    .line 1251
    invoke-direct {v4}, Lcom/google/android/gms/internal/measurement/d;-><init>()V

    .line 1252
    .line 1253
    .line 1254
    double-to-int v2, v2

    .line 1255
    :goto_13
    int-to-double v5, v2

    .line 1256
    cmpg-double v3, v5, v0

    .line 1257
    .line 1258
    if-gez v3, :cond_20

    .line 1259
    .line 1260
    invoke-virtual {v10, v2}, Lcom/google/android/gms/internal/measurement/d;->q(I)Lcom/google/android/gms/internal/measurement/n;

    .line 1261
    .line 1262
    .line 1263
    move-result-object v3

    .line 1264
    invoke-virtual {v4}, Lcom/google/android/gms/internal/measurement/d;->p()I

    .line 1265
    .line 1266
    .line 1267
    move-result v5

    .line 1268
    invoke-virtual {v4, v5, v3}, Lcom/google/android/gms/internal/measurement/d;->v(ILcom/google/android/gms/internal/measurement/n;)V

    .line 1269
    .line 1270
    .line 1271
    const/16 v18, 0x1

    .line 1272
    .line 1273
    add-int/lit8 v2, v2, 0x1

    .line 1274
    .line 1275
    goto :goto_13

    .line 1276
    :cond_20
    return-object v4

    .line 1277
    :pswitch_6
    move-object/from16 v12, p3

    .line 1278
    .line 1279
    const/4 v0, 0x0

    .line 1280
    invoke-static {v0, v4, v12}, Ls8/n;->a0(ILjava/lang/String;Ljava/util/List;)V

    .line 1281
    .line 1282
    .line 1283
    invoke-virtual {v10}, Lcom/google/android/gms/internal/measurement/d;->p()I

    .line 1284
    .line 1285
    .line 1286
    move-result v1

    .line 1287
    if-nez v1, :cond_21

    .line 1288
    .line 1289
    goto/16 :goto_1f

    .line 1290
    .line 1291
    :cond_21
    invoke-virtual {v10, v0}, Lcom/google/android/gms/internal/measurement/d;->q(I)Lcom/google/android/gms/internal/measurement/n;

    .line 1292
    .line 1293
    .line 1294
    move-result-object v1

    .line 1295
    invoke-virtual {v10, v0}, Lcom/google/android/gms/internal/measurement/d;->u(I)V

    .line 1296
    .line 1297
    .line 1298
    return-object v1

    .line 1299
    :pswitch_7
    move-object/from16 v12, p3

    .line 1300
    .line 1301
    const/4 v0, 0x0

    .line 1302
    invoke-static {v0, v6, v12}, Ls8/n;->a0(ILjava/lang/String;Ljava/util/List;)V

    .line 1303
    .line 1304
    .line 1305
    invoke-virtual {v10}, Lcom/google/android/gms/internal/measurement/d;->p()I

    .line 1306
    .line 1307
    .line 1308
    move-result v0

    .line 1309
    if-eqz v0, :cond_24

    .line 1310
    .line 1311
    const/4 v5, 0x0

    .line 1312
    :goto_14
    const/16 v17, 0x2

    .line 1313
    .line 1314
    div-int/lit8 v1, v0, 0x2

    .line 1315
    .line 1316
    if-ge v5, v1, :cond_24

    .line 1317
    .line 1318
    invoke-virtual {v10, v5}, Lcom/google/android/gms/internal/measurement/d;->w(I)Z

    .line 1319
    .line 1320
    .line 1321
    move-result v1

    .line 1322
    if-eqz v1, :cond_23

    .line 1323
    .line 1324
    invoke-virtual {v10, v5}, Lcom/google/android/gms/internal/measurement/d;->q(I)Lcom/google/android/gms/internal/measurement/n;

    .line 1325
    .line 1326
    .line 1327
    move-result-object v1

    .line 1328
    invoke-virtual {v10, v5, v11}, Lcom/google/android/gms/internal/measurement/d;->v(ILcom/google/android/gms/internal/measurement/n;)V

    .line 1329
    .line 1330
    .line 1331
    add-int/lit8 v7, v0, -0x1

    .line 1332
    .line 1333
    sub-int/2addr v7, v5

    .line 1334
    invoke-virtual {v10, v7}, Lcom/google/android/gms/internal/measurement/d;->w(I)Z

    .line 1335
    .line 1336
    .line 1337
    move-result v2

    .line 1338
    if-eqz v2, :cond_22

    .line 1339
    .line 1340
    invoke-virtual {v10, v7}, Lcom/google/android/gms/internal/measurement/d;->q(I)Lcom/google/android/gms/internal/measurement/n;

    .line 1341
    .line 1342
    .line 1343
    move-result-object v2

    .line 1344
    invoke-virtual {v10, v5, v2}, Lcom/google/android/gms/internal/measurement/d;->v(ILcom/google/android/gms/internal/measurement/n;)V

    .line 1345
    .line 1346
    .line 1347
    :cond_22
    invoke-virtual {v10, v7, v1}, Lcom/google/android/gms/internal/measurement/d;->v(ILcom/google/android/gms/internal/measurement/n;)V

    .line 1348
    .line 1349
    .line 1350
    :cond_23
    const/4 v6, 0x1

    .line 1351
    add-int/2addr v5, v6

    .line 1352
    goto :goto_14

    .line 1353
    :cond_24
    return-object v10

    .line 1354
    :pswitch_8
    move-object/from16 v4, p2

    .line 1355
    .line 1356
    move-object/from16 v12, p3

    .line 1357
    .line 1358
    const/4 v0, 0x0

    .line 1359
    invoke-static {v10, v4, v12, v0}, Ll6/b;->B(Lcom/google/android/gms/internal/measurement/d;Lcom/google/firebase/messaging/s;Ljava/util/ArrayList;Z)Lcom/google/android/gms/internal/measurement/n;

    .line 1360
    .line 1361
    .line 1362
    move-result-object v0

    .line 1363
    return-object v0

    .line 1364
    :pswitch_9
    move-object/from16 v4, p2

    .line 1365
    .line 1366
    move-object/from16 v12, p3

    .line 1367
    .line 1368
    move/from16 v6, v18

    .line 1369
    .line 1370
    invoke-static {v10, v4, v12, v6}, Ll6/b;->B(Lcom/google/android/gms/internal/measurement/d;Lcom/google/firebase/messaging/s;Ljava/util/ArrayList;Z)Lcom/google/android/gms/internal/measurement/n;

    .line 1371
    .line 1372
    .line 1373
    move-result-object v0

    .line 1374
    return-object v0

    .line 1375
    :pswitch_a
    move-object/from16 v4, p2

    .line 1376
    .line 1377
    move-object/from16 v12, p3

    .line 1378
    .line 1379
    move/from16 v6, v18

    .line 1380
    .line 1381
    invoke-virtual {v12}, Ljava/util/ArrayList;->isEmpty()Z

    .line 1382
    .line 1383
    .line 1384
    move-result v0

    .line 1385
    if-nez v0, :cond_25

    .line 1386
    .line 1387
    invoke-virtual {v12}, Ljava/util/ArrayList;->size()I

    .line 1388
    .line 1389
    .line 1390
    move-result v0

    .line 1391
    const/4 v5, 0x0

    .line 1392
    :goto_15
    if-ge v5, v0, :cond_25

    .line 1393
    .line 1394
    invoke-virtual {v12, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 1395
    .line 1396
    .line 1397
    move-result-object v1

    .line 1398
    add-int/2addr v5, v6

    .line 1399
    check-cast v1, Lcom/google/android/gms/internal/measurement/n;

    .line 1400
    .line 1401
    iget-object v2, v4, Lcom/google/firebase/messaging/s;->c:Ljava/lang/Object;

    .line 1402
    .line 1403
    check-cast v2, Lcom/google/android/gms/internal/measurement/t;

    .line 1404
    .line 1405
    invoke-virtual {v2, v4, v1}, Lcom/google/android/gms/internal/measurement/t;->a(Lcom/google/firebase/messaging/s;Lcom/google/android/gms/internal/measurement/n;)Lcom/google/android/gms/internal/measurement/n;

    .line 1406
    .line 1407
    .line 1408
    move-result-object v1

    .line 1409
    invoke-virtual {v10}, Lcom/google/android/gms/internal/measurement/d;->p()I

    .line 1410
    .line 1411
    .line 1412
    move-result v2

    .line 1413
    invoke-virtual {v10, v2, v1}, Lcom/google/android/gms/internal/measurement/d;->v(ILcom/google/android/gms/internal/measurement/n;)V

    .line 1414
    .line 1415
    .line 1416
    const/4 v6, 0x1

    .line 1417
    goto :goto_15

    .line 1418
    :cond_25
    new-instance v0, Lcom/google/android/gms/internal/measurement/g;

    .line 1419
    .line 1420
    invoke-virtual {v10}, Lcom/google/android/gms/internal/measurement/d;->p()I

    .line 1421
    .line 1422
    .line 1423
    move-result v1

    .line 1424
    int-to-double v1, v1

    .line 1425
    invoke-static {v1, v2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 1426
    .line 1427
    .line 1428
    move-result-object v1

    .line 1429
    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/measurement/g;-><init>(Ljava/lang/Double;)V

    .line 1430
    .line 1431
    .line 1432
    return-object v0

    .line 1433
    :pswitch_b
    move-object/from16 v12, p3

    .line 1434
    .line 1435
    const/4 v6, 0x0

    .line 1436
    invoke-static {v6, v9, v12}, Ls8/n;->a0(ILjava/lang/String;Ljava/util/List;)V

    .line 1437
    .line 1438
    .line 1439
    invoke-virtual {v10}, Lcom/google/android/gms/internal/measurement/d;->p()I

    .line 1440
    .line 1441
    .line 1442
    move-result v0

    .line 1443
    if-nez v0, :cond_26

    .line 1444
    .line 1445
    goto/16 :goto_1f

    .line 1446
    .line 1447
    :cond_26
    add-int/lit8 v0, v0, -0x1

    .line 1448
    .line 1449
    invoke-virtual {v10, v0}, Lcom/google/android/gms/internal/measurement/d;->q(I)Lcom/google/android/gms/internal/measurement/n;

    .line 1450
    .line 1451
    .line 1452
    move-result-object v1

    .line 1453
    invoke-virtual {v10, v0}, Lcom/google/android/gms/internal/measurement/d;->u(I)V

    .line 1454
    .line 1455
    .line 1456
    return-object v1

    .line 1457
    :pswitch_c
    move-object/from16 v4, p2

    .line 1458
    .line 1459
    move-object/from16 v12, p3

    .line 1460
    .line 1461
    move/from16 v1, v18

    .line 1462
    .line 1463
    const/4 v6, 0x0

    .line 1464
    invoke-static {v1, v0, v12}, Ls8/n;->a0(ILjava/lang/String;Ljava/util/List;)V

    .line 1465
    .line 1466
    .line 1467
    invoke-virtual {v12, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 1468
    .line 1469
    .line 1470
    move-result-object v0

    .line 1471
    check-cast v0, Lcom/google/android/gms/internal/measurement/n;

    .line 1472
    .line 1473
    iget-object v1, v4, Lcom/google/firebase/messaging/s;->c:Ljava/lang/Object;

    .line 1474
    .line 1475
    check-cast v1, Lcom/google/android/gms/internal/measurement/t;

    .line 1476
    .line 1477
    invoke-virtual {v1, v4, v0}, Lcom/google/android/gms/internal/measurement/t;->a(Lcom/google/firebase/messaging/s;Lcom/google/android/gms/internal/measurement/n;)Lcom/google/android/gms/internal/measurement/n;

    .line 1478
    .line 1479
    .line 1480
    move-result-object v0

    .line 1481
    instance-of v1, v0, Lcom/google/android/gms/internal/measurement/m;

    .line 1482
    .line 1483
    if-eqz v1, :cond_28

    .line 1484
    .line 1485
    invoke-virtual {v10}, Lcom/google/android/gms/internal/measurement/d;->p()I

    .line 1486
    .line 1487
    .line 1488
    move-result v1

    .line 1489
    if-nez v1, :cond_27

    .line 1490
    .line 1491
    new-instance v0, Lcom/google/android/gms/internal/measurement/d;

    .line 1492
    .line 1493
    invoke-direct {v0}, Lcom/google/android/gms/internal/measurement/d;-><init>()V

    .line 1494
    .line 1495
    .line 1496
    return-object v0

    .line 1497
    :cond_27
    check-cast v0, Lcom/google/android/gms/internal/measurement/m;

    .line 1498
    .line 1499
    invoke-static {v10, v4, v0, v11, v11}, Ll6/b;->A(Lcom/google/android/gms/internal/measurement/d;Lcom/google/firebase/messaging/s;Lcom/google/android/gms/internal/measurement/m;Ljava/lang/Boolean;Ljava/lang/Boolean;)Lcom/google/android/gms/internal/measurement/d;

    .line 1500
    .line 1501
    .line 1502
    move-result-object v0

    .line 1503
    return-object v0

    .line 1504
    :cond_28
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 1505
    .line 1506
    invoke-direct {v0, v5}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 1507
    .line 1508
    .line 1509
    throw v0

    .line 1510
    :pswitch_d
    move-object/from16 v4, p2

    .line 1511
    .line 1512
    move-object/from16 v12, p3

    .line 1513
    .line 1514
    const/4 v3, 0x2

    .line 1515
    invoke-static {v2, v3, v12}, Ls8/n;->c0(Ljava/lang/String;ILjava/util/ArrayList;)V

    .line 1516
    .line 1517
    .line 1518
    invoke-virtual {v12}, Ljava/util/ArrayList;->isEmpty()Z

    .line 1519
    .line 1520
    .line 1521
    move-result v0

    .line 1522
    if-nez v0, :cond_29

    .line 1523
    .line 1524
    const/4 v0, 0x0

    .line 1525
    invoke-virtual {v12, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 1526
    .line 1527
    .line 1528
    move-result-object v0

    .line 1529
    check-cast v0, Lcom/google/android/gms/internal/measurement/n;

    .line 1530
    .line 1531
    iget-object v1, v4, Lcom/google/firebase/messaging/s;->c:Ljava/lang/Object;

    .line 1532
    .line 1533
    check-cast v1, Lcom/google/android/gms/internal/measurement/t;

    .line 1534
    .line 1535
    invoke-virtual {v1, v4, v0}, Lcom/google/android/gms/internal/measurement/t;->a(Lcom/google/firebase/messaging/s;Lcom/google/android/gms/internal/measurement/n;)Lcom/google/android/gms/internal/measurement/n;

    .line 1536
    .line 1537
    .line 1538
    move-result-object v0

    .line 1539
    goto :goto_16

    .line 1540
    :cond_29
    move-object/from16 v0, v20

    .line 1541
    .line 1542
    :goto_16
    invoke-virtual {v10}, Lcom/google/android/gms/internal/measurement/d;->p()I

    .line 1543
    .line 1544
    .line 1545
    move-result v1

    .line 1546
    add-int/lit8 v1, v1, -0x1

    .line 1547
    .line 1548
    invoke-virtual {v12}, Ljava/util/ArrayList;->size()I

    .line 1549
    .line 1550
    .line 1551
    move-result v2

    .line 1552
    const/4 v5, 0x1

    .line 1553
    if-le v2, v5, :cond_2b

    .line 1554
    .line 1555
    invoke-virtual {v12, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 1556
    .line 1557
    .line 1558
    move-result-object v1

    .line 1559
    check-cast v1, Lcom/google/android/gms/internal/measurement/n;

    .line 1560
    .line 1561
    iget-object v2, v4, Lcom/google/firebase/messaging/s;->c:Ljava/lang/Object;

    .line 1562
    .line 1563
    check-cast v2, Lcom/google/android/gms/internal/measurement/t;

    .line 1564
    .line 1565
    invoke-virtual {v2, v4, v1}, Lcom/google/android/gms/internal/measurement/t;->a(Lcom/google/firebase/messaging/s;Lcom/google/android/gms/internal/measurement/n;)Lcom/google/android/gms/internal/measurement/n;

    .line 1566
    .line 1567
    .line 1568
    move-result-object v1

    .line 1569
    invoke-interface {v1}, Lcom/google/android/gms/internal/measurement/n;->b()Ljava/lang/Double;

    .line 1570
    .line 1571
    .line 1572
    move-result-object v2

    .line 1573
    invoke-virtual {v2}, Ljava/lang/Double;->doubleValue()D

    .line 1574
    .line 1575
    .line 1576
    move-result-wide v2

    .line 1577
    invoke-static {v2, v3}, Ljava/lang/Double;->isNaN(D)Z

    .line 1578
    .line 1579
    .line 1580
    move-result v2

    .line 1581
    if-eqz v2, :cond_2a

    .line 1582
    .line 1583
    invoke-virtual {v10}, Lcom/google/android/gms/internal/measurement/d;->p()I

    .line 1584
    .line 1585
    .line 1586
    move-result v1

    .line 1587
    add-int/lit8 v1, v1, -0x1

    .line 1588
    .line 1589
    int-to-double v1, v1

    .line 1590
    :goto_17
    const-wide/16 v27, 0x0

    .line 1591
    .line 1592
    goto :goto_18

    .line 1593
    :cond_2a
    invoke-interface {v1}, Lcom/google/android/gms/internal/measurement/n;->b()Ljava/lang/Double;

    .line 1594
    .line 1595
    .line 1596
    move-result-object v1

    .line 1597
    invoke-virtual {v1}, Ljava/lang/Double;->doubleValue()D

    .line 1598
    .line 1599
    .line 1600
    move-result-wide v1

    .line 1601
    invoke-static {v1, v2}, Ls8/n;->Q(D)D

    .line 1602
    .line 1603
    .line 1604
    move-result-wide v1

    .line 1605
    goto :goto_17

    .line 1606
    :goto_18
    cmpg-double v3, v1, v27

    .line 1607
    .line 1608
    if-gez v3, :cond_2c

    .line 1609
    .line 1610
    invoke-virtual {v10}, Lcom/google/android/gms/internal/measurement/d;->p()I

    .line 1611
    .line 1612
    .line 1613
    move-result v3

    .line 1614
    int-to-double v3, v3

    .line 1615
    add-double/2addr v1, v3

    .line 1616
    goto :goto_19

    .line 1617
    :cond_2b
    const-wide/16 v27, 0x0

    .line 1618
    .line 1619
    int-to-double v1, v1

    .line 1620
    :cond_2c
    :goto_19
    cmpg-double v3, v1, v27

    .line 1621
    .line 1622
    if-gez v3, :cond_2d

    .line 1623
    .line 1624
    new-instance v0, Lcom/google/android/gms/internal/measurement/g;

    .line 1625
    .line 1626
    invoke-static/range {v22 .. v23}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 1627
    .line 1628
    .line 1629
    move-result-object v1

    .line 1630
    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/measurement/g;-><init>(Ljava/lang/Double;)V

    .line 1631
    .line 1632
    .line 1633
    return-object v0

    .line 1634
    :cond_2d
    invoke-virtual {v10}, Lcom/google/android/gms/internal/measurement/d;->p()I

    .line 1635
    .line 1636
    .line 1637
    move-result v3

    .line 1638
    int-to-double v3, v3

    .line 1639
    invoke-static {v3, v4, v1, v2}, Ljava/lang/Math;->min(DD)D

    .line 1640
    .line 1641
    .line 1642
    move-result-wide v1

    .line 1643
    double-to-int v1, v1

    .line 1644
    :goto_1a
    if-ltz v1, :cond_2f

    .line 1645
    .line 1646
    invoke-virtual {v10, v1}, Lcom/google/android/gms/internal/measurement/d;->w(I)Z

    .line 1647
    .line 1648
    .line 1649
    move-result v2

    .line 1650
    if-eqz v2, :cond_2e

    .line 1651
    .line 1652
    invoke-virtual {v10, v1}, Lcom/google/android/gms/internal/measurement/d;->q(I)Lcom/google/android/gms/internal/measurement/n;

    .line 1653
    .line 1654
    .line 1655
    move-result-object v2

    .line 1656
    invoke-static {v2, v0}, Ls8/n;->e0(Lcom/google/android/gms/internal/measurement/n;Lcom/google/android/gms/internal/measurement/n;)Z

    .line 1657
    .line 1658
    .line 1659
    move-result v2

    .line 1660
    if-eqz v2, :cond_2e

    .line 1661
    .line 1662
    int-to-double v0, v1

    .line 1663
    new-instance v2, Lcom/google/android/gms/internal/measurement/g;

    .line 1664
    .line 1665
    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 1666
    .line 1667
    .line 1668
    move-result-object v0

    .line 1669
    invoke-direct {v2, v0}, Lcom/google/android/gms/internal/measurement/g;-><init>(Ljava/lang/Double;)V

    .line 1670
    .line 1671
    .line 1672
    return-object v2

    .line 1673
    :cond_2e
    add-int/lit8 v1, v1, -0x1

    .line 1674
    .line 1675
    goto :goto_1a

    .line 1676
    :cond_2f
    new-instance v0, Lcom/google/android/gms/internal/measurement/g;

    .line 1677
    .line 1678
    invoke-static/range {v22 .. v23}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 1679
    .line 1680
    .line 1681
    move-result-object v1

    .line 1682
    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/measurement/g;-><init>(Ljava/lang/Double;)V

    .line 1683
    .line 1684
    .line 1685
    return-object v0

    .line 1686
    :pswitch_e
    move-object/from16 v4, p2

    .line 1687
    .line 1688
    move-object/from16 v12, p3

    .line 1689
    .line 1690
    move/from16 v5, v18

    .line 1691
    .line 1692
    invoke-static {v3, v5, v12}, Ls8/n;->c0(Ljava/lang/String;ILjava/util/ArrayList;)V

    .line 1693
    .line 1694
    .line 1695
    invoke-virtual {v10}, Lcom/google/android/gms/internal/measurement/d;->p()I

    .line 1696
    .line 1697
    .line 1698
    move-result v0

    .line 1699
    if-nez v0, :cond_30

    .line 1700
    .line 1701
    sget-object v0, Lcom/google/android/gms/internal/measurement/n;->U:Lcom/google/android/gms/internal/measurement/q;

    .line 1702
    .line 1703
    return-object v0

    .line 1704
    :cond_30
    invoke-virtual {v12}, Ljava/util/ArrayList;->isEmpty()Z

    .line 1705
    .line 1706
    .line 1707
    move-result v0

    .line 1708
    if-nez v0, :cond_33

    .line 1709
    .line 1710
    const/4 v0, 0x0

    .line 1711
    invoke-virtual {v12, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 1712
    .line 1713
    .line 1714
    move-result-object v0

    .line 1715
    check-cast v0, Lcom/google/android/gms/internal/measurement/n;

    .line 1716
    .line 1717
    iget-object v1, v4, Lcom/google/firebase/messaging/s;->c:Ljava/lang/Object;

    .line 1718
    .line 1719
    check-cast v1, Lcom/google/android/gms/internal/measurement/t;

    .line 1720
    .line 1721
    invoke-virtual {v1, v4, v0}, Lcom/google/android/gms/internal/measurement/t;->a(Lcom/google/firebase/messaging/s;Lcom/google/android/gms/internal/measurement/n;)Lcom/google/android/gms/internal/measurement/n;

    .line 1722
    .line 1723
    .line 1724
    move-result-object v0

    .line 1725
    instance-of v1, v0, Lcom/google/android/gms/internal/measurement/l;

    .line 1726
    .line 1727
    if-nez v1, :cond_32

    .line 1728
    .line 1729
    instance-of v1, v0, Lcom/google/android/gms/internal/measurement/r;

    .line 1730
    .line 1731
    if-eqz v1, :cond_31

    .line 1732
    .line 1733
    goto :goto_1b

    .line 1734
    :cond_31
    invoke-interface {v0}, Lcom/google/android/gms/internal/measurement/n;->c()Ljava/lang/String;

    .line 1735
    .line 1736
    .line 1737
    move-result-object v1

    .line 1738
    goto :goto_1c

    .line 1739
    :cond_32
    :goto_1b
    const-string v1, ""

    .line 1740
    .line 1741
    :cond_33
    :goto_1c
    new-instance v0, Lcom/google/android/gms/internal/measurement/q;

    .line 1742
    .line 1743
    invoke-virtual {v10, v1}, Lcom/google/android/gms/internal/measurement/d;->r(Ljava/lang/String;)Ljava/lang/String;

    .line 1744
    .line 1745
    .line 1746
    move-result-object v1

    .line 1747
    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/measurement/q;-><init>(Ljava/lang/String;)V

    .line 1748
    .line 1749
    .line 1750
    return-object v0

    .line 1751
    :pswitch_f
    move-object/from16 v4, p2

    .line 1752
    .line 1753
    move-object/from16 v12, p3

    .line 1754
    .line 1755
    move-object/from16 v0, v25

    .line 1756
    .line 1757
    const/4 v3, 0x2

    .line 1758
    invoke-static {v0, v3, v12}, Ls8/n;->c0(Ljava/lang/String;ILjava/util/ArrayList;)V

    .line 1759
    .line 1760
    .line 1761
    invoke-virtual {v12}, Ljava/util/ArrayList;->isEmpty()Z

    .line 1762
    .line 1763
    .line 1764
    move-result v0

    .line 1765
    if-nez v0, :cond_34

    .line 1766
    .line 1767
    const/4 v0, 0x0

    .line 1768
    invoke-virtual {v12, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 1769
    .line 1770
    .line 1771
    move-result-object v0

    .line 1772
    check-cast v0, Lcom/google/android/gms/internal/measurement/n;

    .line 1773
    .line 1774
    iget-object v1, v4, Lcom/google/firebase/messaging/s;->c:Ljava/lang/Object;

    .line 1775
    .line 1776
    check-cast v1, Lcom/google/android/gms/internal/measurement/t;

    .line 1777
    .line 1778
    invoke-virtual {v1, v4, v0}, Lcom/google/android/gms/internal/measurement/t;->a(Lcom/google/firebase/messaging/s;Lcom/google/android/gms/internal/measurement/n;)Lcom/google/android/gms/internal/measurement/n;

    .line 1779
    .line 1780
    .line 1781
    move-result-object v0

    .line 1782
    goto :goto_1d

    .line 1783
    :cond_34
    move-object/from16 v0, v20

    .line 1784
    .line 1785
    :goto_1d
    invoke-virtual {v12}, Ljava/util/ArrayList;->size()I

    .line 1786
    .line 1787
    .line 1788
    move-result v1

    .line 1789
    const/4 v5, 0x1

    .line 1790
    if-le v1, v5, :cond_37

    .line 1791
    .line 1792
    invoke-virtual {v12, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 1793
    .line 1794
    .line 1795
    move-result-object v1

    .line 1796
    check-cast v1, Lcom/google/android/gms/internal/measurement/n;

    .line 1797
    .line 1798
    iget-object v2, v4, Lcom/google/firebase/messaging/s;->c:Ljava/lang/Object;

    .line 1799
    .line 1800
    check-cast v2, Lcom/google/android/gms/internal/measurement/t;

    .line 1801
    .line 1802
    invoke-virtual {v2, v4, v1}, Lcom/google/android/gms/internal/measurement/t;->a(Lcom/google/firebase/messaging/s;Lcom/google/android/gms/internal/measurement/n;)Lcom/google/android/gms/internal/measurement/n;

    .line 1803
    .line 1804
    .line 1805
    move-result-object v1

    .line 1806
    invoke-interface {v1}, Lcom/google/android/gms/internal/measurement/n;->b()Ljava/lang/Double;

    .line 1807
    .line 1808
    .line 1809
    move-result-object v1

    .line 1810
    invoke-virtual {v1}, Ljava/lang/Double;->doubleValue()D

    .line 1811
    .line 1812
    .line 1813
    move-result-wide v1

    .line 1814
    invoke-static {v1, v2}, Ls8/n;->Q(D)D

    .line 1815
    .line 1816
    .line 1817
    move-result-wide v1

    .line 1818
    invoke-virtual {v10}, Lcom/google/android/gms/internal/measurement/d;->p()I

    .line 1819
    .line 1820
    .line 1821
    move-result v3

    .line 1822
    int-to-double v3, v3

    .line 1823
    cmpl-double v3, v1, v3

    .line 1824
    .line 1825
    if-ltz v3, :cond_35

    .line 1826
    .line 1827
    new-instance v0, Lcom/google/android/gms/internal/measurement/g;

    .line 1828
    .line 1829
    invoke-static/range {v22 .. v23}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 1830
    .line 1831
    .line 1832
    move-result-object v1

    .line 1833
    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/measurement/g;-><init>(Ljava/lang/Double;)V

    .line 1834
    .line 1835
    .line 1836
    return-object v0

    .line 1837
    :cond_35
    const-wide/16 v27, 0x0

    .line 1838
    .line 1839
    cmpg-double v3, v1, v27

    .line 1840
    .line 1841
    if-gez v3, :cond_36

    .line 1842
    .line 1843
    invoke-virtual {v10}, Lcom/google/android/gms/internal/measurement/d;->p()I

    .line 1844
    .line 1845
    .line 1846
    move-result v3

    .line 1847
    int-to-double v3, v3

    .line 1848
    add-double v11, v3, v1

    .line 1849
    .line 1850
    goto :goto_1e

    .line 1851
    :cond_36
    move-wide v11, v1

    .line 1852
    goto :goto_1e

    .line 1853
    :cond_37
    const-wide/16 v27, 0x0

    .line 1854
    .line 1855
    move-wide/from16 v11, v27

    .line 1856
    .line 1857
    :goto_1e
    invoke-virtual {v10}, Lcom/google/android/gms/internal/measurement/d;->s()Ljava/util/Iterator;

    .line 1858
    .line 1859
    .line 1860
    move-result-object v1

    .line 1861
    :cond_38
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 1862
    .line 1863
    .line 1864
    move-result v2

    .line 1865
    if-eqz v2, :cond_39

    .line 1866
    .line 1867
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1868
    .line 1869
    .line 1870
    move-result-object v2

    .line 1871
    check-cast v2, Ljava/lang/Integer;

    .line 1872
    .line 1873
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 1874
    .line 1875
    .line 1876
    move-result v2

    .line 1877
    int-to-double v3, v2

    .line 1878
    cmpg-double v5, v3, v11

    .line 1879
    .line 1880
    if-ltz v5, :cond_38

    .line 1881
    .line 1882
    invoke-virtual {v10, v2}, Lcom/google/android/gms/internal/measurement/d;->q(I)Lcom/google/android/gms/internal/measurement/n;

    .line 1883
    .line 1884
    .line 1885
    move-result-object v2

    .line 1886
    invoke-static {v2, v0}, Ls8/n;->e0(Lcom/google/android/gms/internal/measurement/n;Lcom/google/android/gms/internal/measurement/n;)Z

    .line 1887
    .line 1888
    .line 1889
    move-result v2

    .line 1890
    if-eqz v2, :cond_38

    .line 1891
    .line 1892
    new-instance v0, Lcom/google/android/gms/internal/measurement/g;

    .line 1893
    .line 1894
    invoke-static {v3, v4}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 1895
    .line 1896
    .line 1897
    move-result-object v1

    .line 1898
    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/measurement/g;-><init>(Ljava/lang/Double;)V

    .line 1899
    .line 1900
    .line 1901
    return-object v0

    .line 1902
    :cond_39
    new-instance v0, Lcom/google/android/gms/internal/measurement/g;

    .line 1903
    .line 1904
    invoke-static/range {v22 .. v23}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 1905
    .line 1906
    .line 1907
    move-result-object v1

    .line 1908
    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/measurement/g;-><init>(Ljava/lang/Double;)V

    .line 1909
    .line 1910
    .line 1911
    return-object v0

    .line 1912
    :pswitch_10
    move-object/from16 v4, p2

    .line 1913
    .line 1914
    move-object/from16 v12, p3

    .line 1915
    .line 1916
    move/from16 v6, v18

    .line 1917
    .line 1918
    move-object/from16 v0, v26

    .line 1919
    .line 1920
    invoke-static {v6, v0, v12}, Ls8/n;->a0(ILjava/lang/String;Ljava/util/List;)V

    .line 1921
    .line 1922
    .line 1923
    const/4 v0, 0x0

    .line 1924
    invoke-virtual {v12, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 1925
    .line 1926
    .line 1927
    move-result-object v0

    .line 1928
    check-cast v0, Lcom/google/android/gms/internal/measurement/n;

    .line 1929
    .line 1930
    iget-object v1, v4, Lcom/google/firebase/messaging/s;->c:Ljava/lang/Object;

    .line 1931
    .line 1932
    check-cast v1, Lcom/google/android/gms/internal/measurement/t;

    .line 1933
    .line 1934
    invoke-virtual {v1, v4, v0}, Lcom/google/android/gms/internal/measurement/t;->a(Lcom/google/firebase/messaging/s;Lcom/google/android/gms/internal/measurement/n;)Lcom/google/android/gms/internal/measurement/n;

    .line 1935
    .line 1936
    .line 1937
    move-result-object v0

    .line 1938
    instance-of v1, v0, Lcom/google/android/gms/internal/measurement/m;

    .line 1939
    .line 1940
    if-eqz v1, :cond_3b

    .line 1941
    .line 1942
    invoke-virtual {v14}, Ljava/util/TreeMap;->size()I

    .line 1943
    .line 1944
    .line 1945
    move-result v1

    .line 1946
    if-nez v1, :cond_3a

    .line 1947
    .line 1948
    :goto_1f
    return-object v20

    .line 1949
    :cond_3a
    check-cast v0, Lcom/google/android/gms/internal/measurement/m;

    .line 1950
    .line 1951
    invoke-static {v10, v4, v0, v11, v11}, Ll6/b;->A(Lcom/google/android/gms/internal/measurement/d;Lcom/google/firebase/messaging/s;Lcom/google/android/gms/internal/measurement/m;Ljava/lang/Boolean;Ljava/lang/Boolean;)Lcom/google/android/gms/internal/measurement/d;

    .line 1952
    .line 1953
    .line 1954
    return-object v20

    .line 1955
    :cond_3b
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 1956
    .line 1957
    invoke-direct {v0, v5}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 1958
    .line 1959
    .line 1960
    throw v0

    .line 1961
    :pswitch_11
    move-object/from16 v4, p2

    .line 1962
    .line 1963
    move-object/from16 v12, p3

    .line 1964
    .line 1965
    move/from16 v6, v18

    .line 1966
    .line 1967
    move-object/from16 v0, v24

    .line 1968
    .line 1969
    invoke-static {v6, v0, v12}, Ls8/n;->a0(ILjava/lang/String;Ljava/util/List;)V

    .line 1970
    .line 1971
    .line 1972
    const/4 v0, 0x0

    .line 1973
    invoke-virtual {v12, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 1974
    .line 1975
    .line 1976
    move-result-object v0

    .line 1977
    check-cast v0, Lcom/google/android/gms/internal/measurement/n;

    .line 1978
    .line 1979
    iget-object v1, v4, Lcom/google/firebase/messaging/s;->c:Ljava/lang/Object;

    .line 1980
    .line 1981
    check-cast v1, Lcom/google/android/gms/internal/measurement/t;

    .line 1982
    .line 1983
    invoke-virtual {v1, v4, v0}, Lcom/google/android/gms/internal/measurement/t;->a(Lcom/google/firebase/messaging/s;Lcom/google/android/gms/internal/measurement/n;)Lcom/google/android/gms/internal/measurement/n;

    .line 1984
    .line 1985
    .line 1986
    move-result-object v0

    .line 1987
    instance-of v1, v0, Lcom/google/android/gms/internal/measurement/m;

    .line 1988
    .line 1989
    if-eqz v1, :cond_3e

    .line 1990
    .line 1991
    invoke-virtual {v14}, Ljava/util/TreeMap;->size()I

    .line 1992
    .line 1993
    .line 1994
    move-result v1

    .line 1995
    if-nez v1, :cond_3c

    .line 1996
    .line 1997
    new-instance v0, Lcom/google/android/gms/internal/measurement/d;

    .line 1998
    .line 1999
    invoke-direct {v0}, Lcom/google/android/gms/internal/measurement/d;-><init>()V

    .line 2000
    .line 2001
    .line 2002
    return-object v0

    .line 2003
    :cond_3c
    invoke-virtual {v10}, Lcom/google/android/gms/internal/measurement/d;->f()Lcom/google/android/gms/internal/measurement/n;

    .line 2004
    .line 2005
    .line 2006
    move-result-object v1

    .line 2007
    check-cast v1, Lcom/google/android/gms/internal/measurement/d;

    .line 2008
    .line 2009
    check-cast v0, Lcom/google/android/gms/internal/measurement/m;

    .line 2010
    .line 2011
    sget-object v2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 2012
    .line 2013
    invoke-static {v10, v4, v0, v11, v2}, Ll6/b;->A(Lcom/google/android/gms/internal/measurement/d;Lcom/google/firebase/messaging/s;Lcom/google/android/gms/internal/measurement/m;Ljava/lang/Boolean;Ljava/lang/Boolean;)Lcom/google/android/gms/internal/measurement/d;

    .line 2014
    .line 2015
    .line 2016
    move-result-object v0

    .line 2017
    new-instance v2, Lcom/google/android/gms/internal/measurement/d;

    .line 2018
    .line 2019
    invoke-direct {v2}, Lcom/google/android/gms/internal/measurement/d;-><init>()V

    .line 2020
    .line 2021
    .line 2022
    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/d;->s()Ljava/util/Iterator;

    .line 2023
    .line 2024
    .line 2025
    move-result-object v0

    .line 2026
    :goto_20
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 2027
    .line 2028
    .line 2029
    move-result v3

    .line 2030
    if-eqz v3, :cond_3d

    .line 2031
    .line 2032
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 2033
    .line 2034
    .line 2035
    move-result-object v3

    .line 2036
    check-cast v3, Ljava/lang/Integer;

    .line 2037
    .line 2038
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 2039
    .line 2040
    .line 2041
    move-result v3

    .line 2042
    invoke-virtual {v1, v3}, Lcom/google/android/gms/internal/measurement/d;->q(I)Lcom/google/android/gms/internal/measurement/n;

    .line 2043
    .line 2044
    .line 2045
    move-result-object v3

    .line 2046
    invoke-virtual {v2}, Lcom/google/android/gms/internal/measurement/d;->p()I

    .line 2047
    .line 2048
    .line 2049
    move-result v4

    .line 2050
    invoke-virtual {v2, v4, v3}, Lcom/google/android/gms/internal/measurement/d;->v(ILcom/google/android/gms/internal/measurement/n;)V

    .line 2051
    .line 2052
    .line 2053
    goto :goto_20

    .line 2054
    :cond_3d
    return-object v2

    .line 2055
    :cond_3e
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 2056
    .line 2057
    invoke-direct {v0, v5}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 2058
    .line 2059
    .line 2060
    throw v0

    .line 2061
    :pswitch_12
    move-object/from16 v4, p2

    .line 2062
    .line 2063
    move-object/from16 v12, p3

    .line 2064
    .line 2065
    move/from16 v6, v18

    .line 2066
    .line 2067
    move-object/from16 v0, v21

    .line 2068
    .line 2069
    invoke-static {v6, v0, v12}, Ls8/n;->a0(ILjava/lang/String;Ljava/util/List;)V

    .line 2070
    .line 2071
    .line 2072
    const/4 v0, 0x0

    .line 2073
    invoke-virtual {v12, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 2074
    .line 2075
    .line 2076
    move-result-object v0

    .line 2077
    check-cast v0, Lcom/google/android/gms/internal/measurement/n;

    .line 2078
    .line 2079
    iget-object v1, v4, Lcom/google/firebase/messaging/s;->c:Ljava/lang/Object;

    .line 2080
    .line 2081
    check-cast v1, Lcom/google/android/gms/internal/measurement/t;

    .line 2082
    .line 2083
    invoke-virtual {v1, v4, v0}, Lcom/google/android/gms/internal/measurement/t;->a(Lcom/google/firebase/messaging/s;Lcom/google/android/gms/internal/measurement/n;)Lcom/google/android/gms/internal/measurement/n;

    .line 2084
    .line 2085
    .line 2086
    move-result-object v0

    .line 2087
    instance-of v1, v0, Lcom/google/android/gms/internal/measurement/m;

    .line 2088
    .line 2089
    if-eqz v1, :cond_42

    .line 2090
    .line 2091
    invoke-virtual {v10}, Lcom/google/android/gms/internal/measurement/d;->p()I

    .line 2092
    .line 2093
    .line 2094
    move-result v1

    .line 2095
    if-nez v1, :cond_3f

    .line 2096
    .line 2097
    goto :goto_22

    .line 2098
    :cond_3f
    check-cast v0, Lcom/google/android/gms/internal/measurement/m;

    .line 2099
    .line 2100
    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 2101
    .line 2102
    sget-object v2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 2103
    .line 2104
    invoke-static {v10, v4, v0, v1, v2}, Ll6/b;->A(Lcom/google/android/gms/internal/measurement/d;Lcom/google/firebase/messaging/s;Lcom/google/android/gms/internal/measurement/m;Ljava/lang/Boolean;Ljava/lang/Boolean;)Lcom/google/android/gms/internal/measurement/d;

    .line 2105
    .line 2106
    .line 2107
    move-result-object v0

    .line 2108
    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/d;->p()I

    .line 2109
    .line 2110
    .line 2111
    move-result v0

    .line 2112
    invoke-virtual {v10}, Lcom/google/android/gms/internal/measurement/d;->p()I

    .line 2113
    .line 2114
    .line 2115
    move-result v1

    .line 2116
    if-eq v0, v1, :cond_41

    .line 2117
    .line 2118
    :cond_40
    :goto_21
    sget-object v0, Lcom/google/android/gms/internal/measurement/n;->T:Lcom/google/android/gms/internal/measurement/e;

    .line 2119
    .line 2120
    return-object v0

    .line 2121
    :cond_41
    :goto_22
    sget-object v0, Lcom/google/android/gms/internal/measurement/n;->S:Lcom/google/android/gms/internal/measurement/e;

    .line 2122
    .line 2123
    return-object v0

    .line 2124
    :cond_42
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 2125
    .line 2126
    invoke-direct {v0, v5}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 2127
    .line 2128
    .line 2129
    throw v0

    .line 2130
    :pswitch_13
    move-object/from16 v4, p2

    .line 2131
    .line 2132
    move-object/from16 v12, p3

    .line 2133
    .line 2134
    const/4 v0, 0x0

    .line 2135
    invoke-virtual {v10}, Lcom/google/android/gms/internal/measurement/d;->f()Lcom/google/android/gms/internal/measurement/n;

    .line 2136
    .line 2137
    .line 2138
    move-result-object v1

    .line 2139
    check-cast v1, Lcom/google/android/gms/internal/measurement/d;

    .line 2140
    .line 2141
    invoke-virtual {v12}, Ljava/util/ArrayList;->isEmpty()Z

    .line 2142
    .line 2143
    .line 2144
    move-result v2

    .line 2145
    if-nez v2, :cond_46

    .line 2146
    .line 2147
    invoke-virtual {v12}, Ljava/util/ArrayList;->size()I

    .line 2148
    .line 2149
    .line 2150
    move-result v2

    .line 2151
    move v5, v0

    .line 2152
    :cond_43
    :goto_23
    if-ge v5, v2, :cond_46

    .line 2153
    .line 2154
    invoke-virtual {v12, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 2155
    .line 2156
    .line 2157
    move-result-object v0

    .line 2158
    const/16 v18, 0x1

    .line 2159
    .line 2160
    add-int/lit8 v5, v5, 0x1

    .line 2161
    .line 2162
    check-cast v0, Lcom/google/android/gms/internal/measurement/n;

    .line 2163
    .line 2164
    iget-object v3, v4, Lcom/google/firebase/messaging/s;->c:Ljava/lang/Object;

    .line 2165
    .line 2166
    check-cast v3, Lcom/google/android/gms/internal/measurement/t;

    .line 2167
    .line 2168
    invoke-virtual {v3, v4, v0}, Lcom/google/android/gms/internal/measurement/t;->a(Lcom/google/firebase/messaging/s;Lcom/google/android/gms/internal/measurement/n;)Lcom/google/android/gms/internal/measurement/n;

    .line 2169
    .line 2170
    .line 2171
    move-result-object v0

    .line 2172
    instance-of v3, v0, Lcom/google/android/gms/internal/measurement/f;

    .line 2173
    .line 2174
    if-nez v3, :cond_45

    .line 2175
    .line 2176
    invoke-virtual {v1}, Lcom/google/android/gms/internal/measurement/d;->p()I

    .line 2177
    .line 2178
    .line 2179
    move-result v3

    .line 2180
    instance-of v6, v0, Lcom/google/android/gms/internal/measurement/d;

    .line 2181
    .line 2182
    if-eqz v6, :cond_44

    .line 2183
    .line 2184
    check-cast v0, Lcom/google/android/gms/internal/measurement/d;

    .line 2185
    .line 2186
    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/d;->s()Ljava/util/Iterator;

    .line 2187
    .line 2188
    .line 2189
    move-result-object v6

    .line 2190
    :goto_24
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 2191
    .line 2192
    .line 2193
    move-result v7

    .line 2194
    if-eqz v7, :cond_43

    .line 2195
    .line 2196
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 2197
    .line 2198
    .line 2199
    move-result-object v7

    .line 2200
    check-cast v7, Ljava/lang/Integer;

    .line 2201
    .line 2202
    invoke-virtual {v7}, Ljava/lang/Integer;->intValue()I

    .line 2203
    .line 2204
    .line 2205
    move-result v8

    .line 2206
    add-int/2addr v8, v3

    .line 2207
    invoke-virtual {v7}, Ljava/lang/Integer;->intValue()I

    .line 2208
    .line 2209
    .line 2210
    move-result v7

    .line 2211
    invoke-virtual {v0, v7}, Lcom/google/android/gms/internal/measurement/d;->q(I)Lcom/google/android/gms/internal/measurement/n;

    .line 2212
    .line 2213
    .line 2214
    move-result-object v7

    .line 2215
    invoke-virtual {v1, v8, v7}, Lcom/google/android/gms/internal/measurement/d;->v(ILcom/google/android/gms/internal/measurement/n;)V

    .line 2216
    .line 2217
    .line 2218
    goto :goto_24

    .line 2219
    :cond_44
    invoke-virtual {v1, v3, v0}, Lcom/google/android/gms/internal/measurement/d;->v(ILcom/google/android/gms/internal/measurement/n;)V

    .line 2220
    .line 2221
    .line 2222
    goto :goto_23

    .line 2223
    :cond_45
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 2224
    .line 2225
    const-string v1, "Failed evaluation of arguments"

    .line 2226
    .line 2227
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 2228
    .line 2229
    .line 2230
    throw v0

    .line 2231
    :cond_46
    return-object v1

    .line 2232
    nop

    .line 2233
    :sswitch_data_0
    .sparse-switch
        -0x69e9ad94 -> :sswitch_13
        -0x50c088ec -> :sswitch_12
        -0x4bf73488 -> :sswitch_11
        -0x37b90a9a -> :sswitch_10
        -0x3565b984 -> :sswitch_f
        -0x28732996 -> :sswitch_e
        -0x1bdda92d -> :sswitch_d
        -0x108c6a77 -> :sswitch_c
        0x1a55c -> :sswitch_b
        0x1b251 -> :sswitch_a
        0x31dd2a -> :sswitch_9
        0x34af1a -> :sswitch_8
        0x35f4f4 -> :sswitch_7
        0x35f59e -> :sswitch_6
        0x5c6731b -> :sswitch_5
        0x6856c82 -> :sswitch_4
        0x6873d92 -> :sswitch_3
        0x398d4c56 -> :sswitch_2
        0x418e52e2 -> :sswitch_1
        0x73d44649 -> :sswitch_0
    .end sparse-switch

    .line 2234
    .line 2235
    .line 2236
    .line 2237
    .line 2238
    .line 2239
    .line 2240
    .line 2241
    .line 2242
    .line 2243
    .line 2244
    .line 2245
    .line 2246
    .line 2247
    .line 2248
    .line 2249
    .line 2250
    .line 2251
    .line 2252
    .line 2253
    .line 2254
    .line 2255
    .line 2256
    .line 2257
    .line 2258
    .line 2259
    .line 2260
    .line 2261
    .line 2262
    .line 2263
    .line 2264
    .line 2265
    .line 2266
    .line 2267
    .line 2268
    .line 2269
    .line 2270
    .line 2271
    .line 2272
    .line 2273
    .line 2274
    .line 2275
    .line 2276
    .line 2277
    .line 2278
    .line 2279
    .line 2280
    .line 2281
    .line 2282
    .line 2283
    .line 2284
    .line 2285
    .line 2286
    .line 2287
    .line 2288
    .line 2289
    .line 2290
    .line 2291
    .line 2292
    .line 2293
    .line 2294
    .line 2295
    .line 2296
    .line 2297
    .line 2298
    .line 2299
    .line 2300
    .line 2301
    .line 2302
    .line 2303
    .line 2304
    .line 2305
    .line 2306
    .line 2307
    .line 2308
    .line 2309
    .line 2310
    .line 2311
    .line 2312
    .line 2313
    .line 2314
    .line 2315
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
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
    .line 2316
    .line 2317
    .line 2318
    .line 2319
    .line 2320
    .line 2321
    .line 2322
    .line 2323
    .line 2324
    .line 2325
    .line 2326
    .line 2327
    .line 2328
    .line 2329
    .line 2330
    .line 2331
    .line 2332
    .line 2333
    .line 2334
    .line 2335
    .line 2336
    .line 2337
    .line 2338
    .line 2339
    .line 2340
    .line 2341
    .line 2342
    .line 2343
    .line 2344
    .line 2345
    .line 2346
    .line 2347
    .line 2348
    .line 2349
    .line 2350
    .line 2351
    .line 2352
    .line 2353
    .line 2354
    .line 2355
    .line 2356
    .line 2357
    .line 2358
    .line 2359
    .line 2360
    .line 2361
    .line 2362
    .line 2363
    .line 2364
    .line 2365
    .line 2366
    .line 2367
    .line 2368
    .line 2369
    .line 2370
    .line 2371
    .line 2372
    .line 2373
    .line 2374
    .line 2375
    .line 2376
    .line 2377
    .line 2378
    .line 2379
    .line 2380
    .line 2381
    .line 2382
    .line 2383
    .line 2384
    .line 2385
    .line 2386
    .line 2387
    .line 2388
    .line 2389
    .line 2390
    .line 2391
    .line 2392
    .line 2393
    .line 2394
    .line 2395
    .line 2396
    .line 2397
    .line 2398
    .line 2399
    .line 2400
    .line 2401
    .line 2402
    .line 2403
    .line 2404
    .line 2405
    .line 2406
    .line 2407
    .line 2408
    .line 2409
    .line 2410
    .line 2411
    .line 2412
    .line 2413
    .line 2414
    .line 2415
    .line 2416
    .line 2417
    .line 2418
    .line 2419
    .line 2420
    .line 2421
    .line 2422
    .line 2423
    .line 2424
    .line 2425
    .line 2426
    .line 2427
    .line 2428
    .line 2429
    .line 2430
    .line 2431
    .line 2432
    .line 2433
    .line 2434
    .line 2435
    .line 2436
    .line 2437
    .line 2438
    .line 2439
    .line 2440
    .line 2441
    .line 2442
    .line 2443
    .line 2444
    .line 2445
    .line 2446
    .line 2447
    .line 2448
    .line 2449
    .line 2450
    .line 2451
    .line 2452
    .line 2453
    .line 2454
    .line 2455
    .line 2456
    .line 2457
    .line 2458
    .line 2459
    .line 2460
    .line 2461
    .line 2462
    .line 2463
    .line 2464
    .line 2465
    .line 2466
    .line 2467
    .line 2468
    .line 2469
    .line 2470
    .line 2471
    .line 2472
    .line 2473
    .line 2474
    .line 2475
    .line 2476
    .line 2477
    .line 2478
    .line 2479
    .line 2480
    .line 2481
    .line 2482
    .line 2483
    .line 2484
    .line 2485
    .line 2486
    .line 2487
    .line 2488
    .line 2489
    .line 2490
    .line 2491
    .line 2492
    .line 2493
    .line 2494
    .line 2495
    .line 2496
    .line 2497
    .line 2498
    .line 2499
    .line 2500
    .line 2501
    .line 2502
    .line 2503
    .line 2504
    .line 2505
    .line 2506
    .line 2507
    .line 2508
    .line 2509
    .line 2510
    .line 2511
    .line 2512
    .line 2513
    .line 2514
    .line 2515
    .line 2516
    .line 2517
    .line 2518
    .line 2519
    .line 2520
    .line 2521
    .line 2522
    .line 2523
    .line 2524
    .line 2525
    .line 2526
    .line 2527
    .line 2528
    .line 2529
    .line 2530
    .line 2531
    .line 2532
    .line 2533
    .line 2534
    .line 2535
    .line 2536
    .line 2537
    .line 2538
    .line 2539
    .line 2540
    .line 2541
    .line 2542
    .line 2543
    .line 2544
    .line 2545
    .line 2546
    .line 2547
    .line 2548
    .line 2549
    .line 2550
    .line 2551
    .line 2552
    .line 2553
    .line 2554
    .line 2555
    .line 2556
    .line 2557
    .line 2558
    .line 2559
    .line 2560
    .line 2561
    .line 2562
    .line 2563
    .line 2564
    .line 2565
    .line 2566
    .line 2567
    .line 2568
    .line 2569
    .line 2570
    .line 2571
    .line 2572
    .line 2573
    .line 2574
    .line 2575
    .line 2576
    .line 2577
    .line 2578
    .line 2579
    .line 2580
    .line 2581
    .line 2582
    .line 2583
    .line 2584
    .line 2585
    .line 2586
    .line 2587
    .line 2588
    .line 2589
    .line 2590
    .line 2591
    .line 2592
    .line 2593
    .line 2594
    .line 2595
    .line 2596
    .line 2597
    .line 2598
    .line 2599
    .line 2600
    .line 2601
    .line 2602
    .line 2603
    .line 2604
    .line 2605
    .line 2606
    .line 2607
    .line 2608
    .line 2609
    .line 2610
    .line 2611
    .line 2612
    .line 2613
    .line 2614
    .line 2615
    .line 2616
    .line 2617
    .line 2618
    .line 2619
    .line 2620
    .line 2621
    .line 2622
    .line 2623
    .line 2624
    .line 2625
    .line 2626
    .line 2627
    .line 2628
    .line 2629
    .line 2630
    .line 2631
    .line 2632
    .line 2633
    .line 2634
    .line 2635
    .line 2636
    .line 2637
    .line 2638
    .line 2639
    .line 2640
    .line 2641
    .line 2642
    .line 2643
    .line 2644
    .line 2645
    .line 2646
    .line 2647
    .line 2648
    .line 2649
    .line 2650
    .line 2651
    .line 2652
    .line 2653
    .line 2654
    .line 2655
    .line 2656
    .line 2657
    .line 2658
    .line 2659
    .line 2660
    .line 2661
    .line 2662
    .line 2663
    .line 2664
    .line 2665
    .line 2666
    .line 2667
    .line 2668
    .line 2669
    .line 2670
    .line 2671
    .line 2672
    .line 2673
    .line 2674
    .line 2675
    .line 2676
    .line 2677
    .line 2678
    .line 2679
    .line 2680
    .line 2681
    .line 2682
    .line 2683
    .line 2684
    .line 2685
    .line 2686
    .line 2687
    .line 2688
    .line 2689
    .line 2690
    .line 2691
    .line 2692
    .line 2693
    .line 2694
    .line 2695
    .line 2696
    .line 2697
    .line 2698
    .line 2699
    .line 2700
    .line 2701
    .line 2702
    .line 2703
    .line 2704
    .line 2705
    .line 2706
    .line 2707
    .line 2708
    .line 2709
    .line 2710
    .line 2711
    .line 2712
    .line 2713
    .line 2714
    .line 2715
    .line 2716
    .line 2717
    .line 2718
    .line 2719
    .line 2720
    .line 2721
    .line 2722
    .line 2723
    .line 2724
    .line 2725
    .line 2726
    .line 2727
    .line 2728
    .line 2729
    .line 2730
    .line 2731
    .line 2732
    .line 2733
    .line 2734
    .line 2735
    .line 2736
    .line 2737
    .line 2738
    .line 2739
    .line 2740
    .line 2741
    .line 2742
    .line 2743
    .line 2744
    .line 2745
    .line 2746
    .line 2747
    .line 2748
    .line 2749
    .line 2750
    .line 2751
    .line 2752
    .line 2753
    .line 2754
    .line 2755
    .line 2756
    .line 2757
    .line 2758
    .line 2759
    .line 2760
    .line 2761
    .line 2762
    .line 2763
    .line 2764
    .line 2765
    .line 2766
    .line 2767
    .line 2768
    .line 2769
    .line 2770
    .line 2771
    .line 2772
    .line 2773
    .line 2774
    .line 2775
    .line 2776
    .line 2777
    .line 2778
    .line 2779
    .line 2780
    .line 2781
    .line 2782
    .line 2783
    .line 2784
    .line 2785
    .line 2786
    .line 2787
    .line 2788
    .line 2789
    .line 2790
    .line 2791
    .line 2792
    .line 2793
    .line 2794
    .line 2795
    .line 2796
    .line 2797
    .line 2798
    .line 2799
    .line 2800
    .line 2801
    .line 2802
    .line 2803
    .line 2804
    .line 2805
    .line 2806
    .line 2807
    .line 2808
    .line 2809
    .line 2810
    .line 2811
    .line 2812
    .line 2813
    .line 2814
    .line 2815
    .line 2816
    .line 2817
    .line 2818
    .line 2819
    .line 2820
    .line 2821
    .line 2822
    .line 2823
    .line 2824
    .line 2825
    .line 2826
    .line 2827
    .line 2828
    .line 2829
    .line 2830
    .line 2831
    .line 2832
    .line 2833
    .line 2834
    .line 2835
    .line 2836
    .line 2837
    .line 2838
    .line 2839
    .line 2840
    .line 2841
    .line 2842
    .line 2843
    .line 2844
    .line 2845
    .line 2846
    .line 2847
    .line 2848
    .line 2849
    .line 2850
    .line 2851
    .line 2852
    .line 2853
    .line 2854
    .line 2855
    .line 2856
    .line 2857
    .line 2858
    .line 2859
    .line 2860
    .line 2861
    .line 2862
    .line 2863
    .line 2864
    .line 2865
    .line 2866
    .line 2867
    .line 2868
    .line 2869
    .line 2870
    .line 2871
    .line 2872
    .line 2873
    .line 2874
    .line 2875
    .line 2876
    .line 2877
    .line 2878
    .line 2879
    .line 2880
    .line 2881
    .line 2882
    .line 2883
    .line 2884
    .line 2885
    .line 2886
    .line 2887
    .line 2888
    .line 2889
    .line 2890
    .line 2891
    .line 2892
    .line 2893
    .line 2894
    .line 2895
    .line 2896
    .line 2897
    .line 2898
    .line 2899
    .line 2900
    .line 2901
    .line 2902
    .line 2903
    .line 2904
    .line 2905
    .line 2906
    .line 2907
    .line 2908
    .line 2909
    .line 2910
    .line 2911
    .line 2912
    .line 2913
    .line 2914
    .line 2915
    .line 2916
    .line 2917
    .line 2918
    .line 2919
    .line 2920
    .line 2921
    .line 2922
    .line 2923
    .line 2924
    .line 2925
    .line 2926
    .line 2927
    .line 2928
    .line 2929
    .line 2930
    .line 2931
    .line 2932
    .line 2933
    .line 2934
    .line 2935
    .line 2936
    .line 2937
    .line 2938
    .line 2939
    .line 2940
    .line 2941
    .line 2942
    .line 2943
    .line 2944
    .line 2945
    .line 2946
    .line 2947
    .line 2948
    .line 2949
    .line 2950
    .line 2951
    .line 2952
    .line 2953
    .line 2954
    .line 2955
    .line 2956
    .line 2957
    .line 2958
    .line 2959
    .line 2960
    .line 2961
    .line 2962
    .line 2963
    .line 2964
    .line 2965
    .line 2966
    .line 2967
    .line 2968
    .line 2969
    .line 2970
    .line 2971
    .line 2972
    .line 2973
    .line 2974
    .line 2975
    .line 2976
    .line 2977
    .line 2978
    .line 2979
    .line 2980
    .line 2981
    .line 2982
    .line 2983
    .line 2984
    .line 2985
    .line 2986
    .line 2987
    .line 2988
    .line 2989
    .line 2990
    .line 2991
    .line 2992
    .line 2993
    .line 2994
    .line 2995
    .line 2996
    .line 2997
    .line 2998
    .line 2999
    .line 3000
    .line 3001
    .line 3002
    .line 3003
    .line 3004
    .line 3005
    .line 3006
    .line 3007
    .line 3008
    .line 3009
    .line 3010
    .line 3011
    .line 3012
    .line 3013
    .line 3014
    .line 3015
    .line 3016
    .line 3017
    .line 3018
    .line 3019
    .line 3020
    .line 3021
    .line 3022
    .line 3023
    .line 3024
    .line 3025
    .line 3026
    .line 3027
    .line 3028
    .line 3029
    .line 3030
    .line 3031
    .line 3032
    .line 3033
    .line 3034
    .line 3035
    .line 3036
    .line 3037
    .line 3038
    .line 3039
    .line 3040
    .line 3041
    .line 3042
    .line 3043
    .line 3044
    .line 3045
    .line 3046
    .line 3047
    .line 3048
    .line 3049
    .line 3050
    .line 3051
    .line 3052
    .line 3053
    .line 3054
    .line 3055
    .line 3056
    .line 3057
    .line 3058
    .line 3059
    .line 3060
    .line 3061
    .line 3062
    .line 3063
    .line 3064
    .line 3065
    .line 3066
    .line 3067
    .line 3068
    .line 3069
    .line 3070
    .line 3071
    .line 3072
    .line 3073
    .line 3074
    .line 3075
    .line 3076
    .line 3077
    .line 3078
    .line 3079
    .line 3080
    .line 3081
    .line 3082
    .line 3083
    .line 3084
    .line 3085
    .line 3086
    .line 3087
    .line 3088
    .line 3089
    .line 3090
    .line 3091
    .line 3092
    .line 3093
    .line 3094
    .line 3095
    .line 3096
    .line 3097
    .line 3098
    .line 3099
    .line 3100
    .line 3101
    .line 3102
    .line 3103
    .line 3104
    .line 3105
    .line 3106
    .line 3107
    .line 3108
    .line 3109
    .line 3110
    .line 3111
    .line 3112
    .line 3113
    .line 3114
    .line 3115
    .line 3116
    .line 3117
    .line 3118
    .line 3119
    .line 3120
    .line 3121
    .line 3122
    .line 3123
    .line 3124
    .line 3125
    .line 3126
    .line 3127
    .line 3128
    .line 3129
    .line 3130
    .line 3131
    .line 3132
    .line 3133
    .line 3134
    .line 3135
    .line 3136
    .line 3137
    .line 3138
    .line 3139
    .line 3140
    .line 3141
    .line 3142
    .line 3143
    .line 3144
    .line 3145
    .line 3146
    .line 3147
    .line 3148
    .line 3149
    .line 3150
    .line 3151
    .line 3152
    .line 3153
    .line 3154
    .line 3155
    .line 3156
    .line 3157
    .line 3158
    .line 3159
    .line 3160
    .line 3161
    .line 3162
    .line 3163
    .line 3164
    .line 3165
    .line 3166
    .line 3167
    .line 3168
    .line 3169
    .line 3170
    .line 3171
    .line 3172
    .line 3173
    .line 3174
    .line 3175
    .line 3176
    .line 3177
    .line 3178
    .line 3179
    .line 3180
    .line 3181
    .line 3182
    .line 3183
    .line 3184
    .line 3185
    .line 3186
    .line 3187
    .line 3188
    .line 3189
    .line 3190
    .line 3191
    .line 3192
    .line 3193
    .line 3194
    .line 3195
    .line 3196
    .line 3197
    .line 3198
    .line 3199
    .line 3200
    .line 3201
    .line 3202
    .line 3203
    .line 3204
    .line 3205
    .line 3206
    .line 3207
    .line 3208
    .line 3209
    .line 3210
    .line 3211
    .line 3212
    .line 3213
    .line 3214
    .line 3215
    .line 3216
    .line 3217
    .line 3218
    .line 3219
    .line 3220
    .line 3221
    .line 3222
    .line 3223
    .line 3224
    .line 3225
    .line 3226
    .line 3227
    .line 3228
    .line 3229
    .line 3230
    .line 3231
    .line 3232
    .line 3233
    .line 3234
    .line 3235
    .line 3236
    .line 3237
    .line 3238
    .line 3239
    .line 3240
    .line 3241
    .line 3242
    .line 3243
    .line 3244
    .line 3245
    .line 3246
    .line 3247
    .line 3248
    .line 3249
    .line 3250
    .line 3251
    .line 3252
    .line 3253
    .line 3254
    .line 3255
    .line 3256
    .line 3257
    .line 3258
    .line 3259
    .line 3260
    .line 3261
    .line 3262
    .line 3263
    .line 3264
    .line 3265
    .line 3266
    .line 3267
    .line 3268
    .line 3269
    .line 3270
    .line 3271
    .line 3272
    .line 3273
    .line 3274
    .line 3275
    .line 3276
    .line 3277
    .line 3278
    .line 3279
    .line 3280
    .line 3281
    .line 3282
    .line 3283
    .line 3284
    .line 3285
    .line 3286
    .line 3287
    .line 3288
    .line 3289
    .line 3290
    .line 3291
    .line 3292
    .line 3293
    .line 3294
    .line 3295
    .line 3296
    .line 3297
    .line 3298
    .line 3299
    .line 3300
    .line 3301
    .line 3302
    .line 3303
    .line 3304
    .line 3305
    .line 3306
    .line 3307
    .line 3308
    .line 3309
    .line 3310
    .line 3311
    .line 3312
    .line 3313
    .line 3314
    .line 3315
    .line 3316
    .line 3317
    .line 3318
    .line 3319
    .line 3320
    .line 3321
    .line 3322
    .line 3323
    .line 3324
    .line 3325
    .line 3326
    .line 3327
    .line 3328
    .line 3329
    .line 3330
    .line 3331
    .line 3332
    .line 3333
    .line 3334
    .line 3335
    .line 3336
    .line 3337
    .line 3338
    .line 3339
    .line 3340
    .line 3341
    .line 3342
    .line 3343
    .line 3344
    .line 3345
    .line 3346
    .line 3347
    .line 3348
    .line 3349
    .line 3350
    .line 3351
    .line 3352
    .line 3353
    .line 3354
    .line 3355
    .line 3356
    .line 3357
    .line 3358
    .line 3359
    .line 3360
    .line 3361
    .line 3362
    .line 3363
    .line 3364
    .line 3365
    .line 3366
    .line 3367
    .line 3368
    .line 3369
    .line 3370
    .line 3371
    .line 3372
    .line 3373
    .line 3374
    .line 3375
    .line 3376
    .line 3377
    .line 3378
    .line 3379
    .line 3380
    .line 3381
    .line 3382
    .line 3383
    .line 3384
    .line 3385
    .line 3386
    .line 3387
    .line 3388
    .line 3389
    .line 3390
    .line 3391
    .line 3392
    .line 3393
    .line 3394
    .line 3395
    .line 3396
    .line 3397
    .line 3398
    .line 3399
    .line 3400
    .line 3401
    .line 3402
    .line 3403
    .line 3404
    .line 3405
    .line 3406
    .line 3407
    .line 3408
    .line 3409
    .line 3410
    .line 3411
    .line 3412
    .line 3413
    .line 3414
    .line 3415
    .line 3416
    .line 3417
    .line 3418
    .line 3419
    .line 3420
    .line 3421
    .line 3422
    .line 3423
    .line 3424
    .line 3425
    .line 3426
    .line 3427
    .line 3428
    .line 3429
    .line 3430
    .line 3431
    .line 3432
    .line 3433
    .line 3434
    .line 3435
    .line 3436
    .line 3437
    .line 3438
    .line 3439
    .line 3440
    .line 3441
    .line 3442
    .line 3443
    .line 3444
    .line 3445
    .line 3446
    .line 3447
    .line 3448
    .line 3449
    .line 3450
    .line 3451
    .line 3452
    .line 3453
    .line 3454
    .line 3455
    .line 3456
    .line 3457
    .line 3458
    .line 3459
    .line 3460
    .line 3461
    .line 3462
    .line 3463
    .line 3464
    .line 3465
    .line 3466
    .line 3467
    .line 3468
    .line 3469
    .line 3470
    .line 3471
    .line 3472
    .line 3473
    .line 3474
    .line 3475
    .line 3476
    .line 3477
    .line 3478
    .line 3479
    .line 3480
    .line 3481
    .line 3482
    .line 3483
    .line 3484
    .line 3485
    .line 3486
    .line 3487
    .line 3488
    .line 3489
    .line 3490
    .line 3491
    .line 3492
    .line 3493
    .line 3494
    .line 3495
    .line 3496
    .line 3497
    .line 3498
    .line 3499
    .line 3500
    .line 3501
    .line 3502
    .line 3503
    .line 3504
    .line 3505
    .line 3506
    .line 3507
    .line 3508
    .line 3509
    .line 3510
    .line 3511
    .line 3512
    .line 3513
    .line 3514
    .line 3515
    .line 3516
    .line 3517
    .line 3518
    .line 3519
    .line 3520
    .line 3521
    .line 3522
    .line 3523
    .line 3524
    .line 3525
    .line 3526
    .line 3527
    .line 3528
    .line 3529
    .line 3530
    .line 3531
    .line 3532
    .line 3533
    .line 3534
    .line 3535
    .line 3536
    .line 3537
    .line 3538
    .line 3539
    .line 3540
    .line 3541
    .line 3542
    .line 3543
    .line 3544
    .line 3545
    .line 3546
    .line 3547
    .line 3548
    .line 3549
    .line 3550
    .line 3551
    .line 3552
    .line 3553
    .line 3554
    .line 3555
    .line 3556
    .line 3557
    .line 3558
    .line 3559
    .line 3560
    .line 3561
    .line 3562
    .line 3563
    .line 3564
    .line 3565
    .line 3566
    .line 3567
    .line 3568
    .line 3569
    .line 3570
    .line 3571
    .line 3572
    .line 3573
    .line 3574
    .line 3575
    .line 3576
    .line 3577
    .line 3578
    .line 3579
    .line 3580
    .line 3581
    .line 3582
    .line 3583
    .line 3584
    .line 3585
    .line 3586
    .line 3587
    .line 3588
    .line 3589
    .line 3590
    .line 3591
    .line 3592
    .line 3593
    .line 3594
    .line 3595
    .line 3596
    .line 3597
    .line 3598
    .line 3599
    .line 3600
    .line 3601
    .line 3602
    .line 3603
    .line 3604
    .line 3605
    .line 3606
    .line 3607
    .line 3608
    .line 3609
    .line 3610
    .line 3611
    .line 3612
    .line 3613
    .line 3614
    .line 3615
    .line 3616
    .line 3617
    .line 3618
    .line 3619
    .line 3620
    .line 3621
    .line 3622
    .line 3623
    .line 3624
    .line 3625
    .line 3626
    .line 3627
    .line 3628
    .line 3629
    .line 3630
    .line 3631
    .line 3632
    .line 3633
    .line 3634
    .line 3635
    .line 3636
    .line 3637
    .line 3638
    .line 3639
    .line 3640
    .line 3641
    .line 3642
    .line 3643
    .line 3644
    .line 3645
    .line 3646
    .line 3647
    .line 3648
    .line 3649
    .line 3650
    .line 3651
    .line 3652
    .line 3653
    .line 3654
    .line 3655
    .line 3656
    .line 3657
    .line 3658
    .line 3659
    .line 3660
    .line 3661
    .line 3662
    .line 3663
    .line 3664
    .line 3665
    .line 3666
    .line 3667
    .line 3668
    .line 3669
    .line 3670
    .line 3671
    .line 3672
    .line 3673
    .line 3674
    .line 3675
    .line 3676
    .line 3677
    .line 3678
    .line 3679
    .line 3680
    .line 3681
    .line 3682
    .line 3683
    .line 3684
    .line 3685
    .line 3686
    .line 3687
    .line 3688
    .line 3689
    .line 3690
    .line 3691
    .line 3692
    .line 3693
    .line 3694
    .line 3695
    .line 3696
    .line 3697
    .line 3698
    .line 3699
    .line 3700
    .line 3701
    .line 3702
    .line 3703
    .line 3704
    .line 3705
    .line 3706
    .line 3707
    .line 3708
    .line 3709
    .line 3710
    .line 3711
    .line 3712
    .line 3713
    .line 3714
    .line 3715
    .line 3716
    .line 3717
    .line 3718
    .line 3719
    .line 3720
    .line 3721
    .line 3722
    .line 3723
    .line 3724
    .line 3725
    .line 3726
    .line 3727
    .line 3728
    .line 3729
    .line 3730
    .line 3731
    .line 3732
    .line 3733
    .line 3734
    .line 3735
    .line 3736
    .line 3737
    .line 3738
    .line 3739
    .line 3740
    .line 3741
    .line 3742
    .line 3743
    .line 3744
    .line 3745
    .line 3746
    .line 3747
    .line 3748
    .line 3749
    .line 3750
    .line 3751
    .line 3752
    .line 3753
    .line 3754
    .line 3755
    .line 3756
    .line 3757
    .line 3758
    .line 3759
    .line 3760
    .line 3761
    .line 3762
    .line 3763
    .line 3764
    .line 3765
    .line 3766
    .line 3767
    .line 3768
    .line 3769
    .line 3770
    .line 3771
    .line 3772
    .line 3773
    .line 3774
    .line 3775
    .line 3776
.end method

.method public final hashCode()I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/d;->a:Ljava/util/TreeMap;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    mul-int/lit8 v0, v0, 0x1f

    .line 8
    .line 9
    return v0
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

.method public final i(Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/n;
    .locals 2

    .line 1
    const-string v0, "length"

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    new-instance p1, Lcom/google/android/gms/internal/measurement/g;

    .line 10
    .line 11
    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/d;->p()I

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    int-to-double v0, v0

    .line 16
    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    invoke-direct {p1, v0}, Lcom/google/android/gms/internal/measurement/g;-><init>(Ljava/lang/Double;)V

    .line 21
    .line 22
    .line 23
    return-object p1

    .line 24
    :cond_0
    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/measurement/d;->d(Ljava/lang/String;)Z

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    if-eqz v0, :cond_1

    .line 29
    .line 30
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/d;->b:Ljava/util/TreeMap;

    .line 31
    .line 32
    invoke-virtual {v0, p1}, Ljava/util/TreeMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    check-cast p1, Lcom/google/android/gms/internal/measurement/n;

    .line 37
    .line 38
    if-eqz p1, :cond_1

    .line 39
    .line 40
    return-object p1

    .line 41
    :cond_1
    sget-object p1, Lcom/google/android/gms/internal/measurement/n;->N:Lcom/google/android/gms/internal/measurement/r;

    .line 42
    .line 43
    return-object p1
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

.method public final iterator()Ljava/util/Iterator;
    .locals 2

    new-instance v0, Lcom/google/android/gms/internal/measurement/p;

    const/4 v1, 0x2

    invoke-direct {v0, v1, p0}, Lcom/google/android/gms/internal/measurement/p;-><init>(ILjava/lang/Object;)V

    return-object v0
.end method

.method public final k(Ljava/lang/String;Lcom/google/android/gms/internal/measurement/n;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/d;->b:Ljava/util/TreeMap;

    .line 2
    .line 3
    if-nez p2, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0, p1}, Ljava/util/TreeMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    return-void

    .line 9
    :cond_0
    invoke-virtual {v0, p1, p2}, Ljava/util/TreeMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    return-void
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

.method public final o()Ljava/lang/Boolean;
    .locals 1

    .line 1
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 2
    .line 3
    return-object v0
    .line 4
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
.end method

.method public final p()I
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/d;->a:Ljava/util/TreeMap;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/util/Map;->isEmpty()Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    const/4 v0, 0x0

    .line 10
    return v0

    .line 11
    :cond_0
    invoke-virtual {v0}, Ljava/util/TreeMap;->lastKey()Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    check-cast v0, Ljava/lang/Integer;

    .line 16
    .line 17
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    add-int/lit8 v0, v0, 0x1

    .line 22
    .line 23
    return v0
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

.method public final q(I)Lcom/google/android/gms/internal/measurement/n;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/d;->p()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-ge p1, v0, :cond_1

    .line 6
    .line 7
    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/measurement/d;->w(I)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/d;->a:Ljava/util/TreeMap;

    .line 14
    .line 15
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    invoke-virtual {v0, p1}, Ljava/util/TreeMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    check-cast p1, Lcom/google/android/gms/internal/measurement/n;

    .line 24
    .line 25
    if-eqz p1, :cond_0

    .line 26
    .line 27
    return-object p1

    .line 28
    :cond_0
    sget-object p1, Lcom/google/android/gms/internal/measurement/n;->N:Lcom/google/android/gms/internal/measurement/r;

    .line 29
    .line 30
    return-object p1

    .line 31
    :cond_1
    new-instance p1, Ljava/lang/IndexOutOfBoundsException;

    .line 32
    .line 33
    const-string v0, "Attempting to get element outside of current array"

    .line 34
    .line 35
    invoke-direct {p1, v0}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    throw p1
.end method

.method public final r(Ljava/lang/String;)Ljava/lang/String;
    .locals 5

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Lcom/google/android/gms/internal/measurement/d;->a:Ljava/util/TreeMap;

    .line 7
    .line 8
    invoke-interface {v1}, Ljava/util/Map;->isEmpty()Z

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    if-nez v1, :cond_3

    .line 13
    .line 14
    const/4 v1, 0x0

    .line 15
    move v2, v1

    .line 16
    :goto_0
    if-nez p1, :cond_0

    .line 17
    .line 18
    const-string v3, ""

    .line 19
    .line 20
    goto :goto_1

    .line 21
    :cond_0
    move-object v3, p1

    .line 22
    :goto_1
    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/d;->p()I

    .line 23
    .line 24
    .line 25
    move-result v4

    .line 26
    if-ge v2, v4, :cond_2

    .line 27
    .line 28
    invoke-virtual {p0, v2}, Lcom/google/android/gms/internal/measurement/d;->q(I)Lcom/google/android/gms/internal/measurement/n;

    .line 29
    .line 30
    .line 31
    move-result-object v4

    .line 32
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    instance-of v3, v4, Lcom/google/android/gms/internal/measurement/r;

    .line 36
    .line 37
    if-nez v3, :cond_1

    .line 38
    .line 39
    instance-of v3, v4, Lcom/google/android/gms/internal/measurement/l;

    .line 40
    .line 41
    if-nez v3, :cond_1

    .line 42
    .line 43
    invoke-interface {v4}, Lcom/google/android/gms/internal/measurement/n;->c()Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object v3

    .line 47
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 48
    .line 49
    .line 50
    :cond_1
    add-int/lit8 v2, v2, 0x1

    .line 51
    .line 52
    goto :goto_0

    .line 53
    :cond_2
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    .line 54
    .line 55
    .line 56
    move-result p1

    .line 57
    invoke-virtual {v0, v1, p1}, Ljava/lang/StringBuilder;->delete(II)Ljava/lang/StringBuilder;

    .line 58
    .line 59
    .line 60
    :cond_3
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object p1

    .line 64
    return-object p1
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

.method public final s()Ljava/util/Iterator;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/d;->a:Ljava/util/TreeMap;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/TreeMap;->keySet()Ljava/util/Set;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    return-object v0
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

.method public final t()Ljava/util/ArrayList;
    .locals 3

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/d;->p()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 8
    .line 9
    .line 10
    const/4 v1, 0x0

    .line 11
    :goto_0
    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/d;->p()I

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    if-ge v1, v2, :cond_0

    .line 16
    .line 17
    invoke-virtual {p0, v1}, Lcom/google/android/gms/internal/measurement/d;->q(I)Lcom/google/android/gms/internal/measurement/n;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 22
    .line 23
    .line 24
    add-int/lit8 v1, v1, 0x1

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_0
    return-object v0
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    .line 1
    const-string v0, ","

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/measurement/d;->r(Ljava/lang/String;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
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

.method public final u(I)V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/d;->a:Ljava/util/TreeMap;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/TreeMap;->lastKey()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    check-cast v1, Ljava/lang/Integer;

    .line 8
    .line 9
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    if-gt p1, v1, :cond_2

    .line 14
    .line 15
    if-gez p1, :cond_0

    .line 16
    .line 17
    goto :goto_1

    .line 18
    :cond_0
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 19
    .line 20
    .line 21
    move-result-object v2

    .line 22
    invoke-virtual {v0, v2}, Ljava/util/TreeMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    if-ne p1, v1, :cond_1

    .line 26
    .line 27
    add-int/lit8 p1, p1, -0x1

    .line 28
    .line 29
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    invoke-virtual {v0, v1}, Ljava/util/TreeMap;->containsKey(Ljava/lang/Object;)Z

    .line 34
    .line 35
    .line 36
    move-result v2

    .line 37
    if-nez v2, :cond_2

    .line 38
    .line 39
    if-ltz p1, :cond_2

    .line 40
    .line 41
    sget-object p1, Lcom/google/android/gms/internal/measurement/n;->N:Lcom/google/android/gms/internal/measurement/r;

    .line 42
    .line 43
    invoke-virtual {v0, v1, p1}, Ljava/util/TreeMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    return-void

    .line 47
    :cond_1
    :goto_0
    add-int/lit8 p1, p1, 0x1

    .line 48
    .line 49
    invoke-virtual {v0}, Ljava/util/TreeMap;->lastKey()Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object v1

    .line 53
    check-cast v1, Ljava/lang/Integer;

    .line 54
    .line 55
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 56
    .line 57
    .line 58
    move-result v1

    .line 59
    if-gt p1, v1, :cond_2

    .line 60
    .line 61
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 62
    .line 63
    .line 64
    move-result-object v1

    .line 65
    invoke-virtual {v0, v1}, Ljava/util/TreeMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object v2

    .line 69
    check-cast v2, Lcom/google/android/gms/internal/measurement/n;

    .line 70
    .line 71
    if-eqz v2, :cond_1

    .line 72
    .line 73
    add-int/lit8 v3, p1, -0x1

    .line 74
    .line 75
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 76
    .line 77
    .line 78
    move-result-object v3

    .line 79
    invoke-virtual {v0, v3, v2}, Ljava/util/TreeMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    invoke-virtual {v0, v1}, Ljava/util/TreeMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 83
    .line 84
    .line 85
    goto :goto_0

    .line 86
    :cond_2
    :goto_1
    return-void
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

.method public final v(ILcom/google/android/gms/internal/measurement/n;)V
    .locals 1

    .line 1
    const/16 v0, 0x7ed4

    .line 2
    .line 3
    if-gt p1, v0, :cond_2

    .line 4
    .line 5
    if-ltz p1, :cond_1

    .line 6
    .line 7
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/d;->a:Ljava/util/TreeMap;

    .line 8
    .line 9
    if-nez p2, :cond_0

    .line 10
    .line 11
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    invoke-virtual {v0, p1}, Ljava/util/TreeMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    return-void

    .line 19
    :cond_0
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    invoke-virtual {v0, p1, p2}, Ljava/util/TreeMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    return-void

    .line 27
    :cond_1
    new-instance p2, Ljava/lang/IndexOutOfBoundsException;

    .line 28
    .line 29
    const-string v0, "Out of bounds index: "

    .line 30
    .line 31
    invoke-static {p1, v0}, Lcom/google/android/gms/internal/measurement/k1;->j(ILjava/lang/String;)Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    invoke-direct {p2, p1}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    throw p2

    .line 39
    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 40
    .line 41
    const-string p2, "Array too large"

    .line 42
    .line 43
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    throw p1
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
.end method

.method public final w(I)Z
    .locals 2

    .line 1
    if-ltz p1, :cond_0

    .line 2
    .line 3
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/d;->a:Ljava/util/TreeMap;

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/util/TreeMap;->lastKey()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    check-cast v1, Ljava/lang/Integer;

    .line 10
    .line 11
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    if-gt p1, v1, :cond_0

    .line 16
    .line 17
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    invoke-virtual {v0, p1}, Ljava/util/TreeMap;->containsKey(Ljava/lang/Object;)Z

    .line 22
    .line 23
    .line 24
    move-result p1

    .line 25
    return p1

    .line 26
    :cond_0
    new-instance v0, Ljava/lang/IndexOutOfBoundsException;

    .line 27
    .line 28
    const-string v1, "Out of bounds index: "

    .line 29
    .line 30
    invoke-static {p1, v1}, Lcom/google/android/gms/internal/measurement/k1;->j(ILjava/lang/String;)Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    invoke-direct {v0, p1}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    throw v0
    .line 38
.end method
