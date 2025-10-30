.class public final Lco/notix/or;
.super Lco/notix/pr;
.source "SourceFile"


# static fields
.field public static final a:Lco/notix/or;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lco/notix/or;

    invoke-direct {v0}, Lco/notix/or;-><init>()V

    sput-object v0, Lco/notix/or;->a:Lco/notix/or;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lco/notix/pr;-><init>(I)V

    return-void
.end method
