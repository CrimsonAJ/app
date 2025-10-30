.class public final Ly0/d;
.super Landroid/os/AsyncTask;
.source "SourceFile"


# instance fields
.field public final synthetic a:LN1/h;

.field public final synthetic b:Ld0/n;


# direct methods
.method public constructor <init>(Ld0/n;LN1/h;)V
    .locals 0

    .line 1
    iput-object p1, p0, Ly0/d;->b:Ld0/n;

    .line 2
    .line 3
    iput-object p2, p0, Ly0/d;->a:LN1/h;

    .line 4
    .line 5
    invoke-direct {p0}, Landroid/os/AsyncTask;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
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
.method public final doInBackground([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    check-cast p1, [Landroid/graphics/Bitmap;

    .line 2
    .line 3
    :try_start_0
    iget-object p1, p0, Ly0/d;->b:Ld0/n;

    .line 4
    .line 5
    invoke-virtual {p1}, Ld0/n;->a()Ly0/f;

    .line 6
    .line 7
    .line 8
    move-result-object p1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 9
    return-object p1

    .line 10
    :catch_0
    move-exception p1

    .line 11
    const-string v0, "Palette"

    .line 12
    .line 13
    const-string v1, "Exception thrown during async generate"

    .line 14
    .line 15
    invoke-static {v0, v1, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 16
    .line 17
    .line 18
    const/4 p1, 0x0

    .line 19
    return-object p1
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

.method public final onPostExecute(Ljava/lang/Object;)V
    .locals 2

    .line 1
    check-cast p1, Ly0/f;

    .line 2
    .line 3
    iget-object v0, p0, Ly0/d;->a:LN1/h;

    .line 4
    .line 5
    iget-object v1, v0, LN1/h;->b:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, Lco/notix/j6;

    .line 8
    .line 9
    iget-object v0, v0, LN1/h;->c:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v0, Lco/notix/b6;

    .line 12
    .line 13
    invoke-static {v1, v0, p1}, Lco/notix/q8;->a(Landroid/content/Context;LO7/l;Ly0/f;)V

    .line 14
    .line 15
    .line 16
    return-void
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
