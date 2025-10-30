.class public final Lu6/b;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ly6/p;


# direct methods
.method public constructor <init>(Ly6/p;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lu6/b;->a:Ly6/p;

    .line 5
    .line 6
    return-void
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

.method public static a()Lu6/b;
    .locals 2

    .line 1
    invoke-static {}, Ll6/f;->c()Ll6/f;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-class v1, Lu6/b;

    .line 6
    .line 7
    invoke-virtual {v0, v1}, Ll6/f;->b(Ljava/lang/Class;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    check-cast v0, Lu6/b;

    .line 12
    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    return-object v0

    .line 16
    :cond_0
    new-instance v0, Ljava/lang/NullPointerException;

    .line 17
    .line 18
    const-string v1, "FirebaseCrashlytics component is not present."

    .line 19
    .line 20
    invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    throw v0
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


# virtual methods
.method public final b(Ljava/lang/Throwable;)V
    .locals 3

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    const-string p1, "A null value was passed to recordException. Ignoring."

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    const-string v1, "FirebaseCrashlytics"

    .line 7
    .line 8
    invoke-static {v1, p1, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 9
    .line 10
    .line 11
    return-void

    .line 12
    :cond_0
    sget-object v0, Ljava/util/Collections;->EMPTY_MAP:Ljava/util/Map;

    .line 13
    .line 14
    iget-object v0, p0, Lu6/b;->a:Ly6/p;

    .line 15
    .line 16
    iget-object v1, v0, Ly6/p;->o:Lz6/d;

    .line 17
    .line 18
    iget-object v1, v1, Lz6/d;->a:Lz6/b;

    .line 19
    .line 20
    new-instance v2, LA6/r;

    .line 21
    .line 22
    invoke-direct {v2, v0, p1}, LA6/r;-><init>(Ly6/p;Ljava/lang/Throwable;)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {v1, v2}, Lz6/b;->a(Ljava/lang/Runnable;)Lf5/q;

    .line 26
    .line 27
    .line 28
    return-void
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
